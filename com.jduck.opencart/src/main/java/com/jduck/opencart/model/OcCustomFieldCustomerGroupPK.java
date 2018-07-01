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
public class OcCustomFieldCustomerGroupPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;

    public OcCustomFieldCustomerGroupPK() {
    }

    public OcCustomFieldCustomerGroupPK(int customFieldId, int customerGroupId) {
        this.customFieldId = customFieldId;
        this.customerGroupId = customerGroupId;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
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
        hash += (int) customFieldId;
        hash += (int) customerGroupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldCustomerGroupPK)) {
            return false;
        }
        OcCustomFieldCustomerGroupPK other = (OcCustomFieldCustomerGroupPK) object;
        if (this.customFieldId != other.customFieldId) {
            return false;
        }
        if (this.customerGroupId != other.customerGroupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldCustomerGroupPK[ customFieldId=" + customFieldId + ", customerGroupId=" + customerGroupId + " ]";
    }
    
}
