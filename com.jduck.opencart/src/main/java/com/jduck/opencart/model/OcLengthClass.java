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
@Table(name = "oc_length_class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLengthClass.findAll", query = "SELECT o FROM OcLengthClass o"),
    @NamedQuery(name = "OcLengthClass.findByLengthClassId", query = "SELECT o FROM OcLengthClass o WHERE o.lengthClassId = :lengthClassId"),
    @NamedQuery(name = "OcLengthClass.findByValue", query = "SELECT o FROM OcLengthClass o WHERE o.value = :value")})
public class OcLengthClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "length_class_id")
    private Integer lengthClassId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private BigDecimal value;

    public OcLengthClass() {
    }

    public OcLengthClass(Integer lengthClassId) {
        this.lengthClassId = lengthClassId;
    }

    public OcLengthClass(Integer lengthClassId, BigDecimal value) {
        this.lengthClassId = lengthClassId;
        this.value = value;
    }

    public Integer getLengthClassId() {
        return lengthClassId;
    }

    public void setLengthClassId(Integer lengthClassId) {
        this.lengthClassId = lengthClassId;
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
        hash += (lengthClassId != null ? lengthClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLengthClass)) {
            return false;
        }
        OcLengthClass other = (OcLengthClass) object;
        if ((this.lengthClassId == null && other.lengthClassId != null) || (this.lengthClassId != null && !this.lengthClassId.equals(other.lengthClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLengthClass[ lengthClassId=" + lengthClassId + " ]";
    }
    
}
