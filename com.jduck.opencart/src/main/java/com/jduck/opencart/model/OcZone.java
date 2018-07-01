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
@Table(name = "oc_zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcZone.findAll", query = "SELECT o FROM OcZone o"),
    @NamedQuery(name = "OcZone.findByZoneId", query = "SELECT o FROM OcZone o WHERE o.zoneId = :zoneId"),
    @NamedQuery(name = "OcZone.findByCountryId", query = "SELECT o FROM OcZone o WHERE o.countryId = :countryId"),
    @NamedQuery(name = "OcZone.findByName", query = "SELECT o FROM OcZone o WHERE o.name = :name"),
    @NamedQuery(name = "OcZone.findByCode", query = "SELECT o FROM OcZone o WHERE o.code = :code"),
    @NamedQuery(name = "OcZone.findByStatus", query = "SELECT o FROM OcZone o WHERE o.status = :status")})
public class OcZone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zone_id")
    private Integer zoneId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "country_id")
    private int countryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;

    public OcZone() {
    }

    public OcZone(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public OcZone(Integer zoneId, int countryId, String name, String code, boolean status) {
        this.zoneId = zoneId;
        this.countryId = countryId;
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        hash += (zoneId != null ? zoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcZone)) {
            return false;
        }
        OcZone other = (OcZone) object;
        if ((this.zoneId == null && other.zoneId != null) || (this.zoneId != null && !this.zoneId.equals(other.zoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcZone[ zoneId=" + zoneId + " ]";
    }
    
}
