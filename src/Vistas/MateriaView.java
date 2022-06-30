package Vistas;

import Data.Conexion;
import Data.MateriaData;
import Modelos.Materia;
import java.util.*;
import javax.swing.JOptionPane;

public class MateriaView extends javax.swing.JInternalFrame {

    private MateriaData materia;
   // private Conexion con;

    public MateriaView(MateriaData materia) {

        initComponents();
        limpiarCampos();  
        this.materia=materia;
       // con.getConexion();
       // materiaData = new MateriaData(con);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);

    }
     private void limpiarCampos() {
       
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setEnabled(true);    
        jtBuscaXId.setText("");
        jbAniadir.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlNombMat = new javax.swing.JLabel();
        jlNumId = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jtMateria = new javax.swing.JTextField();
        jtNumId = new javax.swing.JTextField();
        jbBuscaMateria = new javax.swing.JButton();
        jbAniadir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcAnio = new javax.swing.JComboBox<>();
        jlBuscMat = new javax.swing.JLabel();
        jtBuscaXId = new javax.swing.JTextField();
        jcAct = new javax.swing.JCheckBox();
        jlNombMat1 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();

        setBorder(null);

        jlNombMat.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlNombMat.setText("Nombre de Materia");

        jlNumId.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlNumId.setText("Numero de ID");

        jlAnio.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlAnio.setText("Año Academico");

        jtMateria.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jtMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMateriaActionPerformed(evt);
            }
        });

        jtNumId.setEditable(false);
        jtNumId.setBackground(new java.awt.Color(243, 235, 235));
        jtNumId.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jbBuscaMateria.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbBuscaMateria.setText("Buscar");
        jbBuscaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaMateriaActionPerformed(evt);
            }
        });

        jbAniadir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbAniadir.setText("Añadir");
        jbAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAniadirActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel4.setText("Formulario de Materias");

        jcAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jcAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAnioActionPerformed(evt);
            }
        });

        jlBuscMat.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlBuscMat.setText("Buscar Materia por ID");

        jtBuscaXId.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jcAct.setSelected(true);
        jcAct.setText("Activa");
        jcAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActActionPerformed(evt);
            }
        });

        jlNombMat1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlNombMat1.setText("Estado");

        jbLimpiar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jbAniadir)
                            .addGap(80, 80, 80)
                            .addComponent(jbModificar)
                            .addGap(68, 68, 68)
                            .addComponent(jbEliminar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNumId)
                                .addComponent(jlAnio)
                                .addComponent(jlNombMat)
                                .addComponent(jlNombMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcAct)
                                .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jlBuscMat)
                        .addGap(31, 31, 31)
                        .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumId))
                        .addGap(28, 28, 28)
                        .addComponent(jlNombMat)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNombMat1)
                    .addComponent(jcAct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnio)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBuscMat)
                    .addComponent(jbBuscaMateria)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbAniadir)
                    .addComponent(jbEliminar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAnioActionPerformed

    private void jtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMateriaActionPerformed

    //   MODIFICAR UNA MATERIA
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
            
            String matTxt = jtMateria.getText();
            int anio =  Integer.parseInt((String) jcAnio.getSelectedItem());
            Boolean activo = jcAct.isEnabled();
            int id = Integer.parseInt(jtNumId.getText());
            Materia mate = new Materia(id, matTxt, anio, activo);
            materia.modificarMateria(mate);
            
            JOptionPane.showMessageDialog(null, "Materia modificada con exito");
    }//GEN-LAST:event_jbModificarActionPerformed

    // AÑADIR UNA MATERIA
    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed
        if(!"".equals(jtMateria.getText())){
        String matTxt = jtMateria.getText();
        Integer anio = Integer.parseInt((String) jcAnio.getSelectedItem());
        Boolean activo = jcAct.isEnabled();

        Materia mate = new Materia(matTxt, anio, activo);
        if (materia.agregarMateria(mate)) {
            JOptionPane.showMessageDialog(null, "La materia " + mate.getNombre() + " fue agregada exitosamente con el ID: " + mate.getIdMateria());

            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        }else{
             JOptionPane.showMessageDialog(null, "Ingrese una materia valida");  
        }

    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jcActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcActActionPerformed

    //   ELIMINAR UNA MATERIA
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Integer id = Integer.parseInt(jtBuscaXId.getText());

        if (materia.borrarMateria(id)) {
            JOptionPane.showMessageDialog(null, "La materia fue eliminada exitosamente.");
        }
        limpiarCampos();
    }//GEN-LAST:event_jbEliminarActionPerformed

    // OBTENER MATERIA POR ID
    private void jbBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaMateriaActionPerformed
        
        try{
            int id = Integer.parseInt(jtBuscaXId.getText());
            Materia mm = materia.obtenerMateriaXId(id);

            jtMateria.setText(mm.getNombre());
            jcAnio.setSelectedItem(String.valueOf(mm.getAnio()));
            jtNumId.setText(String.valueOf(mm.getIdMateria()));
            jcAct.setSelected(mm.isActivo());
  
        }catch(NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(null, "Debe Ingresar un ID valido");
        }
        
        
        jbEliminar.setEnabled(true);
        jbModificar.setEnabled(true);
    }//GEN-LAST:event_jbBuscaMateriaActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbBuscaMateria;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcAct;
    private javax.swing.JComboBox<String> jcAnio;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlBuscMat;
    private javax.swing.JLabel jlNombMat;
    private javax.swing.JLabel jlNombMat1;
    private javax.swing.JLabel jlNumId;
    private javax.swing.JTextField jtBuscaXId;
    private javax.swing.JTextField jtMateria;
    private javax.swing.JTextField jtNumId;
    // End of variables declaration//GEN-END:variables

}
