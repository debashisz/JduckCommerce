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
@Table(name = "oc_order_recurring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderRecurring.findAll", query = "SELECT o FROM OcOrderRecurring o"),
    @NamedQuery(name = "OcOrderRecurring.findByOrderRecurringId", query = "SELECT o FROM OcOrderRecurring o WHERE o.orderRecurringId = :orderRecurringId"),
    @NamedQuery(name = "OcOrderRecurring.findByOrderId", query = "SELECT o FROM OcOrderRecurring o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderRecurring.findByReference", query = "SELECT o FROM OcOrderRecurring o WHERE o.reference = :reference"),
    @NamedQuery(name = "OcOrderRecurring.findByProductId", query = "SELECT o FROM OcOrderRecurring o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcOrderRecurring.findByProductName", query = "SELECT o FROM OcOrderRecurring o WHERE o.productName = :productName"),
    @NamedQuery(name = "OcOrderRecurring.findByProductQuantity", query = "SELECT o FROM OcOrderRecurring o WHERE o.productQuantity = :productQuantity"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringId", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringId = :recurringId"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringName", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringName = :recurringName"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringDescription", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringDescription = :recurringDescription"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringFrequency", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringFrequency = :recurringFrequency"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringCycle", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringCycle = :recurringCycle"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringDuration", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringDuration = :recurringDuration"),
    @NamedQuery(name = "OcOrderRecurring.findByRecurringPrice", query = "SELECT o FROM OcOrderRecurring o WHERE o.recurringPrice = :recurringPrice"),
    @NamedQuery(name = "OcOrderRecurring.findByTrial", query = "SELECT o FROM OcOrderRecurring o WHERE o.trial = :trial"),
    @NamedQuery(name = "OcOrderRecurring.findByTrialFrequency", query = "SELECT o FROM OcOrderRecurring o WHERE o.trialFrequency = :trialFrequency"),
    @NamedQuery(name = "OcOrderRecurring.findByTrialCycle", query = "SELECT o FROM OcOrderRecurring o WHERE o.trialCycle = :trialCycle"),
    @NamedQuery(name = "OcOrderRecurring.findByTrialDuration", query = "SELECT o FROM OcOrderRecurring o WHERE o.trialDuration = :trialDuration"),
    @NamedQuery(name = "OcOrderRecurring.findByTrialPrice", query = "SELECT o FROM OcOrderRecurring o WHERE o.trialPrice = :trialPrice"),
    @NamedQuery(name = "OcOrderRecurring.findByStatus", query = "SELECT o FROM OcOrderRecurring o WHERE o.status = :status"),
    @NamedQuery(name = "OcOrderRecurring.findByDateAdded", query = "SELECT o FROM OcOrderRecurring o WHERE o.dateAdded = :dateAdded")})
public class OcOrderRecurring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_recurring_id")
    private Integer orderRecurringId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_quantity")
    private int productQuantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_id")
    private int recurringId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "recurring_name")
    private String recurringName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "recurring_description")
    private String recurringDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "recurring_frequency")
    private String recurringFrequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_cycle")
    private short recurringCycle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_duration")
    private short recurringDuration;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_price")
    private BigDecimal recurringPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial")
    private boolean trial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "trial_frequency")
    private String trialFrequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_cycle")
    private short trialCycle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_duration")
    private short trialDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_price")
    private BigDecimal trialPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcOrderRecurring() {
    }

    public OcOrderRecurring(Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public OcOrderRecurring(Integer orderRecurringId, int orderId, String reference, int productId, String productName, int productQuantity, int recurringId, String recurringName, String recurringDescription, String recurringFrequency, short recurringCycle, short recurringDuration, BigDecimal recurringPrice, boolean trial, String trialFrequency, short trialCycle, short trialDuration, BigDecimal trialPrice, short status, Date dateAdded) {
        this.orderRecurringId = orderRecurringId;
        this.orderId = orderId;
        this.reference = reference;
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.recurringId = recurringId;
        this.recurringName = recurringName;
        this.recurringDescription = recurringDescription;
        this.recurringFrequency = recurringFrequency;
        this.recurringCycle = recurringCycle;
        this.recurringDuration = recurringDuration;
        this.recurringPrice = recurringPrice;
        this.trial = trial;
        this.trialFrequency = trialFrequency;
        this.trialCycle = trialCycle;
        this.trialDuration = trialDuration;
        this.trialPrice = trialPrice;
        this.status = status;
        this.dateAdded = dateAdded;
    }

    public Integer getOrderRecurringId() {
        return orderRecurringId;
    }

    public void setOrderRecurringId(Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(int recurringId) {
        this.recurringId = recurringId;
    }

    public String getRecurringName() {
        return recurringName;
    }

    public void setRecurringName(String recurringName) {
        this.recurringName = recurringName;
    }

    public String getRecurringDescription() {
        return recurringDescription;
    }

    public void setRecurringDescription(String recurringDescription) {
        this.recurringDescription = recurringDescription;
    }

    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    public void setRecurringFrequency(String recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }

    public short getRecurringCycle() {
        return recurringCycle;
    }

    public void setRecurringCycle(short recurringCycle) {
        this.recurringCycle = recurringCycle;
    }

    public short getRecurringDuration() {
        return recurringDuration;
    }

    public void setRecurringDuration(short recurringDuration) {
        this.recurringDuration = recurringDuration;
    }

    public BigDecimal getRecurringPrice() {
        return recurringPrice;
    }

    public void setRecurringPrice(BigDecimal recurringPrice) {
        this.recurringPrice = recurringPrice;
    }

    public boolean getTrial() {
        return trial;
    }

    public void setTrial(boolean trial) {
        this.trial = trial;
    }

    public String getTrialFrequency() {
        return trialFrequency;
    }

    public void setTrialFrequency(String trialFrequency) {
        this.trialFrequency = trialFrequency;
    }

    public short getTrialCycle() {
        return trialCycle;
    }

    public void setTrialCycle(short trialCycle) {
        this.trialCycle = trialCycle;
    }

    public short getTrialDuration() {
        return trialDuration;
    }

    public void setTrialDuration(short trialDuration) {
        this.trialDuration = trialDuration;
    }

    public BigDecimal getTrialPrice() {
        return trialPrice;
    }

    public void setTrialPrice(BigDecimal trialPrice) {
        this.trialPrice = trialPrice;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
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
        hash += (orderRecurringId != null ? orderRecurringId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderRecurring)) {
            return false;
        }
        OcOrderRecurring other = (OcOrderRecurring) object;
        if ((this.orderRecurringId == null && other.orderRecurringId != null) || (this.orderRecurringId != null && !this.orderRecurringId.equals(other.orderRecurringId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderRecurring[ orderRecurringId=" + orderRecurringId + " ]";
    }
    
}
