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
public class OcManufacturerToStorePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "manufacturer_id")
    private int manufacturerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;

    public OcManufacturerToStorePK() {
    }

    public OcManufacturerToStorePK(int manufacturerId, int storeId) {
        this.manufacturerId = manufacturerId;
        this.storeId = storeId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) manufacturerId;
        hash += (int) storeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcManufacturerToStorePK)) {
            return false;
        }
        OcManufacturerToStorePK other = (OcManufacturerToStorePK) object;
        if (this.manufacturerId != other.manufacturerId) {
            return false;
        }
        if (this.storeId != other.storeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcManufacturerToStorePK[ manufacturerId=" + manufacturerId + ", storeId=" + storeId + " ]";
    }
    
}
