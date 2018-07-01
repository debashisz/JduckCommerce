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
@Table(name = "oc_customer_group_description")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerGroupDescription.findAll", query = "SELECT o FROM OcCustomerGroupDescription o"),
    @NamedQuery(name = "OcCustomerGroupDescription.findByCustomerGroupId", query = "SELECT o FROM OcCustomerGroupDescription o WHERE o.ocCustomerGroupDescriptionPK.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcCustomerGroupDescription.findByLanguageId", query = "SELECT o FROM OcCustomerGroupDescription o WHERE o.ocCustomerGroupDescriptionPK.languageId = :languageId"),
    @NamedQuery(name = "OcCustomerGroupDescription.findByName", query = "SELECT o FROM OcCustomerGroupDescription o WHERE o.name = :name")})
public class OcCustomerGroupDescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCustomerGroupDescriptionPK ocCustomerGroupDescriptionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;

    public OcCustomerGroupDescription() {
    }

    public OcCustomerGroupDescription(OcCustomerGroupDescriptionPK ocCustomerGroupDescriptionPK) {
        this.ocCustomerGroupDescriptionPK = ocCustomerGroupDescriptionPK;
    }

    public OcCustomerGroupDescription(OcCustomerGroupDescriptionPK ocCustomerGroupDescriptionPK, String name, String description) {
        this.ocCustomerGroupDescriptionPK = ocCustomerGroupDescriptionPK;
        this.name = name;
        this.description = description;
    }

    public OcCustomerGroupDescription(int customerGroupId, int languageId) {
        this.ocCustomerGroupDescriptionPK = new OcCustomerGroupDescriptionPK(customerGroupId, languageId);
    }

    public OcCustomerGroupDescriptionPK getOcCustomerGroupDescriptionPK() {
        return ocCustomerGroupDescriptionPK;
    }

    public void setOcCustomerGroupDescriptionPK(OcCustomerGroupDescriptionPK ocCustomerGroupDescriptionPK) {
        this.ocCustomerGroupDescriptionPK = ocCustomerGroupDescriptionPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCustomerGroupDescriptionPK != null ? ocCustomerGroupDescriptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerGroupDescription)) {
            return false;
        }
        OcCustomerGroupDescription other = (OcCustomerGroupDescription) object;
        if ((this.ocCustomerGroupDescriptionPK == null && other.ocCustomerGroupDescriptionPK != null) || (this.ocCustomerGroupDescriptionPK != null && !this.ocCustomerGroupDescriptionPK.equals(other.ocCustomerGroupDescriptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerGroupDescription[ ocCustomerGroupDescriptionPK=" + ocCustomerGroupDescriptionPK + " ]";
    }
    
}
