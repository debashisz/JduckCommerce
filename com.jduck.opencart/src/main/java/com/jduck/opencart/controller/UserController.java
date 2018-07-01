/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.controller;

import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.response.OcUserResponseMessage;
import com.jduck.opencart.service.OcUserService;
import java.util.List;
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
    public void addUser(@RequestBody OcUser user) {
        ocUserService.addUser(user);
    }

    @GetMapping("/all")
    public @ResponseBody
    List<OcUser> getAllUser() {
        return ocUserService.getAllUser();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    OcUser getSingleUser(@PathVariable("id") int id) {
        OcUser o = ocUserService.getSingleUser(id);
        if (o == null) {
            OcUser empty = new OcUser();
            return empty;
        }
        return o;
    }

    @DeleteMapping("/delete/{id}")
    public OcUserResponseMessage deleteUser(@PathVariable("id") int id) {
       return ocUserService.deleteUser(id);
    }

}
