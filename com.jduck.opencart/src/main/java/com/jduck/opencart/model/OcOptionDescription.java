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
@Table(name = "oc_option_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOptionDescription.findAll", query = "SELECT o FROM OcOptionDescription o"),
    @NamedQuery(name = "OcOptionDescription.findByOptionId", query = "SELECT o FROM OcOptionDescription o WHERE o.ocOptionDescriptionPK.optionId = :optionId"),
    @NamedQuery(name = "OcOptionDescription.findByLanguageId", query = "SELECT o FROM OcOptionDescription o WHERE o.ocOptionDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcOptionDescription.findByName", query = "SELECT o FROM OcOptionDescription o WHERE o.name = :name")})
public class OcOptionDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcOptionDescriptionPK ocOptionDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public OcOptionDescription() {
    }

    public OcOptionDescription(OcOptionDescriptionPK ocOptionDescriptionPK) {
        this.ocOptionDescriptionPK = ocOptionDescriptionPK;
    }

    public OcOptionDescription(OcOptionDescriptionPK ocOptionDescriptionPK, String name) {
        this.ocOptionDescriptionPK = ocOptionDescriptionPK;
        this.name = name;
    }

    public OcOptionDescription(int optionId, int languageId) {
        this.ocOptionDescriptionPK = new OcOptionDescriptionPK(optionId, languageId);
    }

    public OcOptionDescriptionPK getOcOptionDescriptionPK() {
        return ocOptionDescriptionPK;
    }

    public void setOcOptionDescriptionPK(OcOptionDescriptionPK ocOptionDescriptionPK) {
        this.ocOptionDescriptionPK = ocOptionDescriptionPK;
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
        hash += (ocOptionDescriptionPK != null ? ocOptionDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOptionDescription)) {
            return false;
        }
        OcOptionDescription other = (OcOptionDescription) object;
        if ((this.ocOptionDescriptionPK == null && other.ocOptionDescriptionPK != null) || (this.ocOptionDescriptionPK != null && !this.ocOptionDescriptionPK.equals(other.ocOptionDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOptionDescription[ ocOptionDescriptionPK=" + ocOptionDescriptionPK + " ]";
    }
    
}
