/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_voucher_theme_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcVoucherThemeDescription.findAll", query = "SELECT o FROM OcVoucherThemeDescription o"),
    @NamedQuery(name = "OcVoucherThemeDescription.findByVoucherThemeId", query = "SELECT o FROM OcVoucherThemeDescription o WHERE o.ocVoucherThemeDescriptionPK.voucherThemeId = :voucherThemeId"),
    @NamedQuery(name = "OcVoucherThemeDescription.findByLanguageId", query = "SELECT o FROM OcVoucherThemeDescription o WHERE o.ocVoucherThemeDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcVoucherThemeDescription.findByName", query = "SELECT o FROM OcVoucherThemeDescription o WHERE o.name = :name")})
public class OcVoucherThemeDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcVoucherThemeDescriptionPK ocVoucherThemeDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;

    public OcVoucherThemeDescription() {
    }

    public OcVoucherThemeDescription(OcVoucherThemeDescriptionPK ocVoucherThemeDescriptionPK) {
        this.ocVoucherThemeDescriptionPK = ocVoucherThemeDescriptionPK;
    }

    public OcVoucherThemeDescription(OcVoucherThemeDescriptionPK ocVoucherThemeDescriptionPK, String name) {
        this.ocVoucherThemeDescriptionPK = ocVoucherThemeDescriptionPK;
        this.name = name;
    }

    public OcVoucherThemeDescription(int voucherThemeId, int languageId) {
        this.ocVoucherThemeDescriptionPK = new OcVoucherThemeDescriptionPK(voucherThemeId, languageId);
    }

    public OcVoucherThemeDescriptionPK getOcVoucherThemeDescriptionPK() {
        return ocVoucherThemeDescriptionPK;
    }

    public void setOcVoucherThemeDescriptionPK(OcVoucherThemeDescriptionPK ocVoucherThemeDescriptionPK) {
        this.ocVoucherThemeDescriptionPK = ocVoucherThemeDescriptionPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocVoucherThemeDescriptionPK != null ? ocVoucherThemeDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcVoucherThemeDescription)) {
            return false;
        }
        OcVoucherThemeDescription other = (OcVoucherThemeDescription) object;
        if ((this.ocVoucherThemeDescriptionPK == null && other.ocVoucherThemeDescriptionPK != null) || (this.ocVoucherThemeDescriptionPK != null && !this.ocVoucherThemeDescriptionPK.equals(other.ocVoucherThemeDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcVoucherThemeDescription[ ocVoucherThemeDescriptionPK=" + ocVoucherThemeDescriptionPK + " ]";
    }
    
}
