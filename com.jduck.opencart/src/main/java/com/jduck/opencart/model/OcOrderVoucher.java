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
@Table(name = "oc_order_voucher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcOrderVoucher.findAll", query = "SELECT o FROM OcOrderVoucher o"),
    @NamedQuery(name = "OcOrderVoucher.findByOrderVoucherId", query = "SELECT o FROM OcOrderVoucher o WHERE o.orderVoucherId = :orderVoucherId"),
    @NamedQuery(name = "OcOrderVoucher.findByOrderId", query = "SELECT o FROM OcOrderVoucher o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcOrderVoucher.findByVoucherId", query = "SELECT o FROM OcOrderVoucher o WHERE o.voucherId = :voucherId"),
    @NamedQuery(name = "OcOrderVoucher.findByDescription", query = "SELECT o FROM OcOrderVoucher o WHERE o.description = :description"),
    @NamedQuery(name = "OcOrderVoucher.findByCode", query = "SELECT o FROM OcOrderVoucher o WHERE o.code = :code"),
    @NamedQuery(name = "OcOrderVoucher.findByFromName", query = "SELECT o FROM OcOrderVoucher o WHERE o.fromName = :fromName"),
    @NamedQuery(name = "OcOrderVoucher.findByFromEmail", query = "SELECT o FROM OcOrderVoucher o WHERE o.fromEmail = :fromEmail"),
    @NamedQuery(name = "OcOrderVoucher.findByToName", query = "SELECT o FROM OcOrderVoucher o WHERE o.toName = :toName"),
    @NamedQuery(name = "OcOrderVoucher.findByToEmail", query = "SELECT o FROM OcOrderVoucher o WHERE o.toEmail = :toEmail"),
    @NamedQuery(name = "OcOrderVoucher.findByVoucherThemeId", query = "SELECT o FROM OcOrderVoucher o WHERE o.voucherThemeId = :voucherThemeId"),
    @NamedQuery(name = "OcOrderVoucher.findByAmount", query = "SELECT o FROM OcOrderVoucher o WHERE o.amount = :amount")})
public class OcOrderVoucher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_voucher_id")
    private Integer orderVoucherId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "voucher_id")
    private int voucherId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
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

    public OcOrderVoucher() {
    }

    public OcOrderVoucher(Integer orderVoucherId) {
        this.orderVoucherId = orderVoucherId;
    }

    public OcOrderVoucher(Integer orderVoucherId, int orderId, int voucherId, String description, String code, String fromName, String fromEmail, String toName, String toEmail, int voucherThemeId, String message, BigDecimal amount) {
        this.orderVoucherId = orderVoucherId;
        this.orderId = orderId;
        this.voucherId = voucherId;
        this.description = description;
        this.code = code;
        this.fromName = fromName;
        this.fromEmail = fromEmail;
        this.toName = toName;
        this.toEmail = toEmail;
        this.voucherThemeId = voucherThemeId;
        this.message = message;
        this.amount = amount;
    }

    public Integer getOrderVoucherId() {
        return orderVoucherId;
    }

    public void setOrderVoucherId(Integer orderVoucherId) {
        this.orderVoucherId = orderVoucherId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderVoucherId != null ? orderVoucherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcOrderVoucher)) {
            return false;
        }
        OcOrderVoucher other = (OcOrderVoucher) object;
        if ((this.orderVoucherId == null && other.orderVoucherId != null) || (this.orderVoucherId != null && !this.orderVoucherId.equals(other.orderVoucherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcOrderVoucher[ orderVoucherId=" + orderVoucherId + " ]";
    }
    
}
