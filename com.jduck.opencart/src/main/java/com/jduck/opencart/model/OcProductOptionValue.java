/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "oc_product_option_value")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProductOptionValue.findAll", query = "SELECT o FROM OcProductOptionValue o"),
    @NamedQuery(name = "OcProductOptionValue.findByProductOptionValueId", query = "SELECT o FROM OcProductOptionValue o WHERE o.productOptionValueId = :productOptionValueId"),
    @NamedQuery(name = "OcProductOptionValue.findByProductOptionId", query = "SELECT o FROM OcProductOptionValue o WHERE o.productOptionId = :productOptionId"),
    @NamedQuery(name = "OcProductOptionValue.findByProductId", query = "SELECT o FROM OcProductOptionValue o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProductOptionValue.findByOptionId", query = "SELECT o FROM OcProductOptionValue o WHERE o.optionId = :optionId"),
    @NamedQuery(name = "OcProductOptionValue.findByOptionValueId", query = "SELECT o FROM OcProductOptionValue o WHERE o.optionValueId = :optionValueId"),
    @NamedQuery(name = "OcProductOptionValue.findByQuantity", query = "SELECT o FROM OcProductOptionValue o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcProductOptionValue.findBySubtract", query = "SELECT o FROM OcProductOptionValue o WHERE o.subtract = :subtract"),
    @NamedQuery(name = "OcProductOptionValue.findByPrice", query = "SELECT o FROM OcProductOptionValue o WHERE o.price = :price"),
    @NamedQuery(name = "OcProductOptionValue.findByPricePrefix", query = "SELECT o FROM OcProductOptionValue o WHERE o.pricePrefix = :pricePrefix"),
    @NamedQuery(name = "OcProductOptionValue.findByPoints", query = "SELECT o FROM OcProductOptionValue o WHERE o.points = :points"),
    @NamedQuery(name = "OcProductOptionValue.findByPointsPrefix", query = "SELECT o FROM OcProductOptionValue o WHERE o.pointsPrefix = :pointsPrefix"),
    @NamedQuery(name = "OcProductOptionValue.findByWeight", query = "SELECT o FROM OcProductOptionValue o WHERE o.weight = :weight"),
    @NamedQuery(name = "OcProductOptionValue.findByWeightPrefix", query = "SELECT o FROM OcProductOptionValue o WHERE o.weightPrefix = :weightPrefix")})
public class OcProductOptionValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_option_value_id")
    private Integer productOptionValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_option_id")
    private int productOptionId;
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
    @Column(name = "option_value_id")
    private int optionValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtract")
    private boolean subtract;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "price_prefix")
    private String pricePrefix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "points")
    private int points;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "points_prefix")
    private String pointsPrefix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "weight_prefix")
    private String weightPrefix;

    public OcProductOptionValue() {
    }

    public OcProductOptionValue(Integer productOptionValueId) {
        this.productOptionValueId = productOptionValueId;
    }

    public OcProductOptionValue(Integer productOptionValueId, int productOptionId, int productId, int optionId, int optionValueId, int quantity, boolean subtract, BigDecimal price, String pricePrefix, int points, String pointsPrefix, BigDecimal weight, String weightPrefix) {
        this.productOptionValueId = productOptionValueId;
        this.productOptionId = productOptionId;
        this.productId = productId;
        this.optionId = optionId;
        this.optionValueId = optionValueId;
        this.quantity = quantity;
        this.subtract = subtract;
        this.price = price;
        this.pricePrefix = pricePrefix;
        this.points = points;
        this.pointsPrefix = pointsPrefix;
        this.weight = weight;
        this.weightPrefix = weightPrefix;
    }

    public Integer getProductOptionValueId() {
        return productOptionValueId;
    }

    public void setProductOptionValueId(Integer productOptionValueId) {
        this.productOptionValueId = productOptionValueId;
    }

    public int getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(int productOptionId) {
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

    public int getOptionValueId() {
        return optionValueId;
    }

    public void setOptionValueId(int optionValueId) {
        this.optionValueId = optionValueId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getSubtract() {
        return subtract;
    }

    public void setSubtract(boolean subtract) {
        this.subtract = subtract;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPricePrefix() {
        return pricePrefix;
    }

    public void setPricePrefix(String pricePrefix) {
        this.pricePrefix = pricePrefix;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getPointsPrefix() {
        return pointsPrefix;
    }

    public void setPointsPrefix(String pointsPrefix) {
        this.pointsPrefix = pointsPrefix;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getWeightPrefix() {
        return weightPrefix;
    }

    public void setWeightPrefix(String weightPrefix) {
        this.weightPrefix = weightPrefix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productOptionValueId != null ? productOptionValueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProductOptionValue)) {
            return false;
        }
        OcProductOptionValue other = (OcProductOptionValue) object;
        if ((this.productOptionValueId == null && other.productOptionValueId != null) || (this.productOptionValueId != null && !this.productOptionValueId.equals(other.productOptionValueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProductOptionValue[ productOptionValueId=" + productOptionValueId + " ]";
    }
    
}
