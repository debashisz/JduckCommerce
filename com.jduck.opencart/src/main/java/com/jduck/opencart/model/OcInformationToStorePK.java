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
public class OcInformationToStorePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "information_id")
    private int informationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;

    public OcInformationToStorePK() {
    }

    public OcInformationToStorePK(int informationId, int storeId) {
        this.informationId = informationId;
        this.storeId = storeId;
    }

    public int getInformationId() {
        return informationId;
    }

    public void setInformationId(int informationId) {
        this.informationId = informationId;
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
        hash += (int) informationId;
        hash += (int) storeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformationToStorePK)) {
            return false;
        }
        OcInformationToStorePK other = (OcInformationToStorePK) object;
        if (this.informationId != other.informationId) {
            return false;
        }
        if (this.storeId != other.storeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformationToStorePK[ informationId=" + informationId + ", storeId=" + storeId + " ]";
    }
    
}
