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
@Table(name = "oc_custom_field_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomFieldDescription.findAll", query = "SELECT o FROM OcCustomFieldDescription o"),
    @NamedQuery(name = "OcCustomFieldDescription.findByCustomFieldId", query = "SELECT o FROM OcCustomFieldDescription o WHERE o.ocCustomFieldDescriptionPK.customFieldId = :customFieldId"),
    @NamedQuery(name = "OcCustomFieldDescription.findByLanguageId", query = "SELECT o FROM OcCustomFieldDescription o WHERE o.ocCustomFieldDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcCustomFieldDescription.findByName", query = "SELECT o FROM OcCustomFieldDescription o WHERE o.name = :name")})
public class OcCustomFieldDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCustomFieldDescriptionPK ocCustomFieldDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public OcCustomFieldDescription() {
    }

    public OcCustomFieldDescription(OcCustomFieldDescriptionPK ocCustomFieldDescriptionPK) {
        this.ocCustomFieldDescriptionPK = ocCustomFieldDescriptionPK;
    }

    public OcCustomFieldDescription(OcCustomFieldDescriptionPK ocCustomFieldDescriptionPK, String name) {
        this.ocCustomFieldDescriptionPK = ocCustomFieldDescriptionPK;
        this.name = name;
    }

    public OcCustomFieldDescription(int customFieldId, int languageId) {
        this.ocCustomFieldDescriptionPK = new OcCustomFieldDescriptionPK(customFieldId, languageId);
    }

    public OcCustomFieldDescriptionPK getOcCustomFieldDescriptionPK() {
        return ocCustomFieldDescriptionPK;
    }

    public void setOcCustomFieldDescriptionPK(OcCustomFieldDescriptionPK ocCustomFieldDescriptionPK) {
        this.ocCustomFieldDescriptionPK = ocCustomFieldDescriptionPK;
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
        hash += (ocCustomFieldDescriptionPK != null ? ocCustomFieldDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldDescription)) {
            return false;
        }
        OcCustomFieldDescription other = (OcCustomFieldDescription) object;
        if ((this.ocCustomFieldDescriptionPK == null && other.ocCustomFieldDescriptionPK != null) || (this.ocCustomFieldDescriptionPK != null && !this.ocCustomFieldDescriptionPK.equals(other.ocCustomFieldDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldDescription[ ocCustomFieldDescriptionPK=" + ocCustomFieldDescriptionPK + " ]";
    }
    
}
