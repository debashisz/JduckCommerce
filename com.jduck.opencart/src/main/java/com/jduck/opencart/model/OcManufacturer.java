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
@Table(name = "oc_manufacturer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcManufacturer.findAll", query = "SELECT o FROM OcManufacturer o"),
    @NamedQuery(name = "OcManufacturer.findByManufacturerId", query = "SELECT o FROM OcManufacturer o WHERE o.manufacturerId = :manufacturerId"),
    @NamedQuery(name = "OcManufacturer.findByName", query = "SELECT o FROM OcManufacturer o WHERE o.name = :name"),
    @NamedQuery(name = "OcManufacturer.findByImage", query = "SELECT o FROM OcManufacturer o WHERE o.image = :image"),
    @NamedQuery(name = "OcManufacturer.findBySortOrder", query = "SELECT o FROM OcManufacturer o WHERE o.sortOrder = :sortOrder")})
public class OcManufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "manufacturer_id")
    private Integer manufacturerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcManufacturer() {
    }

    public OcManufacturer(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public OcManufacturer(Integer manufacturerId, String name, int sortOrder) {
        this.manufacturerId = manufacturerId;
        this.name = name;
        this.sortOrder = sortOrder;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (manufacturerId != null ? manufacturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcManufacturer)) {
            return false;
        }
        OcManufacturer other = (OcManufacturer) object;
        if ((this.manufacturerId == null && other.manufacturerId != null) || (this.manufacturerId != null && !this.manufacturerId.equals(other.manufacturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcManufacturer[ manufacturerId=" + manufacturerId + " ]";
    }
    
}
