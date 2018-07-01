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
@Table(name = "oc_order_total")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderTotal.findAll", query = "SELECT o FROM OcOrderTotal o"),
    @NamedQuery(name = "OcOrderTotal.findByOrderTotalId", query = "SELECT o FROM OcOrderTotal o WHERE o.orderTotalId = :orderTotalId"),
    @NamedQuery(name = "OcOrderTotal.findByOrderId", query = "SELECT o FROM OcOrderTotal o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderTotal.findByCode", query = "SELECT o FROM OcOrderTotal o WHERE o.code = :code"),
    @NamedQuery(name = "OcOrderTotal.findByTitle", query = "SELECT o FROM OcOrderTotal o WHERE o.title = :title"),
    @NamedQuery(name = "OcOrderTotal.findByValue", query = "SELECT o FROM OcOrderTotal o WHERE o.value = :value"),
    @NamedQuery(name = "OcOrderTotal.findBySortOrder", query = "SELECT o FROM OcOrderTotal o WHERE o.sortOrder = :sortOrder")})
public class OcOrderTotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_total_id")
    private Integer orderTotalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private BigDecimal value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcOrderTotal() {
    }

    public OcOrderTotal(Integer orderTotalId) {
        this.orderTotalId = orderTotalId;
    }

    public OcOrderTotal(Integer orderTotalId, int orderId, String code, String title, BigDecimal value, int sortOrder) {
        this.orderTotalId = orderTotalId;
        this.orderId = orderId;
        this.code = code;
        this.title = title;
        this.value = value;
        this.sortOrder = sortOrder;
    }

    public Integer getOrderTotalId() {
        return orderTotalId;
    }

    public void setOrderTotalId(Integer orderTotalId) {
        this.orderTotalId = orderTotalId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
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
        hash += (orderTotalId != null ? orderTotalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderTotal)) {
            return false;
        }
        OcOrderTotal other = (OcOrderTotal) object;
        if ((this.orderTotalId == null && other.orderTotalId != null) || (this.orderTotalId != null && !this.orderTotalId.equals(other.orderTotalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderTotal[ orderTotalId=" + orderTotalId + " ]";
    }
    
}
