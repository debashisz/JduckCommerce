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
public class OcReturnStatusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "return_status_id")
    private int returnStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcReturnStatusPK() {
    }

    public OcReturnStatusPK(int returnStatusId, int languageId) {
        this.returnStatusId = returnStatusId;
        this.languageId = languageId;
    }

    public int getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(int returnStatusId) {
        this.returnStatusId = returnStatusId;
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
        hash += (int) returnStatusId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnStatusPK)) {
            return false;
        }
        OcReturnStatusPK other = (OcReturnStatusPK) object;
        if (this.returnStatusId != other.returnStatusId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnStatusPK[ returnStatusId=" + returnStatusId + ", languageId=" + languageId + " ]";
    }
    
}
