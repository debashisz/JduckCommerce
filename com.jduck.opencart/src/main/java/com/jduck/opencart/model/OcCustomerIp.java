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
@Table(name = "oc_customer_ip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerIp.findAll", query = "SELECT o FROM OcCustomerIp o"),
    @NamedQuery(name = "OcCustomerIp.findByCustomerIpId", query = "SELECT o FROM OcCustomerIp o WHERE o.customerIpId = :customerIpId"),
    @NamedQuery(name = "OcCustomerIp.findByCustomerId", query = "SELECT o FROM OcCustomerIp o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerIp.findByIp", query = "SELECT o FROM OcCustomerIp o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcCustomerIp.findByDateAdded", query = "SELECT o FROM OcCustomerIp o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerIp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_ip_id")
    private Integer customerIpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
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

    public OcCustomerIp() {
    }

    public OcCustomerIp(Integer customerIpId) {
        this.customerIpId = customerIpId;
    }

    public OcCustomerIp(Integer customerIpId, int customerId, String ip, Date dateAdded) {
        this.customerIpId = customerIpId;
        this.customerId = customerId;
        this.ip = ip;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerIpId() {
        return customerIpId;
    }

    public void setCustomerIpId(Integer customerIpId) {
        this.customerIpId = customerIpId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
        hash += (customerIpId != null ? customerIpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerIp)) {
            return false;
        }
        OcCustomerIp other = (OcCustomerIp) object;
        if ((this.customerIpId == null && other.customerIpId != null) || (this.customerIpId != null && !this.customerIpId.equals(other.customerIpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerIp[ customerIpId=" + customerIpId + " ]";
    }
    
}
