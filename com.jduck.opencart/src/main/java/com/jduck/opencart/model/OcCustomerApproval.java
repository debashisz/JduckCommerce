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
@Table(name = "oc_customer_approval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerApproval.findAll", query = "SELECT o FROM OcCustomerApproval o"),
    @NamedQuery(name = "OcCustomerApproval.findByCustomerApprovalId", query = "SELECT o FROM OcCustomerApproval o WHERE o.customerApprovalId = :customerApprovalId"),
    @NamedQuery(name = "OcCustomerApproval.findByCustomerId", query = "SELECT o FROM OcCustomerApproval o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerApproval.findByType", query = "SELECT o FROM OcCustomerApproval o WHERE o.type = :type"),
    @NamedQuery(name = "OcCustomerApproval.findByDateAdded", query = "SELECT o FROM OcCustomerApproval o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerApproval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_approval_id")
    private Integer customerApprovalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerApproval() {
    }

    public OcCustomerApproval(Integer customerApprovalId) {
        this.customerApprovalId = customerApprovalId;
    }

    public OcCustomerApproval(Integer customerApprovalId, int customerId, String type, Date dateAdded) {
        this.customerApprovalId = customerApprovalId;
        this.customerId = customerId;
        this.type = type;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerApprovalId() {
        return customerApprovalId;
    }

    public void setCustomerApprovalId(Integer customerApprovalId) {
        this.customerApprovalId = customerApprovalId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (customerApprovalId != null ? customerApprovalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerApproval)) {
            return false;
        }
        OcCustomerApproval other = (OcCustomerApproval) object;
        if ((this.customerApprovalId == null && other.customerApprovalId != null) || (this.customerApprovalId != null && !this.customerApprovalId.equals(other.customerApprovalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerApproval[ customerApprovalId=" + customerApprovalId + " ]";
    }
    
}
