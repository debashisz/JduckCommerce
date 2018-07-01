/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcUser.findAll", query = "SELECT o FROM OcUser o"),
    @NamedQuery(name = "OcUser.findByUserId", query = "SELECT o FROM OcUser o WHERE o.userId = :userId"),
    @NamedQuery(name = "OcUser.findByUserGroupId", query = "SELECT o FROM OcUser o WHERE o.userGroupId = :userGroupId"),
    @NamedQuery(name = "OcUser.findByUsername", query = "SELECT o FROM OcUser o WHERE o.username = :username"),
    @NamedQuery(name = "OcUser.findByPassword", query = "SELECT o FROM OcUser o WHERE o.password = :password"),
    @NamedQuery(name = "OcUser.findBySalt", query = "SELECT o FROM OcUser o WHERE o.salt = :salt"),
    @NamedQuery(name = "OcUser.findByFirstname", query = "SELECT o FROM OcUser o WHERE o.firstname = :firstname"),
    @NamedQuery(name = "OcUser.findByLastname", query = "SELECT o FROM OcUser o WHERE o.lastname = :lastname"),
    @NamedQuery(name = "OcUser.findByEmail", query = "SELECT o FROM OcUser o WHERE o.email = :email"),
    @NamedQuery(name = "OcUser.findByImage", query = "SELECT o FROM OcUser o WHERE o.image = :image"),
    @NamedQuery(name = "OcUser.findByCode", query = "SELECT o FROM OcUser o WHERE o.code = :code"),
    @NamedQuery(name = "OcUser.findByIp", query = "SELECT o FROM OcUser o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcUser.findByStatus", query = "SELECT o FROM OcUser o WHERE o.status = :status"),
    @NamedQuery(name = "OcUser.findByDateAdded", query = "SELECT o FROM OcUser o WHERE o.dateAdded = :dateAdded")})
public class OcUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_group_id")
    private int userGroupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "salt")
    private String salt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "lastname")
    private String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcUser() {
    }

    public OcUser(Integer userId) {
        this.userId = userId;
    }

    public OcUser(int userGroupId, String username, String password, String salt, String firstname, String lastname, String email, String image, String code, String ip, boolean status, Date dateAdded) {
        
        this.userGroupId = userGroupId;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.image = image;
        this.code = code;
        this.ip = ip;
        this.status = status;
        this.dateAdded = dateAdded;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(int userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcUser)) {
            return false;
        }
        OcUser other = (OcUser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcUser[ userId=" + userId + " ]";
    }
    
}
