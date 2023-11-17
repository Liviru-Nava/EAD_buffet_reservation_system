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
public class MLoginPage {
    public String getUsernameFromDatabase(String username)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT username FROM tbl_user WHERE username = ?");
            pst.setString(1, username);
            ResultSet rst = pst.executeQuery();
            
            while(rst.next())
            {
                String db_username = rst.getString("username");
                return db_username;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String validateLogin(String username, String password)
    {
        String user_type = null;
        try {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT user_type FROM tbl_user WHERE username = ? AND password = ?");            
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rst = pst.executeQuery();
            
            if(rst.next())
            {
               user_type = rst.getString("user_type"); 
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user_type;
    }
}
