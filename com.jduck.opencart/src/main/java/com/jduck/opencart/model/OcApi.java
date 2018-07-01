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
@Table(name = "oc_api")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcApi.findAll", query = "SELECT o FROM OcApi o"),
    @NamedQuery(name = "OcApi.findByApiId", query = "SELECT o FROM OcApi o WHERE o.apiId = :apiId"),
    @NamedQuery(name = "OcApi.findByUsername", query = "SELECT o FROM OcApi o WHERE o.username = :username"),
    @NamedQuery(name = "OcApi.findByStatus", query = "SELECT o FROM OcApi o WHERE o.status = :status"),
    @NamedQuery(name = "OcApi.findByDateAdded", query = "SELECT o FROM OcApi o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcApi.findByDateModified", query = "SELECT o FROM OcApi o WHERE o.dateModified = :dateModified")})
public class OcApi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "api_id")
    private Integer apiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "key")
    private String key;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcApi() {
    }

    public OcApi(Integer apiId) {
        this.apiId = apiId;
    }

    public OcApi(Integer apiId, String username, String key, boolean status, Date dateAdded, Date dateModified) {
        this.apiId = apiId;
        this.username = username;
        this.key = key;
        this.status = status;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apiId != null ? apiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcApi)) {
            return false;
        }
        OcApi other = (OcApi) object;
        if ((this.apiId == null && other.apiId != null) || (this.apiId != null && !this.apiId.equals(other.apiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcApi[ apiId=" + apiId + " ]";
    }
    
}
