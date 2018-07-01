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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_custom_field_customer_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomFieldCustomerGroup.findAll", query = "SELECT o FROM OcCustomFieldCustomerGroup o"),
    @NamedQuery(name = "OcCustomFieldCustomerGroup.findByCustomFieldId", query = "SELECT o FROM OcCustomFieldCustomerGroup o WHERE o.ocCustomFieldCustomerGroupPK.customFieldId = :customFieldId"),
    @NamedQuery(name = "OcCustomFieldCustomerGroup.findByCustomerGroupId", query = "SELECT o FROM OcCustomFieldCustomerGroup o WHERE o.ocCustomFieldCustomerGroupPK.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcCustomFieldCustomerGroup.findByRequired", query = "SELECT o FROM OcCustomFieldCustomerGroup o WHERE o.required = :required")})
public class OcCustomFieldCustomerGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcCustomFieldCustomerGroupPK ocCustomFieldCustomerGroupPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "required")
    private boolean required;

    public OcCustomFieldCustomerGroup() {
    }

    public OcCustomFieldCustomerGroup(OcCustomFieldCustomerGroupPK ocCustomFieldCustomerGroupPK) {
        this.ocCustomFieldCustomerGroupPK = ocCustomFieldCustomerGroupPK;
    }

    public OcCustomFieldCustomerGroup(OcCustomFieldCustomerGroupPK ocCustomFieldCustomerGroupPK, boolean required) {
        this.ocCustomFieldCustomerGroupPK = ocCustomFieldCustomerGroupPK;
        this.required = required;
    }

    public OcCustomFieldCustomerGroup(int customFieldId, int customerGroupId) {
        this.ocCustomFieldCustomerGroupPK = new OcCustomFieldCustomerGroupPK(customFieldId, customerGroupId);
    }

    public OcCustomFieldCustomerGroupPK getOcCustomFieldCustomerGroupPK() {
        return ocCustomFieldCustomerGroupPK;
    }

    public void setOcCustomFieldCustomerGroupPK(OcCustomFieldCustomerGroupPK ocCustomFieldCustomerGroupPK) {
        this.ocCustomFieldCustomerGroupPK = ocCustomFieldCustomerGroupPK;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocCustomFieldCustomerGroupPK != null ? ocCustomFieldCustomerGroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomFieldCustomerGroup)) {
            return false;
        }
        OcCustomFieldCustomerGroup other = (OcCustomFieldCustomerGroup) object;
        if ((this.ocCustomFieldCustomerGroupPK == null && other.ocCustomFieldCustomerGroupPK != null) || (this.ocCustomFieldCustomerGroupPK != null && !this.ocCustomFieldCustomerGroupPK.equals(other.ocCustomFieldCustomerGroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomFieldCustomerGroup[ ocCustomFieldCustomerGroupPK=" + ocCustomFieldCustomerGroupPK + " ]";
    }
    
}
