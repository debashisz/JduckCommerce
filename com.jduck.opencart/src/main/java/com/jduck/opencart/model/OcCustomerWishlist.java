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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "oc_customer_wishlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerWishlist.findAll", query = "SELECT o FROM OcCustomerWishlist o"),
    @NamedQuery(name = "OcCustomerWishlist.findByCustomerId", query = "SELECT o FROM OcCustomerWishlist o WHERE o.ocCustomerWishlistPK.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerWishlist.findByProductId", query = "SELECT o FROM OcCustomerWishlist o WHERE o.ocCustomerWishlistPK.productId = :productId"),
    @NamedQuery(name = "OcCustomerWishlist.findByDateAdded", query = "SELECT o FROM OcCustomerWishlist o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerWishlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCustomerWishlistPK ocCustomerWishlistPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerWishlist() {
    }

    public OcCustomerWishlist(OcCustomerWishlistPK ocCustomerWishlistPK) {
        this.ocCustomerWishlistPK = ocCustomerWishlistPK;
    }

    public OcCustomerWishlist(OcCustomerWishlistPK ocCustomerWishlistPK, Date dateAdded) {
        this.ocCustomerWishlistPK = ocCustomerWishlistPK;
        this.dateAdded = dateAdded;
    }

    public OcCustomerWishlist(int customerId, int productId) {
        this.ocCustomerWishlistPK = new OcCustomerWishlistPK(customerId, productId);
    }

    public OcCustomerWishlistPK getOcCustomerWishlistPK() {
        return ocCustomerWishlistPK;
    }

    public void setOcCustomerWishlistPK(OcCustomerWishlistPK ocCustomerWishlistPK) {
        this.ocCustomerWishlistPK = ocCustomerWishlistPK;
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
        hash += (ocCustomerWishlistPK != null ? ocCustomerWishlistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerWishlist)) {
            return false;
        }
        OcCustomerWishlist other = (OcCustomerWishlist) object;
        if ((this.ocCustomerWishlistPK == null && other.ocCustomerWishlistPK != null) || (this.ocCustomerWishlistPK != null && !this.ocCustomerWishlistPK.equals(other.ocCustomerWishlistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerWishlist[ ocCustomerWishlistPK=" + ocCustomerWishlistPK + " ]";
    }
    
}
