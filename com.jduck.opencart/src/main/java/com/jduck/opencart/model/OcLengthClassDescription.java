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
@Table(name = "oc_length_class_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLengthClassDescription.findAll", query = "SELECT o FROM OcLengthClassDescription o"),
    @NamedQuery(name = "OcLengthClassDescription.findByLengthClassId", query = "SELECT o FROM OcLengthClassDescription o WHERE o.ocLengthClassDescriptionPK.lengthClassId = :lengthClassId"),
    @NamedQuery(name = "OcLengthClassDescription.findByLanguageId", query = "SELECT o FROM OcLengthClassDescription o WHERE o.ocLengthClassDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcLengthClassDescription.findByTitle", query = "SELECT o FROM OcLengthClassDescription o WHERE o.title = :title"),
    @NamedQuery(name = "OcLengthClassDescription.findByUnit", query = "SELECT o FROM OcLengthClassDescription o WHERE o.unit = :unit")})
public class OcLengthClassDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcLengthClassDescriptionPK ocLengthClassDescriptionPK;
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

    public OcLengthClassDescription() {
    }

    public OcLengthClassDescription(OcLengthClassDescriptionPK ocLengthClassDescriptionPK) {
        this.ocLengthClassDescriptionPK = ocLengthClassDescriptionPK;
    }

    public OcLengthClassDescription(OcLengthClassDescriptionPK ocLengthClassDescriptionPK, String title, String unit) {
        this.ocLengthClassDescriptionPK = ocLengthClassDescriptionPK;
        this.title = title;
        this.unit = unit;
    }

    public OcLengthClassDescription(int lengthClassId, int languageId) {
        this.ocLengthClassDescriptionPK = new OcLengthClassDescriptionPK(lengthClassId, languageId);
    }

    public OcLengthClassDescriptionPK getOcLengthClassDescriptionPK() {
        return ocLengthClassDescriptionPK;
    }

    public void setOcLengthClassDescriptionPK(OcLengthClassDescriptionPK ocLengthClassDescriptionPK) {
        this.ocLengthClassDescriptionPK = ocLengthClassDescriptionPK;
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
        hash += (ocLengthClassDescriptionPK != null ? ocLengthClassDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLengthClassDescription)) {
            return false;
        }
        OcLengthClassDescription other = (OcLengthClassDescription) object;
        if ((this.ocLengthClassDescriptionPK == null && other.ocLengthClassDescriptionPK != null) || (this.ocLengthClassDescriptionPK != null && !this.ocLengthClassDescriptionPK.equals(other.ocLengthClassDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLengthClassDescription[ ocLengthClassDescriptionPK=" + ocLengthClassDescriptionPK + " ]";
    }
    
}
