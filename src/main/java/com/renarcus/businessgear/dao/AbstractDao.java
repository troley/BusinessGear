package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.model.Category;

import java.util.List;

/**
 * Abstract boilerplate dao interface for easier
 * use with new dao interfaces.
 *
 * @param <T> The return/parameter object.
 * @param <E> The object for defining the Id parameter data type.
 */
public interface AbstractDao<T, E> {

    void addItem(T item);

    List<T> getAllItems();

    T getItemById(E id);

    void updateItem(T item);

    void removeItem(E id);
}
