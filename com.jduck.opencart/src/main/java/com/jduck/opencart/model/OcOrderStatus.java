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
@Table(name = "oc_order_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderStatus.findAll", query = "SELECT o FROM OcOrderStatus o"),
    @NamedQuery(name = "OcOrderStatus.findByOrderStatusId", query = "SELECT o FROM OcOrderStatus o WHERE o.ocOrderStatusPK.orderStatusId = :orderStatusId"),
    @NamedQuery(name = "OcOrderStatus.findByLanguageId", query = "SELECT o FROM OcOrderStatus o WHERE o.ocOrderStatusPK.languageId = :languageId"),
    @NamedQuery(name = "OcOrderStatus.findByName", query = "SELECT o FROM OcOrderStatus o WHERE o.name = :name")})
public class OcOrderStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcOrderStatusPK ocOrderStatusPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;

    public OcOrderStatus() {
    }

    public OcOrderStatus(OcOrderStatusPK ocOrderStatusPK) {
        this.ocOrderStatusPK = ocOrderStatusPK;
    }

    public OcOrderStatus(OcOrderStatusPK ocOrderStatusPK, String name) {
        this.ocOrderStatusPK = ocOrderStatusPK;
        this.name = name;
    }

    public OcOrderStatus(int orderStatusId, int languageId) {
        this.ocOrderStatusPK = new OcOrderStatusPK(orderStatusId, languageId);
    }

    public OcOrderStatusPK getOcOrderStatusPK() {
        return ocOrderStatusPK;
    }

    public void setOcOrderStatusPK(OcOrderStatusPK ocOrderStatusPK) {
        this.ocOrderStatusPK = ocOrderStatusPK;
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
        hash += (ocOrderStatusPK != null ? ocOrderStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderStatus)) {
            return false;
        }
        OcOrderStatus other = (OcOrderStatus) object;
        if ((this.ocOrderStatusPK == null && other.ocOrderStatusPK != null) || (this.ocOrderStatusPK != null && !this.ocOrderStatusPK.equals(other.ocOrderStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderStatus[ ocOrderStatusPK=" + ocOrderStatusPK + " ]";
    }
    
}
