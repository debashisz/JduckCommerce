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
@Table(name = "oc_attribute")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcAttribute.findAll", query = "SELECT o FROM OcAttribute o"),
    @NamedQuery(name = "OcAttribute.findByAttributeId", query = "SELECT o FROM OcAttribute o WHERE o.attributeId = :attributeId"),
    @NamedQuery(name = "OcAttribute.findByAttributeGroupId", query = "SELECT o FROM OcAttribute o WHERE o.attributeGroupId = :attributeGroupId"),
    @NamedQuery(name = "OcAttribute.findBySortOrder", query = "SELECT o FROM OcAttribute o WHERE o.sortOrder = :sortOrder")})
public class OcAttribute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "attribute_id")
    private Integer attributeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attribute_group_id")
    private int attributeGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcAttribute() {
    }

    public OcAttribute(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public OcAttribute(Integer attributeId, int attributeGroupId, int sortOrder) {
        this.attributeId = attributeId;
        this.attributeGroupId = attributeGroupId;
        this.sortOrder = sortOrder;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public int getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(int attributeGroupId) {
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
        hash += (attributeId != null ? attributeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAttribute)) {
            return false;
        }
        OcAttribute other = (OcAttribute) object;
        if ((this.attributeId == null && other.attributeId != null) || (this.attributeId != null && !this.attributeId.equals(other.attributeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAttribute[ attributeId=" + attributeId + " ]";
    }
    
}
