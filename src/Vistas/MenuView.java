
package Vistas;


import java.util.logging.Level;
import java.util.logging.Logger;
import Data.AlumnoData;
import Data.Conexion;
import Data.MateriaData;
import Data.CursadaData;

public class MenuView extends javax.swing.JFrame {
    
    private Conexion conexion;
    private AlumnoData alumno;
    private MateriaData materia;
    private CursadaData inscripcion;


   public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        conexion= new Conexion();
        alumno= new AlumnoData(conexion);
        materia= new MateriaData(conexion);
        inscripcion= new CursadaData(conexion);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmFMateria = new javax.swing.JMenu();
        jmMateria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAlumno = new javax.swing.JMenuItem();
        jmI = new javax.swing.JMenu();
        jmInscripcion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jmFMateria.setText("Materias");

        jmMateria.setText("Formulario de materias");
        jmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriaActionPerformed(evt);
            }
        });
        jmFMateria.add(jmMateria);

        jMenuBar1.add(jmFMateria);

        jMenu4.setText("Alumnos");

        jmAlumno.setText("Formulario de alumnos");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(jmAlumno);

        jMenuBar1.add(jMenu4);

        jmI.setText("Inscripciones");
        jmI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIActionPerformed(evt);
            }
        });

        jmInscripcion.setText("Formulario de inscripciones");
        jmInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionActionPerformed(evt);
            }
        });
        jmI.add(jmInscripcion);

        jMenuBar1.add(jmI);

        jMenu6.setText("Notas");

        jMenuItem5.setText("Manipulacion de notas");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Consultas");

        jMenuItem6.setText("Listado de alumnos x materia");
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionActionPerformed

        escritorio.removeAll();                                 
        InscripcionView iv=new InscripcionView(inscripcion);    
        iv.setVisible(true);                        
        escritorio.add(iv);                                  
        escritorio.moveToFront(iv);                          
        escritorio.repaint();
    }//GEN-LAST:event_jmInscripcionActionPerformed

    private void jmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriaActionPerformed
        
        
        escritorio.removeAll();
        escritorio.repaint();
        MateriaView vistaMat = new MateriaView(materia);
        vistaMat.setVisible(true);
        escritorio.add(vistaMat);
        escritorio.moveToFront(vistaMat);
        
    }//GEN-LAST:event_jmMateriaActionPerformed

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
      
        escritorio.removeAll();                                 
        AlumnoView av=new AlumnoView(alumno);    
        av.setVisible(true);                        
        escritorio.add(av);                                  
        escritorio.moveToFront(av);                          
        escritorio.repaint(); 
    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIActionPerformed
       
    }//GEN-LAST:event_jmIActionPerformed

  
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmAlumno;
    private javax.swing.JMenu jmFMateria;
    private javax.swing.JMenu jmI;
    private javax.swing.JMenuItem jmInscripcion;
    private javax.swing.JMenuItem jmMateria;
    // End of variables declaration//GEN-END:variables
}
