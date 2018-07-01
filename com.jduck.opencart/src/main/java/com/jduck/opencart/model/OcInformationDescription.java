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
import javax.persistence.Lob;
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
@Table(name = "oc_information_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcInformationDescription.findAll", query = "SELECT o FROM OcInformationDescription o"),
    @NamedQuery(name = "OcInformationDescription.findByInformationId", query = "SELECT o FROM OcInformationDescription o WHERE o.ocInformationDescriptionPK.informationId = :informationId"),
    @NamedQuery(name = "OcInformationDescription.findByLanguageId", query = "SELECT o FROM OcInformationDescription o WHERE o.ocInformationDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcInformationDescription.findByTitle", query = "SELECT o FROM OcInformationDescription o WHERE o.title = :title"),
    @NamedQuery(name = "OcInformationDescription.findByMetaTitle", query = "SELECT o FROM OcInformationDescription o WHERE o.metaTitle = :metaTitle"),
    @NamedQuery(name = "OcInformationDescription.findByMetaDescription", query = "SELECT o FROM OcInformationDescription o WHERE o.metaDescription = :metaDescription"),
    @NamedQuery(name = "OcInformationDescription.findByMetaKeyword", query = "SELECT o FROM OcInformationDescription o WHERE o.metaKeyword = :metaKeyword")})
public class OcInformationDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcInformationDescriptionPK ocInformationDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "meta_title")
    private String metaTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "meta_description")
    private String metaDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "meta_keyword")
    private String metaKeyword;

    public OcInformationDescription() {
    }

    public OcInformationDescription(OcInformationDescriptionPK ocInformationDescriptionPK) {
        this.ocInformationDescriptionPK = ocInformationDescriptionPK;
    }

    public OcInformationDescription(OcInformationDescriptionPK ocInformationDescriptionPK, String title, String description, String metaTitle, String metaDescription, String metaKeyword) {
        this.ocInformationDescriptionPK = ocInformationDescriptionPK;
        this.title = title;
        this.description = description;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
    }

    public OcInformationDescription(int informationId, int languageId) {
        this.ocInformationDescriptionPK = new OcInformationDescriptionPK(informationId, languageId);
    }

    public OcInformationDescriptionPK getOcInformationDescriptionPK() {
        return ocInformationDescriptionPK;
    }

    public void setOcInformationDescriptionPK(OcInformationDescriptionPK ocInformationDescriptionPK) {
        this.ocInformationDescriptionPK = ocInformationDescriptionPK;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocInformationDescriptionPK != null ? ocInformationDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformationDescription)) {
            return false;
        }
        OcInformationDescription other = (OcInformationDescription) object;
        if ((this.ocInformationDescriptionPK == null && other.ocInformationDescriptionPK != null) || (this.ocInformationDescriptionPK != null && !this.ocInformationDescriptionPK.equals(other.ocInformationDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformationDescription[ ocInformationDescriptionPK=" + ocInformationDescriptionPK + " ]";
    }
    
}
