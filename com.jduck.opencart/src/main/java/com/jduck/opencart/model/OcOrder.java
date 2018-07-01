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
import javax.persistence.Lob;
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
@Table(name = "oc_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrder.findAll", query = "SELECT o FROM OcOrder o"),
    @NamedQuery(name = "OcOrder.findByOrderId", query = "SELECT o FROM OcOrder o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrder.findByInvoiceNo", query = "SELECT o FROM OcOrder o WHERE o.invoiceNo = :invoiceNo"),
    @NamedQuery(name = "OcOrder.findByInvoicePrefix", query = "SELECT o FROM OcOrder o WHERE o.invoicePrefix = :invoicePrefix"),
    @NamedQuery(name = "OcOrder.findByStoreId", query = "SELECT o FROM OcOrder o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcOrder.findByStoreName", query = "SELECT o FROM OcOrder o WHERE o.storeName = :storeName"),
    @NamedQuery(name = "OcOrder.findByStoreUrl", query = "SELECT o FROM OcOrder o WHERE o.storeUrl = :storeUrl"),
    @NamedQuery(name = "OcOrder.findByCustomerId", query = "SELECT o FROM OcOrder o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcOrder.findByCustomerGroupId", query = "SELECT o FROM OcOrder o WHERE o.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "OcOrder.findByFirstname", query = "SELECT o FROM OcOrder o WHERE o.firstname = :firstname"),
    @NamedQuery(name = "OcOrder.findByLastname", query = "SELECT o FROM OcOrder o WHERE o.lastname = :lastname"),
    @NamedQuery(name = "OcOrder.findByEmail", query = "SELECT o FROM OcOrder o WHERE o.email = :email"),
    @NamedQuery(name = "OcOrder.findByTelephone", query = "SELECT o FROM OcOrder o WHERE o.telephone = :telephone"),
    @NamedQuery(name = "OcOrder.findByFax", query = "SELECT o FROM OcOrder o WHERE o.fax = :fax"),
    @NamedQuery(name = "OcOrder.findByPaymentFirstname", query = "SELECT o FROM OcOrder o WHERE o.paymentFirstname = :paymentFirstname"),
    @NamedQuery(name = "OcOrder.findByPaymentLastname", query = "SELECT o FROM OcOrder o WHERE o.paymentLastname = :paymentLastname"),
    @NamedQuery(name = "OcOrder.findByPaymentCompany", query = "SELECT o FROM OcOrder o WHERE o.paymentCompany = :paymentCompany"),
    @NamedQuery(name = "OcOrder.findByPaymentAddress1", query = "SELECT o FROM OcOrder o WHERE o.paymentAddress1 = :paymentAddress1"),
    @NamedQuery(name = "OcOrder.findByPaymentAddress2", query = "SELECT o FROM OcOrder o WHERE o.paymentAddress2 = :paymentAddress2"),
    @NamedQuery(name = "OcOrder.findByPaymentCity", query = "SELECT o FROM OcOrder o WHERE o.paymentCity = :paymentCity"),
    @NamedQuery(name = "OcOrder.findByPaymentPostcode", query = "SELECT o FROM OcOrder o WHERE o.paymentPostcode = :paymentPostcode"),
    @NamedQuery(name = "OcOrder.findByPaymentCountry", query = "SELECT o FROM OcOrder o WHERE o.paymentCountry = :paymentCountry"),
    @NamedQuery(name = "OcOrder.findByPaymentCountryId", query = "SELECT o FROM OcOrder o WHERE o.paymentCountryId = :paymentCountryId"),
    @NamedQuery(name = "OcOrder.findByPaymentZone", query = "SELECT o FROM OcOrder o WHERE o.paymentZone = :paymentZone"),
    @NamedQuery(name = "OcOrder.findByPaymentZoneId", query = "SELECT o FROM OcOrder o WHERE o.paymentZoneId = :paymentZoneId"),
    @NamedQuery(name = "OcOrder.findByPaymentMethod", query = "SELECT o FROM OcOrder o WHERE o.paymentMethod = :paymentMethod"),
    @NamedQuery(name = "OcOrder.findByPaymentCode", query = "SELECT o FROM OcOrder o WHERE o.paymentCode = :paymentCode"),
    @NamedQuery(name = "OcOrder.findByShippingFirstname", query = "SELECT o FROM OcOrder o WHERE o.shippingFirstname = :shippingFirstname"),
    @NamedQuery(name = "OcOrder.findByShippingLastname", query = "SELECT o FROM OcOrder o WHERE o.shippingLastname = :shippingLastname"),
    @NamedQuery(name = "OcOrder.findByShippingCompany", query = "SELECT o FROM OcOrder o WHERE o.shippingCompany = :shippingCompany"),
    @NamedQuery(name = "OcOrder.findByShippingAddress1", query = "SELECT o FROM OcOrder o WHERE o.shippingAddress1 = :shippingAddress1"),
    @NamedQuery(name = "OcOrder.findByShippingAddress2", query = "SELECT o FROM OcOrder o WHERE o.shippingAddress2 = :shippingAddress2"),
    @NamedQuery(name = "OcOrder.findByShippingCity", query = "SELECT o FROM OcOrder o WHERE o.shippingCity = :shippingCity"),
    @NamedQuery(name = "OcOrder.findByShippingPostcode", query = "SELECT o FROM OcOrder o WHERE o.shippingPostcode = :shippingPostcode"),
    @NamedQuery(name = "OcOrder.findByShippingCountry", query = "SELECT o FROM OcOrder o WHERE o.shippingCountry = :shippingCountry"),
    @NamedQuery(name = "OcOrder.findByShippingCountryId", query = "SELECT o FROM OcOrder o WHERE o.shippingCountryId = :shippingCountryId"),
    @NamedQuery(name = "OcOrder.findByShippingZone", query = "SELECT o FROM OcOrder o WHERE o.shippingZone = :shippingZone"),
    @NamedQuery(name = "OcOrder.findByShippingZoneId", query = "SELECT o FROM OcOrder o WHERE o.shippingZoneId = :shippingZoneId"),
    @NamedQuery(name = "OcOrder.findByShippingMethod", query = "SELECT o FROM OcOrder o WHERE o.shippingMethod = :shippingMethod"),
    @NamedQuery(name = "OcOrder.findByShippingCode", query = "SELECT o FROM OcOrder o WHERE o.shippingCode = :shippingCode"),
    @NamedQuery(name = "OcOrder.findByTotal", query = "SELECT o FROM OcOrder o WHERE o.total = :total"),
    @NamedQuery(name = "OcOrder.findByOrderStatusId", query = "SELECT o FROM OcOrder o WHERE o.orderStatusId = :orderStatusId"),
    @NamedQuery(name = "OcOrder.findByAffiliateId", query = "SELECT o FROM OcOrder o WHERE o.affiliateId = :affiliateId"),
    @NamedQuery(name = "OcOrder.findByCommission", query = "SELECT o FROM OcOrder o WHERE o.commission = :commission"),
    @NamedQuery(name = "OcOrder.findByMarketingId", query = "SELECT o FROM OcOrder o WHERE o.marketingId = :marketingId"),
    @NamedQuery(name = "OcOrder.findByTracking", query = "SELECT o FROM OcOrder o WHERE o.tracking = :tracking"),
    @NamedQuery(name = "OcOrder.findByLanguageId", query = "SELECT o FROM OcOrder o WHERE o.languageId = :languageId"),
    @NamedQuery(name = "OcOrder.findByCurrencyId", query = "SELECT o FROM OcOrder o WHERE o.currencyId = :currencyId"),
    @NamedQuery(name = "OcOrder.findByCurrencyCode", query = "SELECT o FROM OcOrder o WHERE o.currencyCode = :currencyCode"),
    @NamedQuery(name = "OcOrder.findByCurrencyValue", query = "SELECT o FROM OcOrder o WHERE o.currencyValue = :currencyValue"),
    @NamedQuery(name = "OcOrder.findByIp", query = "SELECT o FROM OcOrder o WHERE o.ip = :ip"),
    @NamedQuery(name = "OcOrder.findByForwardedIp", query = "SELECT o FROM OcOrder o WHERE o.forwardedIp = :forwardedIp"),
    @NamedQuery(name = "OcOrder.findByUserAgent", query = "SELECT o FROM OcOrder o WHERE o.userAgent = :userAgent"),
    @NamedQuery(name = "OcOrder.findByAcceptLanguage", query = "SELECT o FROM OcOrder o WHERE o.acceptLanguage = :acceptLanguage"),
    @NamedQuery(name = "OcOrder.findByDateAdded", query = "SELECT o FROM OcOrder o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcOrder.findByDateModified", query = "SELECT o FROM OcOrder o WHERE o.dateModified = :dateModified")})
