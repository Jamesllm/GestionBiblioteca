package capa_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Llapapasca Montes Ronal James
 */
public class clsConexion {

    private static clsConexion instancia;
    private Connection conexion;

    // Constructor privado para evitar instancias externas
    private clsConexion() {
    }

    // Método para obtener la instancia de la clase (patrón Singleton)
    public static clsConexion getInstancia() {
        if (instancia == null) {
            instancia = new clsConexion();
        }
        return instancia;
    }

    // Método para obtener la conexión a la base de datos
    public Connection conectar() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            String conexionUrl = "jdbc:sqlite:BibliotecaTest.db";
            try {
                Class.forName("org.sqlite.JDBC");
                conexion = DriverManager.getConnection(conexionUrl);
                System.out.println("Conexion a SQLite establecida.");
                
            } catch (ClassNotFoundException ce) {
                ce.printStackTrace();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return conexion;
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexion a la base de datos cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
