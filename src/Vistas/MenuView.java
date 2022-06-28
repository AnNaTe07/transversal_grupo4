
package Vistas;

import Modelos.Alumno;
import Modelos.Materia;
import java.util.HashSet;

public class MenuView extends javax.swing.JFrame {

   private HashSet <Alumno> listaAlumnos = new HashSet<>();
   private HashSet <Materia> listaMaterias = new HashSet<>();
   
    public MenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
<<<<<<< Updated upstream
        jMenuItem1 = new javax.swing.JMenuItem();
        jmAlumnos = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
=======
        jMenuItem2 = new javax.swing.JMenuItem();
        jmAlumnos = new javax.swing.JMenu();
        jFormularioAlumno = new javax.swing.JMenuItem();
        jfMaterias = new javax.swing.JMenu();
>>>>>>> Stashed changes
        jMenuItem3 = new javax.swing.JMenuItem();
        jInscripciones = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
<<<<<<< Updated upstream
        jMenu6 = new javax.swing.JMenu();
=======
        jlistaAlumXMateria = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jmAlumnos.setText("Alumnos");
        jmAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
        jMenuItem2.setText("Formulario de Alumnos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmAlumnos.add(jMenuItem2);
=======
        jFormularioAlumno.setText("Formulario de Alumnos");
        jFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioAlumnoActionPerformed(evt);
            }
        });
        jmAlumnos.add(jFormularioAlumno);
>>>>>>> Stashed changes

        jMenuBar1.add(jmAlumnos);

        jfMaterias.setText("Materias");
        jfMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfMateriasActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Formulario de Materias");
        jfMaterias.add(jMenuItem3);

        jMenuBar1.add(jfMaterias);

        jInscripciones.setText("Inscripciones");

<<<<<<< Updated upstream
        jMenuItem4.setText("Formulario de Inscripciones");
        jMenu4.add(jMenuItem4);
=======
        jMenuItem4.setText("jMenuItem4");
        jInscripciones.add(jMenuItem4);
>>>>>>> Stashed changes

        jMenuBar1.add(jInscripciones);

<<<<<<< Updated upstream
        jMenu5.setText("Cargar Notas");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consultas");
        jMenuBar1.add(jMenu6);
=======
        jmNotas.setText("Manipulacion de Notas");

        jMenuItem5.setText("jMenuItem5");
        jmNotas.add(jMenuItem5);

        jMenuBar1.add(jmNotas);

        jlistaAlumXMateria.setText("Consultas");

        jMenuItem6.setText("Listado de Alumnos por Materia");
        jlistaAlumXMateria.add(jMenuItem6);

        jMenuBar1.add(jlistaAlumXMateria);
>>>>>>> Stashed changes

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosActionPerformed
       
        escritorio.removeAll();
        AlumnoView av= new AlumnoView(listaAlumnos);
        av.setVisible(true);
        escritorio.add(av);      
        escritorio.moveToFront(av);
        escritorio.repaint();
        
    }//GEN-LAST:event_jmAlumnosActionPerformed

    private void jfMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfMateriasActionPerformed
       
        escritorio.removeAll();
        MateriaView mv= new MateriaView(listaMaterias);
        mv.setVisible(true);
        escritorio.add(mv);      
        escritorio.moveToFront(mv);
        escritorio.repaint();
        
    }//GEN-LAST:event_jfMateriasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioAlumnoActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jFormularioAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jFormularioAlumno;
    private javax.swing.JMenu jInscripciones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
<<<<<<< Updated upstream
=======
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jfMaterias;
    private javax.swing.JMenu jlistaAlumXMateria;
>>>>>>> Stashed changes
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmNotas;
    // End of variables declaration//GEN-END:variables
}
