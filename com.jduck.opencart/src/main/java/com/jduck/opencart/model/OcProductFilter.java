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
@Table(name = "oc_product_filter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductFilter.findAll", query = "SELECT o FROM OcProductFilter o"),
    @NamedQuery(name = "OcProductFilter.findByProductId", query = "SELECT o FROM OcProductFilter o WHERE o.ocProductFilterPK.productId = :productId"),
    @NamedQuery(name = "OcProductFilter.findByFilterId", query = "SELECT o FROM OcProductFilter o WHERE o.ocProductFilterPK.filterId = :filterId")})
public class OcProductFilter implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductFilterPK ocProductFilterPK;

    public OcProductFilter() {
    }

    public OcProductFilter(OcProductFilterPK ocProductFilterPK) {
        this.ocProductFilterPK = ocProductFilterPK;
    }

    public OcProductFilter(int productId, int filterId) {
        this.ocProductFilterPK = new OcProductFilterPK(productId, filterId);
    }

    public OcProductFilterPK getOcProductFilterPK() {
        return ocProductFilterPK;
    }

    public void setOcProductFilterPK(OcProductFilterPK ocProductFilterPK) {
        this.ocProductFilterPK = ocProductFilterPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductFilterPK != null ? ocProductFilterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductFilter)) {
            return false;
        }
        OcProductFilter other = (OcProductFilter) object;
        if ((this.ocProductFilterPK == null && other.ocProductFilterPK != null) || (this.ocProductFilterPK != null && !this.ocProductFilterPK.equals(other.ocProductFilterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductFilter[ ocProductFilterPK=" + ocProductFilterPK + " ]";
    }
    
}
