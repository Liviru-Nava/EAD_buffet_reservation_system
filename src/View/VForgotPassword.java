/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import javax.swing.event.*;
import java.awt.Color;
import javax.swing.*;
import Controller.CForgotPassword;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author ASUS
 */
public class VForgotPassword extends javax.swing.JFrame {
    private CForgotPassword controller;
    /**
     * Creates new form VForgotPassword
     */
    public VForgotPassword() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controller= new CForgotPassword();
        txt_email.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkEmailFromDatabase();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkEmailFromDatabase();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkEmailFromDatabase();
            }
        });
        txt_temporary_password.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkTempPasswordFromDatabase();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkTempPasswordFromDatabase();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkTempPasswordFromDatabase();
            }
            
        });
        txt_confirm_new_password.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPasswordEntered();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPasswordEntered();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkPasswordEntered();
            }
            
        });
        btn_send_code.setEnabled(false);
        txt_temporary_password.setEnabled(false);
        txt_new_password.setEnabled(false);
        txt_confirm_new_password.setEnabled(false);
        btn_reset_password.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        panel_Forgot_Password = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_temporary_password = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_reset_password = new javax.swing.JButton();
        btn_send_code = new javax.swing.JButton();
        txt_new_password = new javax.swing.JPasswordField();
        txt_confirm_new_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Forgot_Password.setBackground(new java.awt.Color(153, 204, 255));
        panel_Forgot_Password.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hotel Cinnamon Classic Resorts");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Please fill out the below details so we can immediately reset your password for you!"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Temporary Password");

        txt_temporary_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Create New Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter email address");

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Enter New Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Confirm Password");

        btn_reset_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_reset_password.setText("Reset Password");
        btn_reset_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_passwordActionPerformed(evt);
            }
        });

        btn_send_code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_send_code.setText("Generate new password");
        btn_send_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_codeActionPerformed(evt);
            }
        });

        txt_new_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_confirm_new_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_Forgot_PasswordLayout = new javax.swing.GroupLayout(panel_Forgot_Password);
        panel_Forgot_Password.setLayout(panel_Forgot_PasswordLayout);
        panel_Forgot_PasswordLayout.setHorizontalGroup(
            panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btn_send_code))))))
                    .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_temporary_password)
                            .addComponent(btn_reset_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txt_new_password)
                            .addComponent(txt_confirm_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel4)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        panel_Forgot_PasswordLayout.setVerticalGroup(
            panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Forgot_PasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Forgot_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_send_code, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_temporary_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_confirm_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_reset_password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Forgot_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Forgot_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_send_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_codeActionPerformed
        // TODO add your handling code here:
        //string for all characters
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String email = txt_email.getText();
        
        //random string builder
        StringBuilder stringbuilder = new StringBuilder();
        
        //create an object for random
        Random random = new Random();
        
        //length of string
        int length = 5;
        for(int i=0; i<length; i++)
        {
            int index = random.nextInt(characters.length());
            char random_character = characters.charAt(index);
            stringbuilder.append(random_character);
        }
        String temp_password = stringbuilder.toString();
        //JOptionPane.showMessageDialog(rootPane, random_password);
        
        //update existing password in database
        int result = controller.updateTempPassword(temp_password, email);
        /*if(result == 1)
        {
            JOptionPane.showMessageDialog(rootPane, temp_password);
            String to_email = txt_email.getText();  //livirunavaratna@gmail.com
            String from_email = "hotelcinnamon123@gmail.com";
            String from_email_password = "tohd rccg imxw iexj";
            String subject = "Reset password";
            
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.protocols","TLSv1.2");

            
            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
               protected PasswordAuthentication getPasswordAuthentication(){
                   return new PasswordAuthentication(from_email, from_email_password);
               }
            });
            
            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from_email));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));
                message.setSubject(subject);
                message.setText("Your temporary password is " + temp_password);
                Transport.send(message);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
        txt_temporary_password.setEnabled(true);
        txt_new_password.setEnabled(true);
        txt_confirm_new_password.setEnabled(true);
        txt_email.setEditable(false);
    }//GEN-LAST:event_btn_send_codeActionPerformed

    private void btn_reset_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_passwordActionPerformed
        // TODO add your handling code here:
        String new_password = String.valueOf(txt_new_password.getPassword());
        String confirm_password = String.valueOf(txt_confirm_new_password.getPassword());
        String email = txt_email.getText();
        
        if(new_password.equals("") || confirm_password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "New password fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!confirm_password.equals(new_password))
        {
            JOptionPane.showMessageDialog(null, "Please enter confirm password correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int result = controller.updateNewPassword(new_password, email);
        }
        
        
        txt_confirm_new_password.setText("");
        txt_confirm_new_password.setEnabled(false);
        txt_new_password.setText("");
        txt_new_password.setEnabled(false);
        txt_temporary_password.setText("");
        txt_temporary_password.setEnabled(false);
        btn_send_code.setEnabled(false);
        txt_email.setText("");
        btn_reset_password.setEnabled(false);
    }//GEN-LAST:event_btn_reset_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(VForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VForgotPassword().setVisible(true);
            }
        });
    }
    //check if username is in the database
    public void checkEmailFromDatabase()
    {
        String email = txt_email.getText();
        String existing_email = controller.getEmailFromDatabase(email);
        
        if(existing_email != null)
        {
            if(email.length() == 0)
            {
                txt_email.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                btn_send_code.setEnabled(false);
            }
            else
            {
                txt_email.setBorder(BorderFactory.createLineBorder(Color.green, 2));
                btn_send_code.setEnabled(true);
            }
        }
        else
        {
            txt_email.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            btn_send_code.setEnabled(false);
        }
    }
    
    //check if temporary password is in database
    public void checkTempPasswordFromDatabase()
    {
        String temp_password = txt_temporary_password.getText();
        String existing_temp_password = controller.getTempPasswordFromDatabase(temp_password);
        
        if(existing_temp_password != null)
        {
            if(temp_password.length() == 0 || !temp_password.equals(existing_temp_password))
            {
                txt_temporary_password.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }
            else
            {
                txt_temporary_password.setBorder(BorderFactory.createLineBorder(Color.green, 2));
            }
        }
        else
        {
            txt_temporary_password.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset_password;
    private javax.swing.JButton btn_send_code;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_Forgot_Password;
    private javax.swing.JPasswordField txt_confirm_new_password;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_new_password;
    private javax.swing.JTextField txt_temporary_password;
    // End of variables declaration//GEN-END:variables

    public void checkPasswordEntered()
    {
        String confirm_new_password = txt_confirm_new_password.getText();
        if(confirm_new_password.isEmpty())
        {
            btn_reset_password.setEnabled(false);
        }
        else
        {
            btn_reset_password.setEnabled(true);
        }
    }
}
