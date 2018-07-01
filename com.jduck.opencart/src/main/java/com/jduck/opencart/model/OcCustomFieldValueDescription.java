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
@Table(name = "oc_custom_field_value_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomFieldValueDescription.findAll", query = "SELECT o FROM OcCustomFieldValueDescription o"),
    @NamedQuery(name = "OcCustomFieldValueDescription.findByCustomFieldValueId", query = "SELECT o FROM OcCustomFieldValueDescription o WHERE o.ocCustomFieldValueDescriptionPK.customFieldValueId = :customFieldValueId"),
    @NamedQuery(name = "OcCustomFieldValueDescription.findByLanguageId", query = "SELECT o FROM OcCustomFieldValueDescription o WHERE o.ocCustomFieldValueDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcCustomFieldValueDescription.findByCustomFieldId", query = "SELECT o FROM OcCustomFieldValueDescription o WHERE o.customFieldId = :customFieldId"),
    @NamedQuery(name = "OcCustomFieldValueDescription.findByName", query = "SELECT o FROM OcCustomFieldValueDescription o WHERE o.name = :name")})
public class OcCustomFieldValueDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCustomFieldValueDescriptionPK ocCustomFieldValueDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public OcCustomFieldValueDescription() {
    }

    public OcCustomFieldValueDescription(OcCustomFieldValueDescriptionPK ocCustomFieldValueDescriptionPK) {
        this.ocCustomFieldValueDescriptionPK = ocCustomFieldValueDescriptionPK;
    }

    public OcCustomFieldValueDescription(OcCustomFieldValueDescriptionPK ocCustomFieldValueDescriptionPK, int customFieldId, String name) {
        this.ocCustomFieldValueDescriptionPK = ocCustomFieldValueDescriptionPK;
        this.customFieldId = customFieldId;
        this.name = name;
    }

    public OcCustomFieldValueDescription(int customFieldValueId, int languageId) {
        this.ocCustomFieldValueDescriptionPK = new OcCustomFieldValueDescriptionPK(customFieldValueId, languageId);
    }

    public OcCustomFieldValueDescriptionPK getOcCustomFieldValueDescriptionPK() {
        return ocCustomFieldValueDescriptionPK;
    }

    public void setOcCustomFieldValueDescriptionPK(OcCustomFieldValueDescriptionPK ocCustomFieldValueDescriptionPK) {
        this.ocCustomFieldValueDescriptionPK = ocCustomFieldValueDescriptionPK;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
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
        hash += (ocCustomFieldValueDescriptionPK != null ? ocCustomFieldValueDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldValueDescription)) {
            return false;
        }
        OcCustomFieldValueDescription other = (OcCustomFieldValueDescription) object;
        if ((this.ocCustomFieldValueDescriptionPK == null && other.ocCustomFieldValueDescriptionPK != null) || (this.ocCustomFieldValueDescriptionPK != null && !this.ocCustomFieldValueDescriptionPK.equals(other.ocCustomFieldValueDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldValueDescription[ ocCustomFieldValueDescriptionPK=" + ocCustomFieldValueDescriptionPK + " ]";
    }
    
}
