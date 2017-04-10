package com.renarcus.businessgear.dao;

import com.renarcus.businessgear.model.Product;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
public interface ProductDao {

    void addProduct(Product p);

    void updateProduct(Product p);

    List<Product> listProducts();

    Product getProductById(Integer id);

    List<Product> getProductsByCategoryId(Integer id);

    void removeProduct(Integer id);
}
