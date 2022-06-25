
package Modelos;

public class Cursada{
    private int id;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Cursada(int id, Alumno alumno, Materia materia, double nota) {
        this.id = id;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno idAlumno) {
        this.alumno = idAlumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia idMateria) {
        this.materia = idMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Cursada{" + "id=" + id + ", idAlumno=" + alumno + ", idMateria=" + materia + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cursada other = (Cursada) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
