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
@Table(name = "oc_address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcAddress.findAll", query = "SELECT o FROM OcAddress o"),
    @NamedQuery(name = "OcAddress.findByAddressId", query = "SELECT o FROM OcAddress o WHERE o.addressId = :addressId"),
    @NamedQuery(name = "OcAddress.findByCustomerId", query = "SELECT o FROM OcAddress o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcAddress.findByFirstname", query = "SELECT o FROM OcAddress o WHERE o.firstname = :firstname"),
    @NamedQuery(name = "OcAddress.findByLastname", query = "SELECT o FROM OcAddress o WHERE o.lastname = :lastname"),
    @NamedQuery(name = "OcAddress.findByCompany", query = "SELECT o FROM OcAddress o WHERE o.company = :company"),
    @NamedQuery(name = "OcAddress.findByAddress1", query = "SELECT o FROM OcAddress o WHERE o.address1 = :address1"),
    @NamedQuery(name = "OcAddress.findByAddress2", query = "SELECT o FROM OcAddress o WHERE o.address2 = :address2"),
    @NamedQuery(name = "OcAddress.findByCity", query = "SELECT o FROM OcAddress o WHERE o.city = :city"),
    @NamedQuery(name = "OcAddress.findByPostcode", query = "SELECT o FROM OcAddress o WHERE o.postcode = :postcode"),
    @NamedQuery(name = "OcAddress.findByCountryId", query = "SELECT o FROM OcAddress o WHERE o.countryId = :countryId"),
    @NamedQuery(name = "OcAddress.findByZoneId", query = "SELECT o FROM OcAddress o WHERE o.zoneId = :zoneId")})
public class OcAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_id")
    private Integer addressId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "address_1")
    private String address1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "address_2")
    private String address2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "postcode")
    private String postcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "country_id")
    private int countryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zone_id")
    private int zoneId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_field")
    private String customField;

    public OcAddress() {
    }

    public OcAddress(Integer addressId) {
        this.addressId = addressId;
    }

    public OcAddress(Integer addressId, int customerId, String firstname, String lastname, String company, String address1, String address2, String city, String postcode, int countryId, int zoneId, String customField) {
        this.addressId = addressId;
        this.customerId = customerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postcode = postcode;
        this.countryId = countryId;
        this.zoneId = zoneId;
        this.customField = customField;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcAddress)) {
            return false;
        }
        OcAddress other = (OcAddress) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcAddress[ addressId=" + addressId + " ]";
    }
    
}
