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
@Table(name = "oc_attribute_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcAttributeDescription.findAll", query = "SELECT o FROM OcAttributeDescription o"),
    @NamedQuery(name = "OcAttributeDescription.findByAttributeId", query = "SELECT o FROM OcAttributeDescription o WHERE o.ocAttributeDescriptionPK.attributeId = :attributeId"),
    @NamedQuery(name = "OcAttributeDescription.findByLanguageId", query = "SELECT o FROM OcAttributeDescription o WHERE o.ocAttributeDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcAttributeDescription.findByName", query = "SELECT o FROM OcAttributeDescription o WHERE o.name = :name")})
public class OcAttributeDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcAttributeDescriptionPK ocAttributeDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcAttributeDescription() {
    }

    public OcAttributeDescription(OcAttributeDescriptionPK ocAttributeDescriptionPK) {
        this.ocAttributeDescriptionPK = ocAttributeDescriptionPK;
    }

    public OcAttributeDescription(OcAttributeDescriptionPK ocAttributeDescriptionPK, String name) {
        this.ocAttributeDescriptionPK = ocAttributeDescriptionPK;
        this.name = name;
    }

    public OcAttributeDescription(int attributeId, int languageId) {
        this.ocAttributeDescriptionPK = new OcAttributeDescriptionPK(attributeId, languageId);
    }

    public OcAttributeDescriptionPK getOcAttributeDescriptionPK() {
        return ocAttributeDescriptionPK;
    }

    public void setOcAttributeDescriptionPK(OcAttributeDescriptionPK ocAttributeDescriptionPK) {
        this.ocAttributeDescriptionPK = ocAttributeDescriptionPK;
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
        hash += (ocAttributeDescriptionPK != null ? ocAttributeDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttributeDescription)) {
            return false;
        }
        OcAttributeDescription other = (OcAttributeDescription) object;
        if ((this.ocAttributeDescriptionPK == null && other.ocAttributeDescriptionPK != null) || (this.ocAttributeDescriptionPK != null && !this.ocAttributeDescriptionPK.equals(other.ocAttributeDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttributeDescription[ ocAttributeDescriptionPK=" + ocAttributeDescriptionPK + " ]";
    }
    
}
