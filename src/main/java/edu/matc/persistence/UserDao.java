package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.Role;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by netherskub on 10/25/16.
 */

public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * retrieve a user given their id
     *
     //* @param id the user's id
     * @return user
     */

    public User getUser(String user_name) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        User user = null;

        try {
            user = (User) session.get(User.class, user_name);
            log.info("Checking for username in database.");
        } catch (HibernateException e) {
            log.error(e);
        } finally {
            session.close();
        }

        return user;
    }

    /**
     * add a user
     *
     * @param user
     * @return the id of the inserted record
     */

    public String addUser(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

        return user.getUser_name();
    }

    public String createRole(Role role) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(role);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
                log.info(e);
            }
        } finally {
            session.close();
        }
        return role.getUser_name();
    }
}
