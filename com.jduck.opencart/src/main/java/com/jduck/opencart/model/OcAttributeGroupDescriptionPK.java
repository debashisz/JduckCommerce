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
public class OcAttributeGroupDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "attribute_group_id")
    private int attributeGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcAttributeGroupDescriptionPK() {
    }

    public OcAttributeGroupDescriptionPK(int attributeGroupId, int languageId) {
        this.attributeGroupId = attributeGroupId;
        this.languageId = languageId;
    }

    public int getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(int attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
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
        hash += (int) attributeGroupId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttributeGroupDescriptionPK)) {
            return false;
        }
        OcAttributeGroupDescriptionPK other = (OcAttributeGroupDescriptionPK) object;
        if (this.attributeGroupId != other.attributeGroupId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttributeGroupDescriptionPK[ attributeGroupId=" + attributeGroupId + ", languageId=" + languageId + " ]";
    }
    
}
