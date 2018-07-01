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
@Table(name = "oc_currency")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcCurrency.findAll", query = "SELECT o FROM OcCurrency o"),
    @NamedQuery(name = "OcCurrency.findByCurrencyId", query = "SELECT o FROM OcCurrency o WHERE o.currencyId = :currencyId"),
    @NamedQuery(name = "OcCurrency.findByTitle", query = "SELECT o FROM OcCurrency o WHERE o.title = :title"),
    @NamedQuery(name = "OcCurrency.findByCode", query = "SELECT o FROM OcCurrency o WHERE o.code = :code"),
    @NamedQuery(name = "OcCurrency.findBySymbolLeft", query = "SELECT o FROM OcCurrency o WHERE o.symbolLeft = :symbolLeft"),
    @NamedQuery(name = "OcCurrency.findBySymbolRight", query = "SELECT o FROM OcCurrency o WHERE o.symbolRight = :symbolRight"),
    @NamedQuery(name = "OcCurrency.findByDecimalPlace", query = "SELECT o FROM OcCurrency o WHERE o.decimalPlace = :decimalPlace"),
    @NamedQuery(name = "OcCurrency.findByValue", query = "SELECT o FROM OcCurrency o WHERE o.value = :value"),
    @NamedQuery(name = "OcCurrency.findByStatus", query = "SELECT o FROM OcCurrency o WHERE o.status = :status"),
    @NamedQuery(name = "OcCurrency.findByDateModified", query = "SELECT o FROM OcCurrency o WHERE o.dateModified = :dateModified")})
public class OcCurrency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "currency_id")
    private Integer currencyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "symbol_left")
    private String symbolLeft;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "symbol_right")
    private String symbolRight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "decimal_place")
    private Character decimalPlace;
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private double value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcCurrency() {
    }

    public OcCurrency(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public OcCurrency(Integer currencyId, String title, String code, String symbolLeft, String symbolRight, Character decimalPlace, double value, boolean status, Date dateModified) {
        this.currencyId = currencyId;
        this.title = title;
        this.code = code;
        this.symbolLeft = symbolLeft;
        this.symbolRight = symbolRight;
        this.decimalPlace = decimalPlace;
        this.value = value;
        this.status = status;
        this.dateModified = dateModified;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbolLeft() {
        return symbolLeft;
    }

    public void setSymbolLeft(String symbolLeft) {
        this.symbolLeft = symbolLeft;
    }

    public String getSymbolRight() {
        return symbolRight;
    }

    public void setSymbolRight(String symbolRight) {
        this.symbolRight = symbolRight;
    }

    public Character getDecimalPlace() {
        return decimalPlace;
    }

    public void setDecimalPlace(Character decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        hash += (currencyId != null ? currencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcCurrency)) {
            return false;
        }
        OcCurrency other = (OcCurrency) object;
        if ((this.currencyId == null && other.currencyId != null) || (this.currencyId != null && !this.currencyId.equals(other.currencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcCurrency[ currencyId=" + currencyId + " ]";
    }
    
}
