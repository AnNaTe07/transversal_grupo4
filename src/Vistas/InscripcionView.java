
package Vistas;

import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Modelos.Alumno;
import Modelos.Inscripcion;
import Modelos.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InscripcionView extends javax.swing.JInternalFrame {
    private CursadaData cursada;
    private AlumnoData ad;
    private MateriaData md;
    private DefaultTableModel modelo;
    private List<Alumno> listaAlumnos;
    
    public InscripcionView(CursadaData inscripcion, AlumnoData alumnoData, MateriaData materias) {
        initComponents();
        modelo = new DefaultTableModel();
        this.cursada=inscripcion;
        ad = alumnoData;
        listaAlumnos  = ad.obtenerAlumnos();
        md = materias;
        llenarComboBox();
        armarTabla();
        limpiarTabla();
        Binscribir.setEnabled(false);
    }
    
    private void llenarComboBox(){
        cbAlumnos.removeAllItems();
        for (Alumno listaAlumno : listaAlumnos) {
            cbAlumnos.addItem(listaAlumno);
        }
    }
    
    private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("ID");
        columnas.add("Materia");
        columnas.add("Año");
        
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        TlistaMaterias.setModel(modelo);
    }
      private void limpiarTabla() {
       int a = TlistaMaterias.getRowCount()-1;
          for (int i = a; i >= 0; i--) {
              modelo.removeRow(i);
          }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbNoInscriptas = new javax.swing.JRadioButton();
        Binscribir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TlistaMaterias = new javax.swing.JTable();
        rbInscriptas = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de inscripciones");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Alumno:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Listado de materias");

        rbNoInscriptas.setText("No inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        Binscribir.setText("Inscribir");
        Binscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinscribirActionPerformed(evt);
            }
        });

        TlistaMaterias = new javax.swing.JTable(){
            public boolean isCellEditable(int RowIndex, int colIndex){
                return false;
            }
        };
        TlistaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        TlistaMaterias.setColumnSelectionAllowed(true);
        TlistaMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TlistaMaterias);

        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(237, 237, 237))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbInscriptas)
                                    .addGap(68, 68, 68)
                                    .addComponent(rbNoInscriptas))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(40, 40, 40)
                                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(Binscribir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoInscriptas)
                    .addComponent(rbInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Binscribir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        limpiarTabla();
        Binscribir.setEnabled(true);
        rbNoInscriptas.setSelected(true);
        rbInscriptas.setSelected(false);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        List<Materia> materiasNoInscriptas = cursada.obtenerMateriasNoCursadas(alumno);
        
        for (Materia aux : materiasNoInscriptas) {
            modelo.addRow(new Object[]{aux.getIdMateria(), aux.getNombre(), aux.getAnio()});
        }
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void BinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinscribirActionPerformed

        Integer idMateria = (Integer) TlistaMaterias.getValueAt(TlistaMaterias.getSelectedRow(), 0);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        Inscripcion inscripcion = new Inscripcion(alumno, md.obtenerMateriaXId(idMateria), 0);
        if(cursada.guardarCursada(inscripcion)){
            JOptionPane.showMessageDialog(this, "Guardado con exito");
            int x = TlistaMaterias.getSelectedRow();
            modelo.removeRow(x);
        }else{
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        
        
    }//GEN-LAST:event_BinscribirActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        Binscribir.setEnabled(false);
        limpiarTabla();
        rbInscriptas.setSelected(true);
        rbNoInscriptas.setSelected(false);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        List<Inscripcion> materiasInscriptas = cursada.cursadasXAlumno(alumno);
        
        for (Inscripcion aux : materiasInscriptas) {
            modelo.addRow(new Object[]{aux.getMateria().getIdMateria(), aux.getMateria().getNombre(), aux.getMateria().getAnio()});
        }
//        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
//        Alumno x = ad.obtenerAlumnoXDNI(alumno.getDni());
//        List<Materia> materiasInscriptas = cursada.cursadasXAlumno(x);
//        
//        for (Materia aux : materiasInscriptas) {
//            modelo.addRow(new Object[]{aux.getIdMateria(), aux.getNombre(), aux.getAnio()});
//        }
        
    
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        if(modelo.getRowCount() > 0){
            limpiarTabla();
            rbInscriptas.setSelected(false);
            rbNoInscriptas.setSelected(false);
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Binscribir;
    private javax.swing.JTable TlistaMaterias;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
