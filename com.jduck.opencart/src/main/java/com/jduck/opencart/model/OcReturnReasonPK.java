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
public class OcReturnReasonPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "return_reason_id")
    private int returnReasonId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcReturnReasonPK() {
    }

    public OcReturnReasonPK(int returnReasonId, int languageId) {
        this.returnReasonId = returnReasonId;
        this.languageId = languageId;
    }

    public int getReturnReasonId() {
        return returnReasonId;
    }

    public void setReturnReasonId(int returnReasonId) {
        this.returnReasonId = returnReasonId;
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
        hash += (int) returnReasonId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnReasonPK)) {
            return false;
        }
        OcReturnReasonPK other = (OcReturnReasonPK) object;
        if (this.returnReasonId != other.returnReasonId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnReasonPK[ returnReasonId=" + returnReasonId + ", languageId=" + languageId + " ]";
    }
    
}
