/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventana.entidades.AlgoritmoFcfs;
import ventana.entidades.AlgoritmoRR;
import ventana.entidades.AlgoritmoSJB;
import ventana.entidades.Interrupciones;
import ventana.entidades.ListaProceso;
import ventana.entidades.Proceso;

/**
 *
 * @author furiusus
 */
public class InterfazTotal2 extends javax.swing.JFrame {

    private final ListaProceso listaDeProcesosFCFS = new ListaProceso();
    private final ListaProceso listaDeProcesosRR = new ListaProceso();
    private final ListaProceso listaDeProcesosSJB = new ListaProceso();
    private final ListaProceso listaProceso = new ListaProceso();
    AlgoritmoFcfs algoritmoFcfs = new AlgoritmoFcfs();
    AlgoritmoSJB algoritmoSJB = new AlgoritmoSJB();
    AlgoritmoRR algoritmoRR = new AlgoritmoRR();
    private final TablasEnEjecucion tablasEnEjecucion = new TablasEnEjecucion();
    private final TablaProceso tablaProceso = new TablaProceso();
    public Thread principalFCFS=new Thread(new HiloFCFS()); 
    public Thread principalSJB=new Thread(new HiloSJB());
    public Thread principalRR=new Thread(new HiloRR());
    private final Interrupciones interrupciones = new Interrupciones();
    private final Random random = new Random();
    

    
    /**
     * Creates new form InterfazTotal2
     */
    public InterfazTotal2() {
        initComponents();
        listaDeProcesosFCFS.setListaProceso(new ArrayList<>());
        listaDeProcesosSJB.setListaProceso(new ArrayList<>());
        listaDeProcesosRR.setListaProceso(new ArrayList<>());
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputTiempoEjecucion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMAS_OPERATIVOS");

        jLabel1.setText("Sistemas Operativos");

        inputTiempoEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTiempoEjecucionActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo de ejecucion");

        jButton1.setText("Tablas en ejecucionm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("AñadirProceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Lista de procesos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Matar Proceso");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(inputTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTiempoEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTiempoEjecucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTiempoEjecucionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               tablasEnEjecucion.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Se esta guardando el proceso en un objeto y este es guardado a la  vez en una lista
        
        int cantidadProcesos;
        Proceso nuevoProceso = new Proceso();
        nuevoProceso.setEstado("Listo");
        nuevoProceso.setTiempoEjecucion(Double.parseDouble(inputTiempoEjecucion.getText()));
        nuevoProceso.setTamanioProceso(0d);
        nuevoProceso.setTiempoFaltane(Double.parseDouble(inputTiempoEjecucion.getText()));
        nuevoProceso.setListaHijos(new ArrayList<>());
        nuevoProceso.setPidHijo(0);
        
        
        cantidadProcesos = algoritmoFcfs.obtenerCantidad(listaDeProcesosFCFS);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso1 =new Proceso(nuevoProceso);
        algoritmoFcfs.anadirProceso(nuevoProceso1,listaDeProcesosFCFS);
        listaProceso.setListaProceso(listaDeProcesosFCFS.getListaProceso());
        
        
        cantidadProcesos = algoritmoSJB.obtenerCantidad(listaDeProcesosSJB);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso2 =new Proceso(nuevoProceso);
        algoritmoSJB.anadirProceso(nuevoProceso2,listaDeProcesosSJB);
        
        
        cantidadProcesos = algoritmoRR.obtenerCantidad(listaDeProcesosRR);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso3 =new Proceso(nuevoProceso);
        algoritmoRR.anadirProceso(nuevoProceso3,listaDeProcesosRR);
        
        algoritmoSJB.ordenarProceso(listaDeProcesosSJB);
        tablaProceso.actualizar(listaProceso);

        inputTiempoEjecucion.setText(null);
        try{
            boolean a = !principalFCFS.isAlive()||principalFCFS.getState().equals(Thread.State.TERMINATED);
            boolean b = !principalSJB.isAlive()||principalSJB.getState().equals(Thread.State.TERMINATED);
            boolean c = !principalRR.isAlive()||principalRR.getState().equals(Thread.State.TERMINATED);
            boolean d = !principalFCFS.isAlive() && !principalSJB.isAlive() && !principalRR.isAlive();
            boolean e = principalFCFS.getState().equals(Thread.State.TERMINATED) && principalSJB.getState().equals(Thread.State.TERMINATED)&&principalRR.getState().equals(Thread.State.TERMINATED);
            if(a&&b){
               principalFCFS = new Thread(new HiloFCFS());
               System.out.println(principalFCFS.getState()+"-"+principalFCFS.isAlive());
               principalFCFS.start();
               System.out.println(principalFCFS.getState()+"-"+principalFCFS.isAlive());
               
               
               principalSJB = new Thread(new HiloSJB());
               System.out.println(principalSJB.getState()+"-"+principalSJB.isAlive());
               principalSJB.start();
               System.out.println(principalSJB.getState()+"-"+principalSJB.isAlive());
               

            }
            if(c){
                principalRR = new Thread(new HiloRR());
               System.out.println(principalRR.getState()+"-"+principalRR.isAlive());
               principalRR.start();
               System.out.println(principalRR.getState()+"-"+principalRR.isAlive());
            }

        }catch(IllegalThreadStateException e){}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                tablaProceso.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private class HiloFCFS implements Runnable{
        public void run(){
            try{
                while(listaDeProcesosFCFS.getListaProceso().size()>=1){
                    
                        for(Proceso proc : listaDeProcesosFCFS.getListaProceso()){
                            if(proc.getEstado().equals("Listo")){
                                proc.setEstado("Ejecutando");
                                tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
                                 try {
                                     double total =proc.getTiempoFaltane();
                                     for(int i = 0; i<total;i++){
                                         try {
                                             Thread.sleep(500);
                                         } catch (InterruptedException ex) {
                                        Logger.getLogger(InterfazTotal2.class.getName()).log(Level.SEVERE, null, ex);
                                         }
                                         proc.setTiempoFaltane(proc.getTiempoFaltane()-1);
                                        tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
                                        int probabilidad = random.nextInt(100)+1;
                                        System.out.println("Probabilidad: "+probabilidad);
                                        //interrupciones.resultado(probabilidad,proc);
                                     }
                                 }finally{
                                    proc.setEstado("Terminado");
                                    System.out.println("Terminado");
                                    tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);   
                                }
                                break;
                            }
                        }
                }
            }catch(NullPointerException e){}
        }
    }
 
    private class HiloSJB implements Runnable{
        public void run(){
            try{
                
                while(listaDeProcesosSJB.getListaProceso().size()>=1){
                        for(Proceso proc : listaDeProcesosSJB.getListaProceso()){
                            if(proc.getEstado().equals("Listo") ){
                                proc.setEstado("Ejecutando");
                                tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
                                     double total =proc.getTiempoFaltane();
                                     for(int i = 0; i<total;i++){
                                         try {
                                             Thread.sleep(500);
                                         } catch (InterruptedException ex) {
                                        Logger.getLogger(InterfazTotal2.class.getName()).log(Level.SEVERE, null, ex);
                                         }
                                        proc.setTiempoFaltane(proc.getTiempoFaltane()-1);
                                        tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
                                    } 
                                     if(proc.getTiempoFaltane()==0d){
                                        proc.setEstado("Terminado");
                                       System.out.println("Terminado");
                                        
                                     }else{
                                         if(!Objects.equals(proc.getTiempoEjecucion(), proc.getTiempoFaltane())){
                                            proc.setEstado("Bloqueado");
                                           System.out.println(proc.getTiempoFaltane()+"BLOQUEADO");
                                            
                                         }
                                     } 
                                     algoritmoSJB.ordenarProceso(listaDeProcesosSJB);
                                     tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);  
                                break;
                            }
                        }
                    algoritmoSJB.ordenarProceso(listaDeProcesosSJB);
                     
                }
            }catch(NullPointerException e){}
        }
    }
 
