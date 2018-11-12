/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

import java.util.Random;

/**
 *
 * @author furiusus
 */
public class Interrupciones {
    private Integer idInterrupcion;
    private String nombreInterrupcion;

    public Integer getIdInterrupcion() {
        return idInterrupcion;
    }

    public void setIdInterrupcion(Integer idInterrupcion) {
        this.idInterrupcion = idInterrupcion;
    }

    public String getNombreInterrupcion() {
        return nombreInterrupcion;
    }

    public void setNombreInterrupcion(String nombreInterrupcion) {
        this.nombreInterrupcion = nombreInterrupcion;
    }
    
    public void crearProcesoHijo(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
    public void crearInterrupcionIO(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

        
}
