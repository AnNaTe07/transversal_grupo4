/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author duvar
 */
public class Cursada{
    private int id;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Cursada(int id, Alumno idAlumno, Materia idMateria, double nota) {
        this.id = id;
        this.alumno = idAlumno;
        this.materia = idMateria;
        this.nota = nota;
    }

    public Cursada(Alumno idAlumno, Materia idMateria, double nota) {
        this.alumno = idAlumno;
        this.materia = idMateria;
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

    public Alumno getIdAlumno() {
        return alumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.alumno = idAlumno;
    }

    public Materia getIdMateria() {
        return materia;
    }

    public void setIdMateria(Materia idMateria) {
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
