/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

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
