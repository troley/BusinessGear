package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public void addProduct(Product p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    public void updateProduct(Product p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
    }

    @SuppressWarnings("unchecked")
    public List<Product> listProducts() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM " + Product.class.getSimpleName() + " p").list();
    }

    public Product getProductById(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Product> getProductsByCategoryId(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        String query = "FROM " + Product.class.getSimpleName() + " p WHERE category_id = :id";
        return session.createQuery(query).setParameter("id", id).list();
    }

    public void removeProduct(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);

        if (product != null) {
            session.delete(product);
        }
    }
}
