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
@Table(name = "oc_return_action")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReturnAction.findAll", query = "SELECT o FROM OcReturnAction o"),
    @NamedQuery(name = "OcReturnAction.findByReturnActionId", query = "SELECT o FROM OcReturnAction o WHERE o.ocReturnActionPK.returnActionId = :returnActionId"),
    @NamedQuery(name = "OcReturnAction.findByLanguageId", query = "SELECT o FROM OcReturnAction o WHERE o.ocReturnActionPK.languageId = :languageId"),
    @NamedQuery(name = "OcReturnAction.findByName", query = "SELECT o FROM OcReturnAction o WHERE o.name = :name")})
public class OcReturnAction implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcReturnActionPK ocReturnActionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcReturnAction() {
    }

    public OcReturnAction(OcReturnActionPK ocReturnActionPK) {
        this.ocReturnActionPK = ocReturnActionPK;
    }

    public OcReturnAction(OcReturnActionPK ocReturnActionPK, String name) {
        this.ocReturnActionPK = ocReturnActionPK;
        this.name = name;
    }

    public OcReturnAction(int returnActionId, int languageId) {
        this.ocReturnActionPK = new OcReturnActionPK(returnActionId, languageId);
    }

    public OcReturnActionPK getOcReturnActionPK() {
        return ocReturnActionPK;
    }

    public void setOcReturnActionPK(OcReturnActionPK ocReturnActionPK) {
        this.ocReturnActionPK = ocReturnActionPK;
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
        hash += (ocReturnActionPK != null ? ocReturnActionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnAction)) {
            return false;
        }
        OcReturnAction other = (OcReturnAction) object;
        if ((this.ocReturnActionPK == null && other.ocReturnActionPK != null) || (this.ocReturnActionPK != null && !this.ocReturnActionPK.equals(other.ocReturnActionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnAction[ ocReturnActionPK=" + ocReturnActionPK + " ]";
    }
    
}
