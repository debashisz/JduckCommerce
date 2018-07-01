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
@Table(name = "oc_product_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductDescription.findAll", query = "SELECT o FROM OcProductDescription o"),
    @NamedQuery(name = "OcProductDescription.findByProductId", query = "SELECT o FROM OcProductDescription o WHERE o.ocProductDescriptionPK.productId = :productId"),
    @NamedQuery(name = "OcProductDescription.findByLanguageId", query = "SELECT o FROM OcProductDescription o WHERE o.ocProductDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcProductDescription.findByName", query = "SELECT o FROM OcProductDescription o WHERE o.name = :name"),
    @NamedQuery(name = "OcProductDescription.findByMetaTitle", query = "SELECT o FROM OcProductDescription o WHERE o.metaTitle = :metaTitle"),
    @NamedQuery(name = "OcProductDescription.findByMetaDescription", query = "SELECT o FROM OcProductDescription o WHERE o.metaDescription = :metaDescription"),
    @NamedQuery(name = "OcProductDescription.findByMetaKeyword", query = "SELECT o FROM OcProductDescription o WHERE o.metaKeyword = :metaKeyword")})
public class OcProductDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductDescriptionPK ocProductDescriptionPK;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "tag")
    private String tag;
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

    public OcProductDescription() {
    }

    public OcProductDescription(OcProductDescriptionPK ocProductDescriptionPK) {
        this.ocProductDescriptionPK = ocProductDescriptionPK;
    }

    public OcProductDescription(OcProductDescriptionPK ocProductDescriptionPK, String name, String description, String tag, String metaTitle, String metaDescription, String metaKeyword) {
        this.ocProductDescriptionPK = ocProductDescriptionPK;
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
    }

    public OcProductDescription(int productId, int languageId) {
        this.ocProductDescriptionPK = new OcProductDescriptionPK(productId, languageId);
    }

    public OcProductDescriptionPK getOcProductDescriptionPK() {
        return ocProductDescriptionPK;
    }

    public void setOcProductDescriptionPK(OcProductDescriptionPK ocProductDescriptionPK) {
        this.ocProductDescriptionPK = ocProductDescriptionPK;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        hash += (ocProductDescriptionPK != null ? ocProductDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductDescription)) {
            return false;
        }
        OcProductDescription other = (OcProductDescription) object;
        if ((this.ocProductDescriptionPK == null && other.ocProductDescriptionPK != null) || (this.ocProductDescriptionPK != null && !this.ocProductDescriptionPK.equals(other.ocProductDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductDescription[ ocProductDescriptionPK=" + ocProductDescriptionPK + " ]";
    }
    
}
