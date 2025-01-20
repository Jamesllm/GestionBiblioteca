package capa_presentacion;

import capa_datos.Conexion;
import utilidades.Customizable;
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
        
         Conexion conexionBD = Conexion.getInstancia();
        try {
            conexion = conexionBD.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
       
        
        
        
        


    }

  
}
