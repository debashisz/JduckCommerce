/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategory.findAll", query = "SELECT o FROM OcCategory o"),
    @NamedQuery(name = "OcCategory.findByCategoryId", query = "SELECT o FROM OcCategory o WHERE o.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategory.findByImage", query = "SELECT o FROM OcCategory o WHERE o.image = :image"),
    @NamedQuery(name = "OcCategory.findByParentId", query = "SELECT o FROM OcCategory o WHERE o.parentId = :parentId"),
    @NamedQuery(name = "OcCategory.findByTop", query = "SELECT o FROM OcCategory o WHERE o.top = :top"),
    @NamedQuery(name = "OcCategory.findByColumn", query = "SELECT o FROM OcCategory o WHERE o.column = :column"),
    @NamedQuery(name = "OcCategory.findBySortOrder", query = "SELECT o FROM OcCategory o WHERE o.sortOrder = :sortOrder"),
    @NamedQuery(name = "OcCategory.findByStatus", query = "SELECT o FROM OcCategory o WHERE o.status = :status"),
    @NamedQuery(name = "OcCategory.findByDateAdded", query = "SELECT o FROM OcCategory o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcCategory.findByDateModified", query = "SELECT o FROM OcCategory o WHERE o.dateModified = :dateModified")})
public class OcCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "top")
    private boolean top;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column")
    private int column;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcCategory() {
    }

    public OcCategory(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public OcCategory(Integer categoryId, int parentId, boolean top, int column, int sortOrder, boolean status, Date dateAdded, Date dateModified) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.top = top;
        this.column = column;
        this.sortOrder = sortOrder;
        this.status = status;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public boolean getTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategory)) {
            return false;
        }
        OcCategory other = (OcCategory) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategory[ categoryId=" + categoryId + " ]";
    }
    
}
