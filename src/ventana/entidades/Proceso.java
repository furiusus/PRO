/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana.entidades;

/**
 *
 * @author furiusus
 */
public class Proceso {
    private Integer pid;
    private Double tamanioProceso;
    private Double tiempoEjecucion;
    private Double tiempoFaltane;
    private Integer ordenEjecucion;
    private String estado;
    
    public Proceso() {
        
    }
    public Proceso(Proceso proc) {
        this.pid=proc.getPid();
        this.tamanioProceso=proc.getTamanioProceso();
        this.tiempoEjecucion=proc.getTiempoEjecucion();
        this.tiempoFaltane=proc.getTiempoFaltane();
        this.ordenEjecucion=proc.getOrdenEjecucion();
        this.estado=proc.getEstado();
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public Integer getOrdenEjecucion() {
        return ordenEjecucion;
    }

    public void setOrdenEjecucion(Integer ordenEjecucion) {
        this.ordenEjecucion = ordenEjecucion;
    }

    public Double getTiempoFaltane() {
        return tiempoFaltane;
    }

    public void setTiempoFaltane(Double tiempoFaltane) {
        this.tiempoFaltane = tiempoFaltane;
    }


    

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getTamanioProceso() {
        return tamanioProceso;
    }

    public void setTamanioProceso(Double tamanioProceso) {
        this.tamanioProceso = tamanioProceso;
    }

    public Double getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(Double tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }


    
    
}
