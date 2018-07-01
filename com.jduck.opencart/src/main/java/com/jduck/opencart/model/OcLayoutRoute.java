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
@Table(name = "oc_layout_route")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcLayoutRoute.findAll", query = "SELECT o FROM OcLayoutRoute o"),
    @NamedQuery(name = "OcLayoutRoute.findByLayoutRouteId", query = "SELECT o FROM OcLayoutRoute o WHERE o.layoutRouteId = :layoutRouteId"),
    @NamedQuery(name = "OcLayoutRoute.findByLayoutId", query = "SELECT o FROM OcLayoutRoute o WHERE o.layoutId = :layoutId"),
    @NamedQuery(name = "OcLayoutRoute.findByStoreId", query = "SELECT o FROM OcLayoutRoute o WHERE o.storeId = :storeId"),
    @NamedQuery(name = "OcLayoutRoute.findByRoute", query = "SELECT o FROM OcLayoutRoute o WHERE o.route = :route")})
public class OcLayoutRoute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layout_route_id")
    private Integer layoutRouteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "layout_id")
    private int layoutId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "route")
    private String route;

    public OcLayoutRoute() {
    }

    public OcLayoutRoute(Integer layoutRouteId) {
        this.layoutRouteId = layoutRouteId;
    }

    public OcLayoutRoute(Integer layoutRouteId, int layoutId, int storeId, String route) {
        this.layoutRouteId = layoutRouteId;
        this.layoutId = layoutId;
        this.storeId = storeId;
        this.route = route;
    }

    public Integer getLayoutRouteId() {
        return layoutRouteId;
    }

    public void setLayoutRouteId(Integer layoutRouteId) {
        this.layoutRouteId = layoutRouteId;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (layoutRouteId != null ? layoutRouteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcLayoutRoute)) {
            return false;
        }
        OcLayoutRoute other = (OcLayoutRoute) object;
        if ((this.layoutRouteId == null && other.layoutRouteId != null) || (this.layoutRouteId != null && !this.layoutRouteId.equals(other.layoutRouteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcLayoutRoute[ layoutRouteId=" + layoutRouteId + " ]";
    }
    
}
