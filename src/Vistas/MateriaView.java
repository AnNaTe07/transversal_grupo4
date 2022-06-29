package Vistas;

import Data.Conexion;
import Data.MateriaData;
import Modelos.Materia;
import java.util.*;
import javax.swing.JOptionPane;

public class MateriaView extends javax.swing.JInternalFrame {

    private MateriaData materiaData;
    private Conexion con;

    public MateriaView() {

        initComponents();
        con.getConexion();
        materiaData = new MateriaData(con);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);

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
        jcBuscaOk = new javax.swing.JCheckBox();
        jcAct = new javax.swing.JCheckBox();
        jbClean = new javax.swing.JButton();

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
        jcAnio.setLocation(new java.awt.Point(1, 5));
        jcAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAnioActionPerformed(evt);
            }
        });

        jlBuscMat.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jlBuscMat.setText("Buscar Materia por ID");

        jtBuscaXId.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jcBuscaOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscaOkActionPerformed(evt);
            }
        });

        jcAct.setSelected(true);
        jcAct.setText("Activa");
        jcAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActActionPerformed(evt);
            }
        });

        jbClean.setText("Limpiar campos");
        jbClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumId)
                        .addGap(35, 35, 35)
                        .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(jbAniadir)
                            .addGap(80, 80, 80)
                            .addComponent(jbModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEliminar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jcBuscaOk)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlBuscMat)
                            .addGap(18, 18, 18)
                            .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNombMat)
                                .addComponent(jlAnio))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcAct))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombMat)
                    .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnio)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumId)
                    .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClean))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlBuscMat))
                    .addComponent(jcBuscaOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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

        if (jtNumId.getText() != null) {

            String matTxt = jtMateria.getText();
            int anio = (int) jcAnio.getSelectedItem();
            Boolean activo = jcAct.isEnabled();
            int id = Integer.parseInt(jtNumId.getText());
            Materia mate = new Materia(id, matTxt, anio, activo);
            materiaData.modificarMateria(mate);
        } else {

            JOptionPane.showMessageDialog(null, "Primero debera ingresar un ID y buscar el alumno.");

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcBuscaOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscaOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBuscaOkActionPerformed

    // AÑADIR UNA MATERIA
    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed

        String matTxt = jtMateria.getText();
        int anio = (int) jcAnio.getSelectedItem();
        Boolean activo = jcAct.isEnabled();

        Materia mate = new Materia(matTxt, anio, activo);
        if (materiaData.agregarMateria(mate)) {
            JOptionPane.showMessageDialog(null, "La materia " + mate.getNombre() + " fue agregada exitosamente con el ID: " + mate.getIdMateria());

            //limpia campos
            jtMateria.setText("");
            jcAnio.setSelectedIndex(0);
            jtNumId.setText("");
            jcAct.setEnabled(false);
        }

    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jcActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcActActionPerformed

    //   ELIMINAR UNA MATERIA
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        int id = Integer.parseInt(jtBuscaXId.getText());

        if (materiaData.borrarMateria(id)) {
            JOptionPane.showMessageDialog(null, "La materia fue eliminada exitosamente.");
        }
        //limpia campos
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setSelected(true);
    }//GEN-LAST:event_jbEliminarActionPerformed

    // OBTENER MATERIA POR ID
    private void jbBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaMateriaActionPerformed
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");

        if (jcBuscaOk.isSelected()) { // DESHABILITA EL BOTON AÑADIR

            jbEliminar.setEnabled(true);
            jbAniadir.setEnabled(false);
            jbModificar.setEnabled(true);

        }

        if (jcBuscaOk.isSelected() && jtBuscaXId.getText() != null) {

            int id = Integer.parseInt(jtBuscaXId.getText());
            Materia mm = materiaData.obtenerMateriaXId(id);

            jtMateria.setText(mm.getNombre());
            jcAnio.setSelectedItem(mm.getAnio());
            jtNumId.setText(mm.getIdMateria() + "");
            jcAct.setSelected(mm.isActivo());

        } else {

            JOptionPane.showMessageDialog(null, "Debe Ingresar un ID primero y/o tildar el campo para buscar");

        }
    }//GEN-LAST:event_jbBuscaMateriaActionPerformed

    private void jbCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCleanActionPerformed

        //limpia campos
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setEnabled(true);
        jcBuscaOk.setSelected(false);
        jtBuscaXId.setText("");
        jbAniadir.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);


    }//GEN-LAST:event_jbCleanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbBuscaMateria;
    private javax.swing.JButton jbClean;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcAct;
    private javax.swing.JComboBox<String> jcAnio;
    private javax.swing.JCheckBox jcBuscaOk;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlBuscMat;
    private javax.swing.JLabel jlNombMat;
    private javax.swing.JLabel jlNumId;
    private javax.swing.JTextField jtBuscaXId;
    private javax.swing.JTextField jtMateria;
    private javax.swing.JTextField jtNumId;
    // End of variables declaration//GEN-END:variables

}
