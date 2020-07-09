package DAO;

import Resources.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

public class UserDAO implements DAO<User, Integer>{
    private final SessionFactory factory;

    public UserDAO(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull User user) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public User read(@NotNull Integer id) {
        try(Session session = factory.openSession()){
            return session.get(User.class, id);
        }
    }

    @Override
    public void update(@NotNull User user) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull User user) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
    }
}
