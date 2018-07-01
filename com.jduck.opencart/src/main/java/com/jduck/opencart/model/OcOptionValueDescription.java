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
@Table(name = "oc_option_value_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOptionValueDescription.findAll", query = "SELECT o FROM OcOptionValueDescription o"),
    @NamedQuery(name = "OcOptionValueDescription.findByOptionValueId", query = "SELECT o FROM OcOptionValueDescription o WHERE o.ocOptionValueDescriptionPK.optionValueId = :optionValueId"),
    @NamedQuery(name = "OcOptionValueDescription.findByLanguageId", query = "SELECT o FROM OcOptionValueDescription o WHERE o.ocOptionValueDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcOptionValueDescription.findByOptionId", query = "SELECT o FROM OcOptionValueDescription o WHERE o.optionId = :optionId"),
    @NamedQuery(name = "OcOptionValueDescription.findByName", query = "SELECT o FROM OcOptionValueDescription o WHERE o.name = :name")})
public class OcOptionValueDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcOptionValueDescriptionPK ocOptionValueDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;

    public OcOptionValueDescription() {
    }

    public OcOptionValueDescription(OcOptionValueDescriptionPK ocOptionValueDescriptionPK) {
        this.ocOptionValueDescriptionPK = ocOptionValueDescriptionPK;
    }

    public OcOptionValueDescription(OcOptionValueDescriptionPK ocOptionValueDescriptionPK, int optionId, String name) {
        this.ocOptionValueDescriptionPK = ocOptionValueDescriptionPK;
        this.optionId = optionId;
        this.name = name;
    }

    public OcOptionValueDescription(int optionValueId, int languageId) {
        this.ocOptionValueDescriptionPK = new OcOptionValueDescriptionPK(optionValueId, languageId);
    }

    public OcOptionValueDescriptionPK getOcOptionValueDescriptionPK() {
        return ocOptionValueDescriptionPK;
    }

    public void setOcOptionValueDescriptionPK(OcOptionValueDescriptionPK ocOptionValueDescriptionPK) {
        this.ocOptionValueDescriptionPK = ocOptionValueDescriptionPK;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
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
        hash += (ocOptionValueDescriptionPK != null ? ocOptionValueDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOptionValueDescription)) {
            return false;
        }
        OcOptionValueDescription other = (OcOptionValueDescription) object;
        if ((this.ocOptionValueDescriptionPK == null && other.ocOptionValueDescriptionPK != null) || (this.ocOptionValueDescriptionPK != null && !this.ocOptionValueDescriptionPK.equals(other.ocOptionValueDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOptionValueDescription[ ocOptionValueDescriptionPK=" + ocOptionValueDescriptionPK + " ]";
    }
    
}
