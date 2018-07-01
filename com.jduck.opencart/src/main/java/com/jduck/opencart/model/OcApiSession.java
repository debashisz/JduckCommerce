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
@Table(name = "oc_api_session")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcApiSession.findAll", query = "SELECT o FROM OcApiSession o"),
    @NamedQuery(name = "OcApiSession.findByApiSessionId", query = "SELECT o FROM OcApiSession o WHERE o.apiSessionId = :apiSessionId"),
    @NamedQuery(name = "OcApiSession.findByApiId", query = "SELECT o FROM OcApiSession o WHERE o.apiId = :apiId"),
    @NamedQuery(name = "OcApiSession.findBySessionId", query = "SELECT o FROM OcApiSession o WHERE o.sessionId = :sessionId"),
    @NamedQuery(name = "OcApiSession.findByIp", query = "SELECT o FROM OcApiSession o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcApiSession.findByDateAdded", query = "SELECT o FROM OcApiSession o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcApiSession.findByDateModified", query = "SELECT o FROM OcApiSession o WHERE o.dateModified = :dateModified")})
public class OcApiSession implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "api_session_id")
    private Integer apiSessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "api_id")
    private int apiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcApiSession() {
    }

    public OcApiSession(Integer apiSessionId) {
        this.apiSessionId = apiSessionId;
    }

    public OcApiSession(Integer apiSessionId, int apiId, String sessionId, String ip, Date dateAdded, Date dateModified) {
        this.apiSessionId = apiSessionId;
        this.apiId = apiId;
        this.sessionId = sessionId;
        this.ip = ip;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getApiSessionId() {
        return apiSessionId;
    }

    public void setApiSessionId(Integer apiSessionId) {
        this.apiSessionId = apiSessionId;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apiSessionId != null ? apiSessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcApiSession)) {
            return false;
        }
        OcApiSession other = (OcApiSession) object;
        if ((this.apiSessionId == null && other.apiSessionId != null) || (this.apiSessionId != null && !this.apiSessionId.equals(other.apiSessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcApiSession[ apiSessionId=" + apiSessionId + " ]";
    }
    
}
