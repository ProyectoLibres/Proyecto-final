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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByCedulaRuc", query = "SELECT c FROM Cliente c WHERE c.cedulaRuc = :cedulaRuc"),
    @NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Cliente.findByTelefono", query = "SELECT c FROM Cliente c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Cliente.findByTelfRef1", query = "SELECT c FROM Cliente c WHERE c.telfRef1 = :telfRef1"),
    @NamedQuery(name = "Cliente.findByTelfRef2", query = "SELECT c FROM Cliente c WHERE c.telfRef2 = :telfRef2"),
    @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cliente.findByRegistroactivocliente", query = "SELECT c FROM Cliente c WHERE c.registroactivocliente = :registroactivocliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "CEDULA_RUC")
    private Integer cedulaRuc;
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "TELEFONO")
    private Integer telefono;
    @Column(name = "TELF_REF1")
    private Integer telfRef1;
    @Column(name = "TELF_REF2")
    private Integer telfRef2;
    @Size(max = 256)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 1024)
    @Column(name = "REGISTROACTIVOCLIENTE")
    private String registroactivocliente;
    @OneToMany(mappedBy = "idCliente")
    private List<Mora> moraList;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(Integer cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelfRef1() {
        return telfRef1;
    }

    public void setTelfRef1(Integer telfRef1) {
        this.telfRef1 = telfRef1;
    }

    public Integer getTelfRef2() {
        return telfRef2;
    }

    public void setTelfRef2(Integer telfRef2) {
        this.telfRef2 = telfRef2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRegistroactivocliente() {
        return registroactivocliente;
    }

    public void setRegistroactivocliente(String registroactivocliente) {
        this.registroactivocliente = registroactivocliente;
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
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
