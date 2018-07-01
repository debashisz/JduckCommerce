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
@Table(name = "oc_option")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOption.findAll", query = "SELECT o FROM OcOption o"),
    @NamedQuery(name = "OcOption.findByOptionId", query = "SELECT o FROM OcOption o WHERE o.optionId = :optionId"),
    @NamedQuery(name = "OcOption.findByType", query = "SELECT o FROM OcOption o WHERE o.type = :type"),
    @NamedQuery(name = "OcOption.findBySortOrder", query = "SELECT o FROM OcOption o WHERE o.sortOrder = :sortOrder")})
public class OcOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "option_id")
    private Integer optionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcOption() {
    }

    public OcOption(Integer optionId) {
        this.optionId = optionId;
    }

    public OcOption(Integer optionId, String type, int sortOrder) {
        this.optionId = optionId;
        this.type = type;
        this.sortOrder = sortOrder;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (optionId != null ? optionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOption)) {
            return false;
        }
        OcOption other = (OcOption) object;
        if ((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOption[ optionId=" + optionId + " ]";
    }
    
}
