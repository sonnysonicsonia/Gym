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
@Table(name = "socios", catalog = "gym", schema = "")
@NamedQueries({
    @NamedQuery(name = "Socios.findAll", query = "SELECT s FROM Socios s"),
    @NamedQuery(name = "Socios.findByIdSocio", query = "SELECT s FROM Socios s WHERE s.idSocio = :idSocio"),
    @NamedQuery(name = "Socios.findByNomSocio", query = "SELECT s FROM Socios s WHERE s.nomSocio = :nomSocio"),
    @NamedQuery(name = "Socios.findByApSocio", query = "SELECT s FROM Socios s WHERE s.apSocio = :apSocio"),
    @NamedQuery(name = "Socios.findByAmSocio", query = "SELECT s FROM Socios s WHERE s.amSocio = :amSocio"),
    @NamedQuery(name = "Socios.findByFenSocio", query = "SELECT s FROM Socios s WHERE s.fenSocio = :fenSocio"),
    @NamedQuery(name = "Socios.findByGenero", query = "SELECT s FROM Socios s WHERE s.genero = :genero"),
    @NamedQuery(name = "Socios.findByCalle", query = "SELECT s FROM Socios s WHERE s.calle = :calle"),
    @NamedQuery(name = "Socios.findByNumero", query = "SELECT s FROM Socios s WHERE s.numero = :numero"),
    @NamedQuery(name = "Socios.findByColonia", query = "SELECT s FROM Socios s WHERE s.colonia = :colonia"),
    @NamedQuery(name = "Socios.findByCp", query = "SELECT s FROM Socios s WHERE s.cp = :cp"),
    @NamedQuery(name = "Socios.findByEdo", query = "SELECT s FROM Socios s WHERE s.edo = :edo"),
    @NamedQuery(name = "Socios.findByDelMpio", query = "SELECT s FROM Socios s WHERE s.delMpio = :delMpio"),
    @NamedQuery(name = "Socios.findByTelSocio", query = "SELECT s FROM Socios s WHERE s.telSocio = :telSocio"),
    @NamedQuery(name = "Socios.findByDStatus", query = "SELECT s FROM Socios s WHERE s.dStatus = :dStatus"),
    @NamedQuery(name = "Socios.findByFechaAlta", query = "SELECT s FROM Socios s WHERE s.fechaAlta = :fechaAlta")})
public class Socios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_socio")
    private Integer idSocio;
    @Basic(optional = false)
    @Column(name = "nom_socio")
    private String nomSocio;
    @Basic(optional = false)
    @Column(name = "ap_socio")
    private String apSocio;
    @Column(name = "am_socio")
    private String amSocio;
    @Column(name = "fen_socio")
    @Temporal(TemporalType.DATE)
    private Date fenSocio;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "cp")
    private String cp;
    @Column(name = "edo")
    private String edo;
    @Column(name = "del_mpio")
    private String delMpio;
    @Basic(optional = false)
    @Column(name = "tel_socio")
    private String telSocio;
    @Basic(optional = false)
    @Column(name = "d_status")
    private String dStatus;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    public Socios() {
    }

    public Socios(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public Socios(Integer idSocio, String nomSocio, String apSocio, String genero, String telSocio, String dStatus, Date fechaAlta) {
        this.idSocio = idSocio;
        this.nomSocio = nomSocio;
        this.apSocio = apSocio;
        this.genero = genero;
        this.telSocio = telSocio;
        this.dStatus = dStatus;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        Integer oldIdSocio = this.idSocio;
        this.idSocio = idSocio;
        changeSupport.firePropertyChange("idSocio", oldIdSocio, idSocio);
    }

    public String getNomSocio() {
        return nomSocio;
    }

    public void setNomSocio(String nomSocio) {
        String oldNomSocio = this.nomSocio;
        this.nomSocio = nomSocio;
        changeSupport.firePropertyChange("nomSocio", oldNomSocio, nomSocio);
    }

    public String getApSocio() {
        return apSocio;
    }

    public void setApSocio(String apSocio) {
        String oldApSocio = this.apSocio;
        this.apSocio = apSocio;
        changeSupport.firePropertyChange("apSocio", oldApSocio, apSocio);
    }

    public String getAmSocio() {
        return amSocio;
    }

    public void setAmSocio(String amSocio) {
        String oldAmSocio = this.amSocio;
        this.amSocio = amSocio;
        changeSupport.firePropertyChange("amSocio", oldAmSocio, amSocio);
    }

    public Date getFenSocio() {
        return fenSocio;
    }

    public void setFenSocio(Date fenSocio) {
        Date oldFenSocio = this.fenSocio;
        this.fenSocio = fenSocio;
        changeSupport.firePropertyChange("fenSocio", oldFenSocio, fenSocio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String oldGenero = this.genero;
        this.genero = genero;
        changeSupport.firePropertyChange("genero", oldGenero, genero);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        String oldCalle = this.calle;
        this.calle = calle;
        changeSupport.firePropertyChange("calle", oldCalle, calle);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        String oldColonia = this.colonia;
        this.colonia = colonia;
        changeSupport.firePropertyChange("colonia", oldColonia, colonia);
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        String oldCp = this.cp;
        this.cp = cp;
        changeSupport.firePropertyChange("cp", oldCp, cp);
    }

    public String getEdo() {
        return edo;
    }

    public void setEdo(String edo) {
        String oldEdo = this.edo;
        this.edo = edo;
        changeSupport.firePropertyChange("edo", oldEdo, edo);
    }

    public String getDelMpio() {
        return delMpio;
    }

    public void setDelMpio(String delMpio) {
        String oldDelMpio = this.delMpio;
        this.delMpio = delMpio;
        changeSupport.firePropertyChange("delMpio", oldDelMpio, delMpio);
    }

    public String getTelSocio() {
        return telSocio;
    }

    public void setTelSocio(String telSocio) {
        String oldTelSocio = this.telSocio;
        this.telSocio = telSocio;
        changeSupport.firePropertyChange("telSocio", oldTelSocio, telSocio);
    }

    public String getDStatus() {
        return dStatus;
    }

    public void setDStatus(String dStatus) {
        String oldDStatus = this.dStatus;
        this.dStatus = dStatus;
        changeSupport.firePropertyChange("DStatus", oldDStatus, dStatus);
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        Date oldFechaAlta = this.fechaAlta;
        this.fechaAlta = fechaAlta;
        changeSupport.firePropertyChange("fechaAlta", oldFechaAlta, fechaAlta);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSocio != null ? idSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socios)) {
            return false;
        }
        Socios other = (Socios) object;
        if ((this.idSocio == null && other.idSocio != null) || (this.idSocio != null && !this.idSocio.equals(other.idSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gym.Socios[ idSocio=" + idSocio + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
