/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

import java.util.ArrayList;
import ventana.entidades.maqueta.Algoritmo;

/**
 *
 * @author furiusus
 */
public class AlgoritmoSJB implements Algoritmo{

    @Override
    public void anadirProceso(Proceso proceso, ListaProceso listaIngresada) {
        try {
            listaIngresada.getListaProceso().add(proceso);
        } catch (NullPointerException e) {
            System.out.println("ERROR||||"+e);
        }
    }

    @Override
    public void ordenarProceso(ListaProceso listaIngresada) {
        for ( Proceso proc1 : listaIngresada.getListaProceso()){
            if(!proc1.getEstado().equals("Terminado")){
            for(Proceso proc2 : listaIngresada.getListaProceso()){
                if(!proc2.getEstado().equals("Terminado")){
                boolean a = !proc1.getEstado().equals("Ejecutando") && !proc2.getEstado().equals("Ejecutando");
                boolean b = proc1.getTiempoEjecucion()<proc2.getTiempoEjecucion();
                if((a && b)){
                    Proceso obj = new Proceso(proc1);
                    proc1.copiarProcesoSO(proc2);
                    proc2.copiarProcesoSO(obj);
                }
                }
            }
            }
        }
    }

    @Override
    public Integer obtenerCantidad(ListaProceso listaIngresada) {
        try {
            return listaIngresada.getListaProceso().size();
        } catch (NullPointerException e) {
            return 0;
        }
    }
        @Override
    public void Ejecutar(ListaProceso lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
