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
public class OcFilterGroupDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "filter_group_id")
    private int filterGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcFilterGroupDescriptionPK() {
    }

    public OcFilterGroupDescriptionPK(int filterGroupId, int languageId) {
        this.filterGroupId = filterGroupId;
        this.languageId = languageId;
    }

    public int getFilterGroupId() {
        return filterGroupId;
    }

    public void setFilterGroupId(int filterGroupId) {
        this.filterGroupId = filterGroupId;
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
        hash += (int) filterGroupId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcFilterGroupDescriptionPK)) {
            return false;
        }
        OcFilterGroupDescriptionPK other = (OcFilterGroupDescriptionPK) object;
        if (this.filterGroupId != other.filterGroupId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcFilterGroupDescriptionPK[ filterGroupId=" + filterGroupId + ", languageId=" + languageId + " ]";
    }
    
}