public class OcOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "invoice_no")
    private int invoiceNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "invoice_prefix")
    private String invoicePrefix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "store_name")
    private String storeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "store_url")
    private String storeUrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;
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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "fax")
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_field")
    private String customField;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "payment_firstname")
    private String paymentFirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "payment_lastname")
    private String paymentLastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "payment_company")
    private String paymentCompany;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_address_1")
    private String paymentAddress1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_address_2")
    private String paymentAddress2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_city")
    private String paymentCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "payment_postcode")
    private String paymentPostcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_country")
    private String paymentCountry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_country_id")
    private int paymentCountryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_zone")
    private String paymentZone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_zone_id")
    private int paymentZoneId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "payment_address_format")
    private String paymentAddressFormat;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "payment_custom_field")
    private String paymentCustomField;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_method")
    private String paymentMethod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "payment_code")
    private String paymentCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "shipping_firstname")
    private String shippingFirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "shipping_lastname")
    private String shippingLastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "shipping_company")
    private String shippingCompany;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_address_1")
    private String shippingAddress1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_address_2")
    private String shippingAddress2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_city")
    private String shippingCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "shipping_postcode")
    private String shippingPostcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_country")
    private String shippingCountry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_country_id")
    private int shippingCountryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_zone")
    private String shippingZone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_zone_id")
    private int shippingZoneId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "shipping_address_format")
    private String shippingAddressFormat;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "shipping_custom_field")
    private String shippingCustomField;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "shipping_code")
    private String shippingCode;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "comment")
    private String comment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "affiliate_id")
    private int affiliateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commission")
    private BigDecimal commission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "marketing_id")
    private int marketingId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "tracking")
    private String tracking;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency_id")
    private int currencyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "currency_code")
    private String currencyCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency_value")
    private BigDecimal currencyValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "forwarded_ip")
    private String forwardedIp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "user_agent")
    private String userAgent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "accept_language")
    private String acceptLanguage;
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

    public OcOrder() {
    }

    public OcOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public OcOrder(Integer orderId, int invoiceNo, String invoicePrefix, int storeId, String storeName, String storeUrl, int customerId, int customerGroupId, String firstname, String lastname, String email, String telephone, String fax, String customField, String paymentFirstname, String paymentLastname, String paymentCompany, String paymentAddress1, String paymentAddress2, String paymentCity, String paymentPostcode, String paymentCountry, int paymentCountryId, String paymentZone, int paymentZoneId, String paymentAddressFormat, String paymentCustomField, String paymentMethod, String paymentCode, String shippingFirstname, String shippingLastname, String shippingCompany, String shippingAddress1, String shippingAddress2, String shippingCity, String shippingPostcode, String shippingCountry, int shippingCountryId, String shippingZone, int shippingZoneId, String shippingAddressFormat, String shippingCustomField, String shippingMethod, String shippingCode, String comment, BigDecimal total, int orderStatusId, int affiliateId, BigDecimal commission, int marketingId, String tracking, int languageId, int currencyId, String currencyCode, BigDecimal currencyValue, String ip, String forwardedIp, String userAgent, String acceptLanguage, Date dateAdded, Date dateModified) {
        this.orderId = orderId;
        this.invoiceNo = invoiceNo;
        this.invoicePrefix = invoicePrefix;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeUrl = storeUrl;
        this.customerId = customerId;
        this.customerGroupId = customerGroupId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.customField = customField;
        this.paymentFirstname = paymentFirstname;
        this.paymentLastname = paymentLastname;
        this.paymentCompany = paymentCompany;
        this.paymentAddress1 = paymentAddress1;
        this.paymentAddress2 = paymentAddress2;
        this.paymentCity = paymentCity;
        this.paymentPostcode = paymentPostcode;
        this.paymentCountry = paymentCountry;
        this.paymentCountryId = paymentCountryId;
        this.paymentZone = paymentZone;
        this.paymentZoneId = paymentZoneId;
        this.paymentAddressFormat = paymentAddressFormat;
        this.paymentCustomField = paymentCustomField;
        this.paymentMethod = paymentMethod;
        this.paymentCode = paymentCode;
        this.shippingFirstname = shippingFirstname;
        this.shippingLastname = shippingLastname;
        this.shippingCompany = shippingCompany;
        this.shippingAddress1 = shippingAddress1;
        this.shippingAddress2 = shippingAddress2;
        this.shippingCity = shippingCity;
        this.shippingPostcode = shippingPostcode;
        this.shippingCountry = shippingCountry;
        this.shippingCountryId = shippingCountryId;
        this.shippingZone = shippingZone;
        this.shippingZoneId = shippingZoneId;
        this.shippingAddressFormat = shippingAddressFormat;
        this.shippingCustomField = shippingCustomField;
        this.shippingMethod = shippingMethod;
        this.shippingCode = shippingCode;
        this.comment = comment;
        this.total = total;
        this.orderStatusId = orderStatusId;
        this.affiliateId = affiliateId;
        this.commission = commission;
        this.marketingId = marketingId;
        this.tracking = tracking;
        this.languageId = languageId;
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencyValue = currencyValue;
        this.ip = ip;
        this.forwardedIp = forwardedIp;
        this.userAgent = userAgent;
        this.acceptLanguage = acceptLanguage;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoicePrefix() {
        return invoicePrefix;
    }

    public void setInvoicePrefix(String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId) {
        this.customerGroupId = customerGroupId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public String getPaymentFirstname() {
        return paymentFirstname;
    }

    public void setPaymentFirstname(String paymentFirstname) {
        this.paymentFirstname = paymentFirstname;
    }

    public String getPaymentLastname() {
        return paymentLastname;
    }

    public void setPaymentLastname(String paymentLastname) {
        this.paymentLastname = paymentLastname;
    }

    public String getPaymentCompany() {
        return paymentCompany;
    }

    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    public String getPaymentAddress1() {
        return paymentAddress1;
    }

    public void setPaymentAddress1(String paymentAddress1) {
        this.paymentAddress1 = paymentAddress1;
    }

    public String getPaymentAddress2() {
        return paymentAddress2;
    }

    public void setPaymentAddress2(String paymentAddress2) {
        this.paymentAddress2 = paymentAddress2;
    }

    public String getPaymentCity() {
        return paymentCity;
    }

    public void setPaymentCity(String paymentCity) {
        this.paymentCity = paymentCity;
    }

    public String getPaymentPostcode() {
        return paymentPostcode;
    }

    public void setPaymentPostcode(String paymentPostcode) {
        this.paymentPostcode = paymentPostcode;
    }

    public String getPaymentCountry() {
        return paymentCountry;
    }

    public void setPaymentCountry(String paymentCountry) {
        this.paymentCountry = paymentCountry;
    }

    public int getPaymentCountryId() {
        return paymentCountryId;
    }

    public void setPaymentCountryId(int paymentCountryId) {
        this.paymentCountryId = paymentCountryId;
    }

    public String getPaymentZone() {
        return paymentZone;
    }

    public void setPaymentZone(String paymentZone) {
        this.paymentZone = paymentZone;
    }

    public int getPaymentZoneId() {
        return paymentZoneId;
    }

    public void setPaymentZoneId(int paymentZoneId) {
        this.paymentZoneId = paymentZoneId;
    }

    public String getPaymentAddressFormat() {
        return paymentAddressFormat;
    }

    public void setPaymentAddressFormat(String paymentAddressFormat) {
        this.paymentAddressFormat = paymentAddressFormat;
    }

    public String getPaymentCustomField() {
        return paymentCustomField;
    }

    public void setPaymentCustomField(String paymentCustomField) {
        this.paymentCustomField = paymentCustomField;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getShippingFirstname() {
        return shippingFirstname;
    }

    public void setShippingFirstname(String shippingFirstname) {
        this.shippingFirstname = shippingFirstname;
    }

    public String getShippingLastname() {
        return shippingLastname;
    }

    public void setShippingLastname(String shippingLastname) {
        this.shippingLastname = shippingLastname;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getShippingAddress1() {
        return shippingAddress1;
    }

    public void setShippingAddress1(String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public String getShippingAddress2() {
        return shippingAddress2;
    }

    public void setShippingAddress2(String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingPostcode() {
        return shippingPostcode;
    }

    public void setShippingPostcode(String shippingPostcode) {
        this.shippingPostcode = shippingPostcode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public int getShippingCountryId() {
        return shippingCountryId;
    }

    public void setShippingCountryId(int shippingCountryId) {
        this.shippingCountryId = shippingCountryId;
    }

    public String getShippingZone() {
        return shippingZone;
    }

    public void setShippingZone(String shippingZone) {
        this.shippingZone = shippingZone;
    }

    public int getShippingZoneId() {
        return shippingZoneId;
    }

    public void setShippingZoneId(int shippingZoneId) {
        this.shippingZoneId = shippingZoneId;
    }

    public String getShippingAddressFormat() {
        return shippingAddressFormat;
    }

    public void setShippingAddressFormat(String shippingAddressFormat) {
        this.shippingAddressFormat = shippingAddressFormat;
    }

    public String getShippingCustomField() {
        return shippingCustomField;
    }

    public void setShippingCustomField(String shippingCustomField) {
        this.shippingCustomField = shippingCustomField;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public int getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(int affiliateId) {
        this.affiliateId = affiliateId;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public int getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(int marketingId) {
        this.marketingId = marketingId;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getForwardedIp() {
        return forwardedIp;
    }

    public void setForwardedIp(String forwardedIp) {
        this.forwardedIp = forwardedIp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrder)) {
            return false;
        }
        OcOrder other = (OcOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrder[ orderId=" + orderId + " ]";
    }
    
}
