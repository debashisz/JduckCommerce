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
@Table(name = "oc_custom_field_value")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomFieldValue.findAll", query = "SELECT o FROM OcCustomFieldValue o"),
    @NamedQuery(name = "OcCustomFieldValue.findByCustomFieldValueId", query = "SELECT o FROM OcCustomFieldValue o WHERE o.customFieldValueId = :customFieldValueId"),
    @NamedQuery(name = "OcCustomFieldValue.findByCustomFieldId", query = "SELECT o FROM OcCustomFieldValue o WHERE o.customFieldId = :customFieldId"),
    @NamedQuery(name = "OcCustomFieldValue.findBySortOrder", query = "SELECT o FROM OcCustomFieldValue o WHERE o.sortOrder = :sortOrder")})
public class OcCustomFieldValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "custom_field_value_id")
    private Integer customFieldValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcCustomFieldValue() {
    }

    public OcCustomFieldValue(Integer customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public OcCustomFieldValue(Integer customFieldValueId, int customFieldId, int sortOrder) {
        this.customFieldValueId = customFieldValueId;
        this.customFieldId = customFieldId;
        this.sortOrder = sortOrder;
    }

    public Integer getCustomFieldValueId() {
        return customFieldValueId;
    }

    public void setCustomFieldValueId(Integer customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
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
        hash += (customFieldValueId != null ? customFieldValueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldValue)) {
            return false;
        }
        OcCustomFieldValue other = (OcCustomFieldValue) object;
        if ((this.customFieldValueId == null && other.customFieldValueId != null) || (this.customFieldValueId != null && !this.customFieldValueId.equals(other.customFieldValueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldValue[ customFieldValueId=" + customFieldValueId + " ]";
    }
    
}
