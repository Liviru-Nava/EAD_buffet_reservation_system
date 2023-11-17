/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class MUserRegistrationPage {

    public void selectAllUserDetails(JTable table_user_details) {
        try {
            String sql = "SELECT * FROM tbl_user";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_user_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String user_id = rst.getString("user_id");
                String name = rst.getString("name");
                String user_type = rst.getString("user_type");
                String username = rst.getString("username");
                String password = rst.getString("password");
                String email = rst.getString("email");
                Date DOB = rst.getDate("DOB");
                
                //ADD FIELDS TO TABLE
                tableModel.addRow(new Object[]{user_id, name, user_type, username, password, email, DOB});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> getUsertypeFromDatabase() {
        List<String> user_types = new ArrayList<>();
        try 
        {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT DISTINCT user_type FROM tbl_user");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                user_types.add(rst.getString("user_type"));
            }
        } 
        catch (Exception e) 
        {
        }
        return user_types;
    }

    public String getAutoID(String user_type) {
        String userType = user_type;
        PreparedStatement pst = null;
        ResultSet rst = null;

        try 
        {
            if(userType.equals("admin"))
            {
                pst = DBClass.createDBConnection().prepareStatement("SELECT MAX(user_id) FROM tbl_user WHERE user_type = ?");
                pst.setString(1, userType);
                rst = pst.executeQuery();
                if(rst.next())
                {
                    String max_id = rst.getString(1);
                    if(max_id==null)
                    {
                        String id = "MU001";
                        return id;
                    }
                    else
                    {
                        long id = Long.parseLong(max_id.substring(2));
                        id++;
                        return "MU" + String.format("%03d", id);
                    }
                }
                else
                {
                    return "MU001";
                }
            }
            else if(userType.equals("user"))
            {
                pst = DBClass.createDBConnection().prepareStatement("SELECT MAX(user_id) FROM tbl_user WHERE user_type = ?");
                pst.setString(1, userType);
                rst = pst.executeQuery();
                if(rst.next())
                {
                    String max_id = rst.getString(1);
                    if(max_id==null)
                    {
                        String id = "RU001";
                        return id;
                    }
                    else
                    {
                        long id = Long.parseLong(max_id.substring(2));
                        id++;
                        return "RU" + String.format("%03d", id);
                    }
                }
                else
                {
                    return "RU001";
                }
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void insertUserDetails(String userID, String name, String user_type, String username, String password, String email, String date_of_birth) {

        try 
        {
            PreparedStatement pst= DBClass.createDBConnection().prepareStatement("INSERT INTO tbl_user(user_id, name, user_type, username, password, email, DOB) VALUES(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, userID);
            pst.setString(2, name);
            pst.setString(3, user_type);
            pst.setString(4, username);
            pst.setString(5, password);
            pst.setString(6, email);
            pst.setString(7, date_of_birth);
            
            int row_count = pst.executeUpdate();
            
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null, "New user detail recorded!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User record could not be inserted!");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public void updateUserDetails(String user_id, String name, String username, String email, String date_of_birth) {
        try {
            Statement st= DBClass.createDBConnection().createStatement();
            int rows = st.executeUpdate("UPDATE tbl_user SET name = '"+name+"', username = '"+username+"', email = '"+email+"', DOB = '"+date_of_birth+"' WHERE user_id = '"+user_id+"'");
            if(rows > 0)
            {
                JOptionPane.showMessageDialog(null, "Selected user records updated successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selected user record could not be updated!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUserFromDatabase(String user_id) {
        try {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this table?", "Are you sure?", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                Statement st= DBClass.createDBConnection().createStatement();
                int rows = st.executeUpdate("DELETE FROM tbl_user WHERE user_id = '"+user_id+"'");
                if(rows > 0)
                {
                    JOptionPane.showMessageDialog(null, "Selected User deleted successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Selected User could not be deleted!");
                }     
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
