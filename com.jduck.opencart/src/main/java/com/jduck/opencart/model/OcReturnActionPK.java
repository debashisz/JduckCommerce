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
public class OcReturnActionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "return_action_id")
    private int returnActionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcReturnActionPK() {
    }

    public OcReturnActionPK(int returnActionId, int languageId) {
        this.returnActionId = returnActionId;
        this.languageId = languageId;
    }

    public int getReturnActionId() {
        return returnActionId;
    }

    public void setReturnActionId(int returnActionId) {
        this.returnActionId = returnActionId;
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
        hash += (int) returnActionId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnActionPK)) {
            return false;
        }
        OcReturnActionPK other = (OcReturnActionPK) object;
        if (this.returnActionId != other.returnActionId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnActionPK[ returnActionId=" + returnActionId + ", languageId=" + languageId + " ]";
    }
    
}
