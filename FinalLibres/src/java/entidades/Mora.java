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
@Table(name = "mora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mora.findAll", query = "SELECT m FROM Mora m"),
    @NamedQuery(name = "Mora.findByIdMora", query = "SELECT m FROM Mora m WHERE m.idMora = :idMora"),
    @NamedQuery(name = "Mora.findByDescripcion", query = "SELECT m FROM Mora m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "Mora.findByNumfactura", query = "SELECT m FROM Mora m WHERE m.numfactura = :numfactura"),
    @NamedQuery(name = "Mora.findByFechafacturacion", query = "SELECT m FROM Mora m WHERE m.fechafacturacion = :fechafacturacion"),
    @NamedQuery(name = "Mora.findByPlazo", query = "SELECT m FROM Mora m WHERE m.plazo = :plazo"),
    @NamedQuery(name = "Mora.findByDiasenmora", query = "SELECT m FROM Mora m WHERE m.diasenmora = :diasenmora"),
    @NamedQuery(name = "Mora.findBySaldototalfacturamora", query = "SELECT m FROM Mora m WHERE m.saldototalfacturamora = :saldototalfacturamora")})
public class Mora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MORA")
    private Integer idMora;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NUMFACTURA")
    private Integer numfactura;
    @Column(name = "FECHAFACTURACION")
    @Temporal(TemporalType.DATE)
    private Date fechafacturacion;
    @Column(name = "PLAZO")
    @Temporal(TemporalType.DATE)
    private Date plazo;
    @Column(name = "DIASENMORA")
    private Integer diasenmora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDOTOTALFACTURAMORA")
    private Float saldototalfacturamora;
    @OneToMany(mappedBy = "idMora")
    private List<Gestion> gestionList;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "ID_USUARIOUNIDADNEGOCIO", referencedColumnName = "ID_USUARIOUNIDADNEGOCIO")
    @ManyToOne
    private UsuarioUnidadNegocio idUsuariounidadnegocio;
    @OneToMany(mappedBy = "idMora")
    private List<AbonoDeuda> abonoDeudaList;

    public Mora() {
    }

    public Mora(Integer idMora) {
        this.idMora = idMora;
    }

    public Integer getIdMora() {
        return idMora;
    }

    public void setIdMora(Integer idMora) {
        this.idMora = idMora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(Integer numfactura) {
        this.numfactura = numfactura;
    }

    public Date getFechafacturacion() {
        return fechafacturacion;
    }

    public void setFechafacturacion(Date fechafacturacion) {
        this.fechafacturacion = fechafacturacion;
    }

    public Date getPlazo() {
        return plazo;
    }

    public void setPlazo(Date plazo) {
        this.plazo = plazo;
    }

    public Integer getDiasenmora() {
        return diasenmora;
    }

    public void setDiasenmora(Integer diasenmora) {
        this.diasenmora = diasenmora;
    }

    public Float getSaldototalfacturamora() {
        return saldototalfacturamora;
    }

    public void setSaldototalfacturamora(Float saldototalfacturamora) {
        this.saldototalfacturamora = saldototalfacturamora;
    }

    @XmlTransient
    public List<Gestion> getGestionList() {
        return gestionList;
    }

    public void setGestionList(List<Gestion> gestionList) {
        this.gestionList = gestionList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public UsuarioUnidadNegocio getIdUsuariounidadnegocio() {
        return idUsuariounidadnegocio;
    }

    public void setIdUsuariounidadnegocio(UsuarioUnidadNegocio idUsuariounidadnegocio) {
        this.idUsuariounidadnegocio = idUsuariounidadnegocio;
    }

    @XmlTransient
    public List<AbonoDeuda> getAbonoDeudaList() {
        return abonoDeudaList;
    }

    public void setAbonoDeudaList(List<AbonoDeuda> abonoDeudaList) {
        this.abonoDeudaList = abonoDeudaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMora != null ? idMora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mora)) {
            return false;
        }
        Mora other = (Mora) object;
        if ((this.idMora == null && other.idMora != null) || (this.idMora != null && !this.idMora.equals(other.idMora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Mora[ idMora=" + idMora + " ]";
    }
    
}
