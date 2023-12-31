/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.CUserRegistrationPage;
import com.sun.tools.attach.AgentLoadException;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class VUserRegistrationPage extends javax.swing.JFrame {
    private CUserRegistrationPage controller;
    Date date = new Date();
    /**
     * Creates new form VUserRegistrationPage
     */
    public VUserRegistrationPage() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        txt_user_id.setEditable(false);
        controller = new CUserRegistrationPage();
        displayUsersToTable();
        loadUsertypeToComboBox();
        date_DOB.setMaxSelectableDate(date);
        
        
        
        //disable buttons and everything
        btn_add_user.setEnabled(false);
        btn_update_user.setEnabled(false);
        btn_delete_user.setEnabled(false);
        
        txt_username.setEnabled(false);
        txt_password.setEnabled(false);
        txt_email.setEnabled(false);
        date_DOB.setEnabled(false);
        
        txt_name.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableUsername();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableUsername();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableUsername();
            }
                    
        });
        txt_username.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enablePassword();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enablePassword();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enablePassword();
            }
                    
        });
        txt_password.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableEmail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableEmail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableEmail();
            }
                    
        });
        txt_email.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableDOB();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableDOB();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableDOB();
            }
                    
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_user_registration = new javax.swing.JPanel();
        panel_user_details = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_user_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        cmb_user_type = new javax.swing.JComboBox<>();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        date_DOB = new com.toedter.calendar.JDateChooser();
        btn_add_user = new javax.swing.JButton();
        btn_update_user = new javax.swing.JButton();
        btn_delete_user = new javax.swing.JButton();
        btn_back_button = new javax.swing.JButton();
        panel_user_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user_details = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_user_registration.setBackground(new java.awt.Color(0, 102, 102));
        panel_user_registration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_user_details.setBackground(new java.awt.Color(0, 0, 51));
        panel_user_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Registration");
        panel_user_details.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOB");
        panel_user_details.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User_ID");
        panel_user_details.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        panel_user_details.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User_Type");
        panel_user_details.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        panel_user_details.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        panel_user_details.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        panel_user_details.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, -1));

        txt_user_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel_user_details.add(txt_user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, 40));

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        panel_user_details.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, 40));

        cmb_user_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_user_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_user_typeActionPerformed(evt);
            }
        });
        panel_user_details.add(cmb_user_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 240, 40));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });
        panel_user_details.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 240, 40));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel_user_details.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 240, 40));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel_user_details.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 240, 40));

        date_DOB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_DOBPropertyChange(evt);
            }
        });
        panel_user_details.add(date_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 240, 40));

        btn_add_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add_user.setText("Add User");
        btn_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_userActionPerformed(evt);
            }
        });
        panel_user_details.add(btn_add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 110, 60));

        btn_update_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_update_user.setText("Update User");
        btn_update_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_userActionPerformed(evt);
            }
        });
        panel_user_details.add(btn_update_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 120, 60));

        btn_delete_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete_user.setText("Delete User");
        btn_delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_userActionPerformed(evt);
            }
        });
        panel_user_details.add(btn_delete_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 110, 60));

        btn_back_button.setBackground(new java.awt.Color(0, 0, 51));
        btn_back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-button-50.png"))); // NOI18N
        btn_back_button.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_buttonActionPerformed(evt);
            }
        });
        panel_user_details.add(btn_back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panel_user_registration.add(panel_user_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 830));

        panel_user_table.setBackground(new java.awt.Color(0, 51, 51));
        panel_user_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_user_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User_ID", "Name", "User_type", "Username", "Password", "Email", "DOB"
            }
        ));
        table_user_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_user_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user_details);

        panel_user_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 830));

        panel_user_registration.add(panel_user_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 1100, 830));

        getContentPane().add(panel_user_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_user_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_user_typeActionPerformed
        // TODO add your handling code here:
        getAutoId();
    }//GEN-LAST:event_cmb_user_typeActionPerformed

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
        // TODO add your handling code here:
        insertUserDetails();
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void table_user_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_user_detailsMouseClicked
        // TODO add your handling code here:
        btn_add_user.setEnabled(false);
        btn_update_user.setEnabled(true);
        btn_delete_user.setEnabled(true);
        txt_email.setEnabled(true);
        int row = table_user_details.getSelectedRow();
        DefaultTableModel tableUser = (DefaultTableModel)table_user_details.getModel();
        
        //insert row records to text boxes
        txt_user_id.setText(tableUser.getValueAt(row, 0).toString());
        txt_name.setText(tableUser.getValueAt(row, 1).toString());
        txt_username.setText(tableUser.getValueAt(row, 3).toString());
        txt_password.setEditable(false);
        txt_email.setText(tableUser.getValueAt(row, 5).toString());
        String date_from_table = tableUser.getValueAt(row, 6).toString();
        Date date= parseDate(date_from_table);
        // Format the date to "MMM d, yyyy"
        String formattedDate = formatDate(date);
        date_DOB.setDate(date);
    }//GEN-LAST:event_table_user_detailsMouseClicked

    private void btn_update_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_userActionPerformed
        // TODO add your handling code here:
        updateUserDetails();
        btn_add_user.setEnabled(true);
    }//GEN-LAST:event_btn_update_userActionPerformed

    private void btn_delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_userActionPerformed
        // TODO add your handling code here:
        deleteUserDetails();
        btn_add_user.setEnabled(true);
    }//GEN-LAST:event_btn_delete_userActionPerformed

    private void date_DOBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_DOBPropertyChange
        // TODO add your handling code here:
        enableAddButton();
    }//GEN-LAST:event_date_DOBPropertyChange

    private void btn_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_buttonActionPerformed
        // TODO add your handling code here:
        VDashboardPage dashboard_page = new VDashboardPage();
        dashboard_page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_back_buttonActionPerformed

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) || !Character.isDigit(c) || c == KeyEvent.VK_SPACE) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_usernameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VUserRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUserRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUserRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUserRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUserRegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_back_button;
    private javax.swing.JButton btn_delete_user;
    private javax.swing.JButton btn_update_user;
    private javax.swing.JComboBox<String> cmb_user_type;
    private com.toedter.calendar.JDateChooser date_DOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_user_details;
    private javax.swing.JPanel panel_user_registration;
    private javax.swing.JPanel panel_user_table;
    private javax.swing.JTable table_user_details;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user_id;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void displayUsersToTable()
    {
        controller.selectAllUserDetails(table_user_details);
    }
    public void loadUsertypeToComboBox() 
    {
        List<String> usertypes = controller.getUsertypeFromDatabase();
        for (String user_type : usertypes) 
        {
        cmb_user_type.addItem(user_type);
        }
    }
    public void getAutoId() {
        String user_type = cmb_user_type.getSelectedItem().toString();
        String id = controller.autoID(user_type);
        txt_user_id.setText(id);
    }
    public int getAge()
    {
        int age = 0;
        age = (date.getYear() + 1900) - (date_DOB.getDate().getYear() + 1900);
        return age;
    }
    public void insertUserDetails()
    {
        String user_id = txt_user_id.getText();
        String name = txt_name.getText();
        String user_type = cmb_user_type.getSelectedItem().toString();
        String username = txt_username.getText();
        String password = txt_password.getPassword().toString();
        String email = txt_email.getText();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        String date_of_birth = dateformat.format(date_DOB.getDate());
        
        int age = getAge();
        if(age < 18 || age > 60)
        {
            JOptionPane.showMessageDialog(null, "Invalid age for registration, should be 18 years and above!");
        }
        else
        {
            controller.insertUserDetails(user_id, name, user_type, username, password, email, date_of_birth);
            displayUsersToTable();
            getAutoId();
            txt_name.setText("");
            txt_username.setText("");
            txt_password.setText("");
            txt_email.setText("");
            cmb_user_type.setSelectedIndex(0);
            date_DOB.setDate(null);
        }
    }

    private Date parseDate(String date_from_table) {
        try {
            // Assuming the date is in the "yyyy-MM-dd" format
            return new SimpleDateFormat("yyyy-MM-dd").parse(date_from_table);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // Handle the parsing error as needed
        }
    }

    private String formatDate(Date date) {
        // Format the date to "MMM d, yyyy"
        return new SimpleDateFormat("MMM d, yyyy").format(date);
    }

    private void updateUserDetails() {
        String user_id = txt_user_id.getText();
        String name = txt_name.getText();
        String username = txt_username.getText();
        String email = txt_email.getText();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        String date_of_birth = dateformat.format(date_DOB.getDate()); 

        
        //UPDATE INTO DATABASE
        controller.updateUserDetails(user_id, name, username, email, date_of_birth);
        displayUsersToTable();
        txt_name.setText("");
        txt_username.setText("");
        txt_email.setText("");
        btn_add_user.setEnabled(true);
        txt_password.setEnabled(true);
        date_DOB.setDate(null);
        getAutoId();
    }

    private void deleteUserDetails() {
        controller.deleteUserFromDatabase(txt_user_id.getText());
        displayUsersToTable();
        getAutoId();
        btn_add_user.setEnabled(true);
        txt_name.setText("");
        txt_username.setText("");
        txt_email.setText("");
        btn_add_user.setEnabled(true);
        txt_password.setEnabled(true);
        date_DOB.setDate(null);
        getAutoId();
    }
    
    public void enableUsername()
    {
        boolean name = !txt_name.getText().trim().isEmpty();
        txt_username.setEnabled(name);
    }
    public void enablePassword()
    {
        boolean username = !txt_username.getText().trim().isEmpty();
        txt_password.setEnabled(username);
    }
    public void enableEmail()
    {
       boolean password = !txt_password.getText().trim().isEmpty();
       txt_email.setEnabled(password); 
    }
    public void enableDOB()
    {
        boolean email = !txt_email.getText().trim().isEmpty();
        date_DOB.setEnabled(email);
    }
    public void enableAddButton()
    {
        boolean name = !txt_name.getText().trim().isEmpty();
        boolean username = !txt_username.getText().trim().isEmpty();
        boolean password = !txt_password.getText().trim().isEmpty();
        boolean email = !txt_email.getText().trim().isEmpty();
        boolean dob = date_DOB.getDate() != null;
        btn_add_user.setEnabled(name && username && password && email && dob);
    }
}
