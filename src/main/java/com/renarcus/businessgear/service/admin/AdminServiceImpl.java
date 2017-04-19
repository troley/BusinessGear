package com.renarcus.businessgear.service.admin;

import com.renarcus.businessgear.dao.admin.AdminDao;
import com.renarcus.businessgear.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Troley on 19-4-2017
 */
@Transactional
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao;

    @Autowired
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public void addItem(Admin item) {
        this.adminDao.addItem(item);
    }

    public List<Admin> getAllItems() {
        return this.adminDao.getAllItems();
    }

    public Admin getItemById(String id) {
        return this.adminDao.getItemById(id);
    }

    public void updateItem(Admin item) {
        this.adminDao.updateItem(item);
    }

    public void removeItem(String id) {
        this.adminDao.removeItem(id);
    }
}
