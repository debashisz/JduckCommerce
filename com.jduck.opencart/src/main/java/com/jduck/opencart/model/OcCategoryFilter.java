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
@Table(name = "oc_category_filter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategoryFilter.findAll", query = "SELECT o FROM OcCategoryFilter o"),
    @NamedQuery(name = "OcCategoryFilter.findByCategoryId", query = "SELECT o FROM OcCategoryFilter o WHERE o.ocCategoryFilterPK.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategoryFilter.findByFilterId", query = "SELECT o FROM OcCategoryFilter o WHERE o.ocCategoryFilterPK.filterId = :filterId")})
public class OcCategoryFilter implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCategoryFilterPK ocCategoryFilterPK;

    public OcCategoryFilter() {
    }

    public OcCategoryFilter(OcCategoryFilterPK ocCategoryFilterPK) {
        this.ocCategoryFilterPK = ocCategoryFilterPK;
    }

    public OcCategoryFilter(int categoryId, int filterId) {
        this.ocCategoryFilterPK = new OcCategoryFilterPK(categoryId, filterId);
    }

    public OcCategoryFilterPK getOcCategoryFilterPK() {
        return ocCategoryFilterPK;
    }

    public void setOcCategoryFilterPK(OcCategoryFilterPK ocCategoryFilterPK) {
        this.ocCategoryFilterPK = ocCategoryFilterPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCategoryFilterPK != null ? ocCategoryFilterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryFilter)) {
            return false;
        }
        OcCategoryFilter other = (OcCategoryFilter) object;
        if ((this.ocCategoryFilterPK == null && other.ocCategoryFilterPK != null) || (this.ocCategoryFilterPK != null && !this.ocCategoryFilterPK.equals(other.ocCategoryFilterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryFilter[ ocCategoryFilterPK=" + ocCategoryFilterPK + " ]";
    }
    
}
