package capa_presentacion;

import utilidades.Customizable;
import capa_datos.clsConexion;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
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
        /* Interfaz grafica Iniciar Sesion*/
        Customizable borde = new Customizable();
        
        FlatMaterialDesignDarkIJTheme.setup();
        borde.FocusWidth();
        IniciarSesion is = new IniciarSesion();
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
