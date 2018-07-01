/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Windows10
 */
@Embeddable
public class OcCustomFieldValueDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_field_value_id")
    private int customFieldValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcCustomFieldValueDescriptionPK() {
    }

    public OcCustomFieldValueDescriptionPK(int customFieldValueId, int languageId) {
        this.customFieldValueId = customFieldValueId;
        this.languageId = languageId;
    }

    public int getCustomFieldValueId() {
        return customFieldValueId;
    }

    public void setCustomFieldValueId(int customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) customFieldValueId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldValueDescriptionPK)) {
            return false;
        }
        OcCustomFieldValueDescriptionPK other = (OcCustomFieldValueDescriptionPK) object;
        if (this.customFieldValueId != other.customFieldValueId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldValueDescriptionPK[ customFieldValueId=" + customFieldValueId + ", languageId=" + languageId + " ]";
    }
    
}
