package com.renarcus.businessgear.dao.admin;

import com.renarcus.businessgear.model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Troley on 19-4-2017
 */
@Repository
public class AdminDaoImpl implements AdminDao {

    private SessionFactory sessionFactory;

    @Autowired
    public AdminDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addItem(Admin item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(item);
    }

    @SuppressWarnings("unchecked")
    public List<Admin> getAllItems() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM admin a").list();
    }

    public Admin getItemById(String username) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Admin.class, username);
    }

    public void updateItem(Admin item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(item);
    }

    public void removeItem(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Admin admin = session.get(Admin.class, id);

        if (admin != null) {
            session.remove(admin);
        }
    }
}
