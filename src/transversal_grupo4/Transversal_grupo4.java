
package transversal_grupo4;

import Data.AlumnoData;
import Data.Conexion;
import Modelos.Alumno;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

public class Transversal_grupo4 {

    public static void main(String[] args) {
       Conexion conec = new Conexion();
       Connection x = null;
       x = conec.getConexion();
       AlumnoData ad = new AlumnoData(conec);
       //Alumno alumno = new Alumno("Duvara", "Claudio", LocalDate.of(2002, 06, 26), 44358778, true);
       //ad.agregarAlumno(alumno);
       Alumno alumnox = ad.buscarAlumno(3);
       System.out.println(alumnox);
    }
    
}
