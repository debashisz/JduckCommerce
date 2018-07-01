/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
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
@Table(name = "oc_customer_reward")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerReward.findAll", query = "SELECT o FROM OcCustomerReward o"),
    @NamedQuery(name = "OcCustomerReward.findByCustomerRewardId", query = "SELECT o FROM OcCustomerReward o WHERE o.customerRewardId = :customerRewardId"),
    @NamedQuery(name = "OcCustomerReward.findByCustomerId", query = "SELECT o FROM OcCustomerReward o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerReward.findByOrderId", query = "SELECT o FROM OcCustomerReward o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcCustomerReward.findByPoints", query = "SELECT o FROM OcCustomerReward o WHERE o.points = :points"),
    @NamedQuery(name = "OcCustomerReward.findByDateAdded", query = "SELECT o FROM OcCustomerReward o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerReward implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_reward_id")
    private Integer customerRewardId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "points")
    private int points;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerReward() {
    }

    public OcCustomerReward(Integer customerRewardId) {
        this.customerRewardId = customerRewardId;
    }

    public OcCustomerReward(Integer customerRewardId, int customerId, int orderId, String description, int points, Date dateAdded) {
        this.customerRewardId = customerRewardId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.description = description;
        this.points = points;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerRewardId() {
        return customerRewardId;
    }

    public void setCustomerRewardId(Integer customerRewardId) {
        this.customerRewardId = customerRewardId;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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
        hash += (customerRewardId != null ? customerRewardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerReward)) {
            return false;
        }
        OcCustomerReward other = (OcCustomerReward) object;
        if ((this.customerRewardId == null && other.customerRewardId != null) || (this.customerRewardId != null && !this.customerRewardId.equals(other.customerRewardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerReward[ customerRewardId=" + customerRewardId + " ]";
    }
    
}
