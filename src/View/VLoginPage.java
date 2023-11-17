/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.sql.*;
import Controller.CLoginPage;

/**
 *
 * @author ASUS
 */

public class VLoginPage extends javax.swing.JFrame{
    private CLoginPage controller;
    /**
     * Creates new form VLoginPage
     */
    public VLoginPage() {
        initComponents();
        controller= new CLoginPage();
        txt_username.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkUsernameFromDatabase();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkUsernameFromDatabase();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkUsernameFromDatabase();
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Login = new javax.swing.JPanel();
        panel_Image = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_Login_details = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_forgot_password = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_username_required = new javax.swing.JLabel();
        lbl_password_required = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Image.setBackground(new java.awt.Color(153, 255, 255));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cinnamon-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout panel_ImageLayout = new javax.swing.GroupLayout(panel_Image);
        panel_Image.setLayout(panel_ImageLayout);
        panel_ImageLayout.setHorizontalGroup(
            panel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImageLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel_ImageLayout.setVerticalGroup(
            panel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImageLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Login_details.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome to Hotel Cinnamon Classic Resort");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_password.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));

        lbl_forgot_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_forgot_password.setForeground(new java.awt.Color(0, 0, 0));
        lbl_forgot_password.setText("Forgot password?");
        lbl_forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_forgot_passwordMouseClicked(evt);
            }
        });

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setForeground(new java.awt.Color(0, 0, 0));
        txt_username.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setText("Sign in");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Login here\n");

        lbl_username_required.setForeground(new java.awt.Color(204, 0, 0));

        lbl_password_required.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout panel_Login_detailsLayout = new javax.swing.GroupLayout(panel_Login_details);
        panel_Login_details.setLayout(panel_Login_detailsLayout);
        panel_Login_detailsLayout.setHorizontalGroup(
            panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Login_detailsLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Login_detailsLayout.createSequentialGroup()
                        .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_password)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_username_required, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_password_required, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Login_detailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Login_detailsLayout.createSequentialGroup()
                        .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Login_detailsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_forgot_password)
                                .addGap(33, 33, 33)))
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Login_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(295, 295, 295))))
        );
        panel_Login_detailsLayout.setVerticalGroup(
            panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Login_detailsLayout.createSequentialGroup()
                .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Login_detailsLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(134, 134, 134)
                        .addComponent(lbl_username_required, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(panel_Login_detailsLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(panel_Login_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lbl_password_required, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_forgot_password)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout panel_LoginLayout = new javax.swing.GroupLayout(panel_Login);
        panel_Login.setLayout(panel_LoginLayout);
        panel_LoginLayout.setHorizontalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addComponent(panel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_Login_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel_LoginLayout.setVerticalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_Login_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = String.valueOf(txt_password.getPassword());
        String usertype = controller.validateLogin(username, password);
        if(usertype!=null)
        {
            if(usertype.equals("admin")){
                VDashboardPage dashboardPage = new VDashboardPage(username);
                dashboardPage.setVisible(true);
                setVisible(false);
            }
            else if(usertype.equals("user")){
                VReservationPage reservationPage = new VReservationPage(username);
                reservationPage.setVisible(true);
                setVisible(false);
            }
        }
        else if(username.isBlank() || password.isBlank())
        {
            if(username.isBlank())
            {
                lbl_username_required.setText("**Required!");
                lbl_username_required.setForeground(Color.red);
            }
            if(password.isBlank())
            {
                lbl_password_required.setText("**Required!");
                lbl_username_required.setForeground(Color.red);
            }
        }
        else if(usertype == null)
        {
           JOptionPane.showMessageDialog(null, "Invalid username and password, please try again!");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void lbl_forgot_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgot_passwordMouseClicked
        // TODO add your handling code here:
        VForgotPassword forgotPassword = new VForgotPassword();
        forgotPassword.setVisible(true);
    }//GEN-LAST:event_lbl_forgot_passwordMouseClicked

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased
        // TODO add your handling code here:
        String inputText = txt_username.getText();
        if (isValidInput(inputText)) {
            lbl_username_required.setForeground(Color.green);
            lbl_username_required.setText("Valid character entered");
        } else {
            lbl_username_required.setForeground(Color.red);
            lbl_username_required.setText("Invalid character entered");
        }
    }//GEN-LAST:event_txt_usernameKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLoginPage().setVisible(true);
            }
        });    
    }
    //check if username is in the database
    public void checkUsernameFromDatabase()
    {
        String username = txt_username.getText();
        String existing_username = controller.getUsernameFromDatabase(username);
        
        if(existing_username != null)
        {
            if(username.length() == 0)
            {
                txt_username.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }
            else if(!username.equals(existing_username))
            {
                txt_username.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }
            else
            {
                txt_username.setBorder(BorderFactory.createLineBorder(Color.green, 2));
            }
        }
        else
        {
            txt_username.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_forgot_password;
    private javax.swing.JLabel lbl_password_required;
    private javax.swing.JLabel lbl_username_required;
    private javax.swing.JPanel panel_Image;
    private javax.swing.JPanel panel_Login;
    private javax.swing.JPanel panel_Login_details;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private boolean isValidInput(String inputText) {
        return inputText.matches("[a-zA-Z].*");
    }

}