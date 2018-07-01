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
import javax.persistence.Lob;
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
@Table(name = "oc_customer_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerActivity.findAll", query = "SELECT o FROM OcCustomerActivity o"),
    @NamedQuery(name = "OcCustomerActivity.findByCustomerActivityId", query = "SELECT o FROM OcCustomerActivity o WHERE o.customerActivityId = :customerActivityId"),
    @NamedQuery(name = "OcCustomerActivity.findByCustomerId", query = "SELECT o FROM OcCustomerActivity o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerActivity.findByKey", query = "SELECT o FROM OcCustomerActivity o WHERE o.key = :key"),
    @NamedQuery(name = "OcCustomerActivity.findByIp", query = "SELECT o FROM OcCustomerActivity o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcCustomerActivity.findByDateAdded", query = "SELECT o FROM OcCustomerActivity o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_activity_id")
    private Integer customerActivityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "key")
    private String key;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerActivity() {
    }

    public OcCustomerActivity(Integer customerActivityId) {
        this.customerActivityId = customerActivityId;
    }

    public OcCustomerActivity(Integer customerActivityId, int customerId, String key, String data, String ip, Date dateAdded) {
        this.customerActivityId = customerActivityId;
        this.customerId = customerId;
        this.key = key;
        this.data = data;
        this.ip = ip;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerActivityId() {
        return customerActivityId;
    }

    public void setCustomerActivityId(Integer customerActivityId) {
        this.customerActivityId = customerActivityId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        hash += (customerActivityId != null ? customerActivityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerActivity)) {
            return false;
        }
        OcCustomerActivity other = (OcCustomerActivity) object;
        if ((this.customerActivityId == null && other.customerActivityId != null) || (this.customerActivityId != null && !this.customerActivityId.equals(other.customerActivityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerActivity[ customerActivityId=" + customerActivityId + " ]";
    }
    
}
