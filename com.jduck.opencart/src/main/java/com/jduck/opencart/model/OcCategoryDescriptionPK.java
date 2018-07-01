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
public class OcCategoryDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcCategoryDescriptionPK() {
    }

    public OcCategoryDescriptionPK(int categoryId, int languageId) {
        this.categoryId = categoryId;
        this.languageId = languageId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        hash += (int) categoryId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryDescriptionPK)) {
            return false;
        }
        OcCategoryDescriptionPK other = (OcCategoryDescriptionPK) object;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryDescriptionPK[ categoryId=" + categoryId + ", languageId=" + languageId + " ]";
    }
    
}
