/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "oc_language")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLanguage.findAll", query = "SELECT o FROM OcLanguage o"),
    @NamedQuery(name = "OcLanguage.findByLanguageId", query = "SELECT o FROM OcLanguage o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcLanguage.findByName", query = "SELECT o FROM OcLanguage o WHERE o.name = :name"),
    @NamedQuery(name = "OcLanguage.findByCode", query = "SELECT o FROM OcLanguage o WHERE o.code = :code"),
    @NamedQuery(name = "OcLanguage.findByLocale", query = "SELECT o FROM OcLanguage o WHERE o.locale = :locale"),
    @NamedQuery(name = "OcLanguage.findByImage", query = "SELECT o FROM OcLanguage o WHERE o.image = :image"),
    @NamedQuery(name = "OcLanguage.findByDirectory", query = "SELECT o FROM OcLanguage o WHERE o.directory = :directory"),
    @NamedQuery(name = "OcLanguage.findBySortOrder", query = "SELECT o FROM OcLanguage o WHERE o.sortOrder = :sortOrder"),
    @NamedQuery(name = "OcLanguage.findByStatus", query = "SELECT o FROM OcLanguage o WHERE o.status = :status")})
public class OcLanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "language_id")
    private Integer languageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "locale")
    private String locale;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "directory")
    private String directory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;

    public OcLanguage() {
    }

    public OcLanguage(Integer languageId) {
        this.languageId = languageId;
    }

    public OcLanguage(Integer languageId, String name, String code, String locale, String image, String directory, int sortOrder, boolean status) {
        this.languageId = languageId;
        this.name = name;
        this.code = code;
        this.locale = locale;
        this.image = image;
        this.directory = directory;
        this.sortOrder = sortOrder;
        this.status = status;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (languageId != null ? languageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLanguage)) {
            return false;
        }
        OcLanguage other = (OcLanguage) object;
        if ((this.languageId == null && other.languageId != null) || (this.languageId != null && !this.languageId.equals(other.languageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLanguage[ languageId=" + languageId + " ]";
    }
    
}
