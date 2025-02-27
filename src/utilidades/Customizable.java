/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Alex
 */
public class Customizable {
    private boolean funcional;

    public boolean isFuncional() {
        return funcional;
    }
    
    
    
    
    public void validarCampos(String nombre, String email, String password) {
    if (nombre == null || nombre.isEmpty() || nombre.equals("Ingrese su usuario")) {
        throw new IllegalArgumentException("El nombre es obligatorio.");
    }

    if (email == null || email.trim().isEmpty() || email.equals("example@gmail.com")) {
        throw new IllegalArgumentException("El email");
    }

    if (password == null || password.trim().isEmpty() || password.equals("********")) {
        throw new IllegalArgumentException("La contraseña");
    }

    // Si todas las condiciones se cumplen
    funcional = true;
}

    
    
    
    // metodo para la mejora del "TextCursor"
     public void cambiarColorCursorText(JTextComponent name) {
        name.setCaretColor(new Color(52, 73, 94));
    }
     
     public void StyleButton(JButton button)
    {
    button.putClientProperty( "JButton.buttonType", "roundRect" );
    }
     
     public void FocusWidth()
     {
         UIManager.put( "Component.focusWidth", 0);
     }
     
     
     
    
    
}
