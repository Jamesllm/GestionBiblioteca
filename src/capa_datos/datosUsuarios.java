package capa_datos;

import java.sql.*;
import javax.swing.JOptionPane;
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
    public boolean insertarUsuario(String username, String email, String password) {
        String sqlInsert = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
         
           try {
            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmtUsuario.setString(1, username);
            stmtUsuario.setString(2, email);
            stmtUsuario.setString(3, password);
            stmtUsuario.executeUpdate();
            
            

         
           } catch (SQLException e) {
           
               JOptionPane.showMessageDialog(null, e);
           
             
         
    }
           return false;
    }
        public boolean validarSql (String username, String password){
         String sqlConsulta = " SELECT * FROM user WHERE username = ? AND password = ? ";
         
            try 
            {
                PreparedStatement readTextField = conexion.prepareStatement(sqlConsulta);
                readTextField.setString(1, username);
                readTextField.setString(2, password);
                
            try (ResultSet rs = readTextField.executeQuery()) {
              
                return rs.next();
            }   
            
                
            } 
            catch (SQLException ex) 
            {
                 JOptionPane.showMessageDialog(null, ex);
            }
            return false;
             
         }
        
         
    }


