
package Vistas;

import Data.AlumnoData;
import Data.Conexion;
import Data.MateriaData;
import Modelos.Alumno;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class AlumnoView extends javax.swing.JInternalFrame {

 
    private AlumnoData alumno;  
  
    
  
    public AlumnoView(AlumnoData alumno){
        initComponents();
        limpiarCampos();   
        this.alumno=alumno;
        jbModificar.setEnabled(false);
        jbBorrar.setEnabled(false);
    }


 
       private void limpiarCampos() {
        jtidAlumno.setText("");
        jtDni.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jcActivo.setText("");
       // jdFechan.setCalendar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtidAlumno = new javax.swing.JTextField();
        jcActivo = new javax.swing.JCheckBox();
        jdFechan = new com.toedter.calendar.JDateChooser();
        jrLegajo = new javax.swing.JRadioButton();
        jrDni = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel1.setText("Sección alumnos");

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jbBuscar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbBorrar.setText("Baja");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jbGuardar.setText("Alta");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jtDni.setText("jTextField1");
        jtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniFocusLost(evt);
            }
        });

        jtApellido.setText("jTextField2");

        jtNombre.setText("jTextField3");

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel6.setText("Legajo");

        jtidAlumno.setText("jTextField1");

        jcActivo.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jcActivo.setText("Activo");

        Grupo1.add(jrLegajo);
        jrLegajo.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jrLegajo.setText("Busqueda por legajo");

        Grupo1.add(jrDni);
        jrDni.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jrDni.setText("Busqueda por Dni");

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel7.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrDni)
                            .addComponent(jrLegajo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(55, 55, 55)
                                .addComponent(jcActivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(78, 78, 78)
                                .addComponent(jbModificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBorrar)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addComponent(jdFechan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrLegajo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jdFechan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcActivo)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbModificar)
                    .addComponent(jbGuardar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
     
        if(jrLegajo.isSelected()){
        int legajo = Integer.parseInt(jtidAlumno.getText());
        Alumno aux =alumno.obtenerAlumnoXId(legajo);
        if(aux != null){
            jtDni.setText(aux.getDni()+"");
            jtApellido.setText(aux.getApellido());
            jtNombre.setText(aux.getNombre());
            jdFechan.setDate(Date.valueOf(aux.getFechNac()));
            if(aux.isActivo()){
           jcActivo.setSelected(aux.isActivo());
           jbModificar.setEnabled(true);
           jbBorrar.setEnabled(true);
        }else{
                JOptionPane.showMessageDialog(this,"El alumno se encuentra inactivo en la base de datos");
                 jbModificar.setEnabled(true);
                 jbBorrar.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El numero de legajo no se encuentra registrado en la base de datos");
            limpiarCampos();
        }
        }
        
        if(jrDni.isSelected()){
        long dni=Long.parseLong(jtDni.getText());  
        
        Alumno aux2= alumno.obtenerAlumnoXDNI(dni);
        if(aux2 != null){
            jtidAlumno.setText(aux2.getIdAlumno()+"");
            jtApellido.setText(aux2.getApellido());
            jtNombre.setText(aux2.getNombre());
            jdFechan.setDate(Date.valueOf(aux2.getFechNac()));
            if(aux2.isActivo()){
            jcActivo.setSelected(aux2.isActivo());
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
        }else{
                JOptionPane.showMessageDialog(this,"El alumno se encuentra inactivo en la base de datos");
                 jbModificar.setEnabled(true);
                 jbBorrar.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El numero de legajo no se encuentra registrado en la base de datos");
            limpiarCampos();
        }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
                 
       
              int id=Integer.parseInt(jtidAlumno.getText());
              if(alumno.borrarAlumno(id)){
                   JOptionPane.showMessageDialog(this, "Alumno dado de baja"); 
                   limpiarCampos();
                   jbModificar.setEnabled(false);
                   jbBorrar.setEnabled(false);
              }                        
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
         
         long dni=Long.parseLong(jtDni.getText()); 
     
         String nombre=jtNombre.getText();
         String apellido=jtApellido.getText();
         
         
         //Obtenemos la fecja del jcalendar y la pasamos a LocalDate            
     
         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
         String fecha = formato.format(jdFechan.getDate());
         LocalDate fechaN = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

         Boolean activo= jcActivo.isEnabled();
         Alumno a=new Alumno(apellido, nombre, fechaN, dni, activo);
         jtidAlumno.setText(a.getIdAlumno()+"");
         int legajo=Integer.parseInt(jtidAlumno.getText());
            if( alumno.agregarAlumno(a)){    
                jtidAlumno.setText(a.getIdAlumno()+"");
                JOptionPane.showMessageDialog(this,"Alumno "+a.getApellido()+" "+a.getNombre()+" \ndni "+a.getDni()+" \nLegajo:"+legajo+"\n agregado con éxito");
                limpiarCampos();
     }else{
         JOptionPane.showMessageDialog(this,"El alumno ya se encuentra en la base de datos");
     }
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniFocusLost
       
        try{
            long dni=Integer.parseInt(jtDni.getText());
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número");
            jtDni.requestFocus();
        }
        
    }//GEN-LAST:event_jtDniFocusLost

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
         int id=-1;
        try{
            id=Integer.parseInt(jtidAlumno.getText());
        }catch(Exception ex){
        
             JOptionPane.showMessageDialog(this, "Usted debe ingresar un número");
             jtidAlumno.requestFocus();
        }
        String nombre=jtNombre.getText();
        String apellido=jtApellido.getText();
        long dni=Long.parseLong(jtDni.getText());
      
         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
         String fecha = formato.format(jdFechan.getDate());
         LocalDate fechaN = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
         Boolean activo= jcActivo.isSelected();
         Alumno a=new Alumno(apellido, nombre, fechaN, dni, activo);
         if(alumno.modificarAlumno(a)){ 
             String legajo=jtidAlumno.getText();
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nAlumno: "+jtApellido.getText()+" "+jtNombre.getText()+"\nLegajo: "+ legajo+"\nDni: "+dni+"\nFecha de nacimiento: "+fecha);
             limpiarCampos();
             jbModificar.setEnabled(false);
             jbBorrar.setEnabled(false); 
       
        }else{
             JOptionPane.showMessageDialog(this, "Error al intentar modificar la los datos, intentelo nuevamente");
         }       
                
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcActivo;
    private com.toedter.calendar.JDateChooser jdFechan;
    private javax.swing.JRadioButton jrDni;
    private javax.swing.JRadioButton jrLegajo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtidAlumno;
    // End of variables declaration//GEN-END:variables
}
