/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaAtenderReclamoPorDesperfecto.java
 *
 * Created on 16/09/2010, 17:07:22
 */

package InterfacesGraficas;

import DTO.DTOProblemasDelSemaforo;
import DTO.DTOinfoParaCrearDenuncia;
import InterfacesGraficas.ModelosTablas.ModeloTablaSemaforos;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Denunciante;
import Persistencia.Entidades.OperadorImplementacion;
import Persistencia.Entidades.Problema;
import Persistencia.Entidades.Semaforo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;


/**
 *
 * @author diego
 */
public class PantallaAtenderReclamoPorDesperfecto extends javax.swing.JFrame {
    ControladorAtenderReclamoPorDesperfecto controladorARPD;
    int filaSeleccionada = -1;
    DTOinfoParaCrearDenuncia dTOinfoParaCrearDenuncia;
    HashMap<String, DTOProblemasDelSemaforo> hashMapProblemasDelSemaforo;
    Denunciante denunciante;
    private boolean cerrar;
    

    /** Creates new form PantallaAtenderReclamoPorDesperfecto */
    public PantallaAtenderReclamoPorDesperfecto(ControladorAtenderReclamoPorDesperfecto controladorARPD) {
        this.controladorARPD = controladorARPD;

        initComponents();
        dTOinfoParaCrearDenuncia = new DTOinfoParaCrearDenuncia();
        dTOinfoParaCrearDenuncia.setProblemasDelSemaforo(new ArrayList<DTOProblemasDelSemaforo>());
        hashMapProblemasDelSemaforo = new HashMap<String, DTOProblemasDelSemaforo>();
        
        tablaDeSemafor.addMouseListener(new MouseAdapter()
   {
      public void mouseClicked(MouseEvent e) 
      {
         int fila = tablaDeSemafor.rowAtPoint(e.getPoint());
         int columna = tablaDeSemafor.columnAtPoint(e.getPoint());
         if ((fila > -1) && (columna > -1)){
            filaSeleccionada = fila;
            ModeloTablaSemaforos mod = (ModeloTablaSemaforos)tablaDeSemafor.getModel();
            Semaforo sem = (Semaforo) mod.getRow(filaSeleccionada);
            if(hashMapProblemasDelSemaforo.containsValue(sem.getnumeroSerie()))
                problemasDeCadaSemaforo.setModel(new SpinnerListModel((hashMapProblemasDelSemaforo.get(sem.getnumeroSerie())).getListaDeProblemas()));
            else
                problemasDeCadaSemaforo.setModel(new SpinnerListModel());
      
            }
        }
   });

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoInterseccionCalle = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarDNI = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        guardarInfoDenunciante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calle2 = new javax.swing.JTextField();
        calle1 = new javax.swing.JTextField();
        buscarInteseccion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        validarCalles = new javax.swing.JButton();
        comboCalle1 = new javax.swing.JComboBox();
        comboCalle2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeSemafor = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        todosLosProblemas = new javax.swing.JSpinner();
        agregarProblema = new javax.swing.JButton();
        quitarProblema = new javax.swing.JButton();
        problemasDeCadaSemaforo = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        asentarCaso = new javax.swing.JButton();
        cancelarCaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Denunciante"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 184, -1));

        jLabel1.setText("DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buscarDNI.setText("Buscar");
        buscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDNIActionPerformed(evt);
            }
        });
        jPanel1.add(buscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 96, -1));

        nombre.setText("Nombre");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        apellido.setText("Apellido");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setText("Domicilio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 14));
        jPanel1.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, -1));

        jLabel6.setText("E-mail:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        guardarInfoDenunciante.setText("Guardar");
        guardarInfoDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarInfoDenuncianteActionPerformed(evt);
            }
        });
        jPanel1.add(guardarInfoDenunciante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 110, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicación"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("calle 1");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setText("calle 2");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 42, -1));
        jPanel2.add(calle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 150, -1));
        jPanel2.add(calle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, -1));

        buscarInteseccion.setText("Buscar");
        buscarInteseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInteseccionActionPerformed(evt);
            }
        });
        jPanel2.add(buscarInteseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 80, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 420, 20));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 70, -1));

        jLabel10.setText("Altura");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        grupoInterseccionCalle.add(jRadioButton1);
        jRadioButton1.setText("Intersección");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        grupoInterseccionCalle.add(jRadioButton2);
        jRadioButton2.setText("Calle Simple");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        validarCalles.setText("Buscar coincidencia");
        validarCalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarCallesActionPerformed(evt);
            }
        });
        jPanel2.add(validarCalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        comboCalle1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboCalle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 130, -1));

        comboCalle2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboCalle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Semáforos"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDeSemafor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDeSemafor);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 33, -1, 174));

        jLabel12.setText("Problemas");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));
        jPanel3.add(todosLosProblemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 143, 102));

        agregarProblema.setText("Agregar>>");
        agregarProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProblemaActionPerformed(evt);
            }
        });
        jPanel3.add(agregarProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        quitarProblema.setText("<<Quitar");
        quitarProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarProblemaActionPerformed(evt);
            }
        });
        jPanel3.add(quitarProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, -1));
        jPanel3.add(problemasDeCadaSemaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 142, 102));

        jLabel13.setText("Problemas a Cargar");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 14));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 10));

        asentarCaso.setText("Asentar Caso");
        asentarCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asentarCasoActionPerformed(evt);
            }
        });

        cancelarCaso.setText("Cancelar");
        cancelarCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(asentarCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asentarCaso)
                            .addComponent(cancelarCaso))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProblemaActionPerformed
        

        ModeloTablaSemaforos mod = (ModeloTablaSemaforos)tablaDeSemafor.getModel();
        Semaforo sem = (Semaforo) mod.getRow(filaSeleccionada);
        if(hashMapProblemasDelSemaforo.containsValue(sem.getnumeroSerie())){
            hashMapProblemasDelSemaforo.get(sem.getnumeroSerie()).getListaDeProblemas().add((Problema) todosLosProblemas.getValue());
        }
        else{
            DTOProblemasDelSemaforo dtoprobDSem = new DTOProblemasDelSemaforo();
            dtoprobDSem.setSemaforo(sem);
            dtoprobDSem.setListaDeProblemas(new ArrayList<Problema>());
            hashMapProblemasDelSemaforo.put(sem.getnumeroSerie(),dtoprobDSem);
            hashMapProblemasDelSemaforo.get(sem.getnumeroSerie()).getListaDeProblemas().add((Problema) todosLosProblemas.getValue());
        }
        problemasDeCadaSemaforo.setModel(new SpinnerListModel((hashMapProblemasDelSemaforo.get(sem.getnumeroSerie())).getListaDeProblemas()));
}//GEN-LAST:event_agregarProblemaActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void buscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDNIActionPerformed
        denunciante = controladorARPD.buscarDenunciante(dni.getText());
        apellido.setText(denunciante.getPersonaPadron().getapellido());
        nombre.setText(denunciante.getPersonaPadron().getnombre());
        domicilio.setText(denunciante.getdomicilio());
        telefono.setText(denunciante.gettelefonofijo());
        email.setText(denunciante.getemail());

    }//GEN-LAST:event_buscarDNIActionPerformed

    private void validarCallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarCallesActionPerformed

        comboCalle1.setModel(new DefaultComboBoxModel(controladorARPD.buscarCalle(calle1.getText())));
        comboCalle2.setModel(new DefaultComboBoxModel(controladorARPD.buscarCalle(calle2.getText())));


    }//GEN-LAST:event_validarCallesActionPerformed






    private void buscarInteseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInteseccionActionPerformed

        controladorARPD.buscarSemaforo((Calle)comboCalle1.getSelectedItem(), (Calle)comboCalle2.getSelectedItem());

    }//GEN-LAST:event_buscarInteseccionActionPerformed

    private void quitarProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarProblemaActionPerformed
        ModeloTablaSemaforos mod = (ModeloTablaSemaforos)tablaDeSemafor.getModel();
        Semaforo sem = (Semaforo) mod.getRow(filaSeleccionada);
        Problema prob = (Problema) problemasDeCadaSemaforo.getValue();
        DTOProblemasDelSemaforo dtoProbDeSem = hashMapProblemasDelSemaforo.get(sem.getnumeroSerie());
        for(int i=0; i<dtoProbDeSem.getListaDeProblemas().size();i++){
            if(dtoProbDeSem.getListaDeProblemas().get(i).getcodigoProblema()==prob.getcodigoProblema());
                dtoProbDeSem.getListaDeProblemas().remove(i);
        }
        problemasDeCadaSemaforo.setModel(new SpinnerListModel((hashMapProblemasDelSemaforo.get(sem.getnumeroSerie())).getListaDeProblemas()));
    }//GEN-LAST:event_quitarProblemaActionPerformed

    private void asentarCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asentarCasoActionPerformed
        dTOinfoParaCrearDenuncia.setDenunciante(denunciante);
        dTOinfoParaCrearDenuncia.setOperador(new OperadorImplementacion());
        dTOinfoParaCrearDenuncia.getProblemasDelSemaforo().addAll(hashMapProblemasDelSemaforo.values());
        controladorARPD.guardarDenuncia(dTOinfoParaCrearDenuncia);
    }//GEN-LAST:event_asentarCasoActionPerformed

    private void guardarInfoDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarInfoDenuncianteActionPerformed
        denunciante.setdomicilio(domicilio.getText());
        denunciante.setemail(email.getText());
        denunciante.settelefonofijo(telefono.getText());
        controladorARPD.guardarDenunciante(denunciante);
    }//GEN-LAST:event_guardarInfoDenuncianteActionPerformed

    private void cancelarCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCasoActionPerformed
  
       cerrar = true;
       this.dispose();
       //System.exit(0);
    }//GEN-LAST:event_cancelarCasoActionPerformed

    /**
    * @param args the command line arguments
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAtenderReclamoPorDesperfecto().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProblema;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton asentarCaso;
    private javax.swing.JButton buscarDNI;
    private javax.swing.JButton buscarInteseccion;
    private javax.swing.JTextField calle1;
    private javax.swing.JTextField calle2;
    private javax.swing.JButton cancelarCaso;
    private javax.swing.JComboBox comboCalle1;
    private javax.swing.JComboBox comboCalle2;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField email;
    private javax.swing.ButtonGroup grupoInterseccionCalle;
    private javax.swing.JButton guardarInfoDenunciante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel nombre;
    private javax.swing.JSpinner problemasDeCadaSemaforo;
    private javax.swing.JButton quitarProblema;
    private javax.swing.JTable tablaDeSemafor;
    private javax.swing.JTextField telefono;
    private javax.swing.JSpinner todosLosProblemas;
    private javax.swing.JButton validarCalles;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tablaDeSemafor
     */
    public javax.swing.JTable getTablaDeSemafor() {
        return tablaDeSemafor;
    }

    /**
     * @param tablaDeSemafor the tablaDeSemafor to set
     */
    public void setTablaDeSemafor(javax.swing.JTable tablaDeSemafor) {
        this.tablaDeSemafor = tablaDeSemafor;
    }

    /**
     * @return the problemasDeCadaSemaforo
     */
    public javax.swing.JSpinner getProblemasDeCadaSemaforo() {
        return problemasDeCadaSemaforo;
    }

    /**
     * @param problemasDeCadaSemaforo the problemasDeCadaSemaforo to set
     */
    public void setProblemasDeCadaSemaforo(javax.swing.JSpinner problemasDeCadaSemaforo) {
        this.problemasDeCadaSemaforo = problemasDeCadaSemaforo;
    }

    /**
     * @return the todosLosProblemas
     */
    public javax.swing.JSpinner getTodosLosProblemas() {
        return todosLosProblemas;
    }

    /**
     * @param todosLosProblemas the todosLosProblemas to set
     */
    public void setTodosLosProblemas(javax.swing.JSpinner todosLosProblemas) {
        this.todosLosProblemas = todosLosProblemas;
    }

    public boolean getcerrar(){

        return cerrar;

    }
}
