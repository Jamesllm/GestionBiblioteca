/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capa_presentacion;

import capa_datos.Conexion;
import capa_datos.datosUsuarios;
import java.awt.Color;
import javax.swing.JOptionPane;
import utilidades.Customizable;
import utilidades.ImagenController;
import javax.swing.JTextField;

/**
 *
 * @author Alex
 */
public class CrearCuenta extends javax.swing.JFrame {
    Customizable personalizado = new Customizable();


    /**
     * Creates new form IniciarSesion
     */
    public CrearCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        personalizado.cambiarColorCursorText(username);
        personalizado.cambiarColorCursorText(password);
        personalizado.cambiarColorCursorText(email);
        ImagenController.setImageLabel(image, "src/imagenes/lg.png");
        AplicarStyle();
    }
    
    private void AplicarStyle()
    {
        personalizado.StyleButton(btnContinue);
        personalizado.StyleButton(btnRegistrar);
    }
    private static void limpiarTextField (JTextField textField)
    {
        textField.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backround = new javax.swing.JPanel();
        welcome = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelUsername1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        btnContinue = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        notUse = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backround.setBackground(new java.awt.Color(255, 255, 255));

        welcome.setBackground(new java.awt.Color(150, 194, 219));

        Login.setBackground(new java.awt.Color(102, 102, 102));
        Login.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(51, 51, 51));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Create Account");
        Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        username.setBackground(new java.awt.Color(150, 194, 219));
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setText("Ingrese su usuario");
        username.setActionCommand("<Not Set>");
        username.setBorder(null);
        username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username.setInheritsPopupMenu(true);
        username.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameMousePressed(evt);
            }
        });

        password.setBackground(new java.awt.Color(150, 194, 219));
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setText("********");
        password.setBorder(null);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        password.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });

        labelUsername.setForeground(new java.awt.Color(51, 51, 51));
        labelUsername.setText("Email");

        labelPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelPassword.setText("Contraseña");

        labelUsername1.setForeground(new java.awt.Color(51, 51, 51));
        labelUsername1.setText("Usuario");

        email.setBackground(new java.awt.Color(150, 194, 219));
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("example@gmail.com");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailMousePressed(evt);
            }
        });

        btnContinue.setBackground(new java.awt.Color(93, 109, 126));
        btnContinue.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(51, 51, 51));
        btnContinue.setText("Continue");
        btnContinue.setBorderPainted(false);
        btnContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinue.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(132, 185, 215));
        btnRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername1)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(welcomeLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelUsername1)
                .addGap(6, 6, 6)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(labelUsername)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        image.setText("imagen");

        notUse.setBackground(new java.awt.Color(229, 237, 241));

        javax.swing.GroupLayout notUseLayout = new javax.swing.GroupLayout(notUse);
        notUse.setLayout(notUseLayout);
        notUseLayout.setHorizontalGroup(
            notUseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        notUseLayout.setVerticalGroup(
            notUseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backroundLayout = new javax.swing.GroupLayout(backround);
        backround.setLayout(backroundLayout);
        backroundLayout.setHorizontalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(notUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backroundLayout.setVerticalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backroundLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMousePressed
        // TODO add your handling code here:
        if(username.getText().equals("Ingrese su usuario"))
        {
            username.setText("");
            username.setForeground(Color.black);
        }
         if(email.getText().isEmpty())
        {
            email.setText("example@gmail.com");
            email.setForeground(Color.gray);
        }
         if(String.valueOf(password.getPassword()).isEmpty())
         {
             password.setText("********");
             password.setForeground(Color.gray);
         }
        
        
        
    }//GEN-LAST:event_usernameMousePressed

    private void emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMousePressed
        // TODO add your handling code here:
        if(email.getText().equals("example@gmail.com"))
        {
            email.setText("");
            email.setForeground(Color.black);
        }
         if(username.getText().isEmpty())
        {
            username.setText("Ingrese su usuario");
            username.setForeground(Color.gray);
        }
         
         if(String.valueOf(password.getPassword()).isEmpty())
         {
             password.setText("********");
             password.setForeground(Color.gray);
         }
        
    }//GEN-LAST:event_emailMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        // TODO add your handling code here:
        if(String.valueOf(password.getPassword()).equals("********"))
        {
            password.setText("");
            password.setForeground(Color.black);
        }
         if(email.getText().isEmpty())
        {
            email.setText("example@gmail.com");
            email.setForeground(Color.gray);
        }
         else if(username.getText().isEmpty())
         {
             username.setText("Ingrese su usuario");
             username.setForeground(Color.gray);
         }
    }//GEN-LAST:event_passwordMousePressed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
        IniciarSesion btnNuevoInicio = new IniciarSesion();
        btnNuevoInicio.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        datosUsuarios registrar = new datosUsuarios();
        String usernameTF = username.getText();
        String emailTF = email.getText();
        String passwordTF = String.valueOf(password.getPassword());
        System.out.println(usernameTF);
        System.out.println(emailTF);
        System.out.println(passwordTF);
        
        

       
        
        
        
        
     
      
        
       
        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JPanel backround;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JPanel notUse;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables
}
