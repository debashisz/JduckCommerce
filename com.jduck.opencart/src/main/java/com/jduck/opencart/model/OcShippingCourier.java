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
@Table(name = "oc_shipping_courier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcShippingCourier.findAll", query = "SELECT o FROM OcShippingCourier o"),
    @NamedQuery(name = "OcShippingCourier.findByShippingCourierId", query = "SELECT o FROM OcShippingCourier o WHERE o.shippingCourierId = :shippingCourierId"),
    @NamedQuery(name = "OcShippingCourier.findByShippingCourierCode", query = "SELECT o FROM OcShippingCourier o WHERE o.shippingCourierCode = :shippingCourierCode"),
    @NamedQuery(name = "OcShippingCourier.findByShippingCourierName", query = "SELECT o FROM OcShippingCourier o WHERE o.shippingCourierName = :shippingCourierName")})
public class OcShippingCourier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_courier_id")
    private Integer shippingCourierId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "shipping_courier_code")
    private String shippingCourierCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "shipping_courier_name")
    private String shippingCourierName;

    public OcShippingCourier() {
    }

    public OcShippingCourier(Integer shippingCourierId) {
        this.shippingCourierId = shippingCourierId;
    }

    public OcShippingCourier(Integer shippingCourierId, String shippingCourierCode, String shippingCourierName) {
        this.shippingCourierId = shippingCourierId;
        this.shippingCourierCode = shippingCourierCode;
        this.shippingCourierName = shippingCourierName;
    }

    public Integer getShippingCourierId() {
        return shippingCourierId;
    }

    public void setShippingCourierId(Integer shippingCourierId) {
        this.shippingCourierId = shippingCourierId;
    }

    public String getShippingCourierCode() {
        return shippingCourierCode;
    }

    public void setShippingCourierCode(String shippingCourierCode) {
        this.shippingCourierCode = shippingCourierCode;
    }

    public String getShippingCourierName() {
        return shippingCourierName;
    }

    public void setShippingCourierName(String shippingCourierName) {
        this.shippingCourierName = shippingCourierName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingCourierId != null ? shippingCourierId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcShippingCourier)) {
            return false;
        }
        OcShippingCourier other = (OcShippingCourier) object;
        if ((this.shippingCourierId == null && other.shippingCourierId != null) || (this.shippingCourierId != null && !this.shippingCourierId.equals(other.shippingCourierId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcShippingCourier[ shippingCourierId=" + shippingCourierId + " ]";
    }
    
}
