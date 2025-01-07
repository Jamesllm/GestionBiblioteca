package capa_datos;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author Llapapasca Montes
 */
public class datosUsuarios {

    private clsConexion conexionBD;
    private Connection conexion;

    public datosUsuarios() {
        conexionBD = clsConexion.getInstancia();

        try {
            conexion = conexionBD.getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Para el registro de usuario
    public boolean insertarUsuario(Usuario usuario) {
        String sqlPersona = "INSERT INTO user (name, surnames, dni, email, userName, password) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);

            stmtUsuario.setString(1, usuario.getNombre());
            stmtUsuario.setString(2, usuario.getApellidos());
            stmtUsuario.setString(3, usuario.getDni());
            stmtUsuario.setString(4, usuario.getEmail());
            stmtUsuario.setString(5, usuario.getUserName());
            stmtUsuario.setString(5, usuario.getPassword());

            int filasInsertadas = stmtUsuario.executeUpdate();

            return filasInsertadas > 0; // Retorna true si se inserta correctamente
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Si no se inserta, retorna false
    }
}
