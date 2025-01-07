package capa_presentacion;

import capa_datos.clsConexion;
import java.sql.SQLException;
import capa_presentacion.admin.Index;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Llapapasca Montes
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aplicar cambio de interfaz grafica
        FlatLightLaf.setup();

        clsConexion conexionBD = clsConexion.getInstancia();

        try {
            conexionBD.getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        Index indexAdmin = new Index();
        indexAdmin.setVisible(true);
        
    }

}
