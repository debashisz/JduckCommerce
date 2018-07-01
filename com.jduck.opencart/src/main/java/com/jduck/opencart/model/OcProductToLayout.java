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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_product_to_layout")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductToLayout.findAll", query = "SELECT o FROM OcProductToLayout o"),
    @NamedQuery(name = "OcProductToLayout.findByProductId", query = "SELECT o FROM OcProductToLayout o WHERE o.ocProductToLayoutPK.productId = :productId"),
    @NamedQuery(name = "OcProductToLayout.findByStoreId", query = "SELECT o FROM OcProductToLayout o WHERE o.ocProductToLayoutPK.storeId = :storeId"),
    @NamedQuery(name = "OcProductToLayout.findByLayoutId", query = "SELECT o FROM OcProductToLayout o WHERE o.layoutId = :layoutId")})
public class OcProductToLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductToLayoutPK ocProductToLayoutPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "layout_id")
    private int layoutId;

    public OcProductToLayout() {
    }

    public OcProductToLayout(OcProductToLayoutPK ocProductToLayoutPK) {
        this.ocProductToLayoutPK = ocProductToLayoutPK;
    }

    public OcProductToLayout(OcProductToLayoutPK ocProductToLayoutPK, int layoutId) {
        this.ocProductToLayoutPK = ocProductToLayoutPK;
        this.layoutId = layoutId;
    }

    public OcProductToLayout(int productId, int storeId) {
        this.ocProductToLayoutPK = new OcProductToLayoutPK(productId, storeId);
    }

    public OcProductToLayoutPK getOcProductToLayoutPK() {
        return ocProductToLayoutPK;
    }

    public void setOcProductToLayoutPK(OcProductToLayoutPK ocProductToLayoutPK) {
        this.ocProductToLayoutPK = ocProductToLayoutPK;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductToLayoutPK != null ? ocProductToLayoutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductToLayout)) {
            return false;
        }
        OcProductToLayout other = (OcProductToLayout) object;
        if ((this.ocProductToLayoutPK == null && other.ocProductToLayoutPK != null) || (this.ocProductToLayoutPK != null && !this.ocProductToLayoutPK.equals(other.ocProductToLayoutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductToLayout[ ocProductToLayoutPK=" + ocProductToLayoutPK + " ]";
    }
    
}
