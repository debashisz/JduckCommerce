/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "oc_tax_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcTaxRate.findAll", query = "SELECT o FROM OcTaxRate o"),
    @NamedQuery(name = "OcTaxRate.findByTaxRateId", query = "SELECT o FROM OcTaxRate o WHERE o.taxRateId = :taxRateId"),
    @NamedQuery(name = "OcTaxRate.findByGeoZoneId", query = "SELECT o FROM OcTaxRate o WHERE o.geoZoneId = :geoZoneId"),
    @NamedQuery(name = "OcTaxRate.findByName", query = "SELECT o FROM OcTaxRate o WHERE o.name = :name"),
    @NamedQuery(name = "OcTaxRate.findByRate", query = "SELECT o FROM OcTaxRate o WHERE o.rate = :rate"),
    @NamedQuery(name = "OcTaxRate.findByType", query = "SELECT o FROM OcTaxRate o WHERE o.type = :type"),
    @NamedQuery(name = "OcTaxRate.findByDateAdded", query = "SELECT o FROM OcTaxRate o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcTaxRate.findByDateModified", query = "SELECT o FROM OcTaxRate o WHERE o.dateModified = :dateModified")})
public class OcTaxRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_rate_id")
    private Integer taxRateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geo_zone_id")
    private int geoZoneId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "rate")
    private BigDecimal rate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private Character type;
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

    public OcTaxRate() {
    }

    public OcTaxRate(Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public OcTaxRate(Integer taxRateId, int geoZoneId, String name, BigDecimal rate, Character type, Date dateAdded, Date dateModified) {
        this.taxRateId = taxRateId;
        this.geoZoneId = geoZoneId;
        this.name = name;
        this.rate = rate;
        this.type = type;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public int getGeoZoneId() {
        return geoZoneId;
    }

    public void setGeoZoneId(int geoZoneId) {
        this.geoZoneId = geoZoneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
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
        hash += (taxRateId != null ? taxRateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTaxRate)) {
            return false;
        }
        OcTaxRate other = (OcTaxRate) object;
        if ((this.taxRateId == null && other.taxRateId != null) || (this.taxRateId != null && !this.taxRateId.equals(other.taxRateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTaxRate[ taxRateId=" + taxRateId + " ]";
    }
    
}
