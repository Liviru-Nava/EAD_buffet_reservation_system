/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MDashboardPage;
import java.util.List;
import javax.swing.JTable;
/**
 *
 * @author ASUS
 */
public class CDashboardPage {
    private MDashboardPage model;
    public CDashboardPage()
    {
        model = new MDashboardPage();
    }
    
    public int getReservationToday()
    {
        return model.getReservationToday();
    }

    public int getNumberOfGuestsToday() {
        return model.getNumberOfGuestsToday();
    }

    public int getTotalRevenueToday() {
        return model.getTotalRevenueToday();
    }

    public void selectAllBuffetDetails(JTable table_buffet_details) {
        model.selectAllBuffetDetails(table_buffet_details);
    }

    public void addNewBuffet(String buffet_name, String buffet_description, int price_per_head, StringBuilder new_time_slot) {
        model.addNewBuffet(buffet_name, buffet_description, price_per_head, new_time_slot);
    }

    public void updateBuffet(String buffet_name, String buffet_description, int price_per_head, StringBuilder new_time_slot) {
        model.updateBuffet(buffet_name, buffet_description, price_per_head, new_time_slot);
    }

    public void deleteBuffet(String buffet_name) {
        model.deleteBuffet(buffet_name);
    }

    public void selectAllTableDetails(JTable table_Table_details) {
        model.selectAllTableDetails(table_Table_details);
    }

    public String autoID() {
        String id = model.autoID();
        return id;
    }

    public List<String> getTableCapacity() {
        List<String> TableCapacity = model.getTableCapacity();
        return TableCapacity;
    }

    public void addNewTable(StringBuilder new_table_id, String capacity) {
        model.addNewTable(new_table_id, capacity);
    }

    public void updateTableCapacity(String front_text, String capacity, String table_id) {
        model.updateTableCapacity(front_text, capacity, table_id);
    }

    public void deleteTableFromDatabase(String table_id) {
        model.deleteTableFromDatabase(table_id);
    }
}
