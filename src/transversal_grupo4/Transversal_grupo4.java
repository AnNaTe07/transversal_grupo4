/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transversal_grupo4;

import Data.Conexion;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class Transversal_grupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conexion conec = new Conexion();
       Connection x = conec.getConexion();
    }
    
}
