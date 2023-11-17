/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MCancelReservationPage;

import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class CCancelReservationPage {
    private MCancelReservationPage model;
    public CCancelReservationPage()
    {
        model = new MCancelReservationPage();
    }

    public void selectAllReservationDetails(JTable table_TableReservation) {
        model.selectAllReservationDetails(table_TableReservation);
    }

    public void selectAllPaymentDetails(JTable table_TablePayment) {
        model.selectAllPaymentDetails(table_TablePayment);
    }

    public void filterTable(int telephone, String date_of_reservation, JTable table_TableReservation) {
        model.filterTable(telephone, date_of_reservation, table_TableReservation);
    }

    public void cancelReservation(String reservation_id) {
        model.cancelReservation(reservation_id);
    }

    public void cancelPayment(String reservation_id) {
        model.cancelPayment(reservation_id);
    }
    
}
