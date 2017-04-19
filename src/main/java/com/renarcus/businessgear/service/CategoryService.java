package com.renarcus.businessgear.service;

import com.renarcus.businessgear.dao.CategoryDao;
import com.renarcus.businessgear.model.Category;

import java.util.List;

/**
 * Created by Troley on 14-4-2017
 */
public interface CategoryService {

    void addCategory(Category c);

    List<Category> listCategories();

    Category getCategoryById(int id);

    void updateCategory(Category c);

    void removeCategory(int id);
}
