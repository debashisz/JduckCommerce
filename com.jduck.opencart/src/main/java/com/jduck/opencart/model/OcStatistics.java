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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_statistics")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcStatistics.findAll", query = "SELECT o FROM OcStatistics o"),
    @NamedQuery(name = "OcStatistics.findByStatisticsId", query = "SELECT o FROM OcStatistics o WHERE o.statisticsId = :statisticsId"),
    @NamedQuery(name = "OcStatistics.findByCode", query = "SELECT o FROM OcStatistics o WHERE o.code = :code"),
    @NamedQuery(name = "OcStatistics.findByValue", query = "SELECT o FROM OcStatistics o WHERE o.value = :value")})
public class OcStatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "statistics_id")
    private Integer statisticsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "code")
    private String code;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "value")
    private BigDecimal value;

    public OcStatistics() {
    }

    public OcStatistics(Integer statisticsId) {
        this.statisticsId = statisticsId;
    }

    public OcStatistics(Integer statisticsId, String code, BigDecimal value) {
        this.statisticsId = statisticsId;
        this.code = code;
        this.value = value;
    }

    public Integer getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(Integer statisticsId) {
        this.statisticsId = statisticsId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        hash += (statisticsId != null ? statisticsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcStatistics)) {
            return false;
        }
        OcStatistics other = (OcStatistics) object;
        if ((this.statisticsId == null && other.statisticsId != null) || (this.statisticsId != null && !this.statisticsId.equals(other.statisticsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcStatistics[ statisticsId=" + statisticsId + " ]";
    }
    
}
