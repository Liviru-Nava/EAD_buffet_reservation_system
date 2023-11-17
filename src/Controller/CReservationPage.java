/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MReservationPage;
import java.util.List;
import javax.swing.JTable;
/**
 *
 * @author ASUS
 */
public class CReservationPage {
    private MReservationPage model;
    public CReservationPage()
    {
        model = new MReservationPage();
    }
    public List<String> getBuffetFromDatabase()
    {
        List<String> buffetItems = model.getBuffetFromDatabase();
        return buffetItems;
    }
    public List<String> getTableFromDatabase(String date_of_reservation, String time_slot, int number_of_guests)
    {
        List<String> tableIDs = model.getTableFromDatabase(date_of_reservation, time_slot, number_of_guests);
        return tableIDs;
    }
    public String getTimeSlot(String buffet_type)
    {
        String time_slot = model.getTimeSlot(buffet_type);
        return time_slot;
    }
    public int getBuffetPrice(String buffet_type)
    {
        int buffet_price = model.getBuffetPrice(buffet_type);
        return buffet_price;
    }
    public String getCustomerEmail(String telephone_number)
    {
        String customer_email = model.getCustomerEmail(telephone_number);
        return customer_email;
    }
    public String getCustomerName(String telephone_number)
    {
        String customer_name = model.getCustomerName(telephone_number);
        return customer_name;
    }
    public String autoID()
    {
        String id = model.autoID();
        return id;
    }

    public String getUserIdFromDatabase(String logged_username) {
        return model.getUserIDFromDatabase(logged_username);
    }

    public int insertReservationDetails(String logged_userid, String buffet_name, String time_slot, String telephone_number, String reservation_id, String date_of_reservation, int number_of_guests, String table_id, int total_fee, String local_date_time) {
        return model.insertReservationDetails(logged_userid, buffet_name, time_slot, telephone_number, reservation_id, date_of_reservation, number_of_guests, table_id, total_fee, local_date_time);
    }

    public void insertCustomerDetails(String customer_name, String customer_email, String telephone_number) {
        model.insertCustomerDetails(customer_name, customer_email, telephone_number);
    }

    public String getCustomerTelephoneNumber(String telephone_number) {
        return model.getCustomerTelephoneNumber(telephone_number);
    }


    public void selectAllReservationDetails(JTable table_reservation_details) {
        model.selectAllReservationDetails(table_reservation_details);
    }

    public int insertPaymentDetails(String reservation_id, String customer_telephone, String payment_method, String payment_amount, String payment_balance) {
        return model.insertPaymentDetails(reservation_id, customer_telephone, payment_method, payment_amount, payment_balance);
    }

    public void filterTable(int telephone, String date_of_reservation, JTable table_reservation_details) {
        model.filterTable(telephone, date_of_reservation, table_reservation_details);
    }

    public void filterTableFromNumber(int telephone, JTable table_reservation_details) {
        model.filterTableFromNumber(telephone, table_reservation_details);
    }

    public void filterTableFromDate(String date_of_reservation, JTable table_reservation_details) {
        model.filterTableFromDate(date_of_reservation, table_reservation_details);
    }

    public int checkCustomerReserved(String customer_telephone, String buffet_name, String date) {
        return model.checkCustomerReserved(customer_telephone, buffet_name, date);
    }

    public void filterTableFromDateForPast(JTable table_reservation_details) {
        model.filterTableFromDateForPast(table_reservation_details);
    }
    
    public void filterTableFromDateForFuture(JTable table_reservation_details) {
        model.filterTableFromDateForFuture(table_reservation_details);
    }
}