    private class HiloRR implements Runnable{
        public void run(){
            try{
                while(listaDeProcesosRR.getListaProceso().size()>=0){
                        for(Proceso proc : listaDeProcesosRR.getListaProceso()){
                            if(proc.getEstado().equals("Listo") ){
                                proc.setEstado("Ejecutando");
                                tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
                                    for(int i = 0; i<3;i++){
                                         if(proc.getTiempoFaltane()!=0){
                                            try {
                                                Thread.sleep(500);
                                            } catch (InterruptedException ex) {
                                                Logger.getLogger(InterfazTotal2.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            proc.setTiempoFaltane(proc.getTiempoFaltane()-1);
                                            tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
                                            
                                        }
                                    } 
                                    if(proc.getTiempoFaltane()==0d){
                                        proc.setEstado("Terminado");
                                        System.out.println("Terminado");                           
                                    }else{
                                        if(!Objects.equals(proc.getTiempoFaltane(), proc.getTiempoEjecucion())){
                                            proc.setEstado("Bloqueado");
                                            System.out.println(proc.getTiempoFaltane()+"BLOQUEADO");
                                        }
                                    }
                                    if(proc.getOrdenEjecucion().equals(listaDeProcesosRR.getListaProceso().size()-1)){
                                        for(Proceso p : listaDeProcesosRR.getListaProceso()){
                                            if(p.getEstado().equals("Bloqueado"))p.setEstado("Listo");
                                            
                                        }
                                    }
                                    break;                                     
                            }
                            if(proc.getOrdenEjecucion().equals(listaDeProcesosRR.getListaProceso().size()-1)){
                                        for(Proceso p : listaDeProcesosRR.getListaProceso()){
                                            if(p.getEstado().equals("Bloqueado"))p.setEstado("Listo");
                                            
                                        }
                                    }
                        }
                }
            }catch(NullPointerException e){}
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTotal2().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputTiempoEjecucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

