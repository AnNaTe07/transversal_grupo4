/*
    Main Colegio
 */
import Data.Conexion;
import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Modelos.Alumno;
import Modelos.Cursada;
import Modelos.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo3_LabI
 */
public class Colegio {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        MateriaData md = new MateriaData(conexion);
        
        AlumnoData ad = new AlumnoData(conexion);
        CursadaData cd = new CursadaData(conexion);
        
        Alumno alumno = new Alumno();
        Materia materia = new Materia();
        
        alumno = ad.obtenerAlumnoXId(12);
        materia = md.obtenerMateriaXId(28);
        //Cursada inscripcion = new Cursada(alumno, materia, 7);
        //cd.guardarInscripcion(inscripcion);
        
        cd.modificarNota(alumno, materia, 5);
    }
}
