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
@Table(name = "oc_category_to_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategoryToStore.findAll", query = "SELECT o FROM OcCategoryToStore o"),
    @NamedQuery(name = "OcCategoryToStore.findByCategoryId", query = "SELECT o FROM OcCategoryToStore o WHERE o.ocCategoryToStorePK.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategoryToStore.findByStoreId", query = "SELECT o FROM OcCategoryToStore o WHERE o.ocCategoryToStorePK.storeId = :storeId")})
public class OcCategoryToStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCategoryToStorePK ocCategoryToStorePK;

    public OcCategoryToStore() {
    }

    public OcCategoryToStore(OcCategoryToStorePK ocCategoryToStorePK) {
        this.ocCategoryToStorePK = ocCategoryToStorePK;
    }

    public OcCategoryToStore(int categoryId, int storeId) {
        this.ocCategoryToStorePK = new OcCategoryToStorePK(categoryId, storeId);
    }

    public OcCategoryToStorePK getOcCategoryToStorePK() {
        return ocCategoryToStorePK;
    }

    public void setOcCategoryToStorePK(OcCategoryToStorePK ocCategoryToStorePK) {
        this.ocCategoryToStorePK = ocCategoryToStorePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCategoryToStorePK != null ? ocCategoryToStorePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryToStore)) {
            return false;
        }
        OcCategoryToStore other = (OcCategoryToStore) object;
        if ((this.ocCategoryToStorePK == null && other.ocCategoryToStorePK != null) || (this.ocCategoryToStorePK != null && !this.ocCategoryToStorePK.equals(other.ocCategoryToStorePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryToStore[ ocCategoryToStorePK=" + ocCategoryToStorePK + " ]";
    }
    
}
