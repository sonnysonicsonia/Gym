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
@Table(name = "cclases", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cclases.findAll", query = "SELECT c FROM Cclases c"),
    @NamedQuery(name = "Cclases.findByIdClase", query = "SELECT c FROM Cclases c WHERE c.idClase = :idClase"),
    @NamedQuery(name = "Cclases.findByActividad", query = "SELECT c FROM Cclases c WHERE c.actividad = :actividad"),
    @NamedQuery(name = "Cclases.findByDia", query = "SELECT c FROM Cclases c WHERE c.dia = :dia"),
    @NamedQuery(name = "Cclases.findByHorario", query = "SELECT c FROM Cclases c WHERE c.horario = :horario"),
    @NamedQuery(name = "Cclases.findByDStatus", query = "SELECT c FROM Cclases c WHERE c.dStatus = :dStatus"),
    @NamedQuery(name = "Cclases.findByIdEmp", query = "SELECT c FROM Cclases c WHERE c.idEmp = :idEmp")})
public class Cclases implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_clase")
    private Integer idClase;
    @Basic(optional = false)
    @Column(name = "actividad")
    private String actividad;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @Basic(optional = false)
    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Basic(optional = false)
    @Column(name = "d_status")
    private String dStatus;
    @Basic(optional = false)
    @Column(name = "id_emp")
    private int idEmp;

    public Cclases() {
    }

    public Cclases(Integer idClase) {
        this.idClase = idClase;
    }

    public Cclases(Integer idClase, String actividad, String dia, Date horario, String dStatus, int idEmp) {
        this.idClase = idClase;
        this.actividad = actividad;
        this.dia = dia;
        this.horario = horario;
        this.dStatus = dStatus;
        this.idEmp = idEmp;
    }

    public Integer getIdClase() {
        return idClase;
    }

    public void setIdClase(Integer idClase) {
        Integer oldIdClase = this.idClase;
        this.idClase = idClase;
        changeSupport.firePropertyChange("idClase", oldIdClase, idClase);
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        String oldActividad = this.actividad;
        this.actividad = actividad;
        changeSupport.firePropertyChange("actividad", oldActividad, actividad);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        Date oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    public String getDStatus() {
        return dStatus;
    }

    public void setDStatus(String dStatus) {
        String oldDStatus = this.dStatus;
        this.dStatus = dStatus;
        changeSupport.firePropertyChange("DStatus", oldDStatus, dStatus);
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        int oldIdEmp = this.idEmp;
        this.idEmp = idEmp;
        changeSupport.firePropertyChange("idEmp", oldIdEmp, idEmp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClase != null ? idClase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cclases)) {
            return false;
        }
        Cclases other = (Cclases) object;
        if ((this.idClase == null && other.idClase != null) || (this.idClase != null && !this.idClase.equals(other.idClase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.Cclases[ idClase=" + idClase + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
