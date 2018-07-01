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
public class OcVoucherThemeDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "voucher_theme_id")
    private int voucherThemeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcVoucherThemeDescriptionPK() {
    }

    public OcVoucherThemeDescriptionPK(int voucherThemeId, int languageId) {
        this.voucherThemeId = voucherThemeId;
        this.languageId = languageId;
    }

    public int getVoucherThemeId() {
        return voucherThemeId;
    }

    public void setVoucherThemeId(int voucherThemeId) {
        this.voucherThemeId = voucherThemeId;
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
        hash += (int) voucherThemeId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcVoucherThemeDescriptionPK)) {
            return false;
        }
        OcVoucherThemeDescriptionPK other = (OcVoucherThemeDescriptionPK) object;
        if (this.voucherThemeId != other.voucherThemeId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcVoucherThemeDescriptionPK[ voucherThemeId=" + voucherThemeId + ", languageId=" + languageId + " ]";
    }
    
}
