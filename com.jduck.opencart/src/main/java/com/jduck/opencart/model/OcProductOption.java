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
@Table(name = "oc_product_option")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductOption.findAll", query = "SELECT o FROM OcProductOption o"),
    @NamedQuery(name = "OcProductOption.findByProductOptionId", query = "SELECT o FROM OcProductOption o WHERE o.productOptionId = :productOptionId"),
    @NamedQuery(name = "OcProductOption.findByProductId", query = "SELECT o FROM OcProductOption o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProductOption.findByOptionId", query = "SELECT o FROM OcProductOption o WHERE o.optionId = :optionId"),
    @NamedQuery(name = "OcProductOption.findByRequired", query = "SELECT o FROM OcProductOption o WHERE o.required = :required")})
public class OcProductOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_option_id")
    private Integer productOptionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "required")
    private boolean required;

    public OcProductOption() {
    }

    public OcProductOption(Integer productOptionId) {
        this.productOptionId = productOptionId;
    }

    public OcProductOption(Integer productOptionId, int productId, int optionId, String value, boolean required) {
        this.productOptionId = productOptionId;
        this.productId = productId;
        this.optionId = optionId;
        this.value = value;
        this.required = required;
    }

    public Integer getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(Integer productOptionId) {
        this.productOptionId = productOptionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        hash += (productOptionId != null ? productOptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductOption)) {
            return false;
        }
        OcProductOption other = (OcProductOption) object;
        if ((this.productOptionId == null && other.productOptionId != null) || (this.productOptionId != null && !this.productOptionId.equals(other.productOptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductOption[ productOptionId=" + productOptionId + " ]";
    }
    
}
