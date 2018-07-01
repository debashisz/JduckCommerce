/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_product_to_download")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductToDownload.findAll", query = "SELECT o FROM OcProductToDownload o"),
    @NamedQuery(name = "OcProductToDownload.findByProductId", query = "SELECT o FROM OcProductToDownload o WHERE o.ocProductToDownloadPK.productId = :productId"),
    @NamedQuery(name = "OcProductToDownload.findByDownloadId", query = "SELECT o FROM OcProductToDownload o WHERE o.ocProductToDownloadPK.downloadId = :downloadId")})
public class OcProductToDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductToDownloadPK ocProductToDownloadPK;

    public OcProductToDownload() {
    }

    public OcProductToDownload(OcProductToDownloadPK ocProductToDownloadPK) {
        this.ocProductToDownloadPK = ocProductToDownloadPK;
    }

    public OcProductToDownload(int productId, int downloadId) {
        this.ocProductToDownloadPK = new OcProductToDownloadPK(productId, downloadId);
    }

    public OcProductToDownloadPK getOcProductToDownloadPK() {
        return ocProductToDownloadPK;
    }

    public void setOcProductToDownloadPK(OcProductToDownloadPK ocProductToDownloadPK) {
        this.ocProductToDownloadPK = ocProductToDownloadPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductToDownloadPK != null ? ocProductToDownloadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductToDownload)) {
            return false;
        }
        OcProductToDownload other = (OcProductToDownload) object;
        if ((this.ocProductToDownloadPK == null && other.ocProductToDownloadPK != null) || (this.ocProductToDownloadPK != null && !this.ocProductToDownloadPK.equals(other.ocProductToDownloadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductToDownload[ ocProductToDownloadPK=" + ocProductToDownloadPK + " ]";
    }
    
}
