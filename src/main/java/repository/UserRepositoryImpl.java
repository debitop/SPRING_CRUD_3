package repository;

import model.User;

import java.util.List;

public interface UserRepositoryImpl {
    public void removeUser(int id);

    public void addUser(User user);

    public User getUser(int id);

    public List<User> getAllUser();

    public void editUser(User user);


}
