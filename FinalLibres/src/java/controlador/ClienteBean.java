/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author Diego Cajas
 */
public class ClienteBean {

    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;
    private int telf_ref1;
    private int telf_ref2;
    private String direccion;
    private String registroActivo;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelf_ref1() {
        return telf_ref1;
    }

    public void setTelf_ref1(int telf_ref1) {
        this.telf_ref1 = telf_ref1;
    }

    public int getTelf_ref2() {
        return telf_ref2;
    }

    public void setTelf_ref2(int telf_ref2) {
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

    public ClienteBean() {
    }

    public String mostrarNombre() {
        return this.nombre;
    }

    public String limpiar() {

        nombre = "";
        apellido = "";
        cedula = "";
        return null;
    }
}
