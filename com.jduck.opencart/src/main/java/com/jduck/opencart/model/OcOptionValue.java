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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_option_value")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOptionValue.findAll", query = "SELECT o FROM OcOptionValue o"),
    @NamedQuery(name = "OcOptionValue.findByOptionValueId", query = "SELECT o FROM OcOptionValue o WHERE o.optionValueId = :optionValueId"),
    @NamedQuery(name = "OcOptionValue.findByOptionId", query = "SELECT o FROM OcOptionValue o WHERE o.optionId = :optionId"),
    @NamedQuery(name = "OcOptionValue.findByImage", query = "SELECT o FROM OcOptionValue o WHERE o.image = :image"),
    @NamedQuery(name = "OcOptionValue.findBySortOrder", query = "SELECT o FROM OcOptionValue o WHERE o.sortOrder = :sortOrder")})
public class OcOptionValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "option_value_id")
    private Integer optionValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcOptionValue() {
    }

    public OcOptionValue(Integer optionValueId) {
        this.optionValueId = optionValueId;
    }

    public OcOptionValue(Integer optionValueId, int optionId, String image, int sortOrder) {
        this.optionValueId = optionValueId;
        this.optionId = optionId;
        this.image = image;
        this.sortOrder = sortOrder;
    }

    public Integer getOptionValueId() {
        return optionValueId;
    }

    public void setOptionValueId(Integer optionValueId) {
        this.optionValueId = optionValueId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        hash += (optionValueId != null ? optionValueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOptionValue)) {
            return false;
        }
        OcOptionValue other = (OcOptionValue) object;
        if ((this.optionValueId == null && other.optionValueId != null) || (this.optionValueId != null && !this.optionValueId.equals(other.optionValueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOptionValue[ optionValueId=" + optionValueId + " ]";
    }
    
}
