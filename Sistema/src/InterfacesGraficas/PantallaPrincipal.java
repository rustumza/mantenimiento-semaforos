/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaPrincipal.java
 *
 * Created on 23/09/2010, 08:57:45
 */

package InterfacesGraficas;

/**
 *
 * @author rustu
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    ChuckNorrisControlador chuck;

    /** Creates new form PantallaPrincipal */
    public PantallaPrincipal() {
        initComponents();
        chuck = new ChuckNorrisControlador(this);
           
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtenderReclamo = new javax.swing.JButton();
        botonConsultarAvanceReclamo = new javax.swing.JButton();
        botonConsultarOrdenesPendientes = new javax.swing.JButton();
        botonEjecutarOrdenesTrabajo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAtenderReclamo.setText("CU Atender Reclamo por desperfecto");
        botonAtenderReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtenderReclamoActionPerformed(evt);
            }
        });

        botonConsultarAvanceReclamo.setText("CU Consultar avance de reclamo");
        botonConsultarAvanceReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarAvanceReclamoActionPerformed(evt);
            }
        });

        botonConsultarOrdenesPendientes.setText("CU Consultar ordenes pendientes");
        botonConsultarOrdenesPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarOrdenesPendientesActionPerformed(evt);
            }
        });

        botonEjecutarOrdenesTrabajo.setText("CU Ejecutar ordenes de trabajo");
        botonEjecutarOrdenesTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarOrdenesTrabajoActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonConsultarAvanceReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(botonAtenderReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(botonConsultarOrdenesPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(botonEjecutarOrdenesTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtenderReclamo)
                .addGap(18, 18, 18)
                .addComponent(botonConsultarAvanceReclamo)
                .addGap(18, 18, 18)
                .addComponent(botonConsultarOrdenesPendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEjecutarOrdenesTrabajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtenderReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtenderReclamoActionPerformed

        chuck.iniciarCUAtenderReclamoPorDesperfecto();
       
    }//GEN-LAST:event_botonAtenderReclamoActionPerformed

    private void botonConsultarAvanceReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarAvanceReclamoActionPerformed
        chuck.iniciarCUConsultarAvanceDeReclamo();  
    }//GEN-LAST:event_botonConsultarAvanceReclamoActionPerformed

    private void botonConsultarOrdenesPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarOrdenesPendientesActionPerformed
        chuck.iniciarCUConsultarOrdenesPendientes();
    }//GEN-LAST:event_botonConsultarOrdenesPendientesActionPerformed

    private void botonEjecutarOrdenesTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarOrdenesTrabajoActionPerformed
        chuck.iniciarCUEjecutarOrdenesPendientes();
    }//GEN-LAST:event_botonEjecutarOrdenesTrabajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtenderReclamo;
    private javax.swing.JButton botonConsultarAvanceReclamo;
    private javax.swing.JButton botonConsultarOrdenesPendientes;
    private javax.swing.JButton botonEjecutarOrdenesTrabajo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
