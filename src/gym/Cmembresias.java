/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Sonia
 */
@Entity
@Table(name = "cmembresias", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cmembresias.findAll", query = "SELECT c FROM Cmembresias c"),
    @NamedQuery(name = "Cmembresias.findByIdMem", query = "SELECT c FROM Cmembresias c WHERE c.idMem = :idMem"),
    @NamedQuery(name = "Cmembresias.findByTipoMem", query = "SELECT c FROM Cmembresias c WHERE c.tipoMem = :tipoMem"),
    @NamedQuery(name = "Cmembresias.findByDurMem", query = "SELECT c FROM Cmembresias c WHERE c.durMem = :durMem"),
    @NamedQuery(name = "Cmembresias.findByCostoMem", query = "SELECT c FROM Cmembresias c WHERE c.costoMem = :costoMem")})
public class Cmembresias implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mem")
    private Integer idMem;
    @Basic(optional = false)
    @Column(name = "tipo_mem")
    private String tipoMem;
    @Basic(optional = false)
    @Column(name = "dur_mem")
    private String durMem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "costo_mem")
    private BigDecimal costoMem;

    public Cmembresias() {
    }

    public Cmembresias(Integer idMem) {
        this.idMem = idMem;
    }

    public Cmembresias(Integer idMem, String tipoMem, String durMem, BigDecimal costoMem) {
        this.idMem = idMem;
        this.tipoMem = tipoMem;
        this.durMem = durMem;
        this.costoMem = costoMem;
    }

    public Integer getIdMem() {
        return idMem;
    }

    public void setIdMem(Integer idMem) {
        Integer oldIdMem = this.idMem;
        this.idMem = idMem;
        changeSupport.firePropertyChange("idMem", oldIdMem, idMem);
    }

    public String getTipoMem() {
        return tipoMem;
    }

    public void setTipoMem(String tipoMem) {
        String oldTipoMem = this.tipoMem;
        this.tipoMem = tipoMem;
        changeSupport.firePropertyChange("tipoMem", oldTipoMem, tipoMem);
    }

    public String getDurMem() {
        return durMem;
    }

    public void setDurMem(String durMem) {
        String oldDurMem = this.durMem;
        this.durMem = durMem;
        changeSupport.firePropertyChange("durMem", oldDurMem, durMem);
    }

    public BigDecimal getCostoMem() {
        return costoMem;
    }

    public void setCostoMem(BigDecimal costoMem) {
        BigDecimal oldCostoMem = this.costoMem;
        this.costoMem = costoMem;
        changeSupport.firePropertyChange("costoMem", oldCostoMem, costoMem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMem != null ? idMem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmembresias)) {
            return false;
        }
        Cmembresias other = (Cmembresias) object;
        if ((this.idMem == null && other.idMem != null) || (this.idMem != null && !this.idMem.equals(other.idMem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.Cmembresias[ idMem=" + idMem + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
