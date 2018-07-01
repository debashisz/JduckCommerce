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
@Table(name = "oc_product_to_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductToStore.findAll", query = "SELECT o FROM OcProductToStore o"),
    @NamedQuery(name = "OcProductToStore.findByProductId", query = "SELECT o FROM OcProductToStore o WHERE o.ocProductToStorePK.productId = :productId"),
    @NamedQuery(name = "OcProductToStore.findByStoreId", query = "SELECT o FROM OcProductToStore o WHERE o.ocProductToStorePK.storeId = :storeId")})
public class OcProductToStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductToStorePK ocProductToStorePK;

    public OcProductToStore() {
    }

    public OcProductToStore(OcProductToStorePK ocProductToStorePK) {
        this.ocProductToStorePK = ocProductToStorePK;
    }

    public OcProductToStore(int productId, int storeId) {
        this.ocProductToStorePK = new OcProductToStorePK(productId, storeId);
    }

    public OcProductToStorePK getOcProductToStorePK() {
        return ocProductToStorePK;
    }

    public void setOcProductToStorePK(OcProductToStorePK ocProductToStorePK) {
        this.ocProductToStorePK = ocProductToStorePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductToStorePK != null ? ocProductToStorePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductToStore)) {
            return false;
        }
        OcProductToStore other = (OcProductToStore) object;
        if ((this.ocProductToStorePK == null && other.ocProductToStorePK != null) || (this.ocProductToStorePK != null && !this.ocProductToStorePK.equals(other.ocProductToStorePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductToStore[ ocProductToStorePK=" + ocProductToStorePK + " ]";
    }
    
}
