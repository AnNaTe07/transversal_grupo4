
package Data;

import Modelos.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData(Conexion conexion) {

        con = conexion.getConexion();

    }

    public boolean agregarAlumno(Alumno alumno) {

        boolean insert = true;
        String sql = "INSERT INTO alumno (nombre, apellido, fechNac, dni, activo)  VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechNac()));//localDate a Date
            ps.setLong(4, alumno.getDni());
            ps.setBoolean(5, alumno.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();         
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar agregar al alumno");
                insert = false;
            }

            ps.close();
        } catch (SQLException ex) {
            insert = false;
            if (ex instanceof java.sql.SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Ya existe un alumno registrado con ese número de dni");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + ex);

            }

        }
        return insert;

    }

    public List<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT * FROM alumno WHERE activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            Alumno alumno;
            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setDni(resultSet.getLong("dni"));
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos");
        }

        return alumnos;
    }

    public Alumno obtenerAlumnoXId(int id) {

        Alumno alumno = null;

        try {
            String sql = "SELECT * FROM alumno WHERE idAlumno = ?";// AND activo = 1;"; desactivado para buscar alumno inactivo y poder modificarlo
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setDni(resultSet.getLong("dni"));
                alumno.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos");
        }

        return alumno;
    }

    public Alumno obtenerAlumnoXDNI(long dni) {

        Alumno alumno = null;

        try {
            String sql = "SELECT * FROM alumno WHERE dni = ? AND activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, dni);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setDni(resultSet.getLong("dni"));
                alumno.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos");
        }

        return alumno;
    }

    public boolean borrarAlumno(int id) {

        boolean borrado = false;
        String sql = "UPDATE alumno SET activo = 0 WHERE idAlumno = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {

                borrado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }

        return borrado;
    }

    public boolean modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET nombre = ?, apellido = ?, fechNac = ?, dni = ?, activo = ? WHERE idAlumno = ?";
        boolean modificado = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechNac()));
            ps.setLong(4, alumno.getDni());
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());

            if (ps.executeUpdate() != 0) {

                modificado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }
        return modificado;
    }

    public boolean activarAlumno(int idAlumno) {
        String sql = "UPDATE alumno SET  activo = 1 WHERE idAlumno = ?";
        boolean activado = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idAlumno);

            if (ps.executeUpdate() != 0) {

                activado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar alumno ");
        }
        return activado;

    }

}
