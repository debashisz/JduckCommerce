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
import javax.persistence.Lob;
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
@Table(name = "oc_cart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCart.findAll", query = "SELECT o FROM OcCart o"),
    @NamedQuery(name = "OcCart.findByCartId", query = "SELECT o FROM OcCart o WHERE o.cartId = :cartId"),
    @NamedQuery(name = "OcCart.findByApiId", query = "SELECT o FROM OcCart o WHERE o.apiId = :apiId"),
    @NamedQuery(name = "OcCart.findByCustomerId", query = "SELECT o FROM OcCart o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCart.findBySessionId", query = "SELECT o FROM OcCart o WHERE o.sessionId = :sessionId"),
    @NamedQuery(name = "OcCart.findByProductId", query = "SELECT o FROM OcCart o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcCart.findByRecurringId", query = "SELECT o FROM OcCart o WHERE o.recurringId = :recurringId"),
    @NamedQuery(name = "OcCart.findByQuantity", query = "SELECT o FROM OcCart o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcCart.findByDateAdded", query = "SELECT o FROM OcCart o WHERE o.dateAdded = :dateAdded")})
public class OcCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cart_id")
    private Integer cartId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "api_id")
    private int apiId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_id")
    private int recurringId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "option")
    private String option;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCart() {
    }

    public OcCart(Integer cartId) {
        this.cartId = cartId;
    }

    public OcCart(Integer cartId, int apiId, int customerId, String sessionId, int productId, int recurringId, String option, int quantity, Date dateAdded) {
        this.cartId = cartId;
        this.apiId = apiId;
        this.customerId = customerId;
        this.sessionId = sessionId;
        this.productId = productId;
        this.recurringId = recurringId;
        this.option = option;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(int recurringId) {
        this.recurringId = recurringId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartId != null ? cartId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCart)) {
            return false;
        }
        OcCart other = (OcCart) object;
        if ((this.cartId == null && other.cartId != null) || (this.cartId != null && !this.cartId.equals(other.cartId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCart[ cartId=" + cartId + " ]";
    }
    
}
