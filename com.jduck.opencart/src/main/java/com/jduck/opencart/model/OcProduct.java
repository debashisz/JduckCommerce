/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "oc_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcProduct.findAll", query = "SELECT o FROM OcProduct o"),
    @NamedQuery(name = "OcProduct.findByProductId", query = "SELECT o FROM OcProduct o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcProduct.findByModel", query = "SELECT o FROM OcProduct o WHERE o.model = :model"),
    @NamedQuery(name = "OcProduct.findBySku", query = "SELECT o FROM OcProduct o WHERE o.sku = :sku"),
    @NamedQuery(name = "OcProduct.findByUpc", query = "SELECT o FROM OcProduct o WHERE o.upc = :upc"),
    @NamedQuery(name = "OcProduct.findByEan", query = "SELECT o FROM OcProduct o WHERE o.ean = :ean"),
    @NamedQuery(name = "OcProduct.findByJan", query = "SELECT o FROM OcProduct o WHERE o.jan = :jan"),
    @NamedQuery(name = "OcProduct.findByIsbn", query = "SELECT o FROM OcProduct o WHERE o.isbn = :isbn"),
    @NamedQuery(name = "OcProduct.findByMpn", query = "SELECT o FROM OcProduct o WHERE o.mpn = :mpn"),
    @NamedQuery(name = "OcProduct.findByLocation", query = "SELECT o FROM OcProduct o WHERE o.location = :location"),
    @NamedQuery(name = "OcProduct.findByQuantity", query = "SELECT o FROM OcProduct o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcProduct.findByStockStatusId", query = "SELECT o FROM OcProduct o WHERE o.stockStatusId = :stockStatusId"),
    @NamedQuery(name = "OcProduct.findByImage", query = "SELECT o FROM OcProduct o WHERE o.image = :image"),
    @NamedQuery(name = "OcProduct.findByManufacturerId", query = "SELECT o FROM OcProduct o WHERE o.manufacturerId = :manufacturerId"),
    @NamedQuery(name = "OcProduct.findByShipping", query = "SELECT o FROM OcProduct o WHERE o.shipping = :shipping"),
    @NamedQuery(name = "OcProduct.findByPrice", query = "SELECT o FROM OcProduct o WHERE o.price = :price"),
    @NamedQuery(name = "OcProduct.findByPoints", query = "SELECT o FROM OcProduct o WHERE o.points = :points"),
    @NamedQuery(name = "OcProduct.findByTaxClassId", query = "SELECT o FROM OcProduct o WHERE o.taxClassId = :taxClassId"),
    @NamedQuery(name = "OcProduct.findByDateAvailable", query = "SELECT o FROM OcProduct o WHERE o.dateAvailable = :dateAvailable"),
    @NamedQuery(name = "OcProduct.findByWeight", query = "SELECT o FROM OcProduct o WHERE o.weight = :weight"),
    @NamedQuery(name = "OcProduct.findByWeightClassId", query = "SELECT o FROM OcProduct o WHERE o.weightClassId = :weightClassId"),
    @NamedQuery(name = "OcProduct.findByLength", query = "SELECT o FROM OcProduct o WHERE o.length = :length"),
    @NamedQuery(name = "OcProduct.findByWidth", query = "SELECT o FROM OcProduct o WHERE o.width = :width"),
    @NamedQuery(name = "OcProduct.findByHeight", query = "SELECT o FROM OcProduct o WHERE o.height = :height"),
    @NamedQuery(name = "OcProduct.findByLengthClassId", query = "SELECT o FROM OcProduct o WHERE o.lengthClassId = :lengthClassId"),
    @NamedQuery(name = "OcProduct.findBySubtract", query = "SELECT o FROM OcProduct o WHERE o.subtract = :subtract"),
    @NamedQuery(name = "OcProduct.findByMinimum", query = "SELECT o FROM OcProduct o WHERE o.minimum = :minimum"),
    @NamedQuery(name = "OcProduct.findBySortOrder", query = "SELECT o FROM OcProduct o WHERE o.sortOrder = :sortOrder"),
    @NamedQuery(name = "OcProduct.findByStatus", query = "SELECT o FROM OcProduct o WHERE o.status = :status"),
    @NamedQuery(name = "OcProduct.findByViewed", query = "SELECT o FROM OcProduct o WHERE o.viewed = :viewed"),
    @NamedQuery(name = "OcProduct.findByDateAdded", query = "SELECT o FROM OcProduct o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcProduct.findByDateModified", query = "SELECT o FROM OcProduct o WHERE o.dateModified = :dateModified")})
