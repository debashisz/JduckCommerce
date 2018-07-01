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
import javax.persistence.Lob;
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
@Table(name = "oc_custom_field")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomField.findAll", query = "SELECT o FROM OcCustomField o"),
    @NamedQuery(name = "OcCustomField.findByCustomFieldId", query = "SELECT o FROM OcCustomField o WHERE o.customFieldId = :customFieldId"),
    @NamedQuery(name = "OcCustomField.findByType", query = "SELECT o FROM OcCustomField o WHERE o.type = :type"),
    @NamedQuery(name = "OcCustomField.findByValidation", query = "SELECT o FROM OcCustomField o WHERE o.validation = :validation"),
    @NamedQuery(name = "OcCustomField.findByLocation", query = "SELECT o FROM OcCustomField o WHERE o.location = :location"),
    @NamedQuery(name = "OcCustomField.findByStatus", query = "SELECT o FROM OcCustomField o WHERE o.status = :status"),
    @NamedQuery(name = "OcCustomField.findBySortOrder", query = "SELECT o FROM OcCustomField o WHERE o.sortOrder = :sortOrder")})
public class OcCustomField implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "custom_field_id")
    private Integer customFieldId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "validation")
    private String validation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcCustomField() {
    }

    public OcCustomField(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public OcCustomField(Integer customFieldId, String type, String value, String validation, String location, boolean status, int sortOrder) {
        this.customFieldId = customFieldId;
        this.type = type;
        this.value = value;
        this.validation = validation;
        this.location = location;
        this.status = status;
        this.sortOrder = sortOrder;
    }

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        hash += (customFieldId != null ? customFieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomField)) {
            return false;
        }
        OcCustomField other = (OcCustomField) object;
        if ((this.customFieldId == null && other.customFieldId != null) || (this.customFieldId != null && !this.customFieldId.equals(other.customFieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomField[ customFieldId=" + customFieldId + " ]";
    }
    
}
