package com.renarcus.businessgear.service;

import com.renarcus.businessgear.dao.ProductDao;
import com.renarcus.businessgear.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional
    public void addProduct(Product p) {
        this.productDao.addProduct(p);
    }

    @Transactional
    public void updateProduct(Product p) {
        this.productDao.updateProduct(p);
    }

    @Transactional
    public List<Product> listProducts() {
        return this.productDao.listProducts();
    }

    @Transactional
    public Product getProductById(Integer id) {
        return this.productDao.getProductById(id);
    }

    @Transactional
    public List<Product> getProductsByCategoryId(Integer id) {
        return this.productDao.getProductsByCategoryId(id);
    }

    @Transactional
    public void removeProduct(Integer id) {
        this.productDao.removeProduct(id);
    }
}
