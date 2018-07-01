/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
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
@Table(name = "oc_customer_search")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerSearch.findAll", query = "SELECT o FROM OcCustomerSearch o"),
    @NamedQuery(name = "OcCustomerSearch.findByCustomerSearchId", query = "SELECT o FROM OcCustomerSearch o WHERE o.customerSearchId = :customerSearchId"),
    @NamedQuery(name = "OcCustomerSearch.findByStoreId", query = "SELECT o FROM OcCustomerSearch o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcCustomerSearch.findByLanguageId", query = "SELECT o FROM OcCustomerSearch o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcCustomerSearch.findByCustomerId", query = "SELECT o FROM OcCustomerSearch o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerSearch.findByKeyword", query = "SELECT o FROM OcCustomerSearch o WHERE o.keyword = :keyword"),
    @NamedQuery(name = "OcCustomerSearch.findByCategoryId", query = "SELECT o FROM OcCustomerSearch o WHERE o.categoryId = :categoryId"),
    @NamedQuery(name = "OcCustomerSearch.findBySubCategory", query = "SELECT o FROM OcCustomerSearch o WHERE o.subCategory = :subCategory"),
    @NamedQuery(name = "OcCustomerSearch.findByDescription", query = "SELECT o FROM OcCustomerSearch o WHERE o.description = :description"),
    @NamedQuery(name = "OcCustomerSearch.findByProducts", query = "SELECT o FROM OcCustomerSearch o WHERE o.products = :products"),
    @NamedQuery(name = "OcCustomerSearch.findByIp", query = "SELECT o FROM OcCustomerSearch o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcCustomerSearch.findByDateAdded", query = "SELECT o FROM OcCustomerSearch o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerSearch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_search_id")
    private Integer customerSearchId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sub_category")
    private boolean subCategory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "description")
    private boolean description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "products")
    private int products;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerSearch() {
    }

    public OcCustomerSearch(Integer customerSearchId) {
        this.customerSearchId = customerSearchId;
    }

    public OcCustomerSearch(Integer customerSearchId, int storeId, int languageId, int customerId, String keyword, boolean subCategory, boolean description, int products, String ip, Date dateAdded) {
        this.customerSearchId = customerSearchId;
        this.storeId = storeId;
        this.languageId = languageId;
        this.customerId = customerId;
        this.keyword = keyword;
        this.subCategory = subCategory;
        this.description = description;
        this.products = products;
        this.ip = ip;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerSearchId() {
        return customerSearchId;
    }

    public void setCustomerSearchId(Integer customerSearchId) {
        this.customerSearchId = customerSearchId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public boolean getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(boolean subCategory) {
        this.subCategory = subCategory;
    }

    public boolean getDescription() {
        return description;
    }

    public void setDescription(boolean description) {
        this.description = description;
    }

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerSearchId != null ? customerSearchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerSearch)) {
            return false;
        }
        OcCustomerSearch other = (OcCustomerSearch) object;
        if ((this.customerSearchId == null && other.customerSearchId != null) || (this.customerSearchId != null && !this.customerSearchId.equals(other.customerSearchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerSearch[ customerSearchId=" + customerSearchId + " ]";
    }
    
}
