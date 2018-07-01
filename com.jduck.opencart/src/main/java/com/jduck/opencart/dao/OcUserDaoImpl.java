/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.dao;

import com.jduck.opencart.model.OcUser;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.*;

/**
 *
 * @author Windows10
 */
@Repository
@Qualifier("ocUserDao")
public class OcUserDaoImpl implements OcUserDao {

    @PersistenceContext
    EntityManager ctx;

    @Override
    @Transactional
    public void addUser(OcUser user) throws SQLException {
        
        String sql = "INSERT INTO oc_user (user_id,user_group_id,username,password,salt,firstname,"
                + "lastname,email,image,code,ip,status,date_added) "
                + " VALUES (NULL, :a, :b, :c, :d, :e, :f, :g, :h, :i, :j, :k, :l)";
        ctx.createNativeQuery(sql)
                .setParameter("a", user.getUserGroupId())
                .setParameter("b", user.getUsername())
                .setParameter("c", user.getPassword())
                .setParameter("d", user.getSalt())
                .setParameter("e", user.getFirstname())
                .setParameter("f", user.getLastname())
                .setParameter("g", user.getEmail())
                .setParameter("h", user.getImage())
                .setParameter("i", user.getCode())
                .setParameter("j", user.getIp())
                .setParameter("k", user.getStatus())
                .setParameter("l", user.getDateAdded()).executeUpdate();
    }

    @Override
    public List<OcUser> getAllUser() throws SQLException {
        return null;
    }

    @Override
    public OcUser getSingleUser(int id) throws SQLException {
        return null;
    }
}
