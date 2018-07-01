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
@Table(name = "oc_product_reward")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductReward.findAll", query = "SELECT o FROM OcProductReward o"),
    @NamedQuery(name = "OcProductReward.findByProductRewardId", query = "SELECT o FROM OcProductReward o WHERE o.productRewardId = :productRewardId"),
    @NamedQuery(name = "OcProductReward.findByProductId", query = "SELECT o FROM OcProductReward o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProductReward.findByCustomerGroupId", query = "SELECT o FROM OcProductReward o WHERE o.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcProductReward.findByPoints", query = "SELECT o FROM OcProductReward o WHERE o.points = :points")})
public class OcProductReward implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_reward_id")
    private Integer productRewardId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "points")
    private int points;

    public OcProductReward() {
    }

    public OcProductReward(Integer productRewardId) {
        this.productRewardId = productRewardId;
    }

    public OcProductReward(Integer productRewardId, int productId, int customerGroupId, int points) {
        this.productRewardId = productRewardId;
        this.productId = productId;
        this.customerGroupId = customerGroupId;
        this.points = points;
    }

    public Integer getProductRewardId() {
        return productRewardId;
    }

    public void setProductRewardId(Integer productRewardId) {
        this.productRewardId = productRewardId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productRewardId != null ? productRewardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductReward)) {
            return false;
        }
        OcProductReward other = (OcProductReward) object;
        if ((this.productRewardId == null && other.productRewardId != null) || (this.productRewardId != null && !this.productRewardId.equals(other.productRewardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductReward[ productRewardId=" + productRewardId + " ]";
    }
    
}
