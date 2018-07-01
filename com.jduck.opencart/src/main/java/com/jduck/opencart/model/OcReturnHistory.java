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
@Table(name = "oc_return_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReturnHistory.findAll", query = "SELECT o FROM OcReturnHistory o"),
    @NamedQuery(name = "OcReturnHistory.findByReturnHistoryId", query = "SELECT o FROM OcReturnHistory o WHERE o.returnHistoryId = :returnHistoryId"),
    @NamedQuery(name = "OcReturnHistory.findByReturnId", query = "SELECT o FROM OcReturnHistory o WHERE o.returnId = :returnId"),
    @NamedQuery(name = "OcReturnHistory.findByReturnStatusId", query = "SELECT o FROM OcReturnHistory o WHERE o.returnStatusId = :returnStatusId"),
    @NamedQuery(name = "OcReturnHistory.findByNotify", query = "SELECT o FROM OcReturnHistory o WHERE o.notify = :notify"),
    @NamedQuery(name = "OcReturnHistory.findByDateAdded", query = "SELECT o FROM OcReturnHistory o WHERE o.dateAdded = :dateAdded")})
public class OcReturnHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "return_history_id")
    private Integer returnHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_id")
    private int returnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_status_id")
    private int returnStatusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notify")
    private boolean notify;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public OcReturnHistory() {
    }

    public OcReturnHistory(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public OcReturnHistory(Integer returnHistoryId, int returnId, int returnStatusId, boolean notify, String comment, Date dateAdded) {
        this.returnHistoryId = returnHistoryId;
        this.returnId = returnId;
        this.returnStatusId = returnStatusId;
        this.notify = notify;
        this.comment = comment;
        this.dateAdded = dateAdded;
    }

    public Integer getReturnHistoryId() {
        return returnHistoryId;
    }

    public void setReturnHistoryId(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }

    public int getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(int returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public boolean getNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        hash += (returnHistoryId != null ? returnHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturnHistory)) {
            return false;
        }
        OcReturnHistory other = (OcReturnHistory) object;
        if ((this.returnHistoryId == null && other.returnHistoryId != null) || (this.returnHistoryId != null && !this.returnHistoryId.equals(other.returnHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturnHistory[ returnHistoryId=" + returnHistoryId + " ]";
    }
    
}
