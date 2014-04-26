/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sonia
 */
@Entity
@Table(name = "clases_socios", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClasesSocios.findAll", query = "SELECT c FROM ClasesSocios c"),
    @NamedQuery(name = "ClasesSocios.findByIdSocio", query = "SELECT c FROM ClasesSocios c WHERE c.clasesSociosPK.idSocio = :idSocio"),
    @NamedQuery(name = "ClasesSocios.findByIdClase", query = "SELECT c FROM ClasesSocios c WHERE c.clasesSociosPK.idClase = :idClase")})
public class ClasesSocios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClasesSociosPK clasesSociosPK;

    public ClasesSocios() {
    }

    public ClasesSocios(ClasesSociosPK clasesSociosPK) {
        this.clasesSociosPK = clasesSociosPK;
    }

    public ClasesSocios(int idSocio, int idClase) {
        this.clasesSociosPK = new ClasesSociosPK(idSocio, idClase);
    }

    public ClasesSociosPK getClasesSociosPK() {
        return clasesSociosPK;
    }

    public void setClasesSociosPK(ClasesSociosPK clasesSociosPK) {
        this.clasesSociosPK = clasesSociosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasesSociosPK != null ? clasesSociosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasesSocios)) {
            return false;
        }
        ClasesSocios other = (ClasesSocios) object;
        if ((this.clasesSociosPK == null && other.clasesSociosPK != null) || (this.clasesSociosPK != null && !this.clasesSociosPK.equals(other.clasesSociosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.ClasesSocios[ clasesSociosPK=" + clasesSociosPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
