package com.renarcus.businessgear.dao.customer;

import com.renarcus.businessgear.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Troley on 26-6-2017
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{

    private static final String CUSTOMER_STRING = Customer.class.getSimpleName();

    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addItem(Customer item) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(item);
    }

    @SuppressWarnings("unchecked")
    public List<Customer> getAllItems() {
        Session session = sessionFactory.getCurrentSession();
        String query = "FROM " + CUSTOMER_STRING + " c";
        return session.createQuery(query).list();
    }

    public Customer getItemById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class, id);
    }

    public void updateItem(Customer item) {
        Session session = sessionFactory.getCurrentSession();
        session.update(item);
    }

    public void removeItem(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);

        if (customer != null) {
            session.delete(customer);
        }
    }
}
