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
@Table(name = "oc_banner_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcBannerImage.findAll", query = "SELECT o FROM OcBannerImage o"),
    @NamedQuery(name = "OcBannerImage.findByBannerImageId", query = "SELECT o FROM OcBannerImage o WHERE o.bannerImageId = :bannerImageId"),
    @NamedQuery(name = "OcBannerImage.findByBannerId", query = "SELECT o FROM OcBannerImage o WHERE o.bannerId = :bannerId"),
    @NamedQuery(name = "OcBannerImage.findByLanguageId", query = "SELECT o FROM OcBannerImage o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcBannerImage.findByTitle", query = "SELECT o FROM OcBannerImage o WHERE o.title = :title"),
    @NamedQuery(name = "OcBannerImage.findByLink", query = "SELECT o FROM OcBannerImage o WHERE o.link = :link"),
    @NamedQuery(name = "OcBannerImage.findByImage", query = "SELECT o FROM OcBannerImage o WHERE o.image = :image"),
    @NamedQuery(name = "OcBannerImage.findBySortOrder", query = "SELECT o FROM OcBannerImage o WHERE o.sortOrder = :sortOrder")})
public class OcBannerImage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banner_image_id")
    private Integer bannerImageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "banner_id")
    private int bannerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "link")
    private String link;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcBannerImage() {
    }

    public OcBannerImage(Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public OcBannerImage(Integer bannerImageId, int bannerId, int languageId, String title, String link, String image, int sortOrder) {
        this.bannerImageId = bannerImageId;
        this.bannerId = bannerId;
        this.languageId = languageId;
        this.title = title;
        this.link = link;
        this.image = image;
        this.sortOrder = sortOrder;
    }

    public Integer getBannerImageId() {
        return bannerImageId;
    }

    public void setBannerImageId(Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bannerImageId != null ? bannerImageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcBannerImage)) {
            return false;
        }
        OcBannerImage other = (OcBannerImage) object;
        if ((this.bannerImageId == null && other.bannerImageId != null) || (this.bannerImageId != null && !this.bannerImageId.equals(other.bannerImageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcBannerImage[ bannerImageId=" + bannerImageId + " ]";
    }
    
}
