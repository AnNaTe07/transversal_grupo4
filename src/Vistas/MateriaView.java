package Vistas;

import Data.Conexion;
import Data.MateriaData;
import Modelos.Materia;
import java.util.*;
import javax.swing.JOptionPane;

public class MateriaView extends javax.swing.JInternalFrame {

    private MateriaData materia;

    public MateriaView(MateriaData materia) {

        initComponents();
        this.materia=materia;
       // con.getConexion();
       // materiaData = new MateriaData(con);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jtBuscaXId.setEnabled(false);
        jtBuscaXNombre.setEnabled(false);
        jbBuscaMateria.setEnabled(false);
        jbBuscaMateriaXNombre.setEnabled(false);
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
        jtBuscaXNombre = new javax.swing.JTextField();
        jLXid = new javax.swing.JLabel();
        jLXnombre = new javax.swing.JLabel();
        jbBuscaMateriaXNombre = new javax.swing.JButton();

        setClosable(true);

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
        jlBuscMat.setText("Buscar Materia");

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

        jtBuscaXNombre.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLXid.setText("ID");

        jLXnombre.setText("Nombre");

        jbBuscaMateriaXNombre.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbBuscaMateriaXNombre.setText("Buscar");
        jbBuscaMateriaXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaMateriaXNombreActionPerformed(evt);
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
                        .addComponent(jcBuscaOk)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jlBuscMat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jbAniadir)
                                .addGap(75, 75, 75)
                                .addComponent(jbModificar)
                                .addGap(48, 48, 48)
                                .addComponent(jbEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLXnombre)
                                    .addComponent(jLXid))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtBuscaXId, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(jtBuscaXNombre))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscaMateriaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumId)
                        .addGap(35, 35, 35)
                        .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombMat)
                            .addComponent(jlAnio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcAct)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombMat)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcAct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnio)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumId)
                    .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClean))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jcBuscaOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jlBuscMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLXid)
                            .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscaMateriaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtBuscaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLXnombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAniadir)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAnioActionPerformed
        
        
    }//GEN-LAST:event_jcAnioActionPerformed

    private void jtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMateriaActionPerformed


    }//GEN-LAST:event_jtMateriaActionPerformed

    //   MODIFICAR UNA MATERIA
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if (jtNumId.getText() != "" && !"".equals(jtMateria.getText())) {
                         

            String matTxt = jtMateria.getText();

            int anio = Integer.parseInt(jcAnio.getSelectedItem().toString());

            Boolean activo = jcAct.isSelected();

            int id = Integer.parseInt(jtNumId.getText().toString());

            Materia mate = new Materia(id, matTxt, anio, activo);

            if(materia.modificarMateria(mate)){
              
                JOptionPane.showMessageDialog(null, "La materia " + matTxt + " se modifico correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar modificar la materia, vuelva a intentar.");
                              
            }
        } else {

            JOptionPane.showMessageDialog(null, "Complete los campos.");

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcBuscaOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscaOkActionPerformed

        if (jcBuscaOk.isSelected()) { // DESHABILITA EL BOTON AÑADIR Y HABILITA MODDIFICAR O ELIMINAR

            jbEliminar.setEnabled(true);
            jbAniadir.setEnabled(false);
            jbModificar.setEnabled(true);
            jtBuscaXId.setEnabled(true);
            jtBuscaXNombre.setEnabled(true);
            jbBuscaMateria.setEnabled(true);
            jbBuscaMateriaXNombre.setEnabled(true);
            jtBuscaXId.setText("");
            jtBuscaXNombre.setText("");
        } else {
            
            jbEliminar.setEnabled(false);
            jbAniadir.setEnabled(true);
            jbModificar.setEnabled(false);
            jtBuscaXId.setEnabled(false);
            jtBuscaXNombre.setEnabled(false);
            jbBuscaMateria.setEnabled(false);
            jbBuscaMateriaXNombre.setEnabled(false);
            jtBuscaXId.setText("");
            jtBuscaXNombre.setText("");
        }
            

        
    }//GEN-LAST:event_jcBuscaOkActionPerformed

    // AÑADIR UNA MATERIA
    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed

        String matTxt = jtMateria.getText();
        Integer anio = Integer.parseInt((String) jcAnio.getSelectedItem());
        Boolean activo = jcAct.isSelected();

        Materia mate = new Materia(matTxt, anio, activo);
        if (materia.agregarMateria(mate) && !"".equals(jtMateria.getText())) {
            JOptionPane.showMessageDialog(null, "La materia " + mate.getNombre() + " fue agregada exitosamente con el ID: " + mate.getIdMateria());

            //limpia campos
            jtMateria.setText("");
            jcAnio.setSelectedIndex(0);
            jtNumId.setText("");
            jcAct.setSelected(true);
        }else{
            JOptionPane.showMessageDialog(null, "ERROR, revise los campos.");
        }

    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jcActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcActActionPerformed

    //   ELIMINAR UNA MATERIA
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Integer id = Integer.parseInt(jtNumId.getText());

        if (materia.borrarMateria(id)) {
            JOptionPane.showMessageDialog(null, "La materia fue eliminada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La materia no pudo ser eliminada.");

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

        try{

            if (jcBuscaOk.isSelected() && jtBuscaXId.getText() != null) {

                int id = Integer.parseInt(jtBuscaXId.getText());
                Materia mm = materia.obtenerMateriaXId(id);
                if(mm != null){
                    jtMateria.setText(mm.getNombre());
                    jcAnio.setSelectedItem(String.valueOf(mm.getAnio()));
                    jtNumId.setText(mm.getIdMateria() + "");
                    jcAct.setSelected(mm.isActivo());
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la materia con el ID ingresado.");

                }
            } else {

                JOptionPane.showMessageDialog(null, "Debe Ingresar un ID primero y/o tildar el campo para buscar");

            }
        } catch(Exception ex) {
                
            JOptionPane.showMessageDialog(null, "Debe Ingresar un ID valido.");

        }
    }//GEN-LAST:event_jbBuscaMateriaActionPerformed
        // LIMPIA TODOS LOS CAMPOS
    private void jbCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCleanActionPerformed

        //limpia campos
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setSelected(true);
        jcBuscaOk.setSelected(false);
        jtBuscaXId.setText("");
        jbAniadir.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtBuscaXNombre.setText("");
        jtBuscaXId.setEnabled(false);
        jtBuscaXNombre.setEnabled(false);
        jbBuscaMateria.setEnabled(false);
        jbBuscaMateriaXNombre.setEnabled(false);

    }//GEN-LAST:event_jbCleanActionPerformed

    // BUSCA MATERIA POR NOMBRE
    private void jbBuscaMateriaXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaMateriaXNombreActionPerformed


        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");

        if (jcBuscaOk.isSelected()) { // DESHABILITA EL BOTON AÑADIR Y HABILITA MODDIFICAR O ELIMINAR

            jbEliminar.setEnabled(true);
            jbAniadir.setEnabled(false);
            jbModificar.setEnabled(true);

        }

        if (jcBuscaOk.isSelected() && jtBuscaXNombre.getText() != null) {

            String nombre = (jtBuscaXNombre.getText());
            Materia mm = materia.obtenerMateriaXNombre(nombre);
            if(mm != null){
                jtMateria.setText(mm.getNombre());
                jcAnio.setSelectedItem(String.valueOf(mm.getAnio()));
                jtNumId.setText(mm.getIdMateria() + "");
                jcAct.setSelected(mm.isActivo());
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado la materia con el nombre ingresado.");

            }
        } else {

            JOptionPane.showMessageDialog(null, "Debe Ingresar un nombre primero y/o tildar el campo para buscar");

        }

        
    }//GEN-LAST:event_jbBuscaMateriaXNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLXid;
    private javax.swing.JLabel jLXnombre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbBuscaMateria;
    private javax.swing.JButton jbBuscaMateriaXNombre;
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
    private javax.swing.JTextField jtBuscaXNombre;
    private javax.swing.JTextField jtMateria;
    private javax.swing.JTextField jtNumId;
    // End of variables declaration//GEN-END:variables

}
