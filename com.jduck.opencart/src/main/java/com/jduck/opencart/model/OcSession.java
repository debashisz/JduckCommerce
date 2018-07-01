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
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "oc_session")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcSession.findAll", query = "SELECT o FROM OcSession o"),
    @NamedQuery(name = "OcSession.findBySessionId", query = "SELECT o FROM OcSession o WHERE o.sessionId = :sessionId"),
    @NamedQuery(name = "OcSession.findByExpire", query = "SELECT o FROM OcSession o WHERE o.expire = :expire")})
public class OcSession implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "session_id")
    private String sessionId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expire")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expire;

    public OcSession() {
    }

    public OcSession(String sessionId) {
        this.sessionId = sessionId;
    }

    public OcSession(String sessionId, String data, Date expire) {
        this.sessionId = sessionId;
        this.data = data;
        this.expire = expire;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcSession)) {
            return false;
        }
        OcSession other = (OcSession) object;
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcSession[ sessionId=" + sessionId + " ]";
    }
    
}
