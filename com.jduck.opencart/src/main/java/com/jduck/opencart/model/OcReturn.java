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
@Table(name = "oc_return")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcReturn.findAll", query = "SELECT o FROM OcReturn o"),
    @NamedQuery(name = "OcReturn.findByReturnId", query = "SELECT o FROM OcReturn o WHERE o.returnId = :returnId"),
    @NamedQuery(name = "OcReturn.findByOrderId", query = "SELECT o FROM OcReturn o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OcReturn.findByProductId", query = "SELECT o FROM OcReturn o WHERE o.productId = :productId"),
    @NamedQuery(name = "OcReturn.findByCustomerId", query = "SELECT o FROM OcReturn o WHERE o.customerId = :customerId"),
    @NamedQuery(name = "OcReturn.findByFirstname", query = "SELECT o FROM OcReturn o WHERE o.firstname = :firstname"),
    @NamedQuery(name = "OcReturn.findByLastname", query = "SELECT o FROM OcReturn o WHERE o.lastname = :lastname"),
    @NamedQuery(name = "OcReturn.findByEmail", query = "SELECT o FROM OcReturn o WHERE o.email = :email"),
    @NamedQuery(name = "OcReturn.findByTelephone", query = "SELECT o FROM OcReturn o WHERE o.telephone = :telephone"),
    @NamedQuery(name = "OcReturn.findByProduct", query = "SELECT o FROM OcReturn o WHERE o.product = :product"),
    @NamedQuery(name = "OcReturn.findByModel", query = "SELECT o FROM OcReturn o WHERE o.model = :model"),
    @NamedQuery(name = "OcReturn.findByQuantity", query = "SELECT o FROM OcReturn o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OcReturn.findByOpened", query = "SELECT o FROM OcReturn o WHERE o.opened = :opened"),
    @NamedQuery(name = "OcReturn.findByReturnReasonId", query = "SELECT o FROM OcReturn o WHERE o.returnReasonId = :returnReasonId"),
    @NamedQuery(name = "OcReturn.findByReturnActionId", query = "SELECT o FROM OcReturn o WHERE o.returnActionId = :returnActionId"),
    @NamedQuery(name = "OcReturn.findByReturnStatusId", query = "SELECT o FROM OcReturn o WHERE o.returnStatusId = :returnStatusId"),
    @NamedQuery(name = "OcReturn.findByDateOrdered", query = "SELECT o FROM OcReturn o WHERE o.dateOrdered = :dateOrdered"),
    @NamedQuery(name = "OcReturn.findByDateAdded", query = "SELECT o FROM OcReturn o WHERE o.dateAdded = :dateAdded"),
    @NamedQuery(name = "OcReturn.findByDateModified", query = "SELECT o FROM OcReturn o WHERE o.dateModified = :dateModified")})
public class OcReturn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "return_id")
    private Integer returnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "lastname")
    private String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "product")
    private String product;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "opened")
    private boolean opened;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_reason_id")
    private int returnReasonId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_action_id")
    private int returnActionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_status_id")
    private int returnStatusId;
    @Lob
    @Size(max = 65535)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_ordered")
    @Temporal(TemporalType.DATE)
    private Date dateOrdered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;

    public OcReturn() {
    }

    public OcReturn(Integer returnId) {
        this.returnId = returnId;
    }

    public OcReturn(Integer returnId, int orderId, int productId, int customerId, String firstname, String lastname, String email, String telephone, String product, String model, int quantity, boolean opened, int returnReasonId, int returnActionId, int returnStatusId, Date dateOrdered, Date dateAdded, Date dateModified) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.productId = productId;
        this.customerId = customerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.product = product;
        this.model = model;
        this.quantity = quantity;
        this.opened = opened;
        this.returnReasonId = returnReasonId;
        this.returnActionId = returnActionId;
        this.returnStatusId = returnStatusId;
        this.dateOrdered = dateOrdered;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public int getReturnReasonId() {
        return returnReasonId;
    }

    public void setReturnReasonId(int returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public int getReturnActionId() {
        return returnActionId;
    }

    public void setReturnActionId(int returnActionId) {
        this.returnActionId = returnActionId;
    }

    public int getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(int returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
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
        hash += (returnId != null ? returnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcReturn)) {
            return false;
        }
        OcReturn other = (OcReturn) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcReturn[ returnId=" + returnId + " ]";
    }
    
}
