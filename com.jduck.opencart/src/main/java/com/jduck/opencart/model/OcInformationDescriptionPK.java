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
public class OcInformationDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "information_id")
    private int informationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcInformationDescriptionPK() {
    }

    public OcInformationDescriptionPK(int informationId, int languageId) {
        this.informationId = informationId;
        this.languageId = languageId;
    }

    public int getInformationId() {
        return informationId;
    }

    public void setInformationId(int informationId) {
        this.informationId = informationId;
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
        hash += (int) informationId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformationDescriptionPK)) {
            return false;
        }
        OcInformationDescriptionPK other = (OcInformationDescriptionPK) object;
        if (this.informationId != other.informationId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformationDescriptionPK[ informationId=" + informationId + ", languageId=" + languageId + " ]";
    }
    
}
