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
@Table(name = "oc_event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcEvent.findAll", query = "SELECT o FROM OcEvent o"),
    @NamedQuery(name = "OcEvent.findByEventId", query = "SELECT o FROM OcEvent o WHERE o.eventId = :eventId"),
    @NamedQuery(name = "OcEvent.findByCode", query = "SELECT o FROM OcEvent o WHERE o.code = :code"),
    @NamedQuery(name = "OcEvent.findByStatus", query = "SELECT o FROM OcEvent o WHERE o.status = :status"),
    @NamedQuery(name = "OcEvent.findBySortOrder", query = "SELECT o FROM OcEvent o WHERE o.sortOrder = :sortOrder")})
public class OcEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "event_id")
    private Integer eventId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "trigger")
    private String trigger;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "action")
    private String action;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sort_order")
    private int sortOrder;

    public OcEvent() {
    }

    public OcEvent(Integer eventId) {
        this.eventId = eventId;
    }

    public OcEvent(Integer eventId, String code, String trigger, String action, boolean status, int sortOrder) {
        this.eventId = eventId;
        this.code = code;
        this.trigger = trigger;
        this.action = action;
        this.status = status;
        this.sortOrder = sortOrder;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcEvent)) {
            return false;
        }
        OcEvent other = (OcEvent) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcEvent[ eventId=" + eventId + " ]";
    }
    
}
