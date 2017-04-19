package com.renarcus.businessgear.service.product;

import com.renarcus.businessgear.dao.product.ProductDao;
import com.renarcus.businessgear.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 10-4-2017
 */
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void addItem(Product item) {
        this.productDao.addItem(item);

    }

    public List<Product> getAllItems() {
        return this.productDao.getAllItems();

    }

    public Product getItemById(Integer id) {
        return this.productDao.getItemById(id);

    }

    public void updateItem(Product item) {
        this.productDao.updateItem(item);
    }

    public void removeItem(Integer id) {
        this.productDao.removeItem(id);
    }

    public List<Product> getItemsByCategoryId(int id) {
        return this.productDao.getItemsByCategoryId(id);
    }
}
