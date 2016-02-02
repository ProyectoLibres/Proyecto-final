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
@Table(name = "usuario_unidad_negocio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioUnidadNegocio.findAll", query = "SELECT u FROM UsuarioUnidadNegocio u"),
    @NamedQuery(name = "UsuarioUnidadNegocio.findByIdUsuariounidadnegocio", query = "SELECT u FROM UsuarioUnidadNegocio u WHERE u.idUsuariounidadnegocio = :idUsuariounidadnegocio"),
    @NamedQuery(name = "UsuarioUnidadNegocio.findByIdUsuario", query = "SELECT u FROM UsuarioUnidadNegocio u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "UsuarioUnidadNegocio.findByIdUnidadnegocio", query = "SELECT u FROM UsuarioUnidadNegocio u WHERE u.idUnidadnegocio = :idUnidadnegocio"),
    @NamedQuery(name = "UsuarioUnidadNegocio.findByActivo", query = "SELECT u FROM UsuarioUnidadNegocio u WHERE u.activo = :activo")})
public class UsuarioUnidadNegocio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIOUNIDADNEGOCIO")
    private Integer idUsuariounidadnegocio;
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Column(name = "ID_UNIDADNEGOCIO")
    private Integer idUnidadnegocio;
    @Size(max = 30)
    @Column(name = "ACTIVO")
    private String activo;
    @OneToMany(mappedBy = "idUsuariounidadnegocio")
    private List<Mora> moraList;

    public UsuarioUnidadNegocio() {
    }

    public UsuarioUnidadNegocio(Integer idUsuariounidadnegocio) {
        this.idUsuariounidadnegocio = idUsuariounidadnegocio;
    }

    public Integer getIdUsuariounidadnegocio() {
        return idUsuariounidadnegocio;
    }

    public void setIdUsuariounidadnegocio(Integer idUsuariounidadnegocio) {
        this.idUsuariounidadnegocio = idUsuariounidadnegocio;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUnidadnegocio() {
        return idUnidadnegocio;
    }

    public void setIdUnidadnegocio(Integer idUnidadnegocio) {
        this.idUnidadnegocio = idUnidadnegocio;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Mora> getMoraList() {
        return moraList;
    }

    public void setMoraList(List<Mora> moraList) {
        this.moraList = moraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuariounidadnegocio != null ? idUsuariounidadnegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioUnidadNegocio)) {
            return false;
        }
        UsuarioUnidadNegocio other = (UsuarioUnidadNegocio) object;
        if ((this.idUsuariounidadnegocio == null && other.idUsuariounidadnegocio != null) || (this.idUsuariounidadnegocio != null && !this.idUsuariounidadnegocio.equals(other.idUsuariounidadnegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.UsuarioUnidadNegocio[ idUsuariounidadnegocio=" + idUsuariounidadnegocio + " ]";
    }
    
}
