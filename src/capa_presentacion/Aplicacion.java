package capa_presentacion;

import capa_datos.clsConexion;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.UIManager;

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
        /* Interfaz grafica Iniciar Sesion*/
        
        FlatMaterialDesignDarkIJTheme.setup();
        UIManager.put( "Component.focusWidth", 0);
        IniciarSesion is = new IniciarSesion();
        CrearCuenta cuenta = new CrearCuenta();
        is.setVisible(true);
         //elimina los bordes sobresalientes y hace los bordes redondeados 
        
        /* Clases importantes para la interfaz de usuario*/

        
        
        
        
        
        
        
        
        
        
        
        /*
        
        
        
        
        
        clsConexion conexionBD = clsConexion.getInstancia();
        try {
            conexion = conexionBD.getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/

    }

  
}
