package com.renarcus.businessgear.dao.category;

import com.renarcus.businessgear.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Troley on 14-4-2017
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public void addItem(Category item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(item);
    }

    @SuppressWarnings("unchecked")
    public List<Category> getAllItems() {
        Session session = this.sessionFactory.getCurrentSession();
        String query = "FROM " + Category.class.getSimpleName();
        return session.createQuery(query).list();
    }

    public Category getItemById(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Category.class, id);
    }

    public void updateItem(Category item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(item);
    }

    public void removeItem(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Category category = session.get(Category.class, id);

        if (category != null) {
            session.remove(category);
        }
    }
}
