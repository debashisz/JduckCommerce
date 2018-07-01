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
@Table(name = "oc_download_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcDownloadDescription.findAll", query = "SELECT o FROM OcDownloadDescription o"),
    @NamedQuery(name = "OcDownloadDescription.findByDownloadId", query = "SELECT o FROM OcDownloadDescription o WHERE o.ocDownloadDescriptionPK.downloadId = :downloadId"),
    @NamedQuery(name = "OcDownloadDescription.findByLanguageId", query = "SELECT o FROM OcDownloadDescription o WHERE o.ocDownloadDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcDownloadDescription.findByName", query = "SELECT o FROM OcDownloadDescription o WHERE o.name = :name")})
public class OcDownloadDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcDownloadDescriptionPK ocDownloadDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;

    public OcDownloadDescription() {
    }

    public OcDownloadDescription(OcDownloadDescriptionPK ocDownloadDescriptionPK) {
        this.ocDownloadDescriptionPK = ocDownloadDescriptionPK;
    }

    public OcDownloadDescription(OcDownloadDescriptionPK ocDownloadDescriptionPK, String name) {
        this.ocDownloadDescriptionPK = ocDownloadDescriptionPK;
        this.name = name;
    }

    public OcDownloadDescription(int downloadId, int languageId) {
        this.ocDownloadDescriptionPK = new OcDownloadDescriptionPK(downloadId, languageId);
    }

    public OcDownloadDescriptionPK getOcDownloadDescriptionPK() {
        return ocDownloadDescriptionPK;
    }

    public void setOcDownloadDescriptionPK(OcDownloadDescriptionPK ocDownloadDescriptionPK) {
        this.ocDownloadDescriptionPK = ocDownloadDescriptionPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocDownloadDescriptionPK != null ? ocDownloadDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcDownloadDescription)) {
            return false;
        }
        OcDownloadDescription other = (OcDownloadDescription) object;
        if ((this.ocDownloadDescriptionPK == null && other.ocDownloadDescriptionPK != null) || (this.ocDownloadDescriptionPK != null && !this.ocDownloadDescriptionPK.equals(other.ocDownloadDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcDownloadDescription[ ocDownloadDescriptionPK=" + ocDownloadDescriptionPK + " ]";
    }
    
}
