/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capa_presentacion;

import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import java.awt.Color;

/**
 *
 * @author Alex
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPrincipal = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        SignIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        loginImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        fondoPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        fondoPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 34)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Welcome!");
        fondoPrincipal.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 370, 50));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setText("contraseña");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        fondoPrincipal.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 300, 50));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailMousePressed(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        fondoPrincipal.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 300, 50));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("ingrese su usuario");
        username.setToolTipText("");
        username.setActionCommand("<Not Set>");
        username.setName(""); // NOI18N
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameMousePressed(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        fondoPrincipal.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 300, 50));
        username.getAccessibleContext().setAccessibleName("");

        SignIn.setBackground(new java.awt.Color(255, 51, 51));
        SignIn.setForeground(new java.awt.Color(0, 0, 0));
        SignIn.setText("Sing In");
        SignIn.setToolTipText("");
        SignIn.setBorder(null);
        SignIn.setBorderPainted(false);
        SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPrincipal.add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 100, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        fondoPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, 50));

        loginImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5364714.jpg"))); // NOI18N
        loginImg.setText("jLabel1");
        fondoPrincipal.add(loginImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 740, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMousePressed
        // TODO add your handling code here:
        username.setText("");
        username.setForeground(Color.black);
        password.setText("contraseña");
        password.setForeground(Color.gray);
        email.setText("email");
        email.setForeground(Color.gray);
        
    }//GEN-LAST:event_usernameMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        // TODO add your handling code here:
        password.setText("");
        password.setForeground(Color.black);
        username.setText("ingrese su usuario");
        username.setForeground(Color.gray);
        email.setText("email");
        email.setForeground(Color.gray);
    }//GEN-LAST:event_passwordMousePressed

    private void emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMousePressed
        // TODO add your handling code here:
        email.setText("");
        email.setForeground(Color.black);
        username.setText("ingrese su usuario");
        username.setForeground(Color.gray);
        password.setText("contraseña");
        password.setForeground(Color.gray);
        
        
    }//GEN-LAST:event_emailMousePressed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if (username.getText().equals("ingrese su usuario")) {
            username.setText("");
            username.setForeground(Color.black);
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if (username.getText().isEmpty()) {
            username.setText("ingrese su usuario");
            username.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
          if (password.getText().equals("contraseña")) {
            password.setText("");
            password.setForeground(Color.black);
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
         if (password.getText().isEmpty()) {
            password.setText("contraseña");
            password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
         if (email.getText().equals("email")) {
            email.setText("");
            email.setForeground(Color.black);
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if (email.getText().isEmpty()) {
            email.setText("email");
            email.setForeground(Color.gray);
        }
    }//GEN-LAST:event_emailFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       FlatMaterialDesignDarkIJTheme.setup();
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignIn;
    private javax.swing.JTextField email;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginImg;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel text;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
