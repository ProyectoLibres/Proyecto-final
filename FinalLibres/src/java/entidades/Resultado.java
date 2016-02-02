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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "resultado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultado.findAll", query = "SELECT r FROM Resultado r"),
    @NamedQuery(name = "Resultado.findByIdResultado", query = "SELECT r FROM Resultado r WHERE r.idResultado = :idResultado"),
    @NamedQuery(name = "Resultado.findByNombreresultado", query = "SELECT r FROM Resultado r WHERE r.nombreresultado = :nombreresultado"),
    @NamedQuery(name = "Resultado.findByRegistroactivoresultado", query = "SELECT r FROM Resultado r WHERE r.registroactivoresultado = :registroactivoresultado")})
public class Resultado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_RESULTADO")
    private Integer idResultado;
    @Size(max = 300)
    @Column(name = "NOMBRERESULTADO")
    private String nombreresultado;
    @Size(max = 30)
    @Column(name = "REGISTROACTIVORESULTADO")
    private String registroactivoresultado;
    @OneToMany(mappedBy = "idResultado")
    private List<Gestion> gestionList;
    @JoinColumn(name = "ID_TIPOGESTION", referencedColumnName = "ID_TIPOGESTION")
    @ManyToOne
    private TipoGestion idTipogestion;

    public Resultado() {
    }

    public Resultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public String getNombreresultado() {
        return nombreresultado;
    }

    public void setNombreresultado(String nombreresultado) {
        this.nombreresultado = nombreresultado;
    }

    public String getRegistroactivoresultado() {
        return registroactivoresultado;
    }

    public void setRegistroactivoresultado(String registroactivoresultado) {
        this.registroactivoresultado = registroactivoresultado;
    }

    @XmlTransient
    public List<Gestion> getGestionList() {
        return gestionList;
    }

    public void setGestionList(List<Gestion> gestionList) {
        this.gestionList = gestionList;
    }

    public TipoGestion getIdTipogestion() {
        return idTipogestion;
    }

    public void setIdTipogestion(TipoGestion idTipogestion) {
        this.idTipogestion = idTipogestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResultado != null ? idResultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultado)) {
            return false;
        }
        Resultado other = (Resultado) object;
        if ((this.idResultado == null && other.idResultado != null) || (this.idResultado != null && !this.idResultado.equals(other.idResultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Resultado[ idResultado=" + idResultado + " ]";
    }
    
}
