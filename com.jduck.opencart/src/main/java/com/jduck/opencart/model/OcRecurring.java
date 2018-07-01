/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_recurring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcRecurring.findAll", query = "SELECT o FROM OcRecurring o"),
    @NamedQuery(name = "OcRecurring.findByRecurringId", query = "SELECT o FROM OcRecurring o WHERE o.recurringId = :recurringId"),
    @NamedQuery(name = "OcRecurring.findByPrice", query = "SELECT o FROM OcRecurring o WHERE o.price = :price"),
    @NamedQuery(name = "OcRecurring.findByFrequency", query = "SELECT o FROM OcRecurring o WHERE o.frequency = :frequency"),
    @NamedQuery(name = "OcRecurring.findByDuration", query = "SELECT o FROM OcRecurring o WHERE o.duration = :duration"),
    @NamedQuery(name = "OcRecurring.findByCycle", query = "SELECT o FROM OcRecurring o WHERE o.cycle = :cycle"),
    @NamedQuery(name = "OcRecurring.findByTrialStatus", query = "SELECT o FROM OcRecurring o WHERE o.trialStatus = :trialStatus"),
    @NamedQuery(name = "OcRecurring.findByTrialPrice", query = "SELECT o FROM OcRecurring o WHERE o.trialPrice = :trialPrice"),
    @NamedQuery(name = "OcRecurring.findByTrialFrequency", query = "SELECT o FROM OcRecurring o WHERE o.trialFrequency = :trialFrequency"),
    @NamedQuery(name = "OcRecurring.findByTrialDuration", query = "SELECT o FROM OcRecurring o WHERE o.trialDuration = :trialDuration"),
    @NamedQuery(name = "OcRecurring.findByTrialCycle", query = "SELECT o FROM OcRecurring o WHERE o.trialCycle = :trialCycle"),
    @NamedQuery(name = "OcRecurring.findByStatus", query = "SELECT o FROM OcRecurring o WHERE o.status = :status"),
    @NamedQuery(name = "OcRecurring.findBySortOrder", query = "SELECT o FROM OcRecurring o WHERE o.sortOrder = :sortOrder")})
public class OcRecurring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "recurring_id")
    private Integer recurringId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "frequency")
    private String frequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duration")
    private int duration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cycle")
    private int cycle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_status")
    private short trialStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_price")
    private BigDecimal trialPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "trial_frequency")
    private String trialFrequency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_duration")
    private int trialDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trial_cycle")
    private int trialCycle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcRecurring() {
    }

    public OcRecurring(Integer recurringId) {
        this.recurringId = recurringId;
    }

    public OcRecurring(Integer recurringId, BigDecimal price, String frequency, int duration, int cycle, short trialStatus, BigDecimal trialPrice, String trialFrequency, int trialDuration, int trialCycle, short status, int sortOrder) {
        this.recurringId = recurringId;
        this.price = price;
        this.frequency = frequency;
        this.duration = duration;
        this.cycle = cycle;
        this.trialStatus = trialStatus;
        this.trialPrice = trialPrice;
        this.trialFrequency = trialFrequency;
        this.trialDuration = trialDuration;
        this.trialCycle = trialCycle;
        this.status = status;
        this.sortOrder = sortOrder;
    }

    public Integer getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(Integer recurringId) {
        this.recurringId = recurringId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public short getTrialStatus() {
        return trialStatus;
    }

    public void setTrialStatus(short trialStatus) {
        this.trialStatus = trialStatus;
    }

    public BigDecimal getTrialPrice() {
        return trialPrice;
    }

    public void setTrialPrice(BigDecimal trialPrice) {
        this.trialPrice = trialPrice;
    }

    public String getTrialFrequency() {
        return trialFrequency;
    }

    public void setTrialFrequency(String trialFrequency) {
        this.trialFrequency = trialFrequency;
    }

    public int getTrialDuration() {
        return trialDuration;
    }

    public void setTrialDuration(int trialDuration) {
        this.trialDuration = trialDuration;
    }

    public int getTrialCycle() {
        return trialCycle;
    }

    public void setTrialCycle(int trialCycle) {
        this.trialCycle = trialCycle;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recurringId != null ? recurringId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcRecurring)) {
            return false;
        }
        OcRecurring other = (OcRecurring) object;
        if ((this.recurringId == null && other.recurringId != null) || (this.recurringId != null && !this.recurringId.equals(other.recurringId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcRecurring[ recurringId=" + recurringId + " ]";
    }
    
}
