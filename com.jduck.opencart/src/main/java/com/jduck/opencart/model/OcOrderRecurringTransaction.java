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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_order_recurring_transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderRecurringTransaction.findAll", query = "SELECT o FROM OcOrderRecurringTransaction o"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByOrderRecurringTransactionId", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.orderRecurringTransactionId = :orderRecurringTransactionId"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByOrderRecurringId", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.orderRecurringId = :orderRecurringId"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByReference", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.reference = :reference"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByType", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.type = :type"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByAmount", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.amount = :amount"),
    @NamedQuery(name = "OcOrderRecurringTransaction.findByDateAdded", query = "SELECT o FROM OcOrderRecurringTransaction o WHERE o.dateAdded = :dateAdded")})
public class OcOrderRecurringTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_recurring_transaction_id")
    private Integer orderRecurringTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_recurring_id")
    private int orderRecurringId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type")
    private String type;
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

    public OcOrderRecurringTransaction() {
    }

    public OcOrderRecurringTransaction(Integer orderRecurringTransactionId) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
    }

    public OcOrderRecurringTransaction(Integer orderRecurringTransactionId, int orderRecurringId, String reference, String type, BigDecimal amount, Date dateAdded) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
        this.orderRecurringId = orderRecurringId;
        this.reference = reference;
        this.type = type;
        this.amount = amount;
        this.dateAdded = dateAdded;
    }

    public Integer getOrderRecurringTransactionId() {
        return orderRecurringTransactionId;
    }

    public void setOrderRecurringTransactionId(Integer orderRecurringTransactionId) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
    }

    public int getOrderRecurringId() {
        return orderRecurringId;
    }

    public void setOrderRecurringId(int orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (orderRecurringTransactionId != null ? orderRecurringTransactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderRecurringTransaction)) {
            return false;
        }
        OcOrderRecurringTransaction other = (OcOrderRecurringTransaction) object;
        if ((this.orderRecurringTransactionId == null && other.orderRecurringTransactionId != null) || (this.orderRecurringTransactionId != null && !this.orderRecurringTransactionId.equals(other.orderRecurringTransactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderRecurringTransaction[ orderRecurringTransactionId=" + orderRecurringTransactionId + " ]";
    }
    
}
