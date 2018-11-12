/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades.maqueta;

import ventana.entidades.ListaProceso;
import ventana.entidades.Proceso;

/**
 *
 * @author furiusus
 */
public interface Algoritmo {
    public void anadirProceso(Proceso proceso,ListaProceso listaIngresada);
    public void ordenarProceso(ListaProceso listaIngresada);
    public Integer obtenerCantidad(ListaProceso listaIngresada);
    public void Ejecutar(ListaProceso lista);
}
