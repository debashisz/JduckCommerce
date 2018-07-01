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
@Table(name = "oc_category_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCategoryDescription.findAll", query = "SELECT o FROM OcCategoryDescription o"),
    @NamedQuery(name = "OcCategoryDescription.findByCategoryId", query = "SELECT o FROM OcCategoryDescription o WHERE o.ocCategoryDescriptionPK.categoryId = :categoryId"),
    @NamedQuery(name = "OcCategoryDescription.findByLanguageId", query = "SELECT o FROM OcCategoryDescription o WHERE o.ocCategoryDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcCategoryDescription.findByName", query = "SELECT o FROM OcCategoryDescription o WHERE o.name = :name"),
    @NamedQuery(name = "OcCategoryDescription.findByMetaTitle", query = "SELECT o FROM OcCategoryDescription o WHERE o.metaTitle = :metaTitle"),
    @NamedQuery(name = "OcCategoryDescription.findByMetaDescription", query = "SELECT o FROM OcCategoryDescription o WHERE o.metaDescription = :metaDescription"),
    @NamedQuery(name = "OcCategoryDescription.findByMetaKeyword", query = "SELECT o FROM OcCategoryDescription o WHERE o.metaKeyword = :metaKeyword")})
public class OcCategoryDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCategoryDescriptionPK ocCategoryDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
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

    public OcCategoryDescription() {
    }

    public OcCategoryDescription(OcCategoryDescriptionPK ocCategoryDescriptionPK) {
        this.ocCategoryDescriptionPK = ocCategoryDescriptionPK;
    }

    public OcCategoryDescription(OcCategoryDescriptionPK ocCategoryDescriptionPK, String name, String description, String metaTitle, String metaDescription, String metaKeyword) {
        this.ocCategoryDescriptionPK = ocCategoryDescriptionPK;
        this.name = name;
        this.description = description;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
    }

    public OcCategoryDescription(int categoryId, int languageId) {
        this.ocCategoryDescriptionPK = new OcCategoryDescriptionPK(categoryId, languageId);
    }

    public OcCategoryDescriptionPK getOcCategoryDescriptionPK() {
        return ocCategoryDescriptionPK;
    }

    public void setOcCategoryDescriptionPK(OcCategoryDescriptionPK ocCategoryDescriptionPK) {
        this.ocCategoryDescriptionPK = ocCategoryDescriptionPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (ocCategoryDescriptionPK != null ? ocCategoryDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCategoryDescription)) {
            return false;
        }
        OcCategoryDescription other = (OcCategoryDescription) object;
        if ((this.ocCategoryDescriptionPK == null && other.ocCategoryDescriptionPK != null) || (this.ocCategoryDescriptionPK != null && !this.ocCategoryDescriptionPK.equals(other.ocCategoryDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCategoryDescription[ ocCategoryDescriptionPK=" + ocCategoryDescriptionPK + " ]";
    }
    
}
