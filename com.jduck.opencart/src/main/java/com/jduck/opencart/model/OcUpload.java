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
@Table(name = "oc_upload")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcUpload.findAll", query = "SELECT o FROM OcUpload o"),
    @NamedQuery(name = "OcUpload.findByUploadId", query = "SELECT o FROM OcUpload o WHERE o.uploadId = :uploadId"),
    @NamedQuery(name = "OcUpload.findByName", query = "SELECT o FROM OcUpload o WHERE o.name = :name"),
    @NamedQuery(name = "OcUpload.findByFilename", query = "SELECT o FROM OcUpload o WHERE o.filename = :filename"),
    @NamedQuery(name = "OcUpload.findByCode", query = "SELECT o FROM OcUpload o WHERE o.code = :code"),
    @NamedQuery(name = "OcUpload.findByDateAdded", query = "SELECT o FROM OcUpload o WHERE o.dateAdded = :dateAdded")})
public class OcUpload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "upload_id")
    private Integer uploadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcUpload() {
    }

    public OcUpload(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public OcUpload(Integer uploadId, String name, String filename, String code, Date dateAdded) {
        this.uploadId = uploadId;
        this.name = name;
        this.filename = filename;
        this.code = code;
        this.dateAdded = dateAdded;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        hash += (uploadId != null ? uploadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcUpload)) {
            return false;
        }
        OcUpload other = (OcUpload) object;
        if ((this.uploadId == null && other.uploadId != null) || (this.uploadId != null && !this.uploadId.equals(other.uploadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcUpload[ uploadId=" + uploadId + " ]";
    }
    
}
