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
@Table(name = "oc_tax_class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcTaxClass.findAll", query = "SELECT o FROM OcTaxClass o"),
    @NamedQuery(name = "OcTaxClass.findByTaxClassId", query = "SELECT o FROM OcTaxClass o WHERE o.taxClassId = :taxClassId"),
    @NamedQuery(name = "OcTaxClass.findByTitle", query = "SELECT o FROM OcTaxClass o WHERE o.title = :title"),
    @NamedQuery(name = "OcTaxClass.findByDescription", query = "SELECT o FROM OcTaxClass o WHERE o.description = :description"),
    @NamedQuery(name = "OcTaxClass.findByDateAdded", query = "SELECT o FROM OcTaxClass o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcTaxClass.findByDateModified", query = "SELECT o FROM OcTaxClass o WHERE o.dateModified = :dateModified")})
public class OcTaxClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_class_id")
    private Integer taxClassId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "title")
    private String title;
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

    public OcTaxClass() {
    }

    public OcTaxClass(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public OcTaxClass(Integer taxClassId, String title, String description, Date dateAdded, Date dateModified) {
        this.taxClassId = taxClassId;
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        hash += (taxClassId != null ? taxClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTaxClass)) {
            return false;
        }
        OcTaxClass other = (OcTaxClass) object;
        if ((this.taxClassId == null && other.taxClassId != null) || (this.taxClassId != null && !this.taxClassId.equals(other.taxClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTaxClass[ taxClassId=" + taxClassId + " ]";
    }
    
}
