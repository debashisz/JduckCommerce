/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Windows10
 */
@Embeddable
public class OcDownloadDescriptionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "download_id")
    private int downloadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public OcDownloadDescriptionPK() {
    }

    public OcDownloadDescriptionPK(int downloadId, int languageId) {
        this.downloadId = downloadId;
        this.languageId = languageId;
    }

    public int getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(int downloadId) {
        this.downloadId = downloadId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) downloadId;
        hash += (int) languageId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcDownloadDescriptionPK)) {
            return false;
        }
        OcDownloadDescriptionPK other = (OcDownloadDescriptionPK) object;
        if (this.downloadId != other.downloadId) {
            return false;
        }
        if (this.languageId != other.languageId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcDownloadDescriptionPK[ downloadId=" + downloadId + ", languageId=" + languageId + " ]";
    }
    
}
