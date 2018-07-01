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
import javax.persistence.Lob;
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
@Table(name = "oc_order_option")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderOption.findAll", query = "SELECT o FROM OcOrderOption o"),
    @NamedQuery(name = "OcOrderOption.findByOrderOptionId", query = "SELECT o FROM OcOrderOption o WHERE o.orderOptionId = :orderOptionId"),
    @NamedQuery(name = "OcOrderOption.findByOrderId", query = "SELECT o FROM OcOrderOption o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderOption.findByOrderProductId", query = "SELECT o FROM OcOrderOption o WHERE o.orderProductId = :orderProductId"),
    @NamedQuery(name = "OcOrderOption.findByProductOptionId", query = "SELECT o FROM OcOrderOption o WHERE o.productOptionId = :productOptionId"),
    @NamedQuery(name = "OcOrderOption.findByProductOptionValueId", query = "SELECT o FROM OcOrderOption o WHERE o.productOptionValueId = :productOptionValueId"),
    @NamedQuery(name = "OcOrderOption.findByName", query = "SELECT o FROM OcOrderOption o WHERE o.name = :name"),
    @NamedQuery(name = "OcOrderOption.findByType", query = "SELECT o FROM OcOrderOption o WHERE o.type = :type")})
public class OcOrderOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_option_id")
    private Integer orderOptionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_product_id")
    private int orderProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_option_id")
    private int productOptionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_option_value_id")
    private int productOptionValueId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "type")
    private String type;

    public OcOrderOption() {
    }

    public OcOrderOption(Integer orderOptionId) {
        this.orderOptionId = orderOptionId;
    }

    public OcOrderOption(Integer orderOptionId, int orderId, int orderProductId, int productOptionId, int productOptionValueId, String name, String value, String type) {
        this.orderOptionId = orderOptionId;
        this.orderId = orderId;
        this.orderProductId = orderProductId;
        this.productOptionId = productOptionId;
        this.productOptionValueId = productOptionValueId;
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public Integer getOrderOptionId() {
        return orderOptionId;
    }

    public void setOrderOptionId(Integer orderOptionId) {
        this.orderOptionId = orderOptionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        this.orderProductId = orderProductId;
    }

    public int getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(int productOptionId) {
        this.productOptionId = productOptionId;
    }

    public int getProductOptionValueId() {
        return productOptionValueId;
    }

    public void setProductOptionValueId(int productOptionValueId) {
        this.productOptionValueId = productOptionValueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderOptionId != null ? orderOptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderOption)) {
            return false;
        }
        OcOrderOption other = (OcOrderOption) object;
        if ((this.orderOptionId == null && other.orderOptionId != null) || (this.orderOptionId != null && !this.orderOptionId.equals(other.orderOptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderOption[ orderOptionId=" + orderOptionId + " ]";
    }
    
}
