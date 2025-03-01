/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Alex
 */
public class Customizable {
    private static boolean funcional;

    public boolean isFuncional() {
        return funcional;
    }
    
    
    
    
    public void validarCampos(String nombre, String email, String password) {
    if (nombre == null || nombre.isEmpty() || nombre.equals("Ingrese su usuario")) {
    if (email == null || email.trim().isEmpty() || email.equals("example@gmail.com")) {
    if (password == null || password.trim().isEmpty() || password.equals("********")) {
         JOptionPane.showMessageDialog(null, "No puede dejar un campo vacio");
    }
        }
    funcional = false;
            }   

    // Si todas las condiciones se cumplen
    else{
    funcional = true;
    }
}

    
    
    
    // metodo para la mejora del "TextCursor"
     public void cambiarColorCursorText(JTextComponent name) {
        name.setCaretColor(new Color(52, 73, 94));
    }
     
     public void StyleButton(JButton button)
    {
    button.putClientProperty( "JButton.buttonType", "roundRect" );
    FocusWidth();
    }
     
     public void FocusWidth()
     {
         UIManager.put( "Component.focusWidth", 0);
     }
     
      // Método para cambiar el tema global
    public static void cambiarTema(boolean temaOscuro, JFrame index) {
        try {
            if (temaOscuro) {
                // Configura el tema oscuro
                FlatMaterialDesignDarkIJTheme.setup();
            } else {
                // Configura el tema claro
                UIManager.setLookAndFeel(new FlatLightLaf());
            }

            // Aplicar el cambio de tema globalmente a todos los componentes
            SwingUtilities.updateComponentTreeUI(index); // Actualiza todos los componentes de la instancia 'index'
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
    }
     
     
     
    
    
}
