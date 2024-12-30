package capa_presentacion;

import capa_datos.clsConexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Llapapasca Montes
 */
public class Aplicacion {

    private static Connection conexion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aplicar cambio de interfaz grafica


        clsConexion conexionBD = clsConexion.getInstancia();

        try {
            conexion = conexionBD.getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
