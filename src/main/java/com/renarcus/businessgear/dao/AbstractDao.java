package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.model.Category;

import java.util.List;

/**
 * Created by Troley on 19-4-2017
 */
public interface AbstractDao<T, E> {

    void addItem(T item);

    List<T> getAllItems();

    T getItemById(E id);

    void updateItem(T item);

    void removeItem(E id);
}
