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
@Table(name = "oc_country")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCountry.findAll", query = "SELECT o FROM OcCountry o"),
    @NamedQuery(name = "OcCountry.findByCountryId", query = "SELECT o FROM OcCountry o WHERE o.countryId = :countryId"),
    @NamedQuery(name = "OcCountry.findByName", query = "SELECT o FROM OcCountry o WHERE o.name = :name"),
    @NamedQuery(name = "OcCountry.findByIsoCode2", query = "SELECT o FROM OcCountry o WHERE o.isoCode2 = :isoCode2"),
    @NamedQuery(name = "OcCountry.findByIsoCode3", query = "SELECT o FROM OcCountry o WHERE o.isoCode3 = :isoCode3"),
    @NamedQuery(name = "OcCountry.findByPostcodeRequired", query = "SELECT o FROM OcCountry o WHERE o.postcodeRequired = :postcodeRequired"),
    @NamedQuery(name = "OcCountry.findByStatus", query = "SELECT o FROM OcCountry o WHERE o.status = :status")})
public class OcCountry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "iso_code_2")
    private String isoCode2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "iso_code_3")
    private String isoCode3;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "address_format")
    private String addressFormat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "postcode_required")
    private boolean postcodeRequired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;

    public OcCountry() {
    }

    public OcCountry(Integer countryId) {
        this.countryId = countryId;
    }

    public OcCountry(Integer countryId, String name, String isoCode2, String isoCode3, String addressFormat, boolean postcodeRequired, boolean status) {
        this.countryId = countryId;
        this.name = name;
        this.isoCode2 = isoCode2;
        this.isoCode3 = isoCode3;
        this.addressFormat = addressFormat;
        this.postcodeRequired = postcodeRequired;
        this.status = status;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode2() {
        return isoCode2;
    }

    public void setIsoCode2(String isoCode2) {
        this.isoCode2 = isoCode2;
    }

    public String getIsoCode3() {
        return isoCode3;
    }

    public void setIsoCode3(String isoCode3) {
        this.isoCode3 = isoCode3;
    }

    public String getAddressFormat() {
        return addressFormat;
    }

    public void setAddressFormat(String addressFormat) {
        this.addressFormat = addressFormat;
    }

    public boolean getPostcodeRequired() {
        return postcodeRequired;
    }

    public void setPostcodeRequired(boolean postcodeRequired) {
        this.postcodeRequired = postcodeRequired;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCountry)) {
            return false;
        }
        OcCountry other = (OcCountry) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCountry[ countryId=" + countryId + " ]";
    }
    
}
