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
@Table(name = "oc_information_to_layout")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcInformationToLayout.findAll", query = "SELECT o FROM OcInformationToLayout o"),
    @NamedQuery(name = "OcInformationToLayout.findByInformationId", query = "SELECT o FROM OcInformationToLayout o WHERE o.ocInformationToLayoutPK.informationId = :informationId"),
    @NamedQuery(name = "OcInformationToLayout.findByStoreId", query = "SELECT o FROM OcInformationToLayout o WHERE o.ocInformationToLayoutPK.storeId = :storeId"),
    @NamedQuery(name = "OcInformationToLayout.findByLayoutId", query = "SELECT o FROM OcInformationToLayout o WHERE o.layoutId = :layoutId")})
public class OcInformationToLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcInformationToLayoutPK ocInformationToLayoutPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "layout_id")
    private int layoutId;

    public OcInformationToLayout() {
    }

    public OcInformationToLayout(OcInformationToLayoutPK ocInformationToLayoutPK) {
        this.ocInformationToLayoutPK = ocInformationToLayoutPK;
    }

    public OcInformationToLayout(OcInformationToLayoutPK ocInformationToLayoutPK, int layoutId) {
        this.ocInformationToLayoutPK = ocInformationToLayoutPK;
        this.layoutId = layoutId;
    }

    public OcInformationToLayout(int informationId, int storeId) {
        this.ocInformationToLayoutPK = new OcInformationToLayoutPK(informationId, storeId);
    }

    public OcInformationToLayoutPK getOcInformationToLayoutPK() {
        return ocInformationToLayoutPK;
    }

    public void setOcInformationToLayoutPK(OcInformationToLayoutPK ocInformationToLayoutPK) {
        this.ocInformationToLayoutPK = ocInformationToLayoutPK;
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
        hash += (ocInformationToLayoutPK != null ? ocInformationToLayoutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformationToLayout)) {
            return false;
        }
        OcInformationToLayout other = (OcInformationToLayout) object;
        if ((this.ocInformationToLayoutPK == null && other.ocInformationToLayoutPK != null) || (this.ocInformationToLayoutPK != null && !this.ocInformationToLayoutPK.equals(other.ocInformationToLayoutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformationToLayout[ ocInformationToLayoutPK=" + ocInformationToLayoutPK + " ]";
    }
    
}
