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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_customer_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerGroup.findAll", query = "SELECT o FROM OcCustomerGroup o"),
    @NamedQuery(name = "OcCustomerGroup.findByCustomerGroupId", query = "SELECT o FROM OcCustomerGroup o WHERE o.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcCustomerGroup.findByApproval", query = "SELECT o FROM OcCustomerGroup o WHERE o.approval = :approval"),
    @NamedQuery(name = "OcCustomerGroup.findBySortOrder", query = "SELECT o FROM OcCustomerGroup o WHERE o.sortOrder = :sortOrder")})
public class OcCustomerGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_group_id")
    private Integer customerGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approval")
    private int approval;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcCustomerGroup() {
    }

    public OcCustomerGroup(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public OcCustomerGroup(Integer customerGroupId, int approval, int sortOrder) {
        this.customerGroupId = customerGroupId;
        this.approval = approval;
        this.sortOrder = sortOrder;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
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
        hash += (customerGroupId != null ? customerGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerGroup)) {
            return false;
        }
        OcCustomerGroup other = (OcCustomerGroup) object;
        if ((this.customerGroupId == null && other.customerGroupId != null) || (this.customerGroupId != null && !this.customerGroupId.equals(other.customerGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerGroup[ customerGroupId=" + customerGroupId + " ]";
    }
    
}
