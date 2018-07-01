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
@Table(name = "oc_extension_install")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcExtensionInstall.findAll", query = "SELECT o FROM OcExtensionInstall o"),
    @NamedQuery(name = "OcExtensionInstall.findByExtensionInstallId", query = "SELECT o FROM OcExtensionInstall o WHERE o.extensionInstallId = :extensionInstallId"),
    @NamedQuery(name = "OcExtensionInstall.findByExtensionDownloadId", query = "SELECT o FROM OcExtensionInstall o WHERE o.extensionDownloadId = :extensionDownloadId"),
    @NamedQuery(name = "OcExtensionInstall.findByFilename", query = "SELECT o FROM OcExtensionInstall o WHERE o.filename = :filename"),
    @NamedQuery(name = "OcExtensionInstall.findByDateAdded", query = "SELECT o FROM OcExtensionInstall o WHERE o.dateAdded = :dateAdded")})
public class OcExtensionInstall implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "extension_install_id")
    private Integer extensionInstallId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extension_download_id")
    private int extensionDownloadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcExtensionInstall() {
    }

    public OcExtensionInstall(Integer extensionInstallId) {
        this.extensionInstallId = extensionInstallId;
    }

    public OcExtensionInstall(Integer extensionInstallId, int extensionDownloadId, String filename, Date dateAdded) {
        this.extensionInstallId = extensionInstallId;
        this.extensionDownloadId = extensionDownloadId;
        this.filename = filename;
        this.dateAdded = dateAdded;
    }

    public Integer getExtensionInstallId() {
        return extensionInstallId;
    }

    public void setExtensionInstallId(Integer extensionInstallId) {
        this.extensionInstallId = extensionInstallId;
    }

    public int getExtensionDownloadId() {
        return extensionDownloadId;
    }

    public void setExtensionDownloadId(int extensionDownloadId) {
        this.extensionDownloadId = extensionDownloadId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
        hash += (extensionInstallId != null ? extensionInstallId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcExtensionInstall)) {
            return false;
        }
        OcExtensionInstall other = (OcExtensionInstall) object;
        if ((this.extensionInstallId == null && other.extensionInstallId != null) || (this.extensionInstallId != null && !this.extensionInstallId.equals(other.extensionInstallId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcExtensionInstall[ extensionInstallId=" + extensionInstallId + " ]";
    }
    
}
