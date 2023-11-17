/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MForgotPassword;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class CForgotPassword {
    private MForgotPassword model;
    public CForgotPassword()
    {
        model = new MForgotPassword();
    }
    public String getEmailFromDatabase(String email)
    {
        String db_email = model.getEmailFromDatabase(email);
        return db_email;
    }
    public String getTempPasswordFromDatabase(String temp_password)
    {
        String db_temp_password = model.getTempPasswordFromDatabase(temp_password);
        return db_temp_password;
    }

    public int updateTempPassword(String temp_password, String email) {
        int result = model.updateTempPassword(temp_password, email);
        if(result == 1)
        {
            JOptionPane.showMessageDialog(null, temp_password);
            String to_email = email;  //livirunavaratna@gmail.com
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
        }
        return result;
    }
    
    public int updateNewPassword(String new_password, String email)
    {
        int result = model.updateNewPassword(new_password, email);
        if(result == 1)
        {
            JOptionPane.showMessageDialog(null, "Password reset successfully");
        }
        return result;
    }
}
