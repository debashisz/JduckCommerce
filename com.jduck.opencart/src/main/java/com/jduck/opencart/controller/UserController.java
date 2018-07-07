/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.controller;

import com.jduck.opencart.custommodel.UserAndUserType;
import com.jduck.opencart.model.OcApi;
import com.jduck.opencart.model.OcUser;
import com.jduck.opencart.response.OcUserResponseMessage;
import com.jduck.opencart.service.OcUserService;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

    @Autowired
    JdbcTemplate jdbcTemplate;

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

    @GetMapping("/AllUserAndUserType")
    public List<UserAndUserType> GetUserAndUserType() {
        return jdbcTemplate.query("select ou.username, ou.salt,oug.name as role,"
                + " oug.permission ,ou.ip from oc_user ou inner join "
                + " oc_user_group oug on ou.user_group_id = oug.user_group_id and ou.username = ?",
                new Object[] {"debashis"}, (ResultSet rs, int row) -> {
                    UserAndUserType f = new UserAndUserType();
                    f.setUsername(rs.getString("username"));
                    f.setSalt(rs.getString(2));
                    f.setRoleType(rs.getString(3));
                    f.setPermission(rs.getString(5));
                    return f;
        });
    }

}
