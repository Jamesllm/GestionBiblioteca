package utilidades;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Llapapasca Montes
 */
public class ImagenController {

    // Metodo para cargar una imagen en especifico
    public static void setImageLabel(JLabel labelName, String root) {
        setImageLabel(labelName, root, labelName.getWidth(), labelName.getHeight());
    }

    // Metodo para cargar una imagen en especifico y definir su tamaño
    public static void setImageLabel(JLabel labelName, String root, int width, int height) {
        try {
            ImageIcon image = new ImageIcon(root);
            int finalWidth = width > 0 ? width : 210; // Usar el ancho proporcionado o un valor predeterminado
            int finalHeight = height > 0 ? height : 320; // Usar el alto proporcionado o un valor predeterminado

            Icon icon = new ImageIcon(image.getImage().getScaledInstance(finalWidth, finalHeight, Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    // Metodo para cargar el logo de la aplicacion
    public static void cargarLogo(JLabel label) {
        setImageLabel(label, "src/imagenes/logo.png");
    }
}
