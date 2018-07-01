/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_user_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcUserGroup.findAll", query = "SELECT o FROM OcUserGroup o"),
    @NamedQuery(name = "OcUserGroup.findByUserGroupId", query = "SELECT o FROM OcUserGroup o WHERE o.userGroupId = :userGroupId"),
    @NamedQuery(name = "OcUserGroup.findByName", query = "SELECT o FROM OcUserGroup o WHERE o.name = :name")})
public class OcUserGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_group_id")
    private Integer userGroupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "permission")
    private String permission;

    public OcUserGroup() {
    }

    public OcUserGroup(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public OcUserGroup(Integer userGroupId, String name, String permission) {
        this.userGroupId = userGroupId;
        this.name = name;
        this.permission = permission;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userGroupId != null ? userGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcUserGroup)) {
            return false;
        }
        OcUserGroup other = (OcUserGroup) object;
        if ((this.userGroupId == null && other.userGroupId != null) || (this.userGroupId != null && !this.userGroupId.equals(other.userGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcUserGroup[ userGroupId=" + userGroupId + " ]";
    }
    
}
