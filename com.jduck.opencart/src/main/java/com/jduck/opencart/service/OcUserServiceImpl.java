/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.service;

import com.jduck.opencart.dao.OcUserDao;
import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.response.OcUserResponseMessage;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows10
 */
@Service("ocUserService")
public class OcUserServiceImpl implements OcUserService {

    @Autowired
    OcUserDao ocUserDao;

    @Override
    public void addUser(OcUser user) {

        try {
            ocUserDao.addUser(user);
        } catch (SQLException ex) {
            Logger.getLogger(OcUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<OcUser> getAllUser() {
        try {
            return ocUserDao.getAllUser();
        } catch (SQLException ex) {
            Logger.getLogger(OcUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public OcUser getSingleUser(int id) {
        try {
            return ocUserDao.getSingleUser(id);
        } catch (SQLException ex) {
            Logger.getLogger(OcUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public OcUserResponseMessage deleteUser(int userId) {
        try {
            return ocUserDao.deleteUser(userId);
        } catch (SQLException ex) {
            Logger.getLogger(OcUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
