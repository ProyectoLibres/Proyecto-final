/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Cliente;
import javax.ejb.EJB;
import servicios.ClienteFacade;

/**
 *
 * @author Diego Cajas
 */
public class ClienteBean {

    private String nombre;
    private String apellido;
    private String cedula;
    private String codCliente;
    private String telefono;
    private String telf_ref1;
    private String telf_ref2;
    private String direccion;
    private String registroActivo;
    
    private Cliente cliente;

    @EJB
    ClienteFacade clienteFacade;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelf_ref1() {
        return telf_ref1;
    }

    public void setTelf_ref1(String telf_ref1) {
        this.telf_ref1 = telf_ref1;
    }

    public String getTelf_ref2() {
        return telf_ref2;
    }

    public void setTelf_ref2(String telf_ref2) {
        this.telf_ref2 = telf_ref2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRegistroActivo() {
        return registroActivo;
    }
    

    public void setRegistroActivo(String registroActivo) {
        this.registroActivo = registroActivo;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    
    public ClienteBean() {
    }

    public String guardar() {
        cliente = new Cliente();
        
        cliente.setCedulaRuc(new Integer(cedula));
        cliente.setCodCliente(new Integer(codCliente));
        cliente.setTelefono(new Integer(telefono));
        cliente.setDireccion(direccion);
        cliente.setTelfRef1(new Integer(telf_ref1));
        cliente.setTelfRef2(new Integer(telf_ref2));
        cliente.setRegistroactivocliente(registroActivo);
        cliente.setIdCliente(new Integer(cedula));
        clienteFacade.create(cliente);        
        limpiar();
        return  null;   
    }

    public String limpiar() {
        
        nombre = "";
        apellido = "";
        cedula = "";
        direccion = "";
        telefono = "";
        telf_ref1= "";
        telf_ref2 = "";
        codCliente = "";
        registroActivo = "";
        return null;
    }
    
    public String modificar(){
        
        cliente = clienteFacade.find(new Integer(cedula));
        
        cliente.setCedulaRuc(new Integer(cedula));
        cliente.setCodCliente(new Integer(codCliente));
        cliente.setTelefono(new Integer(telefono));
        cliente.setDireccion(direccion);
        cliente.setTelfRef1(new Integer(telf_ref1));
        cliente.setTelfRef2(new Integer(telf_ref2));
        cliente.setRegistroactivocliente(registroActivo);
        cliente.setIdCliente(new Integer(cedula));
        clienteFacade.edit(cliente);
        
        limpiar();
        
        return null;
        
    }
    public String eliminar(String cedula){
        
        cliente = clienteFacade.find(new Integer(cedula));
        clienteFacade.remove(cliente);
        limpiar();
        return null;
    }
}
