package com.renarcus.businessgear.service;

import com.renarcus.businessgear.dao.ProductDao;
import com.renarcus.businessgear.model.Product;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
public interface ProductService {

    void addProduct(Product p);

    void updateProduct(Product p);

    List<Product> listProducts();

    Product getProductById(Integer id);

    List<Product> getProductsByCategoryId(Integer id);

    void removeProduct(Integer id);
}
