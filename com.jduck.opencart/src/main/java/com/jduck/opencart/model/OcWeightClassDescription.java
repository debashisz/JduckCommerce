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
@Table(name = "oc_weight_class_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcWeightClassDescription.findAll", query = "SELECT o FROM OcWeightClassDescription o"),
    @NamedQuery(name = "OcWeightClassDescription.findByWeightClassId", query = "SELECT o FROM OcWeightClassDescription o WHERE o.ocWeightClassDescriptionPK.weightClassId = :weightClassId"),
    @NamedQuery(name = "OcWeightClassDescription.findByLanguageId", query = "SELECT o FROM OcWeightClassDescription o WHERE o.ocWeightClassDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcWeightClassDescription.findByTitle", query = "SELECT o FROM OcWeightClassDescription o WHERE o.title = :title"),
    @NamedQuery(name = "OcWeightClassDescription.findByUnit", query = "SELECT o FROM OcWeightClassDescription o WHERE o.unit = :unit")})
public class OcWeightClassDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcWeightClassDescriptionPK ocWeightClassDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "unit")
    private String unit;

    public OcWeightClassDescription() {
    }

    public OcWeightClassDescription(OcWeightClassDescriptionPK ocWeightClassDescriptionPK) {
        this.ocWeightClassDescriptionPK = ocWeightClassDescriptionPK;
    }

    public OcWeightClassDescription(OcWeightClassDescriptionPK ocWeightClassDescriptionPK, String title, String unit) {
        this.ocWeightClassDescriptionPK = ocWeightClassDescriptionPK;
        this.title = title;
        this.unit = unit;
    }

    public OcWeightClassDescription(int weightClassId, int languageId) {
        this.ocWeightClassDescriptionPK = new OcWeightClassDescriptionPK(weightClassId, languageId);
    }

    public OcWeightClassDescriptionPK getOcWeightClassDescriptionPK() {
        return ocWeightClassDescriptionPK;
    }

    public void setOcWeightClassDescriptionPK(OcWeightClassDescriptionPK ocWeightClassDescriptionPK) {
        this.ocWeightClassDescriptionPK = ocWeightClassDescriptionPK;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocWeightClassDescriptionPK != null ? ocWeightClassDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcWeightClassDescription)) {
            return false;
        }
        OcWeightClassDescription other = (OcWeightClassDescription) object;
        if ((this.ocWeightClassDescriptionPK == null && other.ocWeightClassDescriptionPK != null) || (this.ocWeightClassDescriptionPK != null && !this.ocWeightClassDescriptionPK.equals(other.ocWeightClassDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcWeightClassDescription[ ocWeightClassDescriptionPK=" + ocWeightClassDescriptionPK + " ]";
    }
    
}
