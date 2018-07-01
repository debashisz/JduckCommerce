/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Windows10
 */
@Embeddable
public class OcOrderStatusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcOrderStatusPK() {
    }

    public OcOrderStatusPK(int orderStatusId, int languageId) {
        this.orderStatusId = orderStatusId;
        this.languageId = languageId;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderStatusId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderStatusPK)) {
            return false;
        }
        OcOrderStatusPK other = (OcOrderStatusPK) object;
        if (this.orderStatusId != other.orderStatusId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderStatusPK[ orderStatusId=" + orderStatusId + ", languageId=" + languageId + " ]";
    }
    
}
