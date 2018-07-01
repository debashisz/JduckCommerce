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
@Table(name = "oc_review")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReview.findAll", query = "SELECT o FROM OcReview o"),
    @NamedQuery(name = "OcReview.findByReviewId", query = "SELECT o FROM OcReview o WHERE o.reviewId = :reviewId"),
    @NamedQuery(name = "OcReview.findByProductId", query = "SELECT o FROM OcReview o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcReview.findByCustomerId", query = "SELECT o FROM OcReview o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcReview.findByAuthor", query = "SELECT o FROM OcReview o WHERE o.author = :author"),
    @NamedQuery(name = "OcReview.findByRating", query = "SELECT o FROM OcReview o WHERE o.rating = :rating"),
    @NamedQuery(name = "OcReview.findByStatus", query = "SELECT o FROM OcReview o WHERE o.status = :status"),
    @NamedQuery(name = "OcReview.findByDateAdded", query = "SELECT o FROM OcReview o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcReview.findByDateModified", query = "SELECT o FROM OcReview o WHERE o.dateModified = :dateModified")})
public class OcReview implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "review_id")
    private Integer reviewId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "author")
    private String author;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "text")
    private String text;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private int rating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcReview() {
    }

    public OcReview(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public OcReview(Integer reviewId, int productId, int customerId, String author, String text, int rating, boolean status, Date dateAdded, Date dateModified) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.customerId = customerId;
        this.author = author;
        this.text = text;
        this.rating = rating;
        this.status = status;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reviewId != null ? reviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReview)) {
            return false;
        }
        OcReview other = (OcReview) object;
        if ((this.reviewId == null && other.reviewId != null) || (this.reviewId != null && !this.reviewId.equals(other.reviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReview[ reviewId=" + reviewId + " ]";
    }
    
}
