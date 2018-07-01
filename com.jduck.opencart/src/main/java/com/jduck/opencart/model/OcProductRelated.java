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
@Table(name = "oc_product_related")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductRelated.findAll", query = "SELECT o FROM OcProductRelated o"),
    @NamedQuery(name = "OcProductRelated.findByProductId", query = "SELECT o FROM OcProductRelated o WHERE o.ocProductRelatedPK.productId = :productId"),
    @NamedQuery(name = "OcProductRelated.findByRelatedId", query = "SELECT o FROM OcProductRelated o WHERE o.ocProductRelatedPK.relatedId = :relatedId")})
public class OcProductRelated implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductRelatedPK ocProductRelatedPK;

    public OcProductRelated() {
    }

    public OcProductRelated(OcProductRelatedPK ocProductRelatedPK) {
        this.ocProductRelatedPK = ocProductRelatedPK;
    }

    public OcProductRelated(int productId, int relatedId) {
        this.ocProductRelatedPK = new OcProductRelatedPK(productId, relatedId);
    }

    public OcProductRelatedPK getOcProductRelatedPK() {
        return ocProductRelatedPK;
    }

    public void setOcProductRelatedPK(OcProductRelatedPK ocProductRelatedPK) {
        this.ocProductRelatedPK = ocProductRelatedPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductRelatedPK != null ? ocProductRelatedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductRelated)) {
            return false;
        }
        OcProductRelated other = (OcProductRelated) object;
        if ((this.ocProductRelatedPK == null && other.ocProductRelatedPK != null) || (this.ocProductRelatedPK != null && !this.ocProductRelatedPK.equals(other.ocProductRelatedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductRelated[ ocProductRelatedPK=" + ocProductRelatedPK + " ]";
    }
    
}
