/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capa_presentacion;

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
     protected void cambiarColor(JTextComponent name) {
        name.setCaretColor(new Color(52, 73, 94));
    }
     
     protected void StyleButton(JButton button)
    {
    button.putClientProperty( "JButton.buttonType", "roundRect" );
    }
     
     protected void FocusWidht()
     {
         UIManager.put( "Component.focusWidth", 0);
     }
     
    
    
    
}
