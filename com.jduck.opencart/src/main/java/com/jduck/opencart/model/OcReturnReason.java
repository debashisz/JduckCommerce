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
@Table(name = "oc_return_reason")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReturnReason.findAll", query = "SELECT o FROM OcReturnReason o"),
    @NamedQuery(name = "OcReturnReason.findByReturnReasonId", query = "SELECT o FROM OcReturnReason o WHERE o.ocReturnReasonPK.returnReasonId = :returnReasonId"),
    @NamedQuery(name = "OcReturnReason.findByLanguageId", query = "SELECT o FROM OcReturnReason o WHERE o.ocReturnReasonPK.languageId = :languageId"),
    @NamedQuery(name = "OcReturnReason.findByName", query = "SELECT o FROM OcReturnReason o WHERE o.name = :name")})
public class OcReturnReason implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcReturnReasonPK ocReturnReasonPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public OcReturnReason() {
    }

    public OcReturnReason(OcReturnReasonPK ocReturnReasonPK) {
        this.ocReturnReasonPK = ocReturnReasonPK;
    }

    public OcReturnReason(OcReturnReasonPK ocReturnReasonPK, String name) {
        this.ocReturnReasonPK = ocReturnReasonPK;
        this.name = name;
    }

    public OcReturnReason(int returnReasonId, int languageId) {
        this.ocReturnReasonPK = new OcReturnReasonPK(returnReasonId, languageId);
    }

    public OcReturnReasonPK getOcReturnReasonPK() {
        return ocReturnReasonPK;
    }

    public void setOcReturnReasonPK(OcReturnReasonPK ocReturnReasonPK) {
        this.ocReturnReasonPK = ocReturnReasonPK;
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
        hash += (ocReturnReasonPK != null ? ocReturnReasonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnReason)) {
            return false;
        }
        OcReturnReason other = (OcReturnReason) object;
        if ((this.ocReturnReasonPK == null && other.ocReturnReasonPK != null) || (this.ocReturnReasonPK != null && !this.ocReturnReasonPK.equals(other.ocReturnReasonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnReason[ ocReturnReasonPK=" + ocReturnReasonPK + " ]";
    }
    
}
