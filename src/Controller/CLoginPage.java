/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MLoginPage;
/**
 *
 * @author ASUS
 */
public class CLoginPage {
    private MLoginPage model;
    public CLoginPage()
    {
        model = new MLoginPage();
    }
    
    public String getUsernameFromDatabase(String username)
    {
        String db_username = model.getUsernameFromDatabase(username);
        return db_username;
    }
    public String validateLogin(String username, String password)
    {
        String db_usertype = model.validateLogin(username, password);
        return db_usertype;
    }
}
