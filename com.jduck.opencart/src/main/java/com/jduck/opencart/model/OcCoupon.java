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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_coupon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCoupon.findAll", query = "SELECT o FROM OcCoupon o"),
    @NamedQuery(name = "OcCoupon.findByCouponId", query = "SELECT o FROM OcCoupon o WHERE o.couponId = :couponId"),
    @NamedQuery(name = "OcCoupon.findByName", query = "SELECT o FROM OcCoupon o WHERE o.name = :name"),
    @NamedQuery(name = "OcCoupon.findByCode", query = "SELECT o FROM OcCoupon o WHERE o.code = :code"),
    @NamedQuery(name = "OcCoupon.findByType", query = "SELECT o FROM OcCoupon o WHERE o.type = :type"),
    @NamedQuery(name = "OcCoupon.findByDiscount", query = "SELECT o FROM OcCoupon o WHERE o.discount = :discount"),
    @NamedQuery(name = "OcCoupon.findByLogged", query = "SELECT o FROM OcCoupon o WHERE o.logged = :logged"),
    @NamedQuery(name = "OcCoupon.findByShipping", query = "SELECT o FROM OcCoupon o WHERE o.shipping = :shipping"),
    @NamedQuery(name = "OcCoupon.findByTotal", query = "SELECT o FROM OcCoupon o WHERE o.total = :total"),
    @NamedQuery(name = "OcCoupon.findByDateStart", query = "SELECT o FROM OcCoupon o WHERE o.dateStart = :dateStart"),
    @NamedQuery(name = "OcCoupon.findByDateEnd", query = "SELECT o FROM OcCoupon o WHERE o.dateEnd = :dateEnd"),
    @NamedQuery(name = "OcCoupon.findByUsesTotal", query = "SELECT o FROM OcCoupon o WHERE o.usesTotal = :usesTotal"),
    @NamedQuery(name = "OcCoupon.findByUsesCustomer", query = "SELECT o FROM OcCoupon o WHERE o.usesCustomer = :usesCustomer"),
    @NamedQuery(name = "OcCoupon.findByStatus", query = "SELECT o FROM OcCoupon o WHERE o.status = :status"),
    @NamedQuery(name = "OcCoupon.findByDateAdded", query = "SELECT o FROM OcCoupon o WHERE o.dateAdded = :dateAdded")})
public class OcCoupon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "coupon_id")
    private Integer couponId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private Character type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount")
    private BigDecimal discount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "logged")
    private boolean logged;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping")
    private boolean shipping;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_total")
    private int usesTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "uses_customer")
    private String usesCustomer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCoupon() {
    }

    public OcCoupon(Integer couponId) {
        this.couponId = couponId;
    }

    public OcCoupon(Integer couponId, String name, String code, Character type, BigDecimal discount, boolean logged, boolean shipping, BigDecimal total, Date dateStart, Date dateEnd, int usesTotal, String usesCustomer, boolean status, Date dateAdded) {
        this.couponId = couponId;
        this.name = name;
        this.code = code;
        this.type = type;
        this.discount = discount;
        this.logged = logged;
        this.shipping = shipping;
        this.total = total;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.usesTotal = usesTotal;
        this.usesCustomer = usesCustomer;
        this.status = status;
        this.dateAdded = dateAdded;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public boolean getLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public boolean getShipping() {
        return shipping;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public int getUsesTotal() {
        return usesTotal;
    }

    public void setUsesTotal(int usesTotal) {
        this.usesTotal = usesTotal;
    }

    public String getUsesCustomer() {
        return usesCustomer;
    }

    public void setUsesCustomer(String usesCustomer) {
        this.usesCustomer = usesCustomer;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        hash += (couponId != null ? couponId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCoupon)) {
            return false;
        }
        OcCoupon other = (OcCoupon) object;
        if ((this.couponId == null && other.couponId != null) || (this.couponId != null && !this.couponId.equals(other.couponId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCoupon[ couponId=" + couponId + " ]";
    }
    
}
