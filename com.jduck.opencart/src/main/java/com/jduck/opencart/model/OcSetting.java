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
import javax.persistence.Lob;
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
@Table(name = "oc_setting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcSetting.findAll", query = "SELECT o FROM OcSetting o"),
    @NamedQuery(name = "OcSetting.findBySettingId", query = "SELECT o FROM OcSetting o WHERE o.settingId = :settingId"),
    @NamedQuery(name = "OcSetting.findByStoreId", query = "SELECT o FROM OcSetting o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcSetting.findByCode", query = "SELECT o FROM OcSetting o WHERE o.code = :code"),
    @NamedQuery(name = "OcSetting.findByKey", query = "SELECT o FROM OcSetting o WHERE o.key = :key"),
    @NamedQuery(name = "OcSetting.findBySerialized", query = "SELECT o FROM OcSetting o WHERE o.serialized = :serialized")})
public class OcSetting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "setting_id")
    private Integer settingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "key")
    private String key;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serialized")
    private boolean serialized;

    public OcSetting() {
    }

    public OcSetting(Integer settingId) {
        this.settingId = settingId;
    }

    public OcSetting(Integer settingId, int storeId, String code, String key, String value, boolean serialized) {
        this.settingId = settingId;
        this.storeId = storeId;
        this.code = code;
        this.key = key;
        this.value = value;
        this.serialized = serialized;
    }

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getSerialized() {
        return serialized;
    }

    public void setSerialized(boolean serialized) {
        this.serialized = serialized;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settingId != null ? settingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcSetting)) {
            return false;
        }
        OcSetting other = (OcSetting) object;
        if ((this.settingId == null && other.settingId != null) || (this.settingId != null && !this.settingId.equals(other.settingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcSetting[ settingId=" + settingId + " ]";
    }
    
}
