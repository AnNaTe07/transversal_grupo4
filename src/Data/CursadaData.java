/*
    CursadaData
 */
package data;

<<<<<<< Updated upstream
package Data;

=======
>>>>>>> Stashed changes
import Modelos.Alumno;
import Modelos.Cursada;
import Modelos.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CursadaData {
<<<<<<< Updated upstream
    private Connection con = null;
    private AlumnoData ad;
    private MateriaData md;
    public CursadaData(Conexion conexion) {
        con = conexion.getConexion();
        this.ad = new AlumnoData(conexion);
        this.md = new MateriaData(conexion);
    }
    
    public boolean guardarInscripcion(Cursada inscripcion){
        boolean exito = false;
        try{
            String sql = "INSERT INTO cursada(idAlumno,idMateria,nota) VALUES (?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                inscripcion.setId(rs.getInt("id"));
                exito = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se puedo guardar la inscripcion:");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de sintaxis:" + ex);
        }
        return exito;
    }
    
    public List<Cursada> obtenerInscripciones(){
        ArrayList<Cursada> listaCursada = new ArrayList();
        try{
            String sql = "SELECT * FROM cursada";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Cursada inscripcion;
            while(rs.next()){
                inscripcion = new Cursada();
                inscripcion.setId(rs.getInt("id"));
                
                Alumno a = ad.obtenerAlumnoXId(rs.getInt("idAlumno"));
                inscripcion.setAlumno(a);
                
                Materia m = md.obtenerMateriaXId(rs.getInt("idMateria"));
                inscripcion.setMateria(m);
                
                inscripcion.setNota(rs.getDouble("nota"));
                
                listaCursada.add(inscripcion);
            }
           ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo obtener las inscripciones:" + ex);
        }
        return listaCursada;
    }
    
    public boolean modificarNota(Alumno alumno, Materia materia, double nota){
        boolean exito = false;
        try{
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, alumno.getIdAlumno());
            ps.setInt(3, materia.getIdMateria());
            
            int rs = ps.executeUpdate();
            if(rs != 0){
                exito = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar la nota");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return exito;
    }
    
    
    
=======
    
     private Connection con = null;
    
    private AlumnoData alumData;
    private MateriaData materiaData;

    public CursadaData(Conexion conexion) {
       
            this.con = conexion.getConexion();
            this.alumData=new AlumnoData(conexion);
            this.materiaData=new MateriaData(conexion);
            
        
    }
    
    public boolean  guardarInscripcion(Cursada cursada) {
        boolean insc=false;
        try {
            String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cursada.getAlumno().getIdAlumno());
            ps.setInt(2, cursada.getMateria().getIdMateria());
            ps.setDouble(3, cursada.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cursada.setId(rs.getInt("id"));
               // JOptionPane.showMessageDialog(null, "Se inscribió al alumno correctamente");
               insc=true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar Inscripción");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno ya está inscripto en esta materia " + ex.getMessage());
        }
        return insc;
    }
    
    public List<Cursada> obtenerInscripciones() {
        ArrayList<Cursada> inscripciones = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet resultSet = ps.executeQuery();
            Cursada inscripcion;
            while (resultSet.next()) {
                inscripcion = new Cursada();
                inscripcion.setId(resultSet.getInt("id"));

                Alumno a = alumData.obtenerAlumnoXId(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = materiaData.obtenerMateriaPorID(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(resultSet.getDouble("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }

        return inscripciones;
    }

>>>>>>> Stashed changes
    
}
