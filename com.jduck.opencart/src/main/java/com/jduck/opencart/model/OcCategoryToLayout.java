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
@Table(name = "oc_category_to_layout")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategoryToLayout.findAll", query = "SELECT o FROM OcCategoryToLayout o"),
    @NamedQuery(name = "OcCategoryToLayout.findByCategoryId", query = "SELECT o FROM OcCategoryToLayout o WHERE o.ocCategoryToLayoutPK.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategoryToLayout.findByStoreId", query = "SELECT o FROM OcCategoryToLayout o WHERE o.ocCategoryToLayoutPK.storeId = :storeId"),
    @NamedQuery(name = "OcCategoryToLayout.findByLayoutId", query = "SELECT o FROM OcCategoryToLayout o WHERE o.layoutId = :layoutId")})
public class OcCategoryToLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCategoryToLayoutPK ocCategoryToLayoutPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "layout_id")
    private int layoutId;

    public OcCategoryToLayout() {
    }

    public OcCategoryToLayout(OcCategoryToLayoutPK ocCategoryToLayoutPK) {
        this.ocCategoryToLayoutPK = ocCategoryToLayoutPK;
    }

    public OcCategoryToLayout(OcCategoryToLayoutPK ocCategoryToLayoutPK, int layoutId) {
        this.ocCategoryToLayoutPK = ocCategoryToLayoutPK;
        this.layoutId = layoutId;
    }

    public OcCategoryToLayout(int categoryId, int storeId) {
        this.ocCategoryToLayoutPK = new OcCategoryToLayoutPK(categoryId, storeId);
    }

    public OcCategoryToLayoutPK getOcCategoryToLayoutPK() {
        return ocCategoryToLayoutPK;
    }

    public void setOcCategoryToLayoutPK(OcCategoryToLayoutPK ocCategoryToLayoutPK) {
        this.ocCategoryToLayoutPK = ocCategoryToLayoutPK;
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
        hash += (ocCategoryToLayoutPK != null ? ocCategoryToLayoutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryToLayout)) {
            return false;
        }
        OcCategoryToLayout other = (OcCategoryToLayout) object;
        if ((this.ocCategoryToLayoutPK == null && other.ocCategoryToLayoutPK != null) || (this.ocCategoryToLayoutPK != null && !this.ocCategoryToLayoutPK.equals(other.ocCategoryToLayoutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryToLayout[ ocCategoryToLayoutPK=" + ocCategoryToLayoutPK + " ]";
    }
    
}
