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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_weight_class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcWeightClass.findAll", query = "SELECT o FROM OcWeightClass o"),
    @NamedQuery(name = "OcWeightClass.findByWeightClassId", query = "SELECT o FROM OcWeightClass o WHERE o.weightClassId = :weightClassId"),
    @NamedQuery(name = "OcWeightClass.findByValue", query = "SELECT o FROM OcWeightClass o WHERE o.value = :value")})
public class OcWeightClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "weight_class_id")
    private Integer weightClassId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private BigDecimal value;

    public OcWeightClass() {
    }

    public OcWeightClass(Integer weightClassId) {
        this.weightClassId = weightClassId;
    }

    public OcWeightClass(Integer weightClassId, BigDecimal value) {
        this.weightClassId = weightClassId;
        this.value = value;
    }

    public Integer getWeightClassId() {
        return weightClassId;
    }

    public void setWeightClassId(Integer weightClassId) {
        this.weightClassId = weightClassId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (weightClassId != null ? weightClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcWeightClass)) {
            return false;
        }
        OcWeightClass other = (OcWeightClass) object;
        if ((this.weightClassId == null && other.weightClassId != null) || (this.weightClassId != null && !this.weightClassId.equals(other.weightClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcWeightClass[ weightClassId=" + weightClassId + " ]";
    }
    
}
