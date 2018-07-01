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
@Table(name = "oc_product_attribute")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductAttribute.findAll", query = "SELECT o FROM OcProductAttribute o"),
    @NamedQuery(name = "OcProductAttribute.findByProductId", query = "SELECT o FROM OcProductAttribute o WHERE o.ocProductAttributePK.productId = :productId"),
    @NamedQuery(name = "OcProductAttribute.findByAttributeId", query = "SELECT o FROM OcProductAttribute o WHERE o.ocProductAttributePK.attributeId = :attributeId"),
    @NamedQuery(name = "OcProductAttribute.findByLanguageId", query = "SELECT o FROM OcProductAttribute o WHERE o.ocProductAttributePK.languageId = :languageId")})
public class OcProductAttribute implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcProductAttributePK ocProductAttributePK;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "text")
    private String text;

    public OcProductAttribute() {
    }

    public OcProductAttribute(OcProductAttributePK ocProductAttributePK) {
        this.ocProductAttributePK = ocProductAttributePK;
    }

    public OcProductAttribute(OcProductAttributePK ocProductAttributePK, String text) {
        this.ocProductAttributePK = ocProductAttributePK;
        this.text = text;
    }

    public OcProductAttribute(int productId, int attributeId, int languageId) {
        this.ocProductAttributePK = new OcProductAttributePK(productId, attributeId, languageId);
    }

    public OcProductAttributePK getOcProductAttributePK() {
        return ocProductAttributePK;
    }

    public void setOcProductAttributePK(OcProductAttributePK ocProductAttributePK) {
        this.ocProductAttributePK = ocProductAttributePK;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocProductAttributePK != null ? ocProductAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductAttribute)) {
            return false;
        }
        OcProductAttribute other = (OcProductAttribute) object;
        if ((this.ocProductAttributePK == null && other.ocProductAttributePK != null) || (this.ocProductAttributePK != null && !this.ocProductAttributePK.equals(other.ocProductAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductAttribute[ ocProductAttributePK=" + ocProductAttributePK + " ]";
    }
    
}
