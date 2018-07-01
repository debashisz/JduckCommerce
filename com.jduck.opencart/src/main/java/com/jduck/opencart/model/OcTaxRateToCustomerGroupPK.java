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
public class OcTaxRateToCustomerGroupPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_rate_id")
    private int taxRateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;

    public OcTaxRateToCustomerGroupPK() {
    }

    public OcTaxRateToCustomerGroupPK(int taxRateId, int customerGroupId) {
        this.taxRateId = taxRateId;
        this.customerGroupId = customerGroupId;
    }

    public int getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(int taxRateId) {
        this.taxRateId = taxRateId;
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
        hash += (int) taxRateId;
        hash += (int) customerGroupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTaxRateToCustomerGroupPK)) {
            return false;
        }
        OcTaxRateToCustomerGroupPK other = (OcTaxRateToCustomerGroupPK) object;
        if (this.taxRateId != other.taxRateId) {
            return false;
        }
        if (this.customerGroupId != other.customerGroupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTaxRateToCustomerGroupPK[ taxRateId=" + taxRateId + ", customerGroupId=" + customerGroupId + " ]";
    }
    
}
