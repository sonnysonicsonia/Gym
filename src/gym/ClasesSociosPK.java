/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Sonia
 */
@Embeddable
public class ClasesSociosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_socio")
    private int idSocio;
    @Basic(optional = false)
    @Column(name = "id_clase")
    private int idClase;

    public ClasesSociosPK() {
    }

    public ClasesSociosPK(int idSocio, int idClase) {
        this.idSocio = idSocio;
        this.idClase = idClase;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSocio;
        hash += (int) idClase;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasesSociosPK)) {
            return false;
        }
        ClasesSociosPK other = (ClasesSociosPK) object;
        if (this.idSocio != other.idSocio) {
            return false;
        }
        if (this.idClase != other.idClase) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.ClasesSociosPK[ idSocio=" + idSocio + ", idClase=" + idClase + " ]";
    }
    
}
