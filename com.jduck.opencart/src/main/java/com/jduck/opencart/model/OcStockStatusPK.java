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
public class OcStockStatusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "stock_status_id")
    private int stockStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcStockStatusPK() {
    }

    public OcStockStatusPK(int stockStatusId, int languageId) {
        this.stockStatusId = stockStatusId;
        this.languageId = languageId;
    }

    public int getStockStatusId() {
        return stockStatusId;
    }

    public void setStockStatusId(int stockStatusId) {
        this.stockStatusId = stockStatusId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) stockStatusId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcStockStatusPK)) {
            return false;
        }
        OcStockStatusPK other = (OcStockStatusPK) object;
        if (this.stockStatusId != other.stockStatusId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcStockStatusPK[ stockStatusId=" + stockStatusId + ", languageId=" + languageId + " ]";
    }
    
}
