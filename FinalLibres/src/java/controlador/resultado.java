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
public class resultado {

    private String nombre;
    private String registroActivoResultado;
   
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   


    public String getRegistroActivoResultado() {
        return registroActivoResultado;
    }

    public void setRegistroActivo(String registroActivoResultado) {
        this.registroActivoResultado = registroActivoResultado;
    }

    public resultado() {
    }

    public String mostrarNombre() {
        return this.nombre;
    }

    public String limpiar() {

        nombre = "";
      
        return null;
    }
}
