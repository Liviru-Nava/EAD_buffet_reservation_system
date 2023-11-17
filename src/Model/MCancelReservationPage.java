/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JTable;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class MCancelReservationPage {

    public void selectAllReservationDetails(JTable table_TableReservation) {
        try {
            String sql = "SELECT * FROM tbl_reservation";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_TableReservation.getModel();
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

    public void selectAllPaymentDetails(JTable table_TablePayment) {
        try {
            String sql = "SELECT * FROM tbl_payment";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_TablePayment.getModel();
            tableModel.setRowCount(0);
            
            while(rst.next())
            {
                String payment_id = rst.getString("payment_id");
                String reservation_id = rst.getString("reservation_id");
                int customer_telephone = rst.getInt("customer_telephone");
                String payment_method = rst.getString("payment_method");
                int payment_amount = rst.getInt("payment_amount");
                int payment_balance = rst.getInt("payment_balance");
                
                //ADD FIELDS TO TABLE
                tableModel.addRow(new Object[]{payment_id, reservation_id, customer_telephone, payment_method, payment_amount, payment_balance});
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void filterTable(int telephone, String date_of_reservation, JTable table_TableReservation) {
        try {
            String sql = "SELECT * from tbl_reservation WHERE customer_telephone = ? AND date = ?";
            PreparedStatement pst = DBClass.createDBConnection().prepareStatement(sql);
            pst.setInt(1, telephone);
            pst.setDate(2, java.sql.Date.valueOf(date_of_reservation));
            ResultSet rst = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table_TableReservation.getModel();
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

    public void cancelReservation(String reservation_id) {
        try 
        {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this reservation?", "Are you sure?", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                Statement st= DBClass.createDBConnection().createStatement();
                int rows = st.executeUpdate("DELETE FROM tbl_reservation WHERE reservation_id = '"+reservation_id+"'");
                if(rows > 0)
                {
                    JOptionPane.showMessageDialog(null, "Reservation deleted successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Reservation could not be deleted!");
                }     
            }    
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelPayment(String reservation_id) {
        try 
        {
            Statement st= DBClass.createDBConnection().createStatement();
            int rows = st.executeUpdate("DELETE FROM tbl_payment WHERE reservation_id = '"+reservation_id+"'");
            if(rows > 0)
            {
                JOptionPane.showMessageDialog(null, "Payment refunded successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Payment could not be refunded!");
            }         
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
