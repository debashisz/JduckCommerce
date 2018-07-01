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
@Table(name = "oc_attribute_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcAttributeGroup.findAll", query = "SELECT o FROM OcAttributeGroup o"),
    @NamedQuery(name = "OcAttributeGroup.findByAttributeGroupId", query = "SELECT o FROM OcAttributeGroup o WHERE o.attributeGroupId = :attributeGroupId"),
    @NamedQuery(name = "OcAttributeGroup.findBySortOrder", query = "SELECT o FROM OcAttributeGroup o WHERE o.sortOrder = :sortOrder")})
public class OcAttributeGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "attribute_group_id")
    private Integer attributeGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcAttributeGroup() {
    }

    public OcAttributeGroup(Integer attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    public OcAttributeGroup(Integer attributeGroupId, int sortOrder) {
        this.attributeGroupId = attributeGroupId;
        this.sortOrder = sortOrder;
    }

    public Integer getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(Integer attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
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
        hash += (attributeGroupId != null ? attributeGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttributeGroup)) {
            return false;
        }
        OcAttributeGroup other = (OcAttributeGroup) object;
        if ((this.attributeGroupId == null && other.attributeGroupId != null) || (this.attributeGroupId != null && !this.attributeGroupId.equals(other.attributeGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttributeGroup[ attributeGroupId=" + attributeGroupId + " ]";
    }
    
}
