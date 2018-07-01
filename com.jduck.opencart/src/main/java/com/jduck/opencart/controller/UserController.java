/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.controller;

import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.service.OcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 

/**
 *
 * @author Windows10
 */
@RestController
@RequestMapping("api/user")
public class UserController {
    
       @Autowired
    private OcUserService ocUserService;


    @PostMapping("/add")
    public void addUser(@RequestBody OcUser user)
    {
        ocUserService.addUser(user);
    }
    
}
