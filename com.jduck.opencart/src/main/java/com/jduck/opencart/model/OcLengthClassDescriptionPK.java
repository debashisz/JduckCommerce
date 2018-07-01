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
public class OcLengthClassDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "length_class_id")
    private int lengthClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcLengthClassDescriptionPK() {
    }

    public OcLengthClassDescriptionPK(int lengthClassId, int languageId) {
        this.lengthClassId = lengthClassId;
        this.languageId = languageId;
    }

    public int getLengthClassId() {
        return lengthClassId;
    }

    public void setLengthClassId(int lengthClassId) {
        this.lengthClassId = lengthClassId;
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
        hash += (int) lengthClassId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLengthClassDescriptionPK)) {
            return false;
        }
        OcLengthClassDescriptionPK other = (OcLengthClassDescriptionPK) object;
        if (this.lengthClassId != other.lengthClassId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLengthClassDescriptionPK[ lengthClassId=" + lengthClassId + ", languageId=" + languageId + " ]";
    }
    
}
