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
@Table(name = "oc_api_ip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcApiIp.findAll", query = "SELECT o FROM OcApiIp o"),
    @NamedQuery(name = "OcApiIp.findByApiIpId", query = "SELECT o FROM OcApiIp o WHERE o.apiIpId = :apiIpId"),
    @NamedQuery(name = "OcApiIp.findByApiId", query = "SELECT o FROM OcApiIp o WHERE o.apiId = :apiId"),
    @NamedQuery(name = "OcApiIp.findByIp", query = "SELECT o FROM OcApiIp o WHERE o.ip = :ip")})
public class OcApiIp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "api_ip_id")
    private Integer apiIpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "api_id")
    private int apiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;

    public OcApiIp() {
    }

    public OcApiIp(Integer apiIpId) {
        this.apiIpId = apiIpId;
    }

    public OcApiIp(Integer apiIpId, int apiId, String ip) {
        this.apiIpId = apiIpId;
        this.apiId = apiId;
        this.ip = ip;
    }

    public Integer getApiIpId() {
        return apiIpId;
    }

    public void setApiIpId(Integer apiIpId) {
        this.apiIpId = apiIpId;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apiIpId != null ? apiIpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcApiIp)) {
            return false;
        }
        OcApiIp other = (OcApiIp) object;
        if ((this.apiIpId == null && other.apiIpId != null) || (this.apiIpId != null && !this.apiIpId.equals(other.apiIpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcApiIp[ apiIpId=" + apiIpId + " ]";
    }
    
}
