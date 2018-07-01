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
@Table(name = "oc_recurring_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcRecurringDescription.findAll", query = "SELECT o FROM OcRecurringDescription o"),
    @NamedQuery(name = "OcRecurringDescription.findByRecurringId", query = "SELECT o FROM OcRecurringDescription o WHERE o.ocRecurringDescriptionPK.recurringId = :recurringId"),
    @NamedQuery(name = "OcRecurringDescription.findByLanguageId", query = "SELECT o FROM OcRecurringDescription o WHERE o.ocRecurringDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcRecurringDescription.findByName", query = "SELECT o FROM OcRecurringDescription o WHERE o.name = :name")})
public class OcRecurringDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcRecurringDescriptionPK ocRecurringDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;

    public OcRecurringDescription() {
    }

    public OcRecurringDescription(OcRecurringDescriptionPK ocRecurringDescriptionPK) {
        this.ocRecurringDescriptionPK = ocRecurringDescriptionPK;
    }

    public OcRecurringDescription(OcRecurringDescriptionPK ocRecurringDescriptionPK, String name) {
        this.ocRecurringDescriptionPK = ocRecurringDescriptionPK;
        this.name = name;
    }

    public OcRecurringDescription(int recurringId, int languageId) {
        this.ocRecurringDescriptionPK = new OcRecurringDescriptionPK(recurringId, languageId);
    }

    public OcRecurringDescriptionPK getOcRecurringDescriptionPK() {
        return ocRecurringDescriptionPK;
    }

    public void setOcRecurringDescriptionPK(OcRecurringDescriptionPK ocRecurringDescriptionPK) {
        this.ocRecurringDescriptionPK = ocRecurringDescriptionPK;
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
        hash += (ocRecurringDescriptionPK != null ? ocRecurringDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcRecurringDescription)) {
            return false;
        }
        OcRecurringDescription other = (OcRecurringDescription) object;
        if ((this.ocRecurringDescriptionPK == null && other.ocRecurringDescriptionPK != null) || (this.ocRecurringDescriptionPK != null && !this.ocRecurringDescriptionPK.equals(other.ocRecurringDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcRecurringDescription[ ocRecurringDescriptionPK=" + ocRecurringDescriptionPK + " ]";
    }
    
}
