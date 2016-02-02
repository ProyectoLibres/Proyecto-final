/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diego Cajas
 */
@Entity
@Table(name = "gestion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestion.findAll", query = "SELECT g FROM Gestion g"),
    @NamedQuery(name = "Gestion.findByIdGestion", query = "SELECT g FROM Gestion g WHERE g.idGestion = :idGestion"),
    @NamedQuery(name = "Gestion.findByFechagestion", query = "SELECT g FROM Gestion g WHERE g.fechagestion = :fechagestion"),
    @NamedQuery(name = "Gestion.findByObservaciones", query = "SELECT g FROM Gestion g WHERE g.observaciones = :observaciones")})
public class Gestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_GESTION")
    private Integer idGestion;
    @Column(name = "FECHAGESTION")
    @Temporal(TemporalType.DATE)
    private Date fechagestion;
    @Size(max = 500)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumn(name = "ID_RESPUESTA", referencedColumnName = "ID_RESPUESTA")
    @ManyToOne
    private Respuesta idRespuesta;
    @JoinColumn(name = "ID_RESULTADO", referencedColumnName = "ID_RESULTADO")
    @ManyToOne
    private Resultado idResultado;
    @JoinColumn(name = "ID_MORA", referencedColumnName = "ID_MORA")
    @ManyToOne
    private Mora idMora;
    @JoinColumn(name = "ID_TIPOGESTION", referencedColumnName = "ID_TIPOGESTION")
    @ManyToOne
    private TipoGestion idTipogestion;
    @OneToMany(mappedBy = "idGestion")
    private List<Respuesta> respuestaList;

    public Gestion() {
    }

    public Gestion(Integer idGestion) {
        this.idGestion = idGestion;
    }

    public Integer getIdGestion() {
        return idGestion;
    }

    public void setIdGestion(Integer idGestion) {
        this.idGestion = idGestion;
    }

    public Date getFechagestion() {
        return fechagestion;
    }

    public void setFechagestion(Date fechagestion) {
        this.fechagestion = fechagestion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Respuesta getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Respuesta idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Resultado getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Resultado idResultado) {
        this.idResultado = idResultado;
    }

    public Mora getIdMora() {
        return idMora;
    }

    public void setIdMora(Mora idMora) {
        this.idMora = idMora;
    }

    public TipoGestion getIdTipogestion() {
        return idTipogestion;
    }

    public void setIdTipogestion(TipoGestion idTipogestion) {
        this.idTipogestion = idTipogestion;
    }

    @XmlTransient
    public List<Respuesta> getRespuestaList() {
        return respuestaList;
    }

    public void setRespuestaList(List<Respuesta> respuestaList) {
        this.respuestaList = respuestaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGestion != null ? idGestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestion)) {
            return false;
        }
        Gestion other = (Gestion) object;
        if ((this.idGestion == null && other.idGestion != null) || (this.idGestion != null && !this.idGestion.equals(other.idGestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Gestion[ idGestion=" + idGestion + " ]";
    }
    
}
