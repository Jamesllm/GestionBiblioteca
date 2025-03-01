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
            String conexionUrl = "jdbc:sqlite:Biblioteca.db";
            try {
                Class.forName("org.sqlite.JDBC");
                conexion = DriverManager.getConnection(conexionUrl);
                System.out.println("Conexion a SQLite establecida.");
                
            } catch (ClassNotFoundException | SQLException ce) {
                System.out.println("Error al cerrar la conexión: " + ce.getMessage());
                
            }
        }
        return conexion;
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}