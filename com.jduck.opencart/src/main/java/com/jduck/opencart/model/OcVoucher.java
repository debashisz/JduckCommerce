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
@Table(name = "oc_voucher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcVoucher.findAll", query = "SELECT o FROM OcVoucher o"),
    @NamedQuery(name = "OcVoucher.findByVoucherId", query = "SELECT o FROM OcVoucher o WHERE o.voucherId = :voucherId"),
    @NamedQuery(name = "OcVoucher.findByOrderId", query = "SELECT o FROM OcVoucher o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcVoucher.findByCode", query = "SELECT o FROM OcVoucher o WHERE o.code = :code"),
    @NamedQuery(name = "OcVoucher.findByFromName", query = "SELECT o FROM OcVoucher o WHERE o.fromName = :fromName"),
    @NamedQuery(name = "OcVoucher.findByFromEmail", query = "SELECT o FROM OcVoucher o WHERE o.fromEmail = :fromEmail"),
    @NamedQuery(name = "OcVoucher.findByToName", query = "SELECT o FROM OcVoucher o WHERE o.toName = :toName"),
    @NamedQuery(name = "OcVoucher.findByToEmail", query = "SELECT o FROM OcVoucher o WHERE o.toEmail = :toEmail"),
    @NamedQuery(name = "OcVoucher.findByVoucherThemeId", query = "SELECT o FROM OcVoucher o WHERE o.voucherThemeId = :voucherThemeId"),
    @NamedQuery(name = "OcVoucher.findByAmount", query = "SELECT o FROM OcVoucher o WHERE o.amount = :amount"),
    @NamedQuery(name = "OcVoucher.findByStatus", query = "SELECT o FROM OcVoucher o WHERE o.status = :status"),
    @NamedQuery(name = "OcVoucher.findByDateAdded", query = "SELECT o FROM OcVoucher o WHERE o.dateAdded = :dateAdded")})
public class OcVoucher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "voucher_id")
    private Integer voucherId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "from_name")
    private String fromName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "from_email")
    private String fromEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "to_name")
    private String toName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "to_email")
    private String toEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "voucher_theme_id")
    private int voucherThemeId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "message")
    private String message;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcVoucher() {
    }

    public OcVoucher(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public OcVoucher(Integer voucherId, int orderId, String code, String fromName, String fromEmail, String toName, String toEmail, int voucherThemeId, String message, BigDecimal amount, boolean status, Date dateAdded) {
        this.voucherId = voucherId;
        this.orderId = orderId;
        this.code = code;
        this.fromName = fromName;
        this.fromEmail = fromEmail;
        this.toName = toName;
        this.toEmail = toEmail;
        this.voucherThemeId = voucherThemeId;
        this.message = message;
        this.amount = amount;
        this.status = status;
        this.dateAdded = dateAdded;
    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public int getVoucherThemeId() {
        return voucherThemeId;
    }

    public void setVoucherThemeId(int voucherThemeId) {
        this.voucherThemeId = voucherThemeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
        hash += (voucherId != null ? voucherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcVoucher)) {
            return false;
        }
        OcVoucher other = (OcVoucher) object;
        if ((this.voucherId == null && other.voucherId != null) || (this.voucherId != null && !this.voucherId.equals(other.voucherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcVoucher[ voucherId=" + voucherId + " ]";
    }
    
}
