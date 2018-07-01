/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Windows10
 */
@Embeddable
public class OcProductRecurringPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_id")
    private int recurringId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;

    public OcProductRecurringPK() {
    }

    public OcProductRecurringPK(int productId, int recurringId, int customerGroupId) {
        this.productId = productId;
        this.recurringId = recurringId;
        this.customerGroupId = customerGroupId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(int recurringId) {
        this.recurringId = recurringId;
    }

    public int getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productId;
        hash += (int) recurringId;
        hash += (int) customerGroupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductRecurringPK)) {
            return false;
        }
        OcProductRecurringPK other = (OcProductRecurringPK) object;
        if (this.productId != other.productId) {
            return false;
        }
        if (this.recurringId != other.recurringId) {
            return false;
        }
        if (this.customerGroupId != other.customerGroupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductRecurringPK[ productId=" + productId + ", recurringId=" + recurringId + ", customerGroupId=" + customerGroupId + " ]";
    }
    
}
