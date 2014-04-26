/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Sonia
 */
@Entity
@Table(name = "empleados", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByIdEmp", query = "SELECT e FROM Empleados e WHERE e.idEmp = :idEmp"),
    @NamedQuery(name = "Empleados.findByNomEmp", query = "SELECT e FROM Empleados e WHERE e.nomEmp = :nomEmp"),
    @NamedQuery(name = "Empleados.findByApEmp", query = "SELECT e FROM Empleados e WHERE e.apEmp = :apEmp"),
    @NamedQuery(name = "Empleados.findByAmEmp", query = "SELECT e FROM Empleados e WHERE e.amEmp = :amEmp"),
    @NamedQuery(name = "Empleados.findByTelEmp", query = "SELECT e FROM Empleados e WHERE e.telEmp = :telEmp"),
    @NamedQuery(name = "Empleados.findByTipoEmp", query = "SELECT e FROM Empleados e WHERE e.tipoEmp = :tipoEmp")})
public class Empleados implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_emp")
    private Integer idEmp;
    @Basic(optional = false)
    @Column(name = "nom_emp")
    private String nomEmp;
    @Basic(optional = false)
    @Column(name = "ap_emp")
    private String apEmp;
    @Column(name = "am_emp")
    private String amEmp;
    @Basic(optional = false)
    @Column(name = "tel_emp")
    private String telEmp;
    @Basic(optional = false)
    @Column(name = "tipo_emp")
    private String tipoEmp;

    public Empleados() {
    }

    public Empleados(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Empleados(Integer idEmp, String nomEmp, String apEmp, String telEmp, String tipoEmp) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.apEmp = apEmp;
        this.telEmp = telEmp;
        this.tipoEmp = tipoEmp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        Integer oldIdEmp = this.idEmp;
        this.idEmp = idEmp;
        changeSupport.firePropertyChange("idEmp", oldIdEmp, idEmp);
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        String oldNomEmp = this.nomEmp;
        this.nomEmp = nomEmp;
        changeSupport.firePropertyChange("nomEmp", oldNomEmp, nomEmp);
    }

    public String getApEmp() {
        return apEmp;
    }

    public void setApEmp(String apEmp) {
        String oldApEmp = this.apEmp;
        this.apEmp = apEmp;
        changeSupport.firePropertyChange("apEmp", oldApEmp, apEmp);
    }

    public String getAmEmp() {
        return amEmp;
    }

    public void setAmEmp(String amEmp) {
        String oldAmEmp = this.amEmp;
        this.amEmp = amEmp;
        changeSupport.firePropertyChange("amEmp", oldAmEmp, amEmp);
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        String oldTelEmp = this.telEmp;
        this.telEmp = telEmp;
        changeSupport.firePropertyChange("telEmp", oldTelEmp, telEmp);
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        String oldTipoEmp = this.tipoEmp;
        this.tipoEmp = tipoEmp;
        changeSupport.firePropertyChange("tipoEmp", oldTipoEmp, tipoEmp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.Empleados[ idEmp=" + idEmp + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
