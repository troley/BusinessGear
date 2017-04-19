package com.renarcus.businessgear.service;

import com.renarcus.businessgear.dao.CategoryDao;
import com.renarcus.businessgear.model.Category;
import com.renarcus.businessgear.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 14-4-2017
 */

@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void addCategory(Category c) {
        categoryDao.addCategory(c);
    }

    public List<Category> listCategories() {
        return categoryDao.listCategories();
    }

    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

    public void updateCategory(Category c) {
        categoryDao.updateCategory(c);
    }

    public void removeCategory(int id) {
        categoryDao.removeCategory(id);
    }
}
