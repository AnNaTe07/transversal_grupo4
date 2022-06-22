/*
    Main Colegio
 */
import Data.Conexion;
import Modelos.Alumno;
import Data.AlumnoData;
import Data.MateriaData;
import Modelos.Materia;
import java.util.List;
import javax.swing.JOptionPane;


public class Colegio {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        AlumnoData ad = new AlumnoData(conexion);
        MateriaData md = new MateriaData(conexion);
        
        Materia m1 = new  Materia("ingles", 1, true);
        
        if(md.agregarMateria(m1)){
            JOptionPane.showMessageDialog(null, "Materia Agregado Exitosamente");
        }
        
        if(md.borrarMateria(1)){
            JOptionPane.showMessageDialog(null, "Materia borrada Exitosamente");
        }
        
        if(md.agregarMateria(m1)){
            JOptionPane.showMessageDialog(null, "Materia Agregado Exitosamente");
        }
        
        if(md.agregarMateria(m1)){
            JOptionPane.showMessageDialog(null, "Materia Agregado Exitosamente");
        }
        if(md.agregarMateria(m1)){
            JOptionPane.showMessageDialog(null, "Materia Agregado Exitosamente");
        }
        
        
        for (Materia aux : md.obtenerMaterias()) {
            System.out.println("nombre: "+aux.getNombre());
                System.out.println("id: "+aux.getIdMateria());
            System.out.println("anio: "+aux.getAnio());
        }
        
        
        
        /*Alumno pepe=new Alumno("Leticia","Moreira",LocalDate.of(1973, Month.MARCH, 12),2344553,true);
        
        if(ad.agregarAlumno(pepe)){
        
            JOptionPane.showMessageDialog(null, "Alumno Agregado Exitosamente");
        }
*/
        
//        List<Alumno> lista=ad.obtenerAlumnos();
//        
//        for(Alumno alu:lista){
//        
//            System.out.println("dni "+alu.getDni());
//            System.out.println("apellido "+alu.getApellido());
//            System.out.println("nombre "+alu.getNombre());
//        }
//        System.out.println("-------------Buscamos por id----------------");
//        Alumno aEncontrado=ad.obtenerAlumnoXId(3);
//        if(aEncontrado!=null){
//        System.out.println("Apellido "+aEncontrado.getApellido());
//        }else {
//        
//            System.out.println("Alumno no existe");
//        }
//        
//        System.out.println("-------------Modificamos apellido--------------");
//        //aEncontrado.setApellido("Zarate");
//        
//        //ad.modificarAlumno(aEncontrado);
//        System.out.println("-------------Borrar alumno--------------");
//        //ad.borrarAlumno(3);
//        
    }
}
