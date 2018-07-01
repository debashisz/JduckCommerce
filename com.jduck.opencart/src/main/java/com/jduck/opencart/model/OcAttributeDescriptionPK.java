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
public class OcAttributeDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "attribute_id")
    private int attributeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcAttributeDescriptionPK() {
    }

    public OcAttributeDescriptionPK(int attributeId, int languageId) {
        this.attributeId = attributeId;
        this.languageId = languageId;
    }

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
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
        hash += (int) attributeId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttributeDescriptionPK)) {
            return false;
        }
        OcAttributeDescriptionPK other = (OcAttributeDescriptionPK) object;
        if (this.attributeId != other.attributeId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttributeDescriptionPK[ attributeId=" + attributeId + ", languageId=" + languageId + " ]";
    }
    
}
