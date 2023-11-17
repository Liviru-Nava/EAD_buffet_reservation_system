/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MUserRegistrationPage;
import java.util.List;

import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class CUserRegistrationPage {
    private MUserRegistrationPage model;
    public CUserRegistrationPage()
    {
        model = new MUserRegistrationPage();
    }

    public void selectAllUserDetails(JTable table_user_details) {
        model.selectAllUserDetails(table_user_details);
    }

    public List<String> getUsertypeFromDatabase() {
        return model.getUsertypeFromDatabase();  
    }

    public String autoID(String user_type) {
        return model.getAutoID(user_type);
    }

    public void insertUserDetails(String user_id, String name, String user_type, String username, String password, String email, String date_of_birth) {
        model.insertUserDetails(user_id, name, user_type, username, password, email, date_of_birth);
    }

    public void updateUserDetails(String user_id, String name, String username, String email, String date_of_birth) {
        model.updateUserDetails(user_id, name, username, email, date_of_birth);
    }

    public void deleteUserFromDatabase(String user_id) {
        model.deleteUserFromDatabase(user_id);
    }
}
