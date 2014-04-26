/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Sonia
 */
@Entity
@Table(name = "pago_socio", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "PagoSocio.findAll", query = "SELECT p FROM PagoSocio p"),
    @NamedQuery(name = "PagoSocio.findByIdPagsocio", query = "SELECT p FROM PagoSocio p WHERE p.idPagsocio = :idPagsocio"),
    @NamedQuery(name = "PagoSocio.findByFechPago", query = "SELECT p FROM PagoSocio p WHERE p.fechPago = :fechPago"),
    @NamedQuery(name = "PagoSocio.findByIdSocio", query = "SELECT p FROM PagoSocio p WHERE p.idSocio = :idSocio"),
    @NamedQuery(name = "PagoSocio.findByIdMem", query = "SELECT p FROM PagoSocio p WHERE p.idMem = :idMem")})
public class PagoSocio implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pagsocio")
    private Integer idPagsocio;
    @Basic(optional = false)
    @Column(name = "fech_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechPago;
    @Column(name = "id_socio")
    private Integer idSocio;
    @Column(name = "id_mem")
    private Integer idMem;

    public PagoSocio() {
    }

    public PagoSocio(Integer idPagsocio) {
        this.idPagsocio = idPagsocio;
    }

    public PagoSocio(Integer idPagsocio, Date fechPago) {
        this.idPagsocio = idPagsocio;
        this.fechPago = fechPago;
    }

    public Integer getIdPagsocio() {
        return idPagsocio;
    }

    public void setIdPagsocio(Integer idPagsocio) {
        Integer oldIdPagsocio = this.idPagsocio;
        this.idPagsocio = idPagsocio;
        changeSupport.firePropertyChange("idPagsocio", oldIdPagsocio, idPagsocio);
    }

    public Date getFechPago() {
        return fechPago;
    }

    public void setFechPago(Date fechPago) {
        Date oldFechPago = this.fechPago;
        this.fechPago = fechPago;
        changeSupport.firePropertyChange("fechPago", oldFechPago, fechPago);
    }

    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        Integer oldIdSocio = this.idSocio;
        this.idSocio = idSocio;
        changeSupport.firePropertyChange("idSocio", oldIdSocio, idSocio);
    }

    public Integer getIdMem() {
        return idMem;
    }

    public void setIdMem(Integer idMem) {
        Integer oldIdMem = this.idMem;
        this.idMem = idMem;
        changeSupport.firePropertyChange("idMem", oldIdMem, idMem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPagsocio != null ? idPagsocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoSocio)) {
            return false;
        }
        PagoSocio other = (PagoSocio) object;
        if ((this.idPagsocio == null && other.idPagsocio != null) || (this.idPagsocio != null && !this.idPagsocio.equals(other.idPagsocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.PagoSocio[ idPagsocio=" + idPagsocio + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
