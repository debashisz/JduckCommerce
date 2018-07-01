/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_coupon_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCouponHistory.findAll", query = "SELECT o FROM OcCouponHistory o"),
    @NamedQuery(name = "OcCouponHistory.findByCouponHistoryId", query = "SELECT o FROM OcCouponHistory o WHERE o.couponHistoryId = :couponHistoryId"),
    @NamedQuery(name = "OcCouponHistory.findByCouponId", query = "SELECT o FROM OcCouponHistory o WHERE o.couponId = :couponId"),
    @NamedQuery(name = "OcCouponHistory.findByOrderId", query = "SELECT o FROM OcCouponHistory o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcCouponHistory.findByCustomerId", query = "SELECT o FROM OcCouponHistory o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCouponHistory.findByAmount", query = "SELECT o FROM OcCouponHistory o WHERE o.amount = :amount"),
    @NamedQuery(name = "OcCouponHistory.findByDateAdded", query = "SELECT o FROM OcCouponHistory o WHERE o.dateAdded = :dateAdded")})
public class OcCouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "coupon_history_id")
    private Integer couponHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_id")
    private int couponId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCouponHistory() {
    }

    public OcCouponHistory(Integer couponHistoryId) {
        this.couponHistoryId = couponHistoryId;
    }

    public OcCouponHistory(Integer couponHistoryId, int couponId, int orderId, int customerId, BigDecimal amount, Date dateAdded) {
        this.couponHistoryId = couponHistoryId;
        this.couponId = couponId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.dateAdded = dateAdded;
    }

    public Integer getCouponHistoryId() {
        return couponHistoryId;
    }

    public void setCouponHistoryId(Integer couponHistoryId) {
        this.couponHistoryId = couponHistoryId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (couponHistoryId != null ? couponHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCouponHistory)) {
            return false;
        }
        OcCouponHistory other = (OcCouponHistory) object;
        if ((this.couponHistoryId == null && other.couponHistoryId != null) || (this.couponHistoryId != null && !this.couponHistoryId.equals(other.couponHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCouponHistory[ couponHistoryId=" + couponHistoryId + " ]";
    }
    
}
