/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "oc_filter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcFilter.findAll", query = "SELECT o FROM OcFilter o"),
    @NamedQuery(name = "OcFilter.findByFilterId", query = "SELECT o FROM OcFilter o WHERE o.filterId = :filterId"),
    @NamedQuery(name = "OcFilter.findByFilterGroupId", query = "SELECT o FROM OcFilter o WHERE o.filterGroupId = :filterGroupId"),
    @NamedQuery(name = "OcFilter.findBySortOrder", query = "SELECT o FROM OcFilter o WHERE o.sortOrder = :sortOrder")})
public class OcFilter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "filter_id")
    private Integer filterId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filter_group_id")
    private int filterGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcFilter() {
    }

    public OcFilter(Integer filterId) {
        this.filterId = filterId;
    }

    public OcFilter(Integer filterId, int filterGroupId, int sortOrder) {
        this.filterId = filterId;
        this.filterGroupId = filterGroupId;
        this.sortOrder = sortOrder;
    }

    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public int getFilterGroupId() {
        return filterGroupId;
    }

    public void setFilterGroupId(int filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filterId != null ? filterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcFilter)) {
            return false;
        }
        OcFilter other = (OcFilter) object;
        if ((this.filterId == null && other.filterId != null) || (this.filterId != null && !this.filterId.equals(other.filterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcFilter[ filterId=" + filterId + " ]";
    }
    
}
