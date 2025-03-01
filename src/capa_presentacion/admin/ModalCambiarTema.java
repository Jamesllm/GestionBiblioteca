package capa_presentacion.admin;


import java.awt.Color;
import javax.swing.SwingUtilities;
import utilidades.Customizable;

/**
 *
 * @author Llapapasca Montes
 */
public class ModalCambiarTema extends javax.swing.JDialog {

    /**
     * Creates new form ModalCambiarTema
     * @param parent
     * @param modal
     */
    public ModalCambiarTema(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Cambiar Tema");
        
       // Actualizar el color del botón basado en el tema activo actual
        actualizarBotonActivo();
    }

    // Método para cambiar al tema oscuro
    public void cambiarTemaOscuro() {
        // Cambia el tema globalmente
        PanelAdmin.isDarkTheme = true;  // Establecer el estado del tema a oscuro
        // Obtener la instancia de Index y cambiar el tema
        PanelAdmin index = (PanelAdmin) SwingUtilities.getWindowAncestor(this);
        Customizable.cambiarTema(true, index);
        actualizarBotonActivo();
    }

    // Método para cambiar al tema claro
    public void cambiarTemaClaro() {
        // Cambia el tema globalmente
        PanelAdmin.isDarkTheme = false;  // Establecer el estado del tema a claro
        // Obtener la instancia de Index y cambiar el tema
        PanelAdmin index = (PanelAdmin) SwingUtilities.getWindowAncestor(this);
        Customizable.cambiarTema(false, index);
        actualizarBotonActivo();
    }

    // Método para actualizar el estado de los botones (poner en verde el botón activo)
    private void actualizarBotonActivo() {
        if (PanelAdmin.isDarkTheme) {
            btnDarkTheme.setBackground(new Color(68,196,181));
            btnLigthTheme.setBackground(null);
        } else {
            btnLigthTheme.setBackground(new Color(68,196,181));
            btnDarkTheme.setBackground(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLigthTheme = new javax.swing.JButton();
        btnDarkTheme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        btnLigthTheme.setText("Tema Claro");
        btnLigthTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigthThemeActionPerformed(evt);
            }
        });
        jPanel1.add(btnLigthTheme);

        btnDarkTheme.setText("Tema Oscuro");
        btnDarkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkThemeActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarkTheme);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un tema a usar en la aplicacion: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigthThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigthThemeActionPerformed
        cambiarTemaClaro();
    }//GEN-LAST:event_btnLigthThemeActionPerformed

    private void btnDarkThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkThemeActionPerformed
        cambiarTemaOscuro();
    }//GEN-LAST:event_btnDarkThemeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarkTheme;
    private javax.swing.JButton btnLigthTheme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
