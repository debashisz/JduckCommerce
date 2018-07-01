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
@Table(name = "oc_customer_online")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerOnline.findAll", query = "SELECT o FROM OcCustomerOnline o"),
    @NamedQuery(name = "OcCustomerOnline.findByIp", query = "SELECT o FROM OcCustomerOnline o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcCustomerOnline.findByCustomerId", query = "SELECT o FROM OcCustomerOnline o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerOnline.findByDateAdded", query = "SELECT o FROM OcCustomerOnline o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerOnline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "referer")
    private String referer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerOnline() {
    }

    public OcCustomerOnline(String ip) {
        this.ip = ip;
    }

    public OcCustomerOnline(String ip, int customerId, String url, String referer, Date dateAdded) {
        this.ip = ip;
        this.customerId = customerId;
        this.url = url;
        this.referer = referer;
        this.dateAdded = dateAdded;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
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
        hash += (ip != null ? ip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerOnline)) {
            return false;
        }
        OcCustomerOnline other = (OcCustomerOnline) object;
        if ((this.ip == null && other.ip != null) || (this.ip != null && !this.ip.equals(other.ip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerOnline[ ip=" + ip + " ]";
    }
    
}
