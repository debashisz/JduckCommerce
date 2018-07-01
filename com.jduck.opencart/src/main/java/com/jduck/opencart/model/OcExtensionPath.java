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
@Table(name = "oc_extension_path")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcExtensionPath.findAll", query = "SELECT o FROM OcExtensionPath o"),
    @NamedQuery(name = "OcExtensionPath.findByExtensionPathId", query = "SELECT o FROM OcExtensionPath o WHERE o.extensionPathId = :extensionPathId"),
    @NamedQuery(name = "OcExtensionPath.findByExtensionInstallId", query = "SELECT o FROM OcExtensionPath o WHERE o.extensionInstallId = :extensionInstallId"),
    @NamedQuery(name = "OcExtensionPath.findByPath", query = "SELECT o FROM OcExtensionPath o WHERE o.path = :path"),
    @NamedQuery(name = "OcExtensionPath.findByDateAdded", query = "SELECT o FROM OcExtensionPath o WHERE o.dateAdded = :dateAdded")})
public class OcExtensionPath implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "extension_path_id")
    private Integer extensionPathId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extension_install_id")
    private int extensionInstallId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "path")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcExtensionPath() {
    }

    public OcExtensionPath(Integer extensionPathId) {
        this.extensionPathId = extensionPathId;
    }

    public OcExtensionPath(Integer extensionPathId, int extensionInstallId, String path, Date dateAdded) {
        this.extensionPathId = extensionPathId;
        this.extensionInstallId = extensionInstallId;
        this.path = path;
        this.dateAdded = dateAdded;
    }

    public Integer getExtensionPathId() {
        return extensionPathId;
    }

    public void setExtensionPathId(Integer extensionPathId) {
        this.extensionPathId = extensionPathId;
    }

    public int getExtensionInstallId() {
        return extensionInstallId;
    }

    public void setExtensionInstallId(int extensionInstallId) {
        this.extensionInstallId = extensionInstallId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
        hash += (extensionPathId != null ? extensionPathId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcExtensionPath)) {
            return false;
        }
        OcExtensionPath other = (OcExtensionPath) object;
        if ((this.extensionPathId == null && other.extensionPathId != null) || (this.extensionPathId != null && !this.extensionPathId.equals(other.extensionPathId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcExtensionPath[ extensionPathId=" + extensionPathId + " ]";
    }
    
}
