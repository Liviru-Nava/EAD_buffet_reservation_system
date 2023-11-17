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
public class DBClass {
    private static Connection conn;
    public static Connection createDBConnection()
    {
        String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
        String dbusername = "root";
        String dbpassword = "";
        
        try 
        {
            conn = DriverManager.getConnection(dblocation, dbusername, dbpassword);
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return conn;
    } 
}
