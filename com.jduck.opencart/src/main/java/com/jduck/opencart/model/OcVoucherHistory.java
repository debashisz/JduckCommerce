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
@Table(name = "oc_voucher_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcVoucherHistory.findAll", query = "SELECT o FROM OcVoucherHistory o"),
    @NamedQuery(name = "OcVoucherHistory.findByVoucherHistoryId", query = "SELECT o FROM OcVoucherHistory o WHERE o.voucherHistoryId = :voucherHistoryId"),
    @NamedQuery(name = "OcVoucherHistory.findByVoucherId", query = "SELECT o FROM OcVoucherHistory o WHERE o.voucherId = :voucherId"),
    @NamedQuery(name = "OcVoucherHistory.findByOrderId", query = "SELECT o FROM OcVoucherHistory o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcVoucherHistory.findByAmount", query = "SELECT o FROM OcVoucherHistory o WHERE o.amount = :amount"),
    @NamedQuery(name = "OcVoucherHistory.findByDateAdded", query = "SELECT o FROM OcVoucherHistory o WHERE o.dateAdded = :dateAdded")})
public class OcVoucherHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "voucher_history_id")
    private Integer voucherHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "voucher_id")
    private int voucherId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
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

    public OcVoucherHistory() {
    }

    public OcVoucherHistory(Integer voucherHistoryId) {
        this.voucherHistoryId = voucherHistoryId;
    }

    public OcVoucherHistory(Integer voucherHistoryId, int voucherId, int orderId, BigDecimal amount, Date dateAdded) {
        this.voucherHistoryId = voucherHistoryId;
        this.voucherId = voucherId;
        this.orderId = orderId;
        this.amount = amount;
        this.dateAdded = dateAdded;
    }

    public Integer getVoucherHistoryId() {
        return voucherHistoryId;
    }

    public void setVoucherHistoryId(Integer voucherHistoryId) {
        this.voucherHistoryId = voucherHistoryId;
    }

    public int getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
        hash += (voucherHistoryId != null ? voucherHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcVoucherHistory)) {
            return false;
        }
        OcVoucherHistory other = (OcVoucherHistory) object;
        if ((this.voucherHistoryId == null && other.voucherHistoryId != null) || (this.voucherHistoryId != null && !this.voucherHistoryId.equals(other.voucherHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcVoucherHistory[ voucherHistoryId=" + voucherHistoryId + " ]";
    }
    
}
