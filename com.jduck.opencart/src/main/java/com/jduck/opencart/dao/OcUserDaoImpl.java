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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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
        String hql = "FROM OcUser";
        Query query = ctx.createQuery(hql);
        List allCustomer = query.getResultList();
        return allCustomer;
    }

    @Override
    public OcUser getSingleUser(int id) throws SQLException {
        Query query = ctx.createNamedQuery("OcUser.findByUserId", OcUser.class);
        query.setParameter("userId", id);
        OcUser obj = null;

        if (query.getResultList().size() > 0) {
            obj = (OcUser) query.getSingleResult();
            return obj;
        } else {
            OcUser u = new OcUser();
            u.setUserId(-1);
            return u;
        }

    }

    @Override
    @Transactional
    public OcUserResponseMessage deleteUser(int userId) throws SQLException {
        OcUserResponseMessage response = new OcUserResponseMessage();
        Query query = ctx.createNamedQuery("OcUser.findByUserId", OcUser.class);
        query.setParameter("userId", userId);

        if (query.getResultList().size() > 0) {
            Query query2 = ctx.createNamedQuery("OcUser.deleteUserId");
            query2.setParameter("userId", userId);
            int k = query2.executeUpdate();
            if (k > 0) {
                response.setResponseMessage("Record deleted successfully - > " + Integer.toString(userId));
            } else {
                response.setResponseMessage("Record is not deleted - > " + Integer.toString(userId));
            }
        } else {
            response.setResponseMessage("No Record is available - > " + Integer.toString(userId));
        }

        return response;
    }

}
