/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_tax_rate_to_customer_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcTaxRateToCustomerGroup.findAll", query = "SELECT o FROM OcTaxRateToCustomerGroup o"),
    @NamedQuery(name = "OcTaxRateToCustomerGroup.findByTaxRateId", query = "SELECT o FROM OcTaxRateToCustomerGroup o WHERE o.ocTaxRateToCustomerGroupPK.taxRateId = :taxRateId"),
    @NamedQuery(name = "OcTaxRateToCustomerGroup.findByCustomerGroupId", query = "SELECT o FROM OcTaxRateToCustomerGroup o WHERE o.ocTaxRateToCustomerGroupPK.customerGroupId = :customerGroupId")})
public class OcTaxRateToCustomerGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcTaxRateToCustomerGroupPK ocTaxRateToCustomerGroupPK;

    public OcTaxRateToCustomerGroup() {
    }

    public OcTaxRateToCustomerGroup(OcTaxRateToCustomerGroupPK ocTaxRateToCustomerGroupPK) {
        this.ocTaxRateToCustomerGroupPK = ocTaxRateToCustomerGroupPK;
    }

    public OcTaxRateToCustomerGroup(int taxRateId, int customerGroupId) {
        this.ocTaxRateToCustomerGroupPK = new OcTaxRateToCustomerGroupPK(taxRateId, customerGroupId);
    }

    public OcTaxRateToCustomerGroupPK getOcTaxRateToCustomerGroupPK() {
        return ocTaxRateToCustomerGroupPK;
    }

    public void setOcTaxRateToCustomerGroupPK(OcTaxRateToCustomerGroupPK ocTaxRateToCustomerGroupPK) {
        this.ocTaxRateToCustomerGroupPK = ocTaxRateToCustomerGroupPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocTaxRateToCustomerGroupPK != null ? ocTaxRateToCustomerGroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTaxRateToCustomerGroup)) {
            return false;
        }
        OcTaxRateToCustomerGroup other = (OcTaxRateToCustomerGroup) object;
        if ((this.ocTaxRateToCustomerGroupPK == null && other.ocTaxRateToCustomerGroupPK != null) || (this.ocTaxRateToCustomerGroupPK != null && !this.ocTaxRateToCustomerGroupPK.equals(other.ocTaxRateToCustomerGroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTaxRateToCustomerGroup[ ocTaxRateToCustomerGroupPK=" + ocTaxRateToCustomerGroupPK + " ]";
    }
    
}
