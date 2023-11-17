/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class MForgotPassword {
    public String getEmailFromDatabase(String email)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT email FROM tbl_user WHERE email = ?");
            pst.setString(1, email);
            ResultSet rst = pst.executeQuery();
            
            while(rst.next())
            {
                String db_email = rst.getString("email");
                return db_email;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String getTempPasswordFromDatabase(String temp_password)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT password FROM tbl_user WHERE password = ?");
            pst.setString(1, temp_password);
            ResultSet rst = pst.executeQuery();
            
            while(rst.next())
            {
                String db_temp_password = rst.getString("password");
                return db_temp_password;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    /*public int updatePassword(String temp_password, String email)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/liviru";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("UPDATE user SET password = ? WHERE email = ?");
            pst.setString(1, temp_password);
            pst.setString(2, email);
            int rst = pst.executeUpdate();
            if(rst ==1)
            {
                return rst;
            }
        } catch (Exception e) {
        }
        return 0;
    }*/

    public int updateTempPassword(String temp_password, String email) {
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("UPDATE tbl_user SET password = ? WHERE email = ?");
            pst.setString(1, temp_password);
            pst.setString(2, email);
            int rst = pst.executeUpdate();
            if(rst ==1)
            {
                return rst;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int updateNewPassword(String new_password, String email)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("UPDATE tbl_user SET password = ? WHERE email = ?");
            pst.setString(1, new_password);
            pst.setString(2, email);
            int rst = pst.executeUpdate();
            if(rst ==1)
            {
                return rst;
            }
        } catch (Exception e) {
        }
        return 0;
    }
}
