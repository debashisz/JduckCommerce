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
@Table(name = "oc_filter_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcFilterGroup.findAll", query = "SELECT o FROM OcFilterGroup o"),
    @NamedQuery(name = "OcFilterGroup.findByFilterGroupId", query = "SELECT o FROM OcFilterGroup o WHERE o.filterGroupId = :filterGroupId"),
    @NamedQuery(name = "OcFilterGroup.findBySortOrder", query = "SELECT o FROM OcFilterGroup o WHERE o.sortOrder = :sortOrder")})
public class OcFilterGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "filter_group_id")
    private Integer filterGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcFilterGroup() {
    }

    public OcFilterGroup(Integer filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    public OcFilterGroup(Integer filterGroupId, int sortOrder) {
        this.filterGroupId = filterGroupId;
        this.sortOrder = sortOrder;
    }

    public Integer getFilterGroupId() {
        return filterGroupId;
    }

    public void setFilterGroupId(Integer filterGroupId) {
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
        hash += (filterGroupId != null ? filterGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcFilterGroup)) {
            return false;
        }
        OcFilterGroup other = (OcFilterGroup) object;
        if ((this.filterGroupId == null && other.filterGroupId != null) || (this.filterGroupId != null && !this.filterGroupId.equals(other.filterGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcFilterGroup[ filterGroupId=" + filterGroupId + " ]";
    }
    
}
