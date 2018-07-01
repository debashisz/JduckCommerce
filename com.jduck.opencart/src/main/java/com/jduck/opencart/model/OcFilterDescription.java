/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "oc_filter_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcFilterDescription.findAll", query = "SELECT o FROM OcFilterDescription o"),
    @NamedQuery(name = "OcFilterDescription.findByFilterId", query = "SELECT o FROM OcFilterDescription o WHERE o.ocFilterDescriptionPK.filterId = :filterId"),
    @NamedQuery(name = "OcFilterDescription.findByLanguageId", query = "SELECT o FROM OcFilterDescription o WHERE o.ocFilterDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcFilterDescription.findByFilterGroupId", query = "SELECT o FROM OcFilterDescription o WHERE o.filterGroupId = :filterGroupId"),
    @NamedQuery(name = "OcFilterDescription.findByName", query = "SELECT o FROM OcFilterDescription o WHERE o.name = :name")})
public class OcFilterDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcFilterDescriptionPK ocFilterDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filter_group_id")
    private int filterGroupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcFilterDescription() {
    }

    public OcFilterDescription(OcFilterDescriptionPK ocFilterDescriptionPK) {
        this.ocFilterDescriptionPK = ocFilterDescriptionPK;
    }

    public OcFilterDescription(OcFilterDescriptionPK ocFilterDescriptionPK, int filterGroupId, String name) {
        this.ocFilterDescriptionPK = ocFilterDescriptionPK;
        this.filterGroupId = filterGroupId;
        this.name = name;
    }

    public OcFilterDescription(int filterId, int languageId) {
        this.ocFilterDescriptionPK = new OcFilterDescriptionPK(filterId, languageId);
    }

    public OcFilterDescriptionPK getOcFilterDescriptionPK() {
        return ocFilterDescriptionPK;
    }

    public void setOcFilterDescriptionPK(OcFilterDescriptionPK ocFilterDescriptionPK) {
        this.ocFilterDescriptionPK = ocFilterDescriptionPK;
    }

    public int getFilterGroupId() {
        return filterGroupId;
    }

    public void setFilterGroupId(int filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocFilterDescriptionPK != null ? ocFilterDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcFilterDescription)) {
            return false;
        }
        OcFilterDescription other = (OcFilterDescription) object;
        if ((this.ocFilterDescriptionPK == null && other.ocFilterDescriptionPK != null) || (this.ocFilterDescriptionPK != null && !this.ocFilterDescriptionPK.equals(other.ocFilterDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcFilterDescription[ ocFilterDescriptionPK=" + ocFilterDescriptionPK + " ]";
    }
    
}
