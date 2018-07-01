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
public class OcCategoryPathPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "path_id")
    private int pathId;

    public OcCategoryPathPK() {
    }

    public OcCategoryPathPK(int categoryId, int pathId) {
        this.categoryId = categoryId;
        this.pathId = pathId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPathId() {
        return pathId;
    }

    public void setPathId(int pathId) {
        this.pathId = pathId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) categoryId;
        hash += (int) pathId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryPathPK)) {
            return false;
        }
        OcCategoryPathPK other = (OcCategoryPathPK) object;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (this.pathId != other.pathId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryPathPK[ categoryId=" + categoryId + ", pathId=" + pathId + " ]";
    }
    
}
