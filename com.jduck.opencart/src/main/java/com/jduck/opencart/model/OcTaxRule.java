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
@Table(name = "oc_tax_rule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcTaxRule.findAll", query = "SELECT o FROM OcTaxRule o"),
    @NamedQuery(name = "OcTaxRule.findByTaxRuleId", query = "SELECT o FROM OcTaxRule o WHERE o.taxRuleId = :taxRuleId"),
    @NamedQuery(name = "OcTaxRule.findByTaxClassId", query = "SELECT o FROM OcTaxRule o WHERE o.taxClassId = :taxClassId"),
    @NamedQuery(name = "OcTaxRule.findByTaxRateId", query = "SELECT o FROM OcTaxRule o WHERE o.taxRateId = :taxRateId"),
    @NamedQuery(name = "OcTaxRule.findByBased", query = "SELECT o FROM OcTaxRule o WHERE o.based = :based"),
    @NamedQuery(name = "OcTaxRule.findByPriority", query = "SELECT o FROM OcTaxRule o WHERE o.priority = :priority")})
public class OcTaxRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tax_rule_id")
    private Integer taxRuleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_class_id")
    private int taxClassId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_rate_id")
    private int taxRateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "based")
    private String based;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority")
    private int priority;

    public OcTaxRule() {
    }

    public OcTaxRule(Integer taxRuleId) {
        this.taxRuleId = taxRuleId;
    }

    public OcTaxRule(Integer taxRuleId, int taxClassId, int taxRateId, String based, int priority) {
        this.taxRuleId = taxRuleId;
        this.taxClassId = taxClassId;
        this.taxRateId = taxRateId;
        this.based = based;
        this.priority = priority;
    }

    public Integer getTaxRuleId() {
        return taxRuleId;
    }

    public void setTaxRuleId(Integer taxRuleId) {
        this.taxRuleId = taxRuleId;
    }

    public int getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(int taxClassId) {
        this.taxClassId = taxClassId;
    }

    public int getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(int taxRateId) {
        this.taxRateId = taxRateId;
    }

    public String getBased() {
        return based;
    }

    public void setBased(String based) {
        this.based = based;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxRuleId != null ? taxRuleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcTaxRule)) {
            return false;
        }
        OcTaxRule other = (OcTaxRule) object;
        if ((this.taxRuleId == null && other.taxRuleId != null) || (this.taxRuleId != null && !this.taxRuleId.equals(other.taxRuleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcTaxRule[ taxRuleId=" + taxRuleId + " ]";
    }
    
}
