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
@Table(name = "oc_filter_group_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcFilterGroupDescription.findAll", query = "SELECT o FROM OcFilterGroupDescription o"),
    @NamedQuery(name = "OcFilterGroupDescription.findByFilterGroupId", query = "SELECT o FROM OcFilterGroupDescription o WHERE o.ocFilterGroupDescriptionPK.filterGroupId = :filterGroupId"),
    @NamedQuery(name = "OcFilterGroupDescription.findByLanguageId", query = "SELECT o FROM OcFilterGroupDescription o WHERE o.ocFilterGroupDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcFilterGroupDescription.findByName", query = "SELECT o FROM OcFilterGroupDescription o WHERE o.name = :name")})
public class OcFilterGroupDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcFilterGroupDescriptionPK ocFilterGroupDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcFilterGroupDescription() {
    }

    public OcFilterGroupDescription(OcFilterGroupDescriptionPK ocFilterGroupDescriptionPK) {
        this.ocFilterGroupDescriptionPK = ocFilterGroupDescriptionPK;
    }

    public OcFilterGroupDescription(OcFilterGroupDescriptionPK ocFilterGroupDescriptionPK, String name) {
        this.ocFilterGroupDescriptionPK = ocFilterGroupDescriptionPK;
        this.name = name;
    }

    public OcFilterGroupDescription(int filterGroupId, int languageId) {
        this.ocFilterGroupDescriptionPK = new OcFilterGroupDescriptionPK(filterGroupId, languageId);
    }

    public OcFilterGroupDescriptionPK getOcFilterGroupDescriptionPK() {
        return ocFilterGroupDescriptionPK;
    }

    public void setOcFilterGroupDescriptionPK(OcFilterGroupDescriptionPK ocFilterGroupDescriptionPK) {
        this.ocFilterGroupDescriptionPK = ocFilterGroupDescriptionPK;
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
        hash += (ocFilterGroupDescriptionPK != null ? ocFilterGroupDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcFilterGroupDescription)) {
            return false;
        }
        OcFilterGroupDescription other = (OcFilterGroupDescription) object;
        if ((this.ocFilterGroupDescriptionPK == null && other.ocFilterGroupDescriptionPK != null) || (this.ocFilterGroupDescriptionPK != null && !this.ocFilterGroupDescriptionPK.equals(other.ocFilterGroupDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcFilterGroupDescription[ ocFilterGroupDescriptionPK=" + ocFilterGroupDescriptionPK + " ]";
    }
    
}
