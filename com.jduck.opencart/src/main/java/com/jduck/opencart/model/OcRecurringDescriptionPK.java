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
public class OcRecurringDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "recurring_id")
    private int recurringId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcRecurringDescriptionPK() {
    }

    public OcRecurringDescriptionPK(int recurringId, int languageId) {
        this.recurringId = recurringId;
        this.languageId = languageId;
    }

    public int getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(int recurringId) {
        this.recurringId = recurringId;
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
        hash += (int) recurringId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcRecurringDescriptionPK)) {
            return false;
        }
        OcRecurringDescriptionPK other = (OcRecurringDescriptionPK) object;
        if (this.recurringId != other.recurringId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcRecurringDescriptionPK[ recurringId=" + recurringId + ", languageId=" + languageId + " ]";
    }
    
}
