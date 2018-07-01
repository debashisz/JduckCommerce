/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.dao;

import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.response.OcUserResponseMessage;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Windows10
 */
public interface OcUserDao {

    public void addUser(OcUser user) throws SQLException;

    public List<OcUser> getAllUser() throws SQLException;

    public OcUser getSingleUser(int id) throws SQLException;

    public OcUserResponseMessage deleteUser(int userId) throws SQLException;

}
