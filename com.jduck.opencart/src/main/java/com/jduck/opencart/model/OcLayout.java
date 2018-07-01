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
@Table(name = "oc_layout")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLayout.findAll", query = "SELECT o FROM OcLayout o"),
    @NamedQuery(name = "OcLayout.findByLayoutId", query = "SELECT o FROM OcLayout o WHERE o.layoutId = :layoutId"),
    @NamedQuery(name = "OcLayout.findByName", query = "SELECT o FROM OcLayout o WHERE o.name = :name")})
public class OcLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layout_id")
    private Integer layoutId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcLayout() {
    }

    public OcLayout(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public OcLayout(Integer layoutId, String name) {
        this.layoutId = layoutId;
        this.name = name;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (layoutId != null ? layoutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLayout)) {
            return false;
        }
        OcLayout other = (OcLayout) object;
        if ((this.layoutId == null && other.layoutId != null) || (this.layoutId != null && !this.layoutId.equals(other.layoutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLayout[ layoutId=" + layoutId + " ]";
    }

}
