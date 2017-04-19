package com.renarcus.businessgear.dao.product;

import com.renarcus.businessgear.dao.AbstractDao;
import com.renarcus.businessgear.model.Product;

import java.util.List;

/**
 * Created by Troley on 19-4-2017
 */
public interface AbstractProductDao<T> extends AbstractDao<Product, Integer> {

    List<T> getItemsByCategoryId(int id);
}
