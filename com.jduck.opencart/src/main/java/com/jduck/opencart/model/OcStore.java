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
@Table(name = "oc_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcStore.findAll", query = "SELECT o FROM OcStore o"),
    @NamedQuery(name = "OcStore.findByStoreId", query = "SELECT o FROM OcStore o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcStore.findByName", query = "SELECT o FROM OcStore o WHERE o.name = :name"),
    @NamedQuery(name = "OcStore.findByUrl", query = "SELECT o FROM OcStore o WHERE o.url = :url"),
    @NamedQuery(name = "OcStore.findBySsl", query = "SELECT o FROM OcStore o WHERE o.ssl = :ssl")})
public class OcStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_id")
    private Integer storeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ssl")
    private String ssl;

    public OcStore() {
    }

    public OcStore(Integer storeId) {
        this.storeId = storeId;
    }

    public OcStore(Integer storeId, String name, String url, String ssl) {
        this.storeId = storeId;
        this.name = name;
        this.url = url;
        this.ssl = ssl;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSsl() {
        return ssl;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeId != null ? storeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcStore)) {
            return false;
        }
        OcStore other = (OcStore) object;
        if ((this.storeId == null && other.storeId != null) || (this.storeId != null && !this.storeId.equals(other.storeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcStore[ storeId=" + storeId + " ]";
    }
    
}
