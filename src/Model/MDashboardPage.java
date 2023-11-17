/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class MDashboardPage {
    public int getReservationToday()
    {
        int count=0;
        try {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT COUNT(reservation_id) FROM tbl_reservation WHERE DATE(reservation_made_time) = CURDATE()");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt("COUNT(reservation_id)");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int getNumberOfGuestsToday() {
        int count = 0;
        try {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT SUM(num_of_guests) FROM tbl_reservation WHERE DATE(date) = CURDATE()");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt("SUM(num_of_guests)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int getTotalRevenueToday() {
        int count = 0;
        try {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT SUM(total_fee) FROM tbl_reservation WHERE DATE(reservation_made_time) = CURDATE()");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt("SUM(total_fee)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public void selectAllBuffetDetails(JTable table_buffet_details) {
        try {
            String sql = "SELECT * FROM tbl_buffet";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_buffet_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String buffet_name = rst.getString("buffet_name");
                String buffet_description = rst.getString("buffet_description");
                int price_per_head = rst.getInt("price_per_head");
                String time_slot = rst.getString("time_slot");
                
                //ADD FIELDS TO TABLE
                tableModel.addRow(new Object[]{buffet_name, buffet_description, price_per_head, time_slot});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }  

    public void addNewBuffet(String buffet_name, String buffet_description, int price_per_head, StringBuilder new_time_slot) {
        try 
        {
            Statement st= DBClass.createDBConnection().createStatement();
            int row_count = st.executeUpdate("INSERT INTO tbl_buffet VALUES('"+buffet_name+"', '"+buffet_description+"', "+price_per_head+", '"+new_time_slot+"')");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null, "New buffet record added!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Buffet record could not be added!");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "This record already exists", "error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateBuffet(String buffet_name, String buffet_description, int price_per_head, StringBuilder new_time_slot) {
        try {
            Statement st= DBClass.createDBConnection().createStatement();
            int rows = st.executeUpdate("UPDATE tbl_buffet SET buffet_name = '"+buffet_name+"', buffet_description = '"+buffet_description+"', price_per_head = "+price_per_head+", time_slot = '"+new_time_slot+"' WHERE buffet_name = '"+buffet_name+"'");
            if(rows > 0)
            {
                JOptionPane.showMessageDialog(null, "Selected Buffet updated successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selected Buffet could not be updated!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteBuffet(String buffet_name) {
        try {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this table?", "Are you sure?", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                Statement st= DBClass.createDBConnection().createStatement();
                int rows = st.executeUpdate("DELETE FROM tbl_buffet WHERE buffet_name = '"+buffet_name+"'");
                if(rows > 0)
                {
                    JOptionPane.showMessageDialog(null, "Selected Buffet deleted successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Selected Buffet could not be deleted!");
                }     
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectAllTableDetails(JTable table_Table_details) {
        try {
            String sql = "SELECT * FROM tbl_table";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_Table_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String table_id = rst.getString("table_id");
                String table_capacity = rst.getString("table_capacity");

                
                //ADD FIELDS TO TABLE
                tableModel.addRow(new Object[]{table_id, table_capacity});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String autoID() {
        PreparedStatement pst = null;
        ResultSet rst = null;
        
        try 
        {
            pst = DBClass.createDBConnection().prepareStatement("SELECT MAX(table_id) FROM tbl_table");
            rst = pst.executeQuery();
            if(rst.next())
            {
                String max_id = rst.getString(1);
                String prefix;
                int index_of_dash = max_id.indexOf("-");
                if(index_of_dash != -1)
                {
                    prefix = max_id.substring(0, index_of_dash);
                    if(prefix==null)
                    {
                        String id = "T01";
                        return id;
                    }
                    else
                    {
                        long id = Long.parseLong(prefix.substring(1));
                        id++;
                        return "T" + String.format("%02d", id);
                    }
                }  
            }
            else
            {
                return "T01";
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<String> getTableCapacity() {
        List<String> table_capacity = new ArrayList<>();
        try 
        {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT DISTINCT table_capacity FROM tbl_table");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                table_capacity.add(rst.getString("table_capacity"));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return table_capacity;
    }

    public void addNewTable(StringBuilder new_table_id, String capacity) {
        try 
        {
            Statement st= DBClass.createDBConnection().createStatement();
            int row_count = st.executeUpdate("INSERT INTO tbl_table VALUES('"+new_table_id+"', '"+capacity+"')");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null, "New table record added!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Table record could not be added!");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "This record already exists", "error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateTableCapacity(String front_text, String capacity, String table_id) {
        try {
            Statement st= DBClass.createDBConnection().createStatement();
            StringBuilder new_table_id = new StringBuilder(front_text);
            new_table_id.append("-" + capacity);
            int table_capacity = Integer.parseInt(capacity);
            int rows = st.executeUpdate("UPDATE tbl_table SET table_id = '"+new_table_id+"', table_capacity = "+table_capacity+" WHERE table_id = '"+table_id+"'");
            if(rows > 0)
            {
                JOptionPane.showMessageDialog(null, "Selected Table updated successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selected Table could not be updated!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteTableFromDatabase(String table_id) {
        try 
        {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this table?", "Are you sure?", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                Statement st= DBClass.createDBConnection().createStatement();
                int rows = st.executeUpdate("DELETE FROM tbl_table WHERE table_id = '"+table_id+"'");
                if(rows > 0)
                {
                    JOptionPane.showMessageDialog(null, "Selected Table deleted successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Selected Table could not be deleted!");
                }     
            }    
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
