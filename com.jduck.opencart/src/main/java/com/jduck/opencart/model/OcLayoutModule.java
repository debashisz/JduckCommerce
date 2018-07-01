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
@Table(name = "oc_layout_module")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLayoutModule.findAll", query = "SELECT o FROM OcLayoutModule o"),
    @NamedQuery(name = "OcLayoutModule.findByLayoutModuleId", query = "SELECT o FROM OcLayoutModule o WHERE o.layoutModuleId = :layoutModuleId"),
    @NamedQuery(name = "OcLayoutModule.findByLayoutId", query = "SELECT o FROM OcLayoutModule o WHERE o.layoutId = :layoutId"),
    @NamedQuery(name = "OcLayoutModule.findByCode", query = "SELECT o FROM OcLayoutModule o WHERE o.code = :code"),
    @NamedQuery(name = "OcLayoutModule.findByPosition", query = "SELECT o FROM OcLayoutModule o WHERE o.position = :position"),
    @NamedQuery(name = "OcLayoutModule.findBySortOrder", query = "SELECT o FROM OcLayoutModule o WHERE o.sortOrder = :sortOrder")})
public class OcLayoutModule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layout_module_id")
    private Integer layoutModuleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "layout_id")
    private int layoutId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcLayoutModule() {
    }

    public OcLayoutModule(Integer layoutModuleId) {
        this.layoutModuleId = layoutModuleId;
    }

    public OcLayoutModule(Integer layoutModuleId, int layoutId, String code, String position, int sortOrder) {
        this.layoutModuleId = layoutModuleId;
        this.layoutId = layoutId;
        this.code = code;
        this.position = position;
        this.sortOrder = sortOrder;
    }

    public Integer getLayoutModuleId() {
        return layoutModuleId;
    }

    public void setLayoutModuleId(Integer layoutModuleId) {
        this.layoutModuleId = layoutModuleId;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        hash += (layoutModuleId != null ? layoutModuleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLayoutModule)) {
            return false;
        }
        OcLayoutModule other = (OcLayoutModule) object;
        if ((this.layoutModuleId == null && other.layoutModuleId != null) || (this.layoutModuleId != null && !this.layoutModuleId.equals(other.layoutModuleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLayoutModule[ layoutModuleId=" + layoutModuleId + " ]";
    }
    
}
