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
public class OcCustomFieldDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcCustomFieldDescriptionPK() {
    }

    public OcCustomFieldDescriptionPK(int customFieldId, int languageId) {
        this.customFieldId = customFieldId;
        this.languageId = languageId;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
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
        hash += (int) customFieldId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldDescriptionPK)) {
            return false;
        }
        OcCustomFieldDescriptionPK other = (OcCustomFieldDescriptionPK) object;
        if (this.customFieldId != other.customFieldId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldDescriptionPK[ customFieldId=" + customFieldId + ", languageId=" + languageId + " ]";
    }
    
}
