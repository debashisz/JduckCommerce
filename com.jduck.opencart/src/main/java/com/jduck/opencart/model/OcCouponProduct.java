/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_coupon_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCouponProduct.findAll", query = "SELECT o FROM OcCouponProduct o"),
    @NamedQuery(name = "OcCouponProduct.findByCouponProductId", query = "SELECT o FROM OcCouponProduct o WHERE o.couponProductId = :couponProductId"),
    @NamedQuery(name = "OcCouponProduct.findByCouponId", query = "SELECT o FROM OcCouponProduct o WHERE o.couponId = :couponId"),
    @NamedQuery(name = "OcCouponProduct.findByProductId", query = "SELECT o FROM OcCouponProduct o WHERE o.productId = :productId")})
public class OcCouponProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "coupon_product_id")
    private Integer couponProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_id")
    private int couponId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;

    public OcCouponProduct() {
    }

    public OcCouponProduct(Integer couponProductId) {
        this.couponProductId = couponProductId;
    }

    public OcCouponProduct(Integer couponProductId, int couponId, int productId) {
        this.couponProductId = couponProductId;
        this.couponId = couponId;
        this.productId = productId;
    }

    public Integer getCouponProductId() {
        return couponProductId;
    }

    public void setCouponProductId(Integer couponProductId) {
        this.couponProductId = couponProductId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (couponProductId != null ? couponProductId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCouponProduct)) {
            return false;
        }
        OcCouponProduct other = (OcCouponProduct) object;
        if ((this.couponProductId == null && other.couponProductId != null) || (this.couponProductId != null && !this.couponProductId.equals(other.couponProductId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCouponProduct[ couponProductId=" + couponProductId + " ]";
    }
    
}
