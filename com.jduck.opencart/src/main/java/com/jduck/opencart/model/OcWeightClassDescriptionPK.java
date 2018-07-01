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
public class OcWeightClassDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "weight_class_id")
    private int weightClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcWeightClassDescriptionPK() {
    }

    public OcWeightClassDescriptionPK(int weightClassId, int languageId) {
        this.weightClassId = weightClassId;
        this.languageId = languageId;
    }

    public int getWeightClassId() {
        return weightClassId;
    }

    public void setWeightClassId(int weightClassId) {
        this.weightClassId = weightClassId;
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
        hash += (int) weightClassId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcWeightClassDescriptionPK)) {
            return false;
        }
        OcWeightClassDescriptionPK other = (OcWeightClassDescriptionPK) object;
        if (this.weightClassId != other.weightClassId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcWeightClassDescriptionPK[ weightClassId=" + weightClassId + ", languageId=" + languageId + " ]";
    }
    
}
