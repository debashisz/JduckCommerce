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
public class OcProductRelatedPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "related_id")
    private int relatedId;

    public OcProductRelatedPK() {
    }

    public OcProductRelatedPK(int productId, int relatedId) {
        this.productId = productId;
        this.relatedId = relatedId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(int relatedId) {
        this.relatedId = relatedId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productId;
        hash += (int) relatedId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductRelatedPK)) {
            return false;
        }
        OcProductRelatedPK other = (OcProductRelatedPK) object;
        if (this.productId != other.productId) {
            return false;
        }
        if (this.relatedId != other.relatedId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductRelatedPK[ productId=" + productId + ", relatedId=" + relatedId + " ]";
    }
    
}
