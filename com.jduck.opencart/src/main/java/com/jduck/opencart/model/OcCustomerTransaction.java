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
import javax.persistence.Lob;
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
@Table(name = "oc_customer_transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerTransaction.findAll", query = "SELECT o FROM OcCustomerTransaction o"),
    @NamedQuery(name = "OcCustomerTransaction.findByCustomerTransactionId", query = "SELECT o FROM OcCustomerTransaction o WHERE o.customerTransactionId = :customerTransactionId"),
    @NamedQuery(name = "OcCustomerTransaction.findByCustomerId", query = "SELECT o FROM OcCustomerTransaction o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerTransaction.findByOrderId", query = "SELECT o FROM OcCustomerTransaction o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcCustomerTransaction.findByAmount", query = "SELECT o FROM OcCustomerTransaction o WHERE o.amount = :amount"),
    @NamedQuery(name = "OcCustomerTransaction.findByDateAdded", query = "SELECT o FROM OcCustomerTransaction o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_transaction_id")
    private Integer customerTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
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

    public OcCustomerTransaction() {
    }

    public OcCustomerTransaction(Integer customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }

    public OcCustomerTransaction(Integer customerTransactionId, int customerId, int orderId, String description, BigDecimal amount, Date dateAdded) {
        this.customerTransactionId = customerTransactionId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.description = description;
        this.amount = amount;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerTransactionId() {
        return customerTransactionId;
    }

    public void setCustomerTransactionId(Integer customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (customerTransactionId != null ? customerTransactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerTransaction)) {
            return false;
        }
        OcCustomerTransaction other = (OcCustomerTransaction) object;
        if ((this.customerTransactionId == null && other.customerTransactionId != null) || (this.customerTransactionId != null && !this.customerTransactionId.equals(other.customerTransactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerTransaction[ customerTransactionId=" + customerTransactionId + " ]";
    }
    
}
