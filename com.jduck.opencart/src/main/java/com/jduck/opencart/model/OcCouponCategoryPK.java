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
public class OcCouponCategoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_id")
    private int couponId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;

    public OcCouponCategoryPK() {
    }

    public OcCouponCategoryPK(int couponId, int categoryId) {
        this.couponId = couponId;
        this.categoryId = categoryId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) couponId;
        hash += (int) categoryId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCouponCategoryPK)) {
            return false;
        }
        OcCouponCategoryPK other = (OcCouponCategoryPK) object;
        if (this.couponId != other.couponId) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCouponCategoryPK[ couponId=" + couponId + ", categoryId=" + categoryId + " ]";
    }
    
}
