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
@Table(name = "oc_marketing")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcMarketing.findAll", query = "SELECT o FROM OcMarketing o"),
    @NamedQuery(name = "OcMarketing.findByMarketingId", query = "SELECT o FROM OcMarketing o WHERE o.marketingId = :marketingId"),
    @NamedQuery(name = "OcMarketing.findByName", query = "SELECT o FROM OcMarketing o WHERE o.name = :name"),
    @NamedQuery(name = "OcMarketing.findByCode", query = "SELECT o FROM OcMarketing o WHERE o.code = :code"),
    @NamedQuery(name = "OcMarketing.findByClicks", query = "SELECT o FROM OcMarketing o WHERE o.clicks = :clicks"),
    @NamedQuery(name = "OcMarketing.findByDateAdded", query = "SELECT o FROM OcMarketing o WHERE o.dateAdded = :dateAdded")})
public class OcMarketing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "marketing_id")
    private Integer marketingId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clicks")
    private int clicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcMarketing() {
    }

    public OcMarketing(Integer marketingId) {
        this.marketingId = marketingId;
    }

    public OcMarketing(Integer marketingId, String name, String description, String code, int clicks, Date dateAdded) {
        this.marketingId = marketingId;
        this.name = name;
        this.description = description;
        this.code = code;
        this.clicks = clicks;
        this.dateAdded = dateAdded;
    }

    public Integer getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(Integer marketingId) {
        this.marketingId = marketingId;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
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
        hash += (marketingId != null ? marketingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcMarketing)) {
            return false;
        }
        OcMarketing other = (OcMarketing) object;
        if ((this.marketingId == null && other.marketingId != null) || (this.marketingId != null && !this.marketingId.equals(other.marketingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcMarketing[ marketingId=" + marketingId + " ]";
    }
    
}
