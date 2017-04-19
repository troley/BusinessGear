package com.renarcus.businessgear.dao.product;

import com.renarcus.businessgear.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    public void addItem(Product item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(item);
    }

    @SuppressWarnings("unchecked")
    public List<Product> getAllItems() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM " + Product.class.getSimpleName() + " p").list();
    }

    public Product getItemById(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    public void updateItem(Product item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(item);
    }

    public void removeItem(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);

        if (product != null) {
            session.delete(product);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Product> getItemsByCategoryId(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        String query = "FROM " + Product.class.getSimpleName() + " p WHERE category_id = :id";
        return session.createQuery(query).setParameter("id", id).list();
    }
}
