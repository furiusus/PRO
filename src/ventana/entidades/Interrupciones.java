/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author furiusus
 */
public class Interrupciones {
    
    
    public void resultado(int prob,Proceso proceso){
        if(prob>0){
            if(prob<8){
                proceso.setEstado("Bloqueado");
                Proceso procesoObj = new Proceso();
                System.out.println("Creacion de hijos");
                int orden = proceso.getListaHijos().size();
                procesoObj.setOrdenEjecucion(orden);
                procesoObj.setPid(proceso.getPid());
                procesoObj.setPidHijo(orden);
                procesoObj.setEstado("Listo");
                double tiempoEjecucion = prob*400;
                procesoObj.setTiempoEjecucion(tiempoEjecucion);
                procesoObj.setTiempoFaltane(tiempoEjecucion);
                procesoObj.setListaHijos(new ArrayList<>());
                proceso.getListaHijos().add(procesoObj);
            }
            if(prob<16 && prob>=8){
                System.out.println("Creacion de interrupcion de I/O");
            }
            if(prob<20 && prob >=16){
                   System.out.println("El proceso se para completamente por error");
            }
        }
    }
}