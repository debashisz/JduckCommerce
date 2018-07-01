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
@Table(name = "oc_banner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcBanner.findAll", query = "SELECT o FROM OcBanner o"),
    @NamedQuery(name = "OcBanner.findByBannerId", query = "SELECT o FROM OcBanner o WHERE o.bannerId = :bannerId"),
    @NamedQuery(name = "OcBanner.findByName", query = "SELECT o FROM OcBanner o WHERE o.name = :name"),
    @NamedQuery(name = "OcBanner.findByStatus", query = "SELECT o FROM OcBanner o WHERE o.status = :status")})
public class OcBanner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banner_id")
    private Integer bannerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;

    public OcBanner() {
    }

    public OcBanner(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public OcBanner(Integer bannerId, String name, boolean status) {
        this.bannerId = bannerId;
        this.name = name;
        this.status = status;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bannerId != null ? bannerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcBanner)) {
            return false;
        }
        OcBanner other = (OcBanner) object;
        if ((this.bannerId == null && other.bannerId != null) || (this.bannerId != null && !this.bannerId.equals(other.bannerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcBanner[ bannerId=" + bannerId + " ]";
    }
    
}
