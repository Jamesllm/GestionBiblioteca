package capa_datos;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Llapapasca Montes
 */
public class datosUsuarios {

    private Conexion conexionBD;
    private Connection conexion;

    public datosUsuarios() {
        conexionBD = Conexion.getInstancia();

        try {
            conexion = conexionBD.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Para el registro de usuario
    public boolean insertarUsuario(Usuario usuario) {
        String sqlPersona = "INSERT INTO user (nameLastName, dni, email, userName, password) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);

            stmtUsuario.setString(1, usuario.getNombreApellido());
            stmtUsuario.setString(2, usuario.getDni());
            stmtUsuario.setString(3, usuario.getEmail());
            stmtUsuario.setString(4, usuario.getUserName());
            stmtUsuario.setString(5, usuario.getPassword());

            int filasInsertadas = stmtUsuario.executeUpdate();

            return filasInsertadas > 0; // Retorna true si se inserta correctamente
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Si no se inserta, retorna false
    }
}
