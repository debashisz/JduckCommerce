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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_voucher_theme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcVoucherTheme.findAll", query = "SELECT o FROM OcVoucherTheme o"),
    @NamedQuery(name = "OcVoucherTheme.findByVoucherThemeId", query = "SELECT o FROM OcVoucherTheme o WHERE o.voucherThemeId = :voucherThemeId"),
    @NamedQuery(name = "OcVoucherTheme.findByImage", query = "SELECT o FROM OcVoucherTheme o WHERE o.image = :image")})
public class OcVoucherTheme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "voucher_theme_id")
    private Integer voucherThemeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;

    public OcVoucherTheme() {
    }

    public OcVoucherTheme(Integer voucherThemeId) {
        this.voucherThemeId = voucherThemeId;
    }

    public OcVoucherTheme(Integer voucherThemeId, String image) {
        this.voucherThemeId = voucherThemeId;
        this.image = image;
    }

    public Integer getVoucherThemeId() {
        return voucherThemeId;
    }

    public void setVoucherThemeId(Integer voucherThemeId) {
        this.voucherThemeId = voucherThemeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (voucherThemeId != null ? voucherThemeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcVoucherTheme)) {
            return false;
        }
        OcVoucherTheme other = (OcVoucherTheme) object;
        if ((this.voucherThemeId == null && other.voucherThemeId != null) || (this.voucherThemeId != null && !this.voucherThemeId.equals(other.voucherThemeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcVoucherTheme[ voucherThemeId=" + voucherThemeId + " ]";
    }
    
}
