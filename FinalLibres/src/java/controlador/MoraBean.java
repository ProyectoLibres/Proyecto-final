/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Mora;
import java.util.Date;
import javax.ejb.EJB;
import servicios.MoraFacade;

/**
 *
 * @author Liz
 */
public class MoraBean {

    private String descripcion;
    private Number NumFactura;
    private Date FechaFacturacion;
    private Date plazo;
    private Number diasEnMora;
    private Float saldoTotalFacturaMora;
    
    private Mora mora;

    @EJB
    MoraFacade moraFacade;
    
    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Number getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(Number NumFactura) {
        this.NumFactura = NumFactura;
    }

    public Date getFechaFacturacion() {
        return FechaFacturacion;
    }

    public void setFechaFacturacion(Date FechaFacturacion) {
        this.FechaFacturacion = FechaFacturacion;
    }

    public Date getplazo() {
        return plazo;
    }

    public void setplazo(Date plazo) {
        this.plazo = plazo;
    }

    public Number getdiasEnMora() {
        return diasEnMora;
    }

    public void setdiasEnMora(Number diasEnMora) {
        this.diasEnMora = diasEnMora;
    }

    public Float getsaldoTotalFacturaMora() {
        return saldoTotalFacturaMora;
    }

    public void setsaldoTotalFacturaMora(Float saldoTotalFacturaMora) {
        this.saldoTotalFacturaMora = saldoTotalFacturaMora;
    }

    
    public MoraBean() {
    }
}
