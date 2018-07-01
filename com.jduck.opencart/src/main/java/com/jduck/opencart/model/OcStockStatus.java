/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_stock_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcStockStatus.findAll", query = "SELECT o FROM OcStockStatus o"),
    @NamedQuery(name = "OcStockStatus.findByStockStatusId", query = "SELECT o FROM OcStockStatus o WHERE o.ocStockStatusPK.stockStatusId = :stockStatusId"),
    @NamedQuery(name = "OcStockStatus.findByLanguageId", query = "SELECT o FROM OcStockStatus o WHERE o.ocStockStatusPK.languageId = :languageId"),
    @NamedQuery(name = "OcStockStatus.findByName", query = "SELECT o FROM OcStockStatus o WHERE o.name = :name")})
public class OcStockStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcStockStatusPK ocStockStatusPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;

    public OcStockStatus() {
    }

    public OcStockStatus(OcStockStatusPK ocStockStatusPK) {
        this.ocStockStatusPK = ocStockStatusPK;
    }

    public OcStockStatus(OcStockStatusPK ocStockStatusPK, String name) {
        this.ocStockStatusPK = ocStockStatusPK;
        this.name = name;
    }

    public OcStockStatus(int stockStatusId, int languageId) {
        this.ocStockStatusPK = new OcStockStatusPK(stockStatusId, languageId);
    }

    public OcStockStatusPK getOcStockStatusPK() {
        return ocStockStatusPK;
    }

    public void setOcStockStatusPK(OcStockStatusPK ocStockStatusPK) {
        this.ocStockStatusPK = ocStockStatusPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocStockStatusPK != null ? ocStockStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcStockStatus)) {
            return false;
        }
        OcStockStatus other = (OcStockStatus) object;
        if ((this.ocStockStatusPK == null && other.ocStockStatusPK != null) || (this.ocStockStatusPK != null && !this.ocStockStatusPK.equals(other.ocStockStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcStockStatus[ ocStockStatusPK=" + ocStockStatusPK + " ]";
    }
    
}
