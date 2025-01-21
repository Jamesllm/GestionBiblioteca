package capa_datos;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Llapapasca Montes
 */
public class datosUsuarios {
    
    private boolean Right;
    private Conexion conexionBD;
    private Connection conexion;

    public boolean isRight() {
        return Right;
    }
    
    public datosUsuarios() {
        conexionBD = Conexion.getInstancia();

        try {
            conexion = conexionBD.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Para el registro de usuario
    public boolean insertarUsuario(String componente) {
        String sqlInsert = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
         
           try {
            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmtUsuario.setString(1, componente);
            stmtUsuario.setString(2, componente);
            stmtUsuario.setString(3, componente);
            stmtUsuario.executeUpdate();
            
            Right = true;
            

         
           } catch (SQLException e) {
           
               JOptionPane.showMessageDialog(null, e);
           
             
         
    }
           return Right = false;
    }
        public boolean validarSql (String componente){
         String sqlConsulta = " SELECT username, password FROM user WHERE username LIKE ? AND password = ? ";
         
            try 
            {
                PreparedStatement readTextField = conexion.prepareStatement(sqlConsulta, PreparedStatement.RETURN_GENERATED_KEYS);
                readTextField.setString(1, componente);
                readTextField.setString(2, componente);
                readTextField.executeQuery();
                Right = true; // retorna verdadero si se logro completar los datos
                
            } 
            catch (SQLException ex) 
            {
                 JOptionPane.showMessageDialog(null, ex);
            }
            return Right = false;
             
         }
         
    }


