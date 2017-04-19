package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.model.Category;

import java.util.List;

/**
 * Created by Troley on 14-4-2017
 */
public interface CategoryDao {

    void addCategory(Category c);

    List<Category> listCategories();

    Category getCategoryById(int id);

    void updateCategory(Category c);

    void removeCategory(int id);

}
