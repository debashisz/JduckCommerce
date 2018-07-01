/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "oc_order_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderProduct.findAll", query = "SELECT o FROM OcOrderProduct o"),
    @NamedQuery(name = "OcOrderProduct.findByOrderProductId", query = "SELECT o FROM OcOrderProduct o WHERE o.orderProductId = :orderProductId"),
    @NamedQuery(name = "OcOrderProduct.findByOrderId", query = "SELECT o FROM OcOrderProduct o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderProduct.findByProductId", query = "SELECT o FROM OcOrderProduct o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcOrderProduct.findByName", query = "SELECT o FROM OcOrderProduct o WHERE o.name = :name"),
    @NamedQuery(name = "OcOrderProduct.findByModel", query = "SELECT o FROM OcOrderProduct o WHERE o.model = :model"),
    @NamedQuery(name = "OcOrderProduct.findByQuantity", query = "SELECT o FROM OcOrderProduct o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcOrderProduct.findByPrice", query = "SELECT o FROM OcOrderProduct o WHERE o.price = :price"),
    @NamedQuery(name = "OcOrderProduct.findByTotal", query = "SELECT o FROM OcOrderProduct o WHERE o.total = :total"),
    @NamedQuery(name = "OcOrderProduct.findByTax", query = "SELECT o FROM OcOrderProduct o WHERE o.tax = :tax"),
    @NamedQuery(name = "OcOrderProduct.findByReward", query = "SELECT o FROM OcOrderProduct o WHERE o.reward = :reward")})
public class OcOrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_product_id")
    private Integer orderProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax")
    private BigDecimal tax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reward")
    private int reward;

    public OcOrderProduct() {
    }

    public OcOrderProduct(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public OcOrderProduct(Integer orderProductId, int orderId, int productId, String name, String model, int quantity, BigDecimal price, BigDecimal total, BigDecimal tax, int reward) {
        this.orderProductId = orderProductId;
        this.orderId = orderId;
        this.productId = productId;
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.tax = tax;
        this.reward = reward;
    }

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderProductId != null ? orderProductId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderProduct)) {
            return false;
        }
        OcOrderProduct other = (OcOrderProduct) object;
        if ((this.orderProductId == null && other.orderProductId != null) || (this.orderProductId != null && !this.orderProductId.equals(other.orderProductId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderProduct[ orderProductId=" + orderProductId + " ]";
    }
    
}
