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
