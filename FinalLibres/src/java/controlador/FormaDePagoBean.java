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
public class FormaDePagoBean {
    private String nombre;
    private String registroActivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroActivo() {
        return registroActivo;
    }

    public void setRegistroActivo(String registroActivo) {
        this.registroActivo = registroActivo;
    }

    public FormaDePagoBean() {
    }
    
    public String mostrarNombre() {
        return this.nombre;
    }

    public String limpiarA() {

        nombre = "";
        registroActivo = "";
        return null;   
}
     public String modificar(){
         return null;
        
    }
    public String eliminar(){
        return null;
    }
}
