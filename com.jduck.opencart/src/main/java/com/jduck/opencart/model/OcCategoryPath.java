/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "oc_category_path")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategoryPath.findAll", query = "SELECT o FROM OcCategoryPath o"),
    @NamedQuery(name = "OcCategoryPath.findByCategoryId", query = "SELECT o FROM OcCategoryPath o WHERE o.ocCategoryPathPK.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategoryPath.findByPathId", query = "SELECT o FROM OcCategoryPath o WHERE o.ocCategoryPathPK.pathId = :pathId"),
    @NamedQuery(name = "OcCategoryPath.findByLevel", query = "SELECT o FROM OcCategoryPath o WHERE o.level = :level")})
public class OcCategoryPath implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCategoryPathPK ocCategoryPathPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level")
    private int level;

    public OcCategoryPath() {
    }

    public OcCategoryPath(OcCategoryPathPK ocCategoryPathPK) {
        this.ocCategoryPathPK = ocCategoryPathPK;
    }

    public OcCategoryPath(OcCategoryPathPK ocCategoryPathPK, int level) {
        this.ocCategoryPathPK = ocCategoryPathPK;
        this.level = level;
    }

    public OcCategoryPath(int categoryId, int pathId) {
        this.ocCategoryPathPK = new OcCategoryPathPK(categoryId, pathId);
    }

    public OcCategoryPathPK getOcCategoryPathPK() {
        return ocCategoryPathPK;
    }

    public void setOcCategoryPathPK(OcCategoryPathPK ocCategoryPathPK) {
        this.ocCategoryPathPK = ocCategoryPathPK;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCategoryPathPK != null ? ocCategoryPathPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryPath)) {
            return false;
        }
        OcCategoryPath other = (OcCategoryPath) object;
        if ((this.ocCategoryPathPK == null && other.ocCategoryPathPK != null) || (this.ocCategoryPathPK != null && !this.ocCategoryPathPK.equals(other.ocCategoryPathPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryPath[ ocCategoryPathPK=" + ocCategoryPathPK + " ]";
    }
    
}
