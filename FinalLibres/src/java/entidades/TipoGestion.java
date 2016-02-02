/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diego Cajas
 */
@Entity
@Table(name = "tipo_gestion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGestion.findAll", query = "SELECT t FROM TipoGestion t"),
    @NamedQuery(name = "TipoGestion.findByIdTipogestion", query = "SELECT t FROM TipoGestion t WHERE t.idTipogestion = :idTipogestion"),
    @NamedQuery(name = "TipoGestion.findByNombregestion", query = "SELECT t FROM TipoGestion t WHERE t.nombregestion = :nombregestion"),
    @NamedQuery(name = "TipoGestion.findByRegistroactivogestion", query = "SELECT t FROM TipoGestion t WHERE t.registroactivogestion = :registroactivogestion")})
public class TipoGestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPOGESTION")
    private Integer idTipogestion;
    @Size(max = 300)
    @Column(name = "NOMBREGESTION")
    private String nombregestion;
    @Size(max = 30)
    @Column(name = "REGISTROACTIVOGESTION")
    private String registroactivogestion;
    @OneToMany(mappedBy = "idTipogestion")
    private List<Gestion> gestionList;
    @OneToMany(mappedBy = "idTipogestion")
    private List<Resultado> resultadoList;

    public TipoGestion() {
    }

    public TipoGestion(Integer idTipogestion) {
        this.idTipogestion = idTipogestion;
    }

    public Integer getIdTipogestion() {
        return idTipogestion;
    }

    public void setIdTipogestion(Integer idTipogestion) {
        this.idTipogestion = idTipogestion;
    }

    public String getNombregestion() {
        return nombregestion;
    }

    public void setNombregestion(String nombregestion) {
        this.nombregestion = nombregestion;
    }

    public String getRegistroactivogestion() {
        return registroactivogestion;
    }

    public void setRegistroactivogestion(String registroactivogestion) {
        this.registroactivogestion = registroactivogestion;
    }

    @XmlTransient
    public List<Gestion> getGestionList() {
        return gestionList;
    }

    public void setGestionList(List<Gestion> gestionList) {
        this.gestionList = gestionList;
    }

    @XmlTransient
    public List<Resultado> getResultadoList() {
        return resultadoList;
    }

    public void setResultadoList(List<Resultado> resultadoList) {
        this.resultadoList = resultadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipogestion != null ? idTipogestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGestion)) {
            return false;
        }
        TipoGestion other = (TipoGestion) object;
        if ((this.idTipogestion == null && other.idTipogestion != null) || (this.idTipogestion != null && !this.idTipogestion.equals(other.idTipogestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoGestion[ idTipogestion=" + idTipogestion + " ]";
    }
    
}
