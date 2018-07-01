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
@Table(name = "oc_attribute_group_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcAttributeGroupDescription.findAll", query = "SELECT o FROM OcAttributeGroupDescription o"),
    @NamedQuery(name = "OcAttributeGroupDescription.findByAttributeGroupId", query = "SELECT o FROM OcAttributeGroupDescription o WHERE o.ocAttributeGroupDescriptionPK.attributeGroupId = :attributeGroupId"),
    @NamedQuery(name = "OcAttributeGroupDescription.findByLanguageId", query = "SELECT o FROM OcAttributeGroupDescription o WHERE o.ocAttributeGroupDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcAttributeGroupDescription.findByName", query = "SELECT o FROM OcAttributeGroupDescription o WHERE o.name = :name")})
public class OcAttributeGroupDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcAttributeGroupDescriptionPK ocAttributeGroupDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcAttributeGroupDescription() {
    }

    public OcAttributeGroupDescription(OcAttributeGroupDescriptionPK ocAttributeGroupDescriptionPK) {
        this.ocAttributeGroupDescriptionPK = ocAttributeGroupDescriptionPK;
    }

    public OcAttributeGroupDescription(OcAttributeGroupDescriptionPK ocAttributeGroupDescriptionPK, String name) {
        this.ocAttributeGroupDescriptionPK = ocAttributeGroupDescriptionPK;
        this.name = name;
    }

    public OcAttributeGroupDescription(int attributeGroupId, int languageId) {
        this.ocAttributeGroupDescriptionPK = new OcAttributeGroupDescriptionPK(attributeGroupId, languageId);
    }

    public OcAttributeGroupDescriptionPK getOcAttributeGroupDescriptionPK() {
        return ocAttributeGroupDescriptionPK;
    }

    public void setOcAttributeGroupDescriptionPK(OcAttributeGroupDescriptionPK ocAttributeGroupDescriptionPK) {
        this.ocAttributeGroupDescriptionPK = ocAttributeGroupDescriptionPK;
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
        hash += (ocAttributeGroupDescriptionPK != null ? ocAttributeGroupDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttributeGroupDescription)) {
            return false;
        }
        OcAttributeGroupDescription other = (OcAttributeGroupDescription) object;
        if ((this.ocAttributeGroupDescriptionPK == null && other.ocAttributeGroupDescriptionPK != null) || (this.ocAttributeGroupDescriptionPK != null && !this.ocAttributeGroupDescriptionPK.equals(other.ocAttributeGroupDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttributeGroupDescription[ ocAttributeGroupDescriptionPK=" + ocAttributeGroupDescriptionPK + " ]";
    }
    
}
