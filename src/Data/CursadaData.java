
package Data;

import java.sql.Connection;

public class CursadaData {
    private Connection con = null;

    public CursadaData(Conexion conexion) {

        con = conexion.getConexion();

    }
}
