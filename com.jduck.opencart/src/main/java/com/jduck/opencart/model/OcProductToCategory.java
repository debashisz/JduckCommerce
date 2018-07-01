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
@Table(name = "oc_product_to_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductToCategory.findAll", query = "SELECT o FROM OcProductToCategory o"),
    @NamedQuery(name = "OcProductToCategory.findByProductId", query = "SELECT o FROM OcProductToCategory o WHERE o.ocProductToCategoryPK.productId = :productId"),
    @NamedQuery(name = "OcProductToCategory.findByCategoryId", query = "SELECT o FROM OcProductToCategory o WHERE o.ocProductToCategoryPK.categoryId = :categoryId")})
public class OcProductToCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductToCategoryPK ocProductToCategoryPK;

    public OcProductToCategory() {
    }

    public OcProductToCategory(OcProductToCategoryPK ocProductToCategoryPK) {
        this.ocProductToCategoryPK = ocProductToCategoryPK;
    }

    public OcProductToCategory(int productId, int categoryId) {
        this.ocProductToCategoryPK = new OcProductToCategoryPK(productId, categoryId);
    }

    public OcProductToCategoryPK getOcProductToCategoryPK() {
        return ocProductToCategoryPK;
    }

    public void setOcProductToCategoryPK(OcProductToCategoryPK ocProductToCategoryPK) {
        this.ocProductToCategoryPK = ocProductToCategoryPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductToCategoryPK != null ? ocProductToCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductToCategory)) {
            return false;
        }
        OcProductToCategory other = (OcProductToCategory) object;
        if ((this.ocProductToCategoryPK == null && other.ocProductToCategoryPK != null) || (this.ocProductToCategoryPK != null && !this.ocProductToCategoryPK.equals(other.ocProductToCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductToCategory[ ocProductToCategoryPK=" + ocProductToCategoryPK + " ]";
    }
    
}
