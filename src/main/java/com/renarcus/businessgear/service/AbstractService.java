package com.renarcus.businessgear.service;

import java.util.List;

/**
 * Abstract boilerplate service interface for easier
 * use with new service interfaces.
 *
 * @param <T> The return/parameter object.
 * @param <E> The object for defining the Id parameter data type.
 */
public interface AbstractService<T, E> {

    void addItem(T item);

    List<T> getAllItems();

    T getItemById(E id);

    void updateItem(T item);

    void removeItem(E id);
}
