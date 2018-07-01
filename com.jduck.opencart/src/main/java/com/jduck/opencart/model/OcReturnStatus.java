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
@Table(name = "oc_return_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReturnStatus.findAll", query = "SELECT o FROM OcReturnStatus o"),
    @NamedQuery(name = "OcReturnStatus.findByReturnStatusId", query = "SELECT o FROM OcReturnStatus o WHERE o.ocReturnStatusPK.returnStatusId = :returnStatusId"),
    @NamedQuery(name = "OcReturnStatus.findByLanguageId", query = "SELECT o FROM OcReturnStatus o WHERE o.ocReturnStatusPK.languageId = :languageId"),
    @NamedQuery(name = "OcReturnStatus.findByName", query = "SELECT o FROM OcReturnStatus o WHERE o.name = :name")})
public class OcReturnStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcReturnStatusPK ocReturnStatusPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;

    public OcReturnStatus() {
    }

    public OcReturnStatus(OcReturnStatusPK ocReturnStatusPK) {
        this.ocReturnStatusPK = ocReturnStatusPK;
    }

    public OcReturnStatus(OcReturnStatusPK ocReturnStatusPK, String name) {
        this.ocReturnStatusPK = ocReturnStatusPK;
        this.name = name;
    }

    public OcReturnStatus(int returnStatusId, int languageId) {
        this.ocReturnStatusPK = new OcReturnStatusPK(returnStatusId, languageId);
    }

    public OcReturnStatusPK getOcReturnStatusPK() {
        return ocReturnStatusPK;
    }

    public void setOcReturnStatusPK(OcReturnStatusPK ocReturnStatusPK) {
        this.ocReturnStatusPK = ocReturnStatusPK;
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
        hash += (ocReturnStatusPK != null ? ocReturnStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnStatus)) {
            return false;
        }
        OcReturnStatus other = (OcReturnStatus) object;
        if ((this.ocReturnStatusPK == null && other.ocReturnStatusPK != null) || (this.ocReturnStatusPK != null && !this.ocReturnStatusPK.equals(other.ocReturnStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnStatus[ ocReturnStatusPK=" + ocReturnStatusPK + " ]";
    }
    
}
