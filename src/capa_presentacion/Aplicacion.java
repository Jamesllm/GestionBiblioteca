package capa_presentacion;

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
        
        IniciarSesion is = new IniciarSesion();
        is.setVisible(true);
    }
    
}
