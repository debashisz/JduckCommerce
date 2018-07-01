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
@Table(name = "oc_information")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcInformation.findAll", query = "SELECT o FROM OcInformation o"),
    @NamedQuery(name = "OcInformation.findByInformationId", query = "SELECT o FROM OcInformation o WHERE o.informationId = :informationId"),
    @NamedQuery(name = "OcInformation.findByBottom", query = "SELECT o FROM OcInformation o WHERE o.bottom = :bottom"),
    @NamedQuery(name = "OcInformation.findBySortOrder", query = "SELECT o FROM OcInformation o WHERE o.sortOrder = :sortOrder"),
    @NamedQuery(name = "OcInformation.findByStatus", query = "SELECT o FROM OcInformation o WHERE o.status = :status")})
public class OcInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "information_id")
    private Integer informationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bottom")
    private int bottom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;

    public OcInformation() {
    }

    public OcInformation(Integer informationId) {
        this.informationId = informationId;
    }

    public OcInformation(Integer informationId, int bottom, int sortOrder, boolean status) {
        this.informationId = informationId;
        this.bottom = bottom;
        this.sortOrder = sortOrder;
        this.status = status;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informationId != null ? informationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformation)) {
            return false;
        }
        OcInformation other = (OcInformation) object;
        if ((this.informationId == null && other.informationId != null) || (this.informationId != null && !this.informationId.equals(other.informationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformation[ informationId=" + informationId + " ]";
    }
    
}
