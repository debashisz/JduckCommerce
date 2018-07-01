/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jduck.opencart.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Windows10
 */
@Entity
@Table(name = "oc_information_to_store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OcInformationToStore.findAll", query = "SELECT o FROM OcInformationToStore o"),
    @NamedQuery(name = "OcInformationToStore.findByInformationId", query = "SELECT o FROM OcInformationToStore o WHERE o.ocInformationToStorePK.informationId = :informationId"),
    @NamedQuery(name = "OcInformationToStore.findByStoreId", query = "SELECT o FROM OcInformationToStore o WHERE o.ocInformationToStorePK.storeId = :storeId")})
public class OcInformationToStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OcInformationToStorePK ocInformationToStorePK;

    public OcInformationToStore() {
    }

    public OcInformationToStore(OcInformationToStorePK ocInformationToStorePK) {
        this.ocInformationToStorePK = ocInformationToStorePK;
    }

    public OcInformationToStore(int informationId, int storeId) {
        this.ocInformationToStorePK = new OcInformationToStorePK(informationId, storeId);
    }

    public OcInformationToStorePK getOcInformationToStorePK() {
        return ocInformationToStorePK;
    }

    public void setOcInformationToStorePK(OcInformationToStorePK ocInformationToStorePK) {
        this.ocInformationToStorePK = ocInformationToStorePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocInformationToStorePK != null ? ocInformationToStorePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OcInformationToStore)) {
            return false;
        }
        OcInformationToStore other = (OcInformationToStore) object;
        if ((this.ocInformationToStorePK == null && other.ocInformationToStorePK != null) || (this.ocInformationToStorePK != null && !this.ocInformationToStorePK.equals(other.ocInformationToStorePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jduck.opencart.model.OcInformationToStore[ ocInformationToStorePK=" + ocInformationToStorePK + " ]";
    }
    
}
