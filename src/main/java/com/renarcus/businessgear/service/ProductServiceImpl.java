package com.renarcus.businessgear.service;

import com.renarcus.businessgear.dao.ProductDao;
import com.renarcus.businessgear.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void addProduct(Product p) {
        this.productDao.addProduct(p);
    }

    public void updateProduct(Product p) {
        this.productDao.updateProduct(p);
    }

    public List<Product> listProducts() {
        return this.productDao.listProducts();
    }

    public Product getProductById(Integer id) {
        return this.productDao.getProductById(id);
    }

    public List<Product> getProductsByCategoryId(Integer id) {
        return this.productDao.getProductsByCategoryId(id);
    }

    public void removeProduct(Integer id) {
        this.productDao.removeProduct(id);
    }
}
