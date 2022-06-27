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
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.JOptionPane;


public class Colegio {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        
        MateriaData md = new MateriaData(conexion);        
        AlumnoData ad = new AlumnoData(conexion);
        CursadaData cd = new CursadaData(conexion);
        
        Alumno alumno;
        Materia materia;
        
       
        //agregamos alumnos
        /*
        LocalDate fecha=LocalDate.parse("1995-07-20");
        
        alumno= new Alumno("Abdala","Samir",fecha,22222222,true);
        ad.agregarAlumno(alumno);
        
        alumno= new Alumno("Cejas","Luciano",fecha,33333333,true);
        ad.agregarAlumno(alumno);
        
        alumno= new Alumno("Duvara","Claudio",fecha,44444444,true);
        ad.agregarAlumno(alumno);      
             
        alumno= new Alumno("Tello","Andrea Natalia",fecha,29265938,true);
        ad.agregarAlumno(alumno);*/
        
        //modificar alumno
        
        //agregamos materias
        /*
        materia= new Materia("Fundamentos de programacion", 1, true);
        md.agregarMateria(materia);
        
        materia= new Materia("Java", 1, true);
        md.agregarMateria(materia);
        
        materia= new Materia("Web 1", 1, true);
        md.agregarMateria(materia);
        
        materia= new Materia("Laboratorio 1", 1, true);
        md.agregarMateria(materia);
        
        materia= new Materia("Matematicas", 1, true);
        md.agregarMateria(materia);
        
        materia= new Materia("Estructura de datos", 1, true);
        md.agregarMateria(materia);
*/
        
        //modificar materia
        
        //inscribir alumno
               /*
        alumno = ad.obtenerAlumnoXId(5);
        materia = md.obtenerMateriaXId(11);
        Cursada inscribir = new Cursada(alumno, materia, 7);
        cd.guardarInscripcion(inscribir);
*/
        
        //mostrar listado de inscriptos
        /*
        List <Cursada> listadoInscriptos=cd.obtenerInscripciones();
        
        for(Cursada aux : listadoInscriptos){
            System.out.println("Apellido y nombre: "+aux.getAlumno().getApellido()+" "+aux.getAlumno().getNombre());
            System.out.println("Materia: "+aux.getMateria());
            System.out.println("Nota: "+aux.getNota());
        }*/
        
        //modificar nota
       // cd.modificarNota(alumno, materia, 7);
       
       //Borrar inscripcion
       /*
       alumno = ad.obtenerAlumnoXId(4);
       materia = md.obtenerMateriaXId(11);
       boolean borrarInscripcion = cd.borrarInscripcion(alumno, materia);
*/
       //lista de inscripciones por alumno
       /*
       alumno = ad.obtenerAlumnoXId(4);
       
       List <Cursada> listado=cd.inscripcionesAlumno(alumno);
        
        System.out.println("Alumno: "+alumno.getApellido()+" "+alumno.getNombre());
        System.out.println("Inscripto en: ");
        for(Cursada aux : listado){     
            System.out.println("-----------------------------");
            System.out.println("Materia: "+aux.getMateria());
            System.out.println("Nota: "+aux.getNota());
        }
*/
        //lista de materias no inscriptas por alumno
        /*
         alumno = ad.obtenerAlumnoXId(4);
       
       List <Cursada> listadoNoI=cd.noInscripto(alumno);
        
        System.out.println("Alumno: "+alumno.getApellido()+" "+alumno.getNombre());
        System.out.println("No inscripto en: ");
        for(Cursada aux : listadoNoI){     
            System.out.println("-----------------------------");
            System.out.println("Materia: "+aux.getMateria());
        }
*/
        
        //Alumnos inscriptos en materia
        
        materia=md.obtenerMateriaXId(11);
        
       List<Cursada> listaMaterias= cd.inscripcionesEnMateria(materia);
        System.out.println("Materia: "+materia.getNombre()+", año: "+materia.getAnio());
        System.out.println("Alumnos inscriptos:");
        for(Cursada aux: listaMaterias){
            System.out.println("------------------------------");
            System.out.println("Alumno: "+ aux.getIdAlumno());
            System.out.println("Nota: "+aux.getNota());
        }

    }
}
