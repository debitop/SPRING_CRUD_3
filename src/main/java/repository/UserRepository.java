package repository;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repository.impl.UserRepositoryImpl;

import java.util.List;

@Repository
@Transactional

public class UserRepository implements UserRepositoryImpl {
    @Autowired
    SessionFactory sessionFactory;


    @Override
    public void removeUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        session.delete(user);
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public void editUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        User userOld = session.get(User.class, user.getId());
        userOld.setName(user.getName());
        userOld.setAdmin(user.getAdmin());
        session.update(userOld);
    }
}
