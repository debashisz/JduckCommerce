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
@Table(name = "oc_manufacturer_to_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcManufacturerToStore.findAll", query = "SELECT o FROM OcManufacturerToStore o"),
    @NamedQuery(name = "OcManufacturerToStore.findByManufacturerId", query = "SELECT o FROM OcManufacturerToStore o WHERE o.ocManufacturerToStorePK.manufacturerId = :manufacturerId"),
    @NamedQuery(name = "OcManufacturerToStore.findByStoreId", query = "SELECT o FROM OcManufacturerToStore o WHERE o.ocManufacturerToStorePK.storeId = :storeId")})
public class OcManufacturerToStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcManufacturerToStorePK ocManufacturerToStorePK;

    public OcManufacturerToStore() {
    }

    public OcManufacturerToStore(OcManufacturerToStorePK ocManufacturerToStorePK) {
        this.ocManufacturerToStorePK = ocManufacturerToStorePK;
    }

    public OcManufacturerToStore(int manufacturerId, int storeId) {
        this.ocManufacturerToStorePK = new OcManufacturerToStorePK(manufacturerId, storeId);
    }

    public OcManufacturerToStorePK getOcManufacturerToStorePK() {
        return ocManufacturerToStorePK;
    }

    public void setOcManufacturerToStorePK(OcManufacturerToStorePK ocManufacturerToStorePK) {
        this.ocManufacturerToStorePK = ocManufacturerToStorePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocManufacturerToStorePK != null ? ocManufacturerToStorePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcManufacturerToStore)) {
            return false;
        }
        OcManufacturerToStore other = (OcManufacturerToStore) object;
        if ((this.ocManufacturerToStorePK == null && other.ocManufacturerToStorePK != null) || (this.ocManufacturerToStorePK != null && !this.ocManufacturerToStorePK.equals(other.ocManufacturerToStorePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcManufacturerToStore[ ocManufacturerToStorePK=" + ocManufacturerToStorePK + " ]";
    }
    
}
