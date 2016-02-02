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
@Table(name = "forma_de_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaDePago.findAll", query = "SELECT f FROM FormaDePago f"),
    @NamedQuery(name = "FormaDePago.findByIdFormapago", query = "SELECT f FROM FormaDePago f WHERE f.idFormapago = :idFormapago"),
    @NamedQuery(name = "FormaDePago.findByNombreforma", query = "SELECT f FROM FormaDePago f WHERE f.nombreforma = :nombreforma"),
    @NamedQuery(name = "FormaDePago.findByRegistroactivo", query = "SELECT f FROM FormaDePago f WHERE f.registroactivo = :registroactivo")})
public class FormaDePago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FORMAPAGO")
    private Integer idFormapago;
    @Size(max = 1024)
    @Column(name = "NOMBREFORMA")
    private String nombreforma;
    @Size(max = 1024)
    @Column(name = "REGISTROACTIVO")
    private String registroactivo;
    @OneToMany(mappedBy = "idFormapago")
    private List<AbonoDeuda> abonoDeudaList;

    public FormaDePago() {
    }

    public FormaDePago(Integer idFormapago) {
        this.idFormapago = idFormapago;
    }

    public Integer getIdFormapago() {
        return idFormapago;
    }

    public void setIdFormapago(Integer idFormapago) {
        this.idFormapago = idFormapago;
    }

    public String getNombreforma() {
        return nombreforma;
    }

    public void setNombreforma(String nombreforma) {
        this.nombreforma = nombreforma;
    }

    public String getRegistroactivo() {
        return registroactivo;
    }

    public void setRegistroactivo(String registroactivo) {
        this.registroactivo = registroactivo;
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
        hash += (idFormapago != null ? idFormapago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaDePago)) {
            return false;
        }
        FormaDePago other = (FormaDePago) object;
        if ((this.idFormapago == null && other.idFormapago != null) || (this.idFormapago != null && !this.idFormapago.equals(other.idFormapago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.FormaDePago[ idFormapago=" + idFormapago + " ]";
    }
    
}
