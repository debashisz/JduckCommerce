/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_coupon_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCouponCategory.findAll", query = "SELECT o FROM OcCouponCategory o"),
    @NamedQuery(name = "OcCouponCategory.findByCouponId", query = "SELECT o FROM OcCouponCategory o WHERE o.ocCouponCategoryPK.couponId = :couponId"),
    @NamedQuery(name = "OcCouponCategory.findByCategoryId", query = "SELECT o FROM OcCouponCategory o WHERE o.ocCouponCategoryPK.categoryId = :categoryId")})
public class OcCouponCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCouponCategoryPK ocCouponCategoryPK;

    public OcCouponCategory() {
    }

    public OcCouponCategory(OcCouponCategoryPK ocCouponCategoryPK) {
        this.ocCouponCategoryPK = ocCouponCategoryPK;
    }

    public OcCouponCategory(int couponId, int categoryId) {
        this.ocCouponCategoryPK = new OcCouponCategoryPK(couponId, categoryId);
    }

    public OcCouponCategoryPK getOcCouponCategoryPK() {
        return ocCouponCategoryPK;
    }

    public void setOcCouponCategoryPK(OcCouponCategoryPK ocCouponCategoryPK) {
        this.ocCouponCategoryPK = ocCouponCategoryPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCouponCategoryPK != null ? ocCouponCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCouponCategory)) {
            return false;
        }
        OcCouponCategory other = (OcCouponCategory) object;
        if ((this.ocCouponCategoryPK == null && other.ocCouponCategoryPK != null) || (this.ocCouponCategoryPK != null && !this.ocCouponCategoryPK.equals(other.ocCouponCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCouponCategory[ ocCouponCategoryPK=" + ocCouponCategoryPK + " ]";
    }
    
}
