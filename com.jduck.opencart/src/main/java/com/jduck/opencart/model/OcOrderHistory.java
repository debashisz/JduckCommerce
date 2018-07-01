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
@Table(name = "oc_order_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderHistory.findAll", query = "SELECT o FROM OcOrderHistory o"),
    @NamedQuery(name = "OcOrderHistory.findByOrderHistoryId", query = "SELECT o FROM OcOrderHistory o WHERE o.orderHistoryId = :orderHistoryId"),
    @NamedQuery(name = "OcOrderHistory.findByOrderId", query = "SELECT o FROM OcOrderHistory o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderHistory.findByOrderStatusId", query = "SELECT o FROM OcOrderHistory o WHERE o.orderStatusId = :orderStatusId"),
    @NamedQuery(name = "OcOrderHistory.findByNotify", query = "SELECT o FROM OcOrderHistory o WHERE o.notify = :notify"),
    @NamedQuery(name = "OcOrderHistory.findByDateAdded", query = "SELECT o FROM OcOrderHistory o WHERE o.dateAdded = :dateAdded")})
public class OcOrderHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_history_id")
    private Integer orderHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notify")
    private boolean notify;
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

    public OcOrderHistory() {
    }

    public OcOrderHistory(Integer orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public OcOrderHistory(Integer orderHistoryId, int orderId, int orderStatusId, boolean notify, String comment, Date dateAdded) {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
        this.orderStatusId = orderStatusId;
        this.notify = notify;
        this.comment = comment;
        this.dateAdded = dateAdded;
    }

    public Integer getOrderHistoryId() {
        return orderHistoryId;
    }

    public void setOrderHistoryId(Integer orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public boolean getNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
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
        hash += (orderHistoryId != null ? orderHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderHistory)) {
            return false;
        }
        OcOrderHistory other = (OcOrderHistory) object;
        if ((this.orderHistoryId == null && other.orderHistoryId != null) || (this.orderHistoryId != null && !this.orderHistoryId.equals(other.orderHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderHistory[ orderHistoryId=" + orderHistoryId + " ]";
    }
    
}
