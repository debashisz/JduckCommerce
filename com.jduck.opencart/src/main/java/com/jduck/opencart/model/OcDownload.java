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
@Table(name = "oc_download")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcDownload.findAll", query = "SELECT o FROM OcDownload o"),
    @NamedQuery(name = "OcDownload.findByDownloadId", query = "SELECT o FROM OcDownload o WHERE o.downloadId = :downloadId"),
    @NamedQuery(name = "OcDownload.findByFilename", query = "SELECT o FROM OcDownload o WHERE o.filename = :filename"),
    @NamedQuery(name = "OcDownload.findByMask", query = "SELECT o FROM OcDownload o WHERE o.mask = :mask"),
    @NamedQuery(name = "OcDownload.findByDateAdded", query = "SELECT o FROM OcDownload o WHERE o.dateAdded = :dateAdded")})
public class OcDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "download_id")
    private Integer downloadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "mask")
    private String mask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcDownload() {
    }

    public OcDownload(Integer downloadId) {
        this.downloadId = downloadId;
    }

    public OcDownload(Integer downloadId, String filename, String mask, Date dateAdded) {
        this.downloadId = downloadId;
        this.filename = filename;
        this.mask = mask;
        this.dateAdded = dateAdded;
    }

    public Integer getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
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
        hash += (downloadId != null ? downloadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcDownload)) {
            return false;
        }
        OcDownload other = (OcDownload) object;
        if ((this.downloadId == null && other.downloadId != null) || (this.downloadId != null && !this.downloadId.equals(other.downloadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcDownload[ downloadId=" + downloadId + " ]";
    }
    
}
