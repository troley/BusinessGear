package com.renarcus.businessgear.service.customer;

import com.renarcus.businessgear.dao.customer.CustomerDao;
import com.renarcus.businessgear.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 26-6-2017
 */
@Transactional
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addItem(Customer item) {
        customerDao.addItem(item);
    }

    public List<Customer> getAllItems() {
        return customerDao.getAllItems();
    }

    public Customer getItemById(Integer id) {
        return customerDao.getItemById(id);
    }

    public void updateItem(Customer item) {
        customerDao.updateItem(item);
    }

    public void removeItem(Integer id) {
        customerDao.removeItem(id);
    }
}
