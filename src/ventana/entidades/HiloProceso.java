/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

import ventana.TablasEnEjecucion;

/**
 *
 * @author furiusus
 */
public class HiloProceso implements Runnable{
    ListaProceso listaProceso;
    TablasEnEjecucion tabla;
    @Override
    public void run() {
                    try{
                while(listaProceso.getListaProceso().size()>=1){
                for(Proceso proc : listaProceso.getListaProceso()){
                    if(proc.getEstado().equals("Listo")){
                        proc.setEstado("Ejecutando");
                        tabla.actualizarFCFS(listaProceso);
                         try {
                             for(int i = 0; i<proc.getTiempoEjecucion();i++){
                                 Thread.sleep(500);
                                 proc.setTiempoFaltane(proc.getTiempoFaltane()-1);
                                tabla.actualizarFCFS(listaProceso);
                             }
                         } catch (InterruptedException e) {
                         }finally{
                            proc.setEstado("Terminado");
                            System.out.println("Terminado");
                            tabla.actualizarFCFS(listaProceso);
                            break;
                         }
                    }
                }
                }
            }catch(NullPointerException e){}
    }
    
}
