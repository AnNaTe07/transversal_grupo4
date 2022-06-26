/*
    CursadaData
 */


package Data;


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
    
    //borrar inscripcion
    
    public boolean borrarInscripcion(Alumno alumno, Materia materia){
        boolean borrado = false;
        try{
            String sql = "DELETE FROM cursada WHERE cursada.idAlumno = ? AND cursada.idMateria= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ps.setInt(2, materia.getIdMateria());
            
            int rs = ps.executeUpdate();
            if(rs != 0){
                borrado = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se puede borrar la inscripcion");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return borrado;
    }
    
    //Dado un alumno nos devuelva las materias en las que está inscripto
    
    
    //Dado un alumno nos devuelva las materias en las que NO está inscripto
    
    
    //Dada una materia nos devuelva los alumnos inscriptos en ella.
    
    
   
    
}
