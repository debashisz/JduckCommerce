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
@Table(name = "oc_product_discount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductDiscount.findAll", query = "SELECT o FROM OcProductDiscount o"),
    @NamedQuery(name = "OcProductDiscount.findByProductDiscountId", query = "SELECT o FROM OcProductDiscount o WHERE o.productDiscountId = :productDiscountId"),
    @NamedQuery(name = "OcProductDiscount.findByProductId", query = "SELECT o FROM OcProductDiscount o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProductDiscount.findByCustomerGroupId", query = "SELECT o FROM OcProductDiscount o WHERE o.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcProductDiscount.findByQuantity", query = "SELECT o FROM OcProductDiscount o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcProductDiscount.findByPriority", query = "SELECT o FROM OcProductDiscount o WHERE o.priority = :priority"),
    @NamedQuery(name = "OcProductDiscount.findByPrice", query = "SELECT o FROM OcProductDiscount o WHERE o.price = :price"),
    @NamedQuery(name = "OcProductDiscount.findByDateStart", query = "SELECT o FROM OcProductDiscount o WHERE o.dateStart = :dateStart"),
    @NamedQuery(name = "OcProductDiscount.findByDateEnd", query = "SELECT o FROM OcProductDiscount o WHERE o.dateEnd = :dateEnd")})
public class OcProductDiscount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_discount_id")
    private Integer productDiscountId;
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
    @Column(name = "quantity")
    private int quantity;
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

    public OcProductDiscount() {
    }

    public OcProductDiscount(Integer productDiscountId) {
        this.productDiscountId = productDiscountId;
    }

    public OcProductDiscount(Integer productDiscountId, int productId, int customerGroupId, int quantity, int priority, BigDecimal price, Date dateStart, Date dateEnd) {
        this.productDiscountId = productDiscountId;
        this.productId = productId;
        this.customerGroupId = customerGroupId;
        this.quantity = quantity;
        this.priority = priority;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Integer getProductDiscountId() {
        return productDiscountId;
    }

    public void setProductDiscountId(Integer productDiscountId) {
        this.productDiscountId = productDiscountId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        hash += (productDiscountId != null ? productDiscountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductDiscount)) {
            return false;
        }
        OcProductDiscount other = (OcProductDiscount) object;
        if ((this.productDiscountId == null && other.productDiscountId != null) || (this.productDiscountId != null && !this.productDiscountId.equals(other.productDiscountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductDiscount[ productDiscountId=" + productDiscountId + " ]";
    }
    
}
