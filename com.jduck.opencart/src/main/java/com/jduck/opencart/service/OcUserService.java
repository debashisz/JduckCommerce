/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.service;

import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.response.OcUserResponseMessage;
import java.util.List;

/**
 *
 * @author Windows10
 */
public interface OcUserService {

    public void addUser(OcUser user);

    public List<OcUser> getAllUser();

    public OcUser getSingleUser(int id);
    public OcUserResponseMessage deleteUser(int userId);
    
}
