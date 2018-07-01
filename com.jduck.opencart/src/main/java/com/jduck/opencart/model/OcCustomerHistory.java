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
@Table(name = "oc_customer_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerHistory.findAll", query = "SELECT o FROM OcCustomerHistory o"),
    @NamedQuery(name = "OcCustomerHistory.findByCustomerHistoryId", query = "SELECT o FROM OcCustomerHistory o WHERE o.customerHistoryId = :customerHistoryId"),
    @NamedQuery(name = "OcCustomerHistory.findByCustomerId", query = "SELECT o FROM OcCustomerHistory o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerHistory.findByDateAdded", query = "SELECT o FROM OcCustomerHistory o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_history_id")
    private Integer customerHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerHistory() {
    }

    public OcCustomerHistory(Integer customerHistoryId) {
        this.customerHistoryId = customerHistoryId;
    }

    public OcCustomerHistory(Integer customerHistoryId, int customerId, String comment, Date dateAdded) {
        this.customerHistoryId = customerHistoryId;
        this.customerId = customerId;
        this.comment = comment;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerHistoryId() {
        return customerHistoryId;
    }

    public void setCustomerHistoryId(Integer customerHistoryId) {
        this.customerHistoryId = customerHistoryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        hash += (customerHistoryId != null ? customerHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerHistory)) {
            return false;
        }
        OcCustomerHistory other = (OcCustomerHistory) object;
        if ((this.customerHistoryId == null && other.customerHistoryId != null) || (this.customerHistoryId != null && !this.customerHistoryId.equals(other.customerHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerHistory[ customerHistoryId=" + customerHistoryId + " ]";
    }
    
}
