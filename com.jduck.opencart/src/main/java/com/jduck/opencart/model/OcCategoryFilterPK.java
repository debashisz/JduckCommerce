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
public class OcCategoryFilterPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filter_id")
    private int filterId;

    public OcCategoryFilterPK() {
    }

    public OcCategoryFilterPK(int categoryId, int filterId) {
        this.categoryId = categoryId;
        this.filterId = filterId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) categoryId;
        hash += (int) filterId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryFilterPK)) {
            return false;
        }
        OcCategoryFilterPK other = (OcCategoryFilterPK) object;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (this.filterId != other.filterId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryFilterPK[ categoryId=" + categoryId + ", filterId=" + filterId + " ]";
    }
    
}
