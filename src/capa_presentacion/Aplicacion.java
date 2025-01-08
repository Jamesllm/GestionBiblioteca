package capa_presentacion;

import capa_datos.clsConexion;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
        // Aplicar cambio de interfaz grafica
         FlatOneDarkIJTheme.setup();
        
        IniciarSesion is = new IniciarSesion();
        is.setVisible(true);
        
        clsConexion conexionBD = clsConexion.getInstancia();

        try {
            conexion = conexionBD.getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    // metodo para ajustar la imagen del login
    public void ajustarImagen(JLabel labelName, String ruta)
    {
        labelName.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)));
    }
    
}