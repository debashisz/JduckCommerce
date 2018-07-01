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
@Table(name = "oc_seo_url")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcSeoUrl.findAll", query = "SELECT o FROM OcSeoUrl o"),
    @NamedQuery(name = "OcSeoUrl.findBySeoUrlId", query = "SELECT o FROM OcSeoUrl o WHERE o.seoUrlId = :seoUrlId"),
    @NamedQuery(name = "OcSeoUrl.findByStoreId", query = "SELECT o FROM OcSeoUrl o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcSeoUrl.findByLanguageId", query = "SELECT o FROM OcSeoUrl o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcSeoUrl.findByQuery", query = "SELECT o FROM OcSeoUrl o WHERE o.query = :query"),
    @NamedQuery(name = "OcSeoUrl.findByKeyword", query = "SELECT o FROM OcSeoUrl o WHERE o.keyword = :keyword")})
public class OcSeoUrl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seo_url_id")
    private Integer seoUrlId;
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
    @Size(min = 1, max = 255)
    @Column(name = "query")
    private String query;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "keyword")
    private String keyword;

    public OcSeoUrl() {
    }

    public OcSeoUrl(Integer seoUrlId) {
        this.seoUrlId = seoUrlId;
    }

    public OcSeoUrl(Integer seoUrlId, int storeId, int languageId, String query, String keyword) {
        this.seoUrlId = seoUrlId;
        this.storeId = storeId;
        this.languageId = languageId;
        this.query = query;
        this.keyword = keyword;
    }

    public Integer getSeoUrlId() {
        return seoUrlId;
    }

    public void setSeoUrlId(Integer seoUrlId) {
        this.seoUrlId = seoUrlId;
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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seoUrlId != null ? seoUrlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcSeoUrl)) {
            return false;
        }
        OcSeoUrl other = (OcSeoUrl) object;
        if ((this.seoUrlId == null && other.seoUrlId != null) || (this.seoUrlId != null && !this.seoUrlId.equals(other.seoUrlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcSeoUrl[ seoUrlId=" + seoUrlId + " ]";
    }
    
}
