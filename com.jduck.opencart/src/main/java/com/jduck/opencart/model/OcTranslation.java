/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_translation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcTranslation.findAll", query = "SELECT o FROM OcTranslation o"),
    @NamedQuery(name = "OcTranslation.findByTranslationId", query = "SELECT o FROM OcTranslation o WHERE o.translationId = :translationId"),
    @NamedQuery(name = "OcTranslation.findByStoreId", query = "SELECT o FROM OcTranslation o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcTranslation.findByLanguageId", query = "SELECT o FROM OcTranslation o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcTranslation.findByRoute", query = "SELECT o FROM OcTranslation o WHERE o.route = :route"),
    @NamedQuery(name = "OcTranslation.findByKey", query = "SELECT o FROM OcTranslation o WHERE o.key = :key"),
    @NamedQuery(name = "OcTranslation.findByDateAdded", query = "SELECT o FROM OcTranslation o WHERE o.dateAdded = :dateAdded")})
public class OcTranslation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "translation_id")
    private Integer translationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "route")
    private String route;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "key")
    private String key;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcTranslation() {
    }

    public OcTranslation(Integer translationId) {
        this.translationId = translationId;
    }

    public OcTranslation(Integer translationId, int storeId, int languageId, String route, String key, String value, Date dateAdded) {
        this.translationId = translationId;
        this.storeId = storeId;
        this.languageId = languageId;
        this.route = route;
        this.key = key;
        this.value = value;
        this.dateAdded = dateAdded;
    }

    public Integer getTranslationId() {
        return translationId;
    }

    public void setTranslationId(Integer translationId) {
        this.translationId = translationId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (translationId != null ? translationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTranslation)) {
            return false;
        }
        OcTranslation other = (OcTranslation) object;
        if ((this.translationId == null && other.translationId != null) || (this.translationId != null && !this.translationId.equals(other.translationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTranslation[ translationId=" + translationId + " ]";
    }
    
}
