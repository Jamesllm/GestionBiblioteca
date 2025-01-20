package capa_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Llapapasca Montes Ronal James
 */
public class Conexion {

    private static Conexion instancia;
    private Connection conexion;

    // Constructor privado para evitar instancias externas
    private Conexion() {
    }

    // Método para obtener la instancia de la clase (patrón Singleton)
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // Método para obtener la conexión a la base de datos
    public Connection conectar() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                        + "database=loginUser;"
                        + "user=sa;"
                        + "password=admin;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
             try {
                conexion = DriverManager.getConnection(conexionUrl);
                System.out.println("Conexion exitosa a la base de datos");
            } catch (SQLException ex) {
                System.out.println("Error en la conexion: " + ex.getMessage());
                throw ex;
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
