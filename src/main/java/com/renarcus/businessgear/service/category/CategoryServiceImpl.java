package com.renarcus.businessgear.service.category;

import com.renarcus.businessgear.dao.category.CategoryDao;
import com.renarcus.businessgear.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 14-4-2017
 */

@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;

    @Autowired
    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void addItem(Category item) {
        categoryDao.addItem(item);

    }

    public List<Category> getAllItems() {
        return categoryDao.getAllItems();

    }

    public Category getItemById(Integer id) {
        return categoryDao.getItemById(id);

    }

    public void updateItem(Category item) {
        categoryDao.updateItem(item);
    }

    public void removeItem(Integer id) {
        categoryDao.removeItem(id);
    }
}