public class OcProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "sku")
    private String sku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "upc")
    private String upc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "ean")
    private String ean;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "jan")
    private String jan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 17)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "mpn")
    private String mpn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock_status_id")
    private int stockStatusId;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "manufacturer_id")
    private int manufacturerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping")
    private boolean shipping;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "points")
    private int points;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_class_id")
    private int taxClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_available")
    @Temporal(TemporalType.DATE)
    private Date dateAvailable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight_class_id")
    private int weightClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "length")
    private BigDecimal length;
    @Basic(optional = false)
    @NotNull
    @Column(name = "width")
    private BigDecimal width;
    @Basic(optional = false)
    @NotNull
    @Column(name = "height")
    private BigDecimal height;
    @Basic(optional = false)
    @NotNull
    @Column(name = "length_class_id")
    private int lengthClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtract")
    private boolean subtract;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minimum")
    private int minimum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "viewed")
    private int viewed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcProduct() {
    }

    public OcProduct(Integer productId) {
        this.productId = productId;
    }

    public OcProduct(Integer productId, String model, String sku, String upc, String ean, String jan, String isbn, String mpn, String location, int quantity, int stockStatusId, int manufacturerId, boolean shipping, BigDecimal price, int points, int taxClassId, Date dateAvailable, BigDecimal weight, int weightClassId, BigDecimal length, BigDecimal width, BigDecimal height, int lengthClassId, boolean subtract, int minimum, int sortOrder, boolean status, int viewed, Date dateAdded, Date dateModified) {
        this.productId = productId;
        this.model = model;
        this.sku = sku;
        this.upc = upc;
        this.ean = ean;
        this.jan = jan;
        this.isbn = isbn;
        this.mpn = mpn;
        this.location = location;
        this.quantity = quantity;
        this.stockStatusId = stockStatusId;
        this.manufacturerId = manufacturerId;
        this.shipping = shipping;
        this.price = price;
        this.points = points;
        this.taxClassId = taxClassId;
        this.dateAvailable = dateAvailable;
        this.weight = weight;
        this.weightClassId = weightClassId;
        this.length = length;
        this.width = width;
        this.height = height;
        this.lengthClassId = lengthClassId;
        this.subtract = subtract;
        this.minimum = minimum;
        this.sortOrder = sortOrder;
        this.status = status;
        this.viewed = viewed;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStockStatusId() {
        return stockStatusId;
    }

    public void setStockStatusId(int stockStatusId) {
        this.stockStatusId = stockStatusId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public boolean getShipping() {
        return shipping;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(int taxClassId) {
        this.taxClassId = taxClassId;
    }

    public Date getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(Date dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getWeightClassId() {
        return weightClassId;
    }

    public void setWeightClassId(int weightClassId) {
        this.weightClassId = weightClassId;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public int getLengthClassId() {
        return lengthClassId;
    }

    public void setLengthClassId(int lengthClassId) {
        this.lengthClassId = lengthClassId;
    }

    public boolean getSubtract() {
        return subtract;
    }

    public void setSubtract(boolean subtract) {
        this.subtract = subtract;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcProduct)) {
            return false;
        }
        OcProduct other = (OcProduct) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcProduct[ productId=" + productId + " ]";
    }
    
}
