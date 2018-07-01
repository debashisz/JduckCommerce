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
@Table(name = "oc_product_recurring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductRecurring.findAll", query = "SELECT o FROM OcProductRecurring o"),
    @NamedQuery(name = "OcProductRecurring.findByProductId", query = "SELECT o FROM OcProductRecurring o WHERE o.ocProductRecurringPK.productId = :productId"),
    @NamedQuery(name = "OcProductRecurring.findByRecurringId", query = "SELECT o FROM OcProductRecurring o WHERE o.ocProductRecurringPK.recurringId = :recurringId"),
    @NamedQuery(name = "OcProductRecurring.findByCustomerGroupId", query = "SELECT o FROM OcProductRecurring o WHERE o.ocProductRecurringPK.customerGroupId = :customerGroupId")})
public class OcProductRecurring implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductRecurringPK ocProductRecurringPK;

    public OcProductRecurring() {
    }

    public OcProductRecurring(OcProductRecurringPK ocProductRecurringPK) {
        this.ocProductRecurringPK = ocProductRecurringPK;
    }

    public OcProductRecurring(int productId, int recurringId, int customerGroupId) {
        this.ocProductRecurringPK = new OcProductRecurringPK(productId, recurringId, customerGroupId);
    }

    public OcProductRecurringPK getOcProductRecurringPK() {
        return ocProductRecurringPK;
    }

    public void setOcProductRecurringPK(OcProductRecurringPK ocProductRecurringPK) {
        this.ocProductRecurringPK = ocProductRecurringPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductRecurringPK != null ? ocProductRecurringPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductRecurring)) {
            return false;
        }
        OcProductRecurring other = (OcProductRecurring) object;
        if ((this.ocProductRecurringPK == null && other.ocProductRecurringPK != null) || (this.ocProductRecurringPK != null && !this.ocProductRecurringPK.equals(other.ocProductRecurringPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductRecurring[ ocProductRecurringPK=" + ocProductRecurringPK + " ]";
    }
    
}
