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
@Table(name = "oc_geo_zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcGeoZone.findAll", query = "SELECT o FROM OcGeoZone o"),
    @NamedQuery(name = "OcGeoZone.findByGeoZoneId", query = "SELECT o FROM OcGeoZone o WHERE o.geoZoneId = :geoZoneId"),
    @NamedQuery(name = "OcGeoZone.findByName", query = "SELECT o FROM OcGeoZone o WHERE o.name = :name"),
    @NamedQuery(name = "OcGeoZone.findByDescription", query = "SELECT o FROM OcGeoZone o WHERE o.description = :description"),
    @NamedQuery(name = "OcGeoZone.findByDateAdded", query = "SELECT o FROM OcGeoZone o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcGeoZone.findByDateModified", query = "SELECT o FROM OcGeoZone o WHERE o.dateModified = :dateModified")})
public class OcGeoZone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "geo_zone_id")
    private Integer geoZoneId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
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

    public OcGeoZone() {
    }

    public OcGeoZone(Integer geoZoneId) {
        this.geoZoneId = geoZoneId;
    }

    public OcGeoZone(Integer geoZoneId, String name, String description, Date dateAdded, Date dateModified) {
        this.geoZoneId = geoZoneId;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getGeoZoneId() {
        return geoZoneId;
    }

    public void setGeoZoneId(Integer geoZoneId) {
        this.geoZoneId = geoZoneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (geoZoneId != null ? geoZoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcGeoZone)) {
            return false;
        }
        OcGeoZone other = (OcGeoZone) object;
        if ((this.geoZoneId == null && other.geoZoneId != null) || (this.geoZoneId != null && !this.geoZoneId.equals(other.geoZoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcGeoZone[ geoZoneId=" + geoZoneId + " ]";
    }
    
}
