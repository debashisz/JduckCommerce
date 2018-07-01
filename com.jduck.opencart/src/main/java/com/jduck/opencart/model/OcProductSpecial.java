/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_product_special")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductSpecial.findAll", query = "SELECT o FROM OcProductSpecial o"),
    @NamedQuery(name = "OcProductSpecial.findByProductSpecialId", query = "SELECT o FROM OcProductSpecial o WHERE o.productSpecialId = :productSpecialId"),
    @NamedQuery(name = "OcProductSpecial.findByProductId", query = "SELECT o FROM OcProductSpecial o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProductSpecial.findByCustomerGroupId", query = "SELECT o FROM OcProductSpecial o WHERE o.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcProductSpecial.findByPriority", query = "SELECT o FROM OcProductSpecial o WHERE o.priority = :priority"),
    @NamedQuery(name = "OcProductSpecial.findByPrice", query = "SELECT o FROM OcProductSpecial o WHERE o.price = :price"),
    @NamedQuery(name = "OcProductSpecial.findByDateStart", query = "SELECT o FROM OcProductSpecial o WHERE o.dateStart = :dateStart"),
    @NamedQuery(name = "OcProductSpecial.findByDateEnd", query = "SELECT o FROM OcProductSpecial o WHERE o.dateEnd = :dateEnd")})
public class OcProductSpecial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_special_id")
    private Integer productSpecialId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority")
    private int priority;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_start")
    @Temporal(TemporalType.DATE)
    private Date dateStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_end")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;

    public OcProductSpecial() {
    }

    public OcProductSpecial(Integer productSpecialId) {
        this.productSpecialId = productSpecialId;
    }

    public OcProductSpecial(Integer productSpecialId, int productId, int customerGroupId, int priority, BigDecimal price, Date dateStart, Date dateEnd) {
        this.productSpecialId = productSpecialId;
        this.productId = productId;
        this.customerGroupId = customerGroupId;
        this.priority = priority;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Integer getProductSpecialId() {
        return productSpecialId;
    }

    public void setProductSpecialId(Integer productSpecialId) {
        this.productSpecialId = productSpecialId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSpecialId != null ? productSpecialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductSpecial)) {
            return false;
        }
        OcProductSpecial other = (OcProductSpecial) object;
        if ((this.productSpecialId == null && other.productSpecialId != null) || (this.productSpecialId != null && !this.productSpecialId.equals(other.productSpecialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductSpecial[ productSpecialId=" + productSpecialId + " ]";
    }
    
}
