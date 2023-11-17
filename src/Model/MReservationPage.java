/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class MReservationPage {

    private Object rst;
    private Object pst;
    private Object conn;
    public List<String> getBuffetFromDatabase()
    {
        List<String> buffetItems = new ArrayList<>();
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT buffet_name FROM tbl_buffet");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                buffetItems.add(rst.getString("buffet_name"));
            }
            conn.close();
        } 
        catch (Exception e) 
        {
        }
        return buffetItems;
    }
    public List<String> getTableFromDatabase(String date_of_reservation, String time_slot, int number_of_guests)
    {
        List<String> tableIDs = new ArrayList<>();
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT tbl_table.table_id FROM tbl_table LEFT JOIN tbl_reservation ON tbl_table.table_id = tbl_reservation.table_id AND tbl_reservation.date = ? AND tbl_reservation.time_slot = ? WHERE tbl_reservation.table_id IS NULL AND tbl_table.table_capacity >= ?");
            pst.setDate(1, Date.valueOf(date_of_reservation));
            pst.setString(2, time_slot);
            pst.setInt(3, number_of_guests);
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                tableIDs.add(rst.getString("table_id"));
            }
            conn.close();
        } catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return tableIDs;
    }
    public String getTimeSlot(String buffet_type)
    {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT time_slot FROM tbl_buffet WHERE buffet_name = ?");
            pst.setString(1, buffet_type);
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                return rst.getString("time_slot");
            }
            conn.close();
        } 
        catch (Exception e) 
        {
        }
        return null;
    }
    public int getBuffetPrice(String buffet_type)
    {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT price_per_head FROM tbl_buffet WHERE buffet_name=?");
            pst.setString(1, buffet_type);
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                return rst.getInt("price_per_head");
            }
            conn.close();
        } catch (Exception e) 
        {
        }
        return 0;
    }
    public String getCustomerEmail(String telephone_number)
    {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT customer_email FROM tbl_customer WHERE customer_telephone=?");
            pst.setInt(1, Integer.parseInt(telephone_number));
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                return rst.getString("customer_email");
            }
            conn.close();
        } catch (Exception e) 
        {
        }
        return null;
    }
    public String getCustomerName(String telephone_number)
    {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            PreparedStatement pst = conn.prepareStatement("SELECT customer_name FROM tbl_customer WHERE customer_telephone=?");
            pst.setInt(1, Integer.parseInt(telephone_number));
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                return rst.getString("customer_name");
            }
            conn.close();
        } catch (Exception e) 
        {
        }
        return null;
    }
    public String autoID()
    {
        PreparedStatement pst = null;
        ResultSet rst = null;
        Connection conn = null;
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            pst = conn.prepareStatement("SELECT MAX(reservation_id) FROM tbl_reservation");
            rst = pst.executeQuery();
            if(rst.next())
            {
                String max_id = rst.getString(1);
                if(max_id==null)
                {
                    String id = "R0001";
                    return id;
                }
                else
                {
                    long id = Long.parseLong(max_id.substring(1));
                    id++;
                    return "R" + String.format("%04d", id);
                }
            }
            else
            {
                return "R0001";
            }
        } 
        catch (Exception e) 
        {
            
        }
        finally 
        {
        // Close your database resources in a finally block
            try 
            {
                if (rst != null) 
                {
                    rst.close();
                }
                if (pst != null) 
                {
                    pst.close();
                }
                if (conn != null) 
                {
                    conn.close();
                }
            } 
            catch (SQLException e) 
            {
                e.printStackTrace(); // Handle the exception according to your needs
            }
        }
        return null;
    }

    public String getUserIDFromDatabase(String logged_username) {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
            
            PreparedStatement pst = conn.prepareStatement("SELECT user_id FROM tbl_user WHERE username = ?");
            pst.setString(1, logged_username);
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                return rst.getString("user_id");
            }
            conn.close();
        } catch (Exception e) 
        {
        }
        return null;
    }

    public int insertReservationDetails(String logged_userid, String buffet_name, String time_slot, String telephone_number, String reservation_id, String date_of_reservation, int number_of_guests, String table_id, int total_fee, String local_date_time) {
        try 
        {
            String dblocation = "jdbc:mysql://localhost/buffet_reservation_system";
            String dbuser = "root";
            String dbpass = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpass);
 
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO tbl_reservation (reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, reservation_made_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, reservation_id);
            pst.setString(2,logged_userid);
            pst.setInt(3, Integer.parseInt(telephone_number));
            pst.setString(4, table_id);
            pst.setString(5, buffet_name);
            pst.setInt(6, number_of_guests);
            pst.setString(7, time_slot);
            pst.setDate(8, Date.valueOf(date_of_reservation));
            pst.setInt(9, total_fee);
            pst.setString(10, local_date_time);
            
            int row_count = pst.executeUpdate();
            if(row_count !=0)
            {
                return row_count;
            }
            conn.close();
        } catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return 0;
        
    }

    public void insertCustomerDetails(String customer_name, String customer_email, String telephone_number) 
    {
        int customer_telephone = Integer.parseInt(telephone_number);
        try 
        {
            Statement st= DBClass.createDBConnection().createStatement();
            int row_count = st.executeUpdate("INSERT INTO tbl_customer VALUES("+customer_telephone+", '"+customer_name+"', '"+customer_email+"')");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null, "New customer detail recorded!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Customer record could not be inserted!");
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public String getCustomerTelephoneNumber(String telephone_number) {
        int customer_telephone = Integer.parseInt(telephone_number);
        String result = null;
        try {
            Statement st = DBClass.createDBConnection().createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM tbl_customer WHERE customer_telephone = "+customer_telephone+"");
            if(rst.next())
            {
                result = String.valueOf(rst.getInt("customer_telephone"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void selectAllReservationDetails(JTable table_reservation_details) {
        try {
            String sql = "SELECT * FROM tbl_reservation";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date reservation_made = rst.getDate("reservation_made_time");
                
                //ADD FIELDS TO TABLE
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, reservation_made});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int insertPaymentDetails(String reservation_id, String customer_telephone, String payment_method, String payment_amount, String payment_balance) {
        int row_count = 0;
        try {
            int telephone = Integer.parseInt(customer_telephone);
            int amount_paid = Integer.parseInt(payment_amount);
            int balance = Integer.parseInt(payment_balance);
            Statement st = DBClass.createDBConnection().createStatement();
            row_count = st.executeUpdate("INSERT INTO tbl_payment(reservation_id, customer_telephone, payment_method, payment_amount, payment_balance) VALUES('"+reservation_id+"',"+telephone+", '"+payment_method+"', "+amount_paid+", "+balance+")");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null, "Payment information has been saved succesfully!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Payment information could not be saved!");
        }
        return row_count;
    }

    public void filterTable(int telephone, String date_of_reservation, JTable table_reservation_details) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE customer_telephone = ? AND date = ?";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            pst.setInt(1, telephone);
            pst.setDate(2, java.sql.Date.valueOf(date_of_reservation));
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date made_Date = rst.getDate("reservation_made_time");
                
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, made_Date});
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void filterTableFromNumber(int telephone, JTable table_reservation_details) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE customer_telephone = ?";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            pst.setInt(1, telephone);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date made_Date = rst.getDate("reservation_made_time");
                
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, made_Date});
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void filterTableFromDate(String date_of_reservation, JTable table_reservation_details) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE date = ?";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            pst.setDate(1, java.sql.Date.valueOf(date_of_reservation));
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date made_Date = rst.getDate("reservation_made_time");
                
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, made_Date});
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int checkCustomerReserved(String customer_telephone, String buffet_name, String date) {
            int result = 0;
        try {
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement("SELECT customer_telephone FROM tbl_reservation WHERE buffet_name = ? AND customer_telephone = ? AND date = ?");
            pst.setString(1, buffet_name);
            pst.setInt(2, Integer.parseInt(customer_telephone));
            pst.setDate(3, Date.valueOf(date));
            ResultSet rst = pst.executeQuery();
            if(rst.next())
            {
                JOptionPane.showMessageDialog(null, "This customer has already made a reservation!");
                result = 1;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void filterTableFromDateForPast(JTable table_reservation_details) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE date < CURDATE()";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date made_Date = rst.getDate("reservation_made_time");
                
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, made_Date});
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void filterTableFromDateForFuture(JTable table_reservation_details) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE date >= CURDATE()";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_reservation_details.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String reservation_id = rst.getString("reservation_id");
                String user_id = rst.getString("user_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String table_id = rst.getString("table_id");
                String buffet_name = rst.getString("buffet_name");
                int num_of_guests = rst.getInt("num_of_guests");
                String time_slot = rst.getString("time_slot");
                Date date = rst.getDate("date");
                int total_fee = rst.getInt("total_fee");
                Date made_Date = rst.getDate("reservation_made_time");
                
                tableModel.addRow(new Object[]{reservation_id, user_id, customer_telephone, table_id, buffet_name, num_of_guests, time_slot, date, total_fee, made_Date});
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
