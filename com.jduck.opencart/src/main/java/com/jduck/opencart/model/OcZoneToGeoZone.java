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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_zone_to_geo_zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcZoneToGeoZone.findAll", query = "SELECT o FROM OcZoneToGeoZone o"),
    @NamedQuery(name = "OcZoneToGeoZone.findByZoneToGeoZoneId", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.zoneToGeoZoneId = :zoneToGeoZoneId"),
    @NamedQuery(name = "OcZoneToGeoZone.findByCountryId", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.countryId = :countryId"),
    @NamedQuery(name = "OcZoneToGeoZone.findByZoneId", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.zoneId = :zoneId"),
    @NamedQuery(name = "OcZoneToGeoZone.findByGeoZoneId", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.geoZoneId = :geoZoneId"),
    @NamedQuery(name = "OcZoneToGeoZone.findByDateAdded", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcZoneToGeoZone.findByDateModified", query = "SELECT o FROM OcZoneToGeoZone o WHERE o.dateModified = :dateModified")})
public class OcZoneToGeoZone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zone_to_geo_zone_id")
    private Integer zoneToGeoZoneId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "country_id")
    private int countryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zone_id")
    private int zoneId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geo_zone_id")
    private int geoZoneId;
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

    public OcZoneToGeoZone() {
    }

    public OcZoneToGeoZone(Integer zoneToGeoZoneId) {
        this.zoneToGeoZoneId = zoneToGeoZoneId;
    }

    public OcZoneToGeoZone(Integer zoneToGeoZoneId, int countryId, int zoneId, int geoZoneId, Date dateAdded, Date dateModified) {
        this.zoneToGeoZoneId = zoneToGeoZoneId;
        this.countryId = countryId;
        this.zoneId = zoneId;
        this.geoZoneId = geoZoneId;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getZoneToGeoZoneId() {
        return zoneToGeoZoneId;
    }

    public void setZoneToGeoZoneId(Integer zoneToGeoZoneId) {
        this.zoneToGeoZoneId = zoneToGeoZoneId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public int getGeoZoneId() {
        return geoZoneId;
    }

    public void setGeoZoneId(int geoZoneId) {
        this.geoZoneId = geoZoneId;
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
        hash += (zoneToGeoZoneId != null ? zoneToGeoZoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcZoneToGeoZone)) {
            return false;
        }
        OcZoneToGeoZone other = (OcZoneToGeoZone) object;
        if ((this.zoneToGeoZoneId == null && other.zoneToGeoZoneId != null) || (this.zoneToGeoZoneId != null && !this.zoneToGeoZoneId.equals(other.zoneToGeoZoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcZoneToGeoZone[ zoneToGeoZoneId=" + zoneToGeoZoneId + " ]";
    }
    
}
