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
@Table(name = "oc_customer_affiliate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCustomerAffiliate.findAll", query = "SELECT o FROM OcCustomerAffiliate o"),
    @NamedQuery(name = "OcCustomerAffiliate.findByCustomerId", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcCustomerAffiliate.findByCompany", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.company = :company"),
    @NamedQuery(name = "OcCustomerAffiliate.findByWebsite", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.website = :website"),
    @NamedQuery(name = "OcCustomerAffiliate.findByTracking", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.tracking = :tracking"),
    @NamedQuery(name = "OcCustomerAffiliate.findByCommission", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.commission = :commission"),
    @NamedQuery(name = "OcCustomerAffiliate.findByTax", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.tax = :tax"),
    @NamedQuery(name = "OcCustomerAffiliate.findByPayment", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.payment = :payment"),
    @NamedQuery(name = "OcCustomerAffiliate.findByCheque", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.cheque = :cheque"),
    @NamedQuery(name = "OcCustomerAffiliate.findByPaypal", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.paypal = :paypal"),
    @NamedQuery(name = "OcCustomerAffiliate.findByBankName", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.bankName = :bankName"),
    @NamedQuery(name = "OcCustomerAffiliate.findByBankBranchNumber", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.bankBranchNumber = :bankBranchNumber"),
    @NamedQuery(name = "OcCustomerAffiliate.findByBankSwiftCode", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.bankSwiftCode = :bankSwiftCode"),
    @NamedQuery(name = "OcCustomerAffiliate.findByBankAccountName", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.bankAccountName = :bankAccountName"),
    @NamedQuery(name = "OcCustomerAffiliate.findByBankAccountNumber", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.bankAccountNumber = :bankAccountNumber"),
    @NamedQuery(name = "OcCustomerAffiliate.findByStatus", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.status = :status"),
    @NamedQuery(name = "OcCustomerAffiliate.findByDateAdded", query = "SELECT o FROM OcCustomerAffiliate o WHERE o.dateAdded = :dateAdded")})
public class OcCustomerAffiliate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "website")
    private String website;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "tracking")
    private String tracking;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "commission")
    private BigDecimal commission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "tax")
    private String tax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "cheque")
    private String cheque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "paypal")
    private String paypal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "bank_name")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "bank_branch_number")
    private String bankBranchNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "bank_swift_code")
    private String bankSwiftCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "bank_account_name")
    private String bankAccountName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "bank_account_number")
    private String bankAccountNumber;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_field")
    private String customField;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcCustomerAffiliate() {
    }

    public OcCustomerAffiliate(Integer customerId) {
        this.customerId = customerId;
    }

    public OcCustomerAffiliate(Integer customerId, String company, String website, String tracking, BigDecimal commission, String tax, String payment, String cheque, String paypal, String bankName, String bankBranchNumber, String bankSwiftCode, String bankAccountName, String bankAccountNumber, String customField, boolean status, Date dateAdded) {
        this.customerId = customerId;
        this.company = company;
        this.website = website;
        this.tracking = tracking;
        this.commission = commission;
        this.tax = tax;
        this.payment = payment;
        this.cheque = cheque;
        this.paypal = paypal;
        this.bankName = bankName;
        this.bankBranchNumber = bankBranchNumber;
        this.bankSwiftCode = bankSwiftCode;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
        this.customField = customField;
        this.status = status;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchNumber() {
        return bankBranchNumber;
    }

    public void setBankBranchNumber(String bankBranchNumber) {
        this.bankBranchNumber = bankBranchNumber;
    }

    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    public void setBankSwiftCode(String bankSwiftCode) {
        this.bankSwiftCode = bankSwiftCode;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCustomerAffiliate)) {
            return false;
        }
        OcCustomerAffiliate other = (OcCustomerAffiliate) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCustomerAffiliate[ customerId=" + customerId + " ]";
    }
    
}
