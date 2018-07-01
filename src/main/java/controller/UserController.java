package controller;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import repository.UserRepositoryImpl;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepositoryImpl userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getUsers(Model model) {
        List<User> users = userRepository.getAllUser();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/addUser")
    public String addUsers() {
        return "createUser";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addUser")
    public String addUser(@RequestParam("name") String name, @RequestParam(value = "isadmin", defaultValue = "false") Boolean isAdmin) {
        User user = new User();
        user.setAdmin(isAdmin);
        user.setName(name);
        user.setCreateDate();
        userRepository.addUser(user);
        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userRepository.removeUser(id);
        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/updateUser/{id}")
    public String updateUser(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("userAttribute", userRepository.getUser(id));
        return "updateUser";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/updateUser/{id}")
    public String updateUser(@PathVariable("id") Integer id, @RequestParam("name") String name, @RequestParam Boolean isadmin) {

        User user = userRepository.getUser(id);
        user.setName(name);
        user.setAdmin(isadmin);
        userRepository.editUser(user);
        return "redirect:/";

    }


}
