/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.CReservationPage;
import java.awt.Color;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.event.DocumentEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Timer;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
/**
 *
 * @author ASUS
 */
public class VReservationPage extends javax.swing.JFrame {
    private CReservationPage controller;
    Date date = new Date();
    private final Timer timer = new Timer();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    /**
     * Creates new form VReservationPage
     */
    public VReservationPage() {
        initComponents();
    }
    public VReservationPage(String username)
    {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbl_logged_user.setText(username);
        controller = new CReservationPage();
        displayReservationToTable();
        loadBuffetToComboBox();
        updateLabel();
        getAutoId();
        
        
        
        date_reservation_date.setMinSelectableDate(date);
        txt_customer_name.setEnabled(false);
        txt_customer_email.setEnabled(false);
        date_reservation_date.setEnabled(false);
        txt_number_of_guests.setEnabled(false);
        cmb_table.setEnabled(false);
        btn_save_reservation_details.setEnabled(false);
        btn_paynow.setEnabled(false);
        
        txt_time_slot.setEditable(false);
        txt_buffet_price.setEditable(false);
        txt_number_of_guests_for_payment.setEditable(false);
        txt_total_fee.setEditable(false);
        txt_balance_from_payment.setEditable(false);
        
        txt_telephone_number.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                checkNameAndEmailFromDatabase();
                enableCustomerNameField();
                enableReserveButtonField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                checkNameAndEmailFromDatabase();
                enableCustomerNameField();
                enableReserveButtonField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                checkNameAndEmailFromDatabase();
                enableCustomerNameField();
                enableReserveButtonField();
            }
                    
        });
        
        txt_paid_amount.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculateBalance();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculateBalance();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateBalance();
            }
                    
        });
        txt_customer_name.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableCustomerEmailField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableCustomerEmailField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableCustomerEmailField();
            }
                    
        });
        txt_customer_email.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableDateField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableDateField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableDateField();
            }
                    
        });
    }
    public void updateLabel() {
        LocalDate now_date = LocalDate.now();
        String formattedDate = formatter.format(now_date);
        lbl_current_time.setText(formattedDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        group_payment = new javax.swing.ButtonGroup();
        panel_Reservation_layout = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_telephone_number2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date_reservation_date_2 = new com.toedter.calendar.JDateChooser();
        btn_paynow = new javax.swing.JButton();
        panel_reservation_details = new javax.swing.JPanel();
        panel_customer_buffet_info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_buffet_type = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_customer_email = new javax.swing.JTextField();
        txt_telephone_number = new javax.swing.JTextField();
        txt_customer_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_time_slot = new javax.swing.JTextField();
        panel_reservation_info = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_number_of_guests = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cmb_table = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        date_reservation_date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btn_save_reservation_details = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_reservation_id = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lbl_logged_user = new javax.swing.JLabel();
        lbl_current_time = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        lbl_logged_user1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reservation_details = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_buffet_price = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_number_of_guests_for_payment = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_paid_amount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        radio_cash = new javax.swing.JRadioButton();
        radio_card = new javax.swing.JRadioButton();
        btn_refresh = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_balance_from_payment = new javax.swing.JTextField();
        txt_total_fee = new javax.swing.JTextField();
        btn_view_reservation_from_date = new javax.swing.JButton();
        btn_view_reservation_from_number = new javax.swing.JButton();
        btn_view_reservation = new javax.swing.JButton();
        btn_upcoming_reservations = new javax.swing.JButton();
        btn_past_reservations = new javax.swing.JButton();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Reservation_layout.setBackground(new java.awt.Color(204, 204, 204));
        panel_Reservation_layout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Make Payment");
        panel_Reservation_layout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Buffet price");
        panel_Reservation_layout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        txt_telephone_number2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_telephone_number2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telephone_number2KeyTyped(evt);
            }
        });
        panel_Reservation_layout.add(txt_telephone_number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, 240, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Select reservation date");
        panel_Reservation_layout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 440, -1, -1));

        date_reservation_date_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_Reservation_layout.add(date_reservation_date_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 470, 240, 40));

        btn_paynow.setBackground(new java.awt.Color(0, 98, 255));
        btn_paynow.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_paynow.setForeground(new java.awt.Color(255, 255, 255));
        btn_paynow.setText("Pay now");
        btn_paynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paynowActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_paynow, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 730, 390, 50));

        panel_reservation_details.setBackground(new java.awt.Color(0, 153, 153));
        panel_reservation_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_customer_buffet_info.setBackground(new java.awt.Color(0, 102, 102));
        panel_customer_buffet_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buffet Types");
        panel_customer_buffet_info.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please select a Buffet category");
        panel_customer_buffet_info.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cmb_buffet_type.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmb_buffet_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_buffet_typeActionPerformed(evt);
            }
        });
        panel_customer_buffet_info.add(cmb_buffet_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panel_customer_buffet_info.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 310, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Information");
        panel_customer_buffet_info.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telephone number");
        panel_customer_buffet_info.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer name");
        panel_customer_buffet_info.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 131, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer email address");
        panel_customer_buffet_info.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        txt_customer_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_customer_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_customer_emailKeyTyped(evt);
            }
        });
        panel_customer_buffet_info.add(txt_customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 279, 37));

        txt_telephone_number.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_telephone_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telephone_numberKeyTyped(evt);
            }
        });
        panel_customer_buffet_info.add(txt_telephone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 279, 37));

        txt_customer_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_customer_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_customer_nameKeyTyped(evt);
            }
        });
        panel_customer_buffet_info.add(txt_customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 279, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Time of Reservation");
        panel_customer_buffet_info.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        txt_time_slot.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_customer_buffet_info.add(txt_time_slot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 40));

        panel_reservation_details.add(panel_customer_buffet_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 710));

        panel_reservation_info.setBackground(new java.awt.Color(0, 102, 102));
        panel_reservation_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reservation Details");
        panel_reservation_info.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txt_number_of_guests.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_number_of_guests.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_number_of_guestsStateChanged(evt);
            }
        });
        panel_reservation_info.add(txt_number_of_guests, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 220, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Number of Guests");
        panel_reservation_info.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cmb_table.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmb_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tableActionPerformed(evt);
            }
        });
        panel_reservation_info.add(cmb_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 220, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Table");
        panel_reservation_info.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 40, -1));

        date_reservation_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_reservation_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_reservation_datePropertyChange(evt);
            }
        });
        panel_reservation_info.add(date_reservation_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date of Reservation");
        panel_reservation_info.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        btn_save_reservation_details.setBackground(new java.awt.Color(0, 24, 255));
        btn_save_reservation_details.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_save_reservation_details.setForeground(new java.awt.Color(255, 255, 255));
        btn_save_reservation_details.setText("Save Reservation Details");
        btn_save_reservation_details.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save_reservation_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save_reservation_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_reservation_detailsActionPerformed(evt);
            }
        });
        panel_reservation_info.add(btn_save_reservation_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 230, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Reservation ID");
        panel_reservation_info.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, -1));

        txt_reservation_id.setEditable(false);
        txt_reservation_id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_reservation_info.add(txt_reservation_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 220, 40));

        panel_reservation_details.add(panel_reservation_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 330, 710));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Make Reservation");
        panel_reservation_details.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        lbl_logged_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_logged_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logged_user.setText("is logged in");
        panel_reservation_details.add(lbl_logged_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        lbl_current_time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_current_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_current_time.setText("jLabel24");
        panel_reservation_details.add(lbl_current_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_logout.setBackground(new java.awt.Color(0, 153, 153));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-logout-50.png"))); // NOI18N
        btn_logout.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_logout.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_logout.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_reservation_details.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 50));

        lbl_logged_user1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_logged_user1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logged_user1.setText("Logged user:");
        panel_reservation_details.add(lbl_logged_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        panel_Reservation_layout.add(panel_reservation_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        table_reservation_details.setBackground(new java.awt.Color(51, 51, 51));
        table_reservation_details.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        table_reservation_details.setForeground(new java.awt.Color(255, 255, 255));
        table_reservation_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ReservationID", "UserID", "C_Telephone", "TableID", "Buffet_name", "Num_Guests", "Time_slot", "Date", "Total_fee", "Reservation_made"
            }
        ));
        jScrollPane1.setViewportView(table_reservation_details);

        panel_Reservation_layout.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 0, 840, 290));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("View Reservations");
        panel_Reservation_layout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Enter customer telephone number");
        panel_Reservation_layout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 350, -1, -1));

        txt_buffet_price.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_Reservation_layout.add(txt_buffet_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 180, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Number of guests");
        panel_Reservation_layout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        txt_number_of_guests_for_payment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_Reservation_layout.add(txt_number_of_guests_for_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 180, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Payment method");
        panel_Reservation_layout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        txt_paid_amount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_paid_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paid_amountKeyTyped(evt);
            }
        });
        panel_Reservation_layout.add(txt_paid_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 180, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Total fee");
        panel_Reservation_layout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        group_payment.add(radio_cash);
        radio_cash.setForeground(new java.awt.Color(0, 0, 0));
        radio_cash.setText("Cash");
        radio_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_cashActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(radio_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, -1, -1));

        group_payment.add(radio_card);
        radio_card.setForeground(new java.awt.Color(0, 0, 0));
        radio_card.setText("Card");
        radio_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_cardActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(radio_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, -1, -1));

        btn_refresh.setBackground(new java.awt.Color(0, 98, 255));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 730, 320, 50));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Paid Amount");
        panel_Reservation_layout.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Balance");
        panel_Reservation_layout.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, -1));

        txt_balance_from_payment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_Reservation_layout.add(txt_balance_from_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 180, -1));

        txt_total_fee.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_Reservation_layout.add(txt_total_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 180, -1));

        btn_view_reservation_from_date.setBackground(new java.awt.Color(0, 98, 255));
        btn_view_reservation_from_date.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_view_reservation_from_date.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_reservation_from_date.setText("View");
        btn_view_reservation_from_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_reservation_from_dateActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_view_reservation_from_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 470, -1, 50));

        btn_view_reservation_from_number.setBackground(new java.awt.Color(0, 98, 255));
        btn_view_reservation_from_number.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_view_reservation_from_number.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_reservation_from_number.setText("View");
        btn_view_reservation_from_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_reservation_from_numberActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_view_reservation_from_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 380, -1, 50));

        btn_view_reservation.setBackground(new java.awt.Color(0, 98, 255));
        btn_view_reservation.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_view_reservation.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_reservation.setText("View Reservations of Customer");
        btn_view_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_reservationActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_view_reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 670, 320, 50));

        btn_upcoming_reservations.setBackground(new java.awt.Color(0, 98, 255));
        btn_upcoming_reservations.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_upcoming_reservations.setForeground(new java.awt.Color(255, 255, 255));
        btn_upcoming_reservations.setText("View upcoming reservations");
        btn_upcoming_reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upcoming_reservationsActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_upcoming_reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 610, 320, 50));

        btn_past_reservations.setBackground(new java.awt.Color(0, 98, 255));
        btn_past_reservations.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_past_reservations.setForeground(new java.awt.Color(255, 255, 255));
        btn_past_reservations.setText("View past reservations");
        btn_past_reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_past_reservationsActionPerformed(evt);
            }
        });
        panel_Reservation_layout.add(btn_past_reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 550, 320, 50));

        getContentPane().add(panel_Reservation_layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        setSize(new java.awt.Dimension(1543, 837));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_buffet_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_buffet_typeActionPerformed
        // TODO add your handling code here:
        String selected_buffet_type = cmb_buffet_type.getSelectedItem().toString();
        String time_slot = controller.getTimeSlot(selected_buffet_type);
        int buffet_price = controller.getBuffetPrice(selected_buffet_type);
        txt_time_slot.setText(time_slot);
        txt_buffet_price.setText(String.valueOf(buffet_price));
        
        handleBuffetSelection();
        
    }//GEN-LAST:event_cmb_buffet_typeActionPerformed

    private void date_reservation_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_reservation_datePropertyChange
        // TODO add your handling code here:
        handleDateSelection();
        restrictReservation();
        if ("date".equals(evt.getPropertyName())) 
        {
            // When the date property changes, enable the spinner
            txt_number_of_guests.setEnabled(date_reservation_date.getDate() != null);
            cmb_table.setEnabled(date_reservation_date.getDate() != null);
        }
    }//GEN-LAST:event_date_reservation_datePropertyChange

    private void txt_number_of_guestsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_number_of_guestsStateChanged
        // TODO add your handling code here:
        int spinner_value = (int)txt_number_of_guests.getValue();
        txt_number_of_guests_for_payment.setText(Integer.toString(spinner_value));
        int number_of_guests = spinner_value;
        
        if(spinner_value <= 1)
        {
            txt_number_of_guests.setValue(1);
        }
        else if(spinner_value >= 10)
        {
            spinner_value =10;
            txt_number_of_guests.setValue(10);
        }
        
        
        
        //pass values to get tables into combo box
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        String date_of_reservation = dateformat.format(date_reservation_date.getDate());
        String time_slot = txt_time_slot.getText();
        
        loadTableToComboBox(date_of_reservation, time_slot, number_of_guests);
        if(txt_telephone_number.getText().length()<10 || txt_customer_name.getText().isEmpty() || txt_customer_email.getText().isEmpty())
        {
            btn_save_reservation_details.setEnabled(false);
        }
        else
        {
            btn_save_reservation_details.setEnabled(true);
        }
    }//GEN-LAST:event_txt_number_of_guestsStateChanged

    private void btn_save_reservation_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_reservation_detailsActionPerformed
        //CLICK ON SAVE RESERVATION BUTTON

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        
        String logged_username = lbl_logged_user.getText();
        String logged_userid = controller.getUserIdFromDatabase(logged_username);
        String buffet_name = String.valueOf(cmb_buffet_type.getSelectedItem());
        String time_slot = txt_time_slot.getText();
        String telephone_number = txt_telephone_number.getText();
        String customer_name = txt_customer_name.getText();
        String customer_email = txt_customer_email.getText();
        String reservation_id = txt_reservation_id.getText();
        String date_of_reservation = dateformat.format(date_reservation_date.getDate());
        int number_of_guests = (int)txt_number_of_guests.getValue();
        String table_id = String.valueOf(cmb_table.getSelectedItem());
        String local_date_time = lbl_current_time.getText();
        
        //CHECK IF CUSTOMER EXISTS IN DATABASE
        String available_telephone_number = controller.getCustomerTelephoneNumber(telephone_number);
        if(available_telephone_number ==null)
        {
            controller.insertCustomerDetails(customer_name, customer_email, telephone_number);
            
        }
        
        //CALCULATE TOTAL FEE 
        int total_fee = 0;
        total_fee = number_of_guests * (Integer.parseInt(txt_buffet_price.getText()));
        txt_total_fee.setText(String.valueOf(total_fee));
        
        //INSERT INTO RESERVATION TABLE
        int insert_reservation_result = controller.insertReservationDetails(logged_userid, buffet_name, time_slot, telephone_number, reservation_id, date_of_reservation, number_of_guests, table_id, total_fee, local_date_time);
        if(insert_reservation_result > 0)
        {
            JOptionPane.showMessageDialog(this,"Data has been inserted successfully!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No data is stored!");
        }
        //AUTO INCREMENT RESERVATION ID
        displayReservationToTable();
         
    }//GEN-LAST:event_btn_save_reservation_detailsActionPerformed

    private void radio_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_cardActionPerformed
        // TODO add your handling code here:
        txt_paid_amount.setText(txt_total_fee.getText());
        txt_balance_from_payment.setText("0");
        txt_paid_amount.setEditable(false);
        txt_balance_from_payment.setEditable(false);
        btn_paynow.setEnabled(true);
    }//GEN-LAST:event_radio_cardActionPerformed

    private void radio_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_cashActionPerformed
        // TODO add your handling code here:
        txt_paid_amount.setEditable(true);
        txt_paid_amount.setText("");
        txt_balance_from_payment.setText("");
    }//GEN-LAST:event_radio_cashActionPerformed

    private void btn_paynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paynowActionPerformed
        // TODO add your handling code here:
        String reservation_id = txt_reservation_id.getText();
        String customer_telephone = txt_telephone_number.getText();
        String payment_method = null;
        int balance = Integer.parseInt(txt_balance_from_payment.getText());
        if(radio_card.isSelected())
        {
            payment_method = "Card payment";
        }
        else if(radio_cash.isSelected())
        {
            payment_method = "Cash payment";
        }
        String payment_amount = txt_paid_amount.getText();
        String payment_balance = txt_balance_from_payment.getText();
        
        int row_count = controller.insertPaymentDetails(reservation_id, customer_telephone, payment_method, payment_amount, payment_balance);
        
        balance = Integer.parseInt(txt_balance_from_payment.getText());
        if(balance < 0)
        {
            JOptionPane.showMessageDialog(null, "Insufficient cash funds", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(row_count > 0)
        {
            txt_balance_from_payment.setText("");
            txt_paid_amount.setText("");
            radio_card.setSelected(false);
            radio_cash.setSelected(false);
            txt_total_fee.setText("");
            txt_number_of_guests_for_payment.setText("");
            
            cmb_table.setSelectedIndex(-1);
            cmb_table.setEnabled(false);
            
            txt_number_of_guests.setValue(0);
            txt_number_of_guests.setEnabled(false);
            
            date_reservation_date.setDate(null);
            date_reservation_date.setEnabled(false);
            
            txt_customer_email.setText("");
            txt_customer_email.setEnabled(false);
            
            txt_customer_name.setText("");
            txt_customer_name.setEnabled(false);
            
            txt_telephone_number.setText("");
            
            btn_paynow.setEnabled(false);
        }
        btn_save_reservation_details.setEnabled(false);
        displayReservationToTable();
        getAutoId();
    }//GEN-LAST:event_btn_paynowActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
       displayReservationToTable();
       txt_telephone_number2.setText("");
       date_reservation_date_2.setDate(null);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_view_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_reservationActionPerformed
        // TODO add your handling code here:
         try {
            int telephone = Integer.parseInt(txt_telephone_number2. getText());
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
            String date_of_reservation = dateformat.format(date_reservation_date_2.getDate());
            
            if(String.valueOf(telephone).isEmpty() || date_of_reservation.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter the contact number and date!", "error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                controller.filterTable(telephone, date_of_reservation, table_reservation_details);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter the date!", "error", JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid contact number!", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_view_reservationActionPerformed

    private void btn_view_reservation_from_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_reservation_from_numberActionPerformed
        // TODO add your handling code here:
        try {
            int telephone = Integer.parseInt(txt_telephone_number2. getText());
            controller.filterTableFromNumber(telephone, table_reservation_details);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter the contact number!", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_view_reservation_from_numberActionPerformed

    private void btn_view_reservation_from_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_reservation_from_dateActionPerformed
        // TODO add your handling code here:
        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
            String date_of_reservation = dateformat.format(date_reservation_date_2.getDate());
            controller.filterTableFromDate(date_of_reservation, table_reservation_details);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter the date!", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_view_reservation_from_dateActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        VLoginPage login_page = new VLoginPage();
        
        int choice = JOptionPane.showConfirmDialog(this, "Do you wish to logout now?" , "Are you sure", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION)
        {
            login_page.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_telephone_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telephone_numberKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(txt_telephone_number.getText().length()>=10 || c==' ' || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txt_telephone_numberKeyTyped

    private void txt_telephone_number2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telephone_number2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(txt_telephone_number2.getText().length()>=10 || c==' ' || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telephone_number2KeyTyped

    private void txt_customer_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_customer_nameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c==' ' || (Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || !Character.isLetter(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_customer_nameKeyTyped

    private void txt_customer_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_customer_emailKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( c==' ' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_customer_emailKeyTyped

    private void cmb_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tableActionPerformed

    private void txt_paid_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paid_amountKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c==' ' || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_paid_amountKeyTyped

    private void btn_upcoming_reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upcoming_reservationsActionPerformed
        // TODO add your handling code here:
        controller.filterTableFromDateForFuture(table_reservation_details);
    }//GEN-LAST:event_btn_upcoming_reservationsActionPerformed

    private void btn_past_reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_past_reservationsActionPerformed
        // TODO add your handling code here:
        controller.filterTableFromDateForPast( table_reservation_details);
    }//GEN-LAST:event_btn_past_reservationsActionPerformed

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
            java.util.logging.Logger.getLogger(VReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VReservationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_past_reservations;
    private javax.swing.JButton btn_paynow;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save_reservation_details;
    private javax.swing.JButton btn_upcoming_reservations;
    private javax.swing.JButton btn_view_reservation;
    private javax.swing.JButton btn_view_reservation_from_date;
    private javax.swing.JButton btn_view_reservation_from_number;
    private javax.swing.JComboBox<String> cmb_buffet_type;
    private javax.swing.JComboBox<String> cmb_table;
    private com.toedter.calendar.JDateChooser date_reservation_date;
    private com.toedter.calendar.JDateChooser date_reservation_date_2;
    private javax.swing.ButtonGroup group_payment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_current_time;
    private javax.swing.JLabel lbl_logged_user;
    private javax.swing.JLabel lbl_logged_user1;
    private javax.swing.JPanel panel_Reservation_layout;
    private javax.swing.JPanel panel_customer_buffet_info;
    private javax.swing.JPanel panel_reservation_details;
    private javax.swing.JPanel panel_reservation_info;
    private javax.swing.JRadioButton radio_card;
    private javax.swing.JRadioButton radio_cash;
    private javax.swing.JTable table_reservation_details;
    private javax.swing.JTextField txt_balance_from_payment;
    private javax.swing.JTextField txt_buffet_price;
    private javax.swing.JTextField txt_customer_email;
    private javax.swing.JTextField txt_customer_name;
    private javax.swing.JSpinner txt_number_of_guests;
    private javax.swing.JTextField txt_number_of_guests_for_payment;
    private javax.swing.JTextField txt_paid_amount;
    private javax.swing.JTextField txt_reservation_id;
    private javax.swing.JTextField txt_telephone_number;
    private javax.swing.JTextField txt_telephone_number2;
    private javax.swing.JTextField txt_time_slot;
    private javax.swing.JTextField txt_total_fee;
    // End of variables declaration//GEN-END:variables

    //LOADING BUFFET NAME TO COMBO BOX
    public void loadBuffetToComboBox() 
    {
        List<String> buffetItems = controller.getBuffetFromDatabase();
        for (String buffetItem : buffetItems) 
        {
        cmb_buffet_type.addItem(buffetItem);
        }
    }
    
    //LOAD TABLE ID TO COMBO BOX
    public void loadTableToComboBox(String date_of_reservation, String time_slot, int spinner_value)
    {
        cmb_table.removeAllItems();
        List<String> tableIDs = controller.getTableFromDatabase(date_of_reservation, time_slot, spinner_value);
        for(String table_id : tableIDs)
        {
            cmb_table.addItem(table_id);
        }
    }
    
    //CHECK EMAIL AND NAME FROM DATABASE
    public void checkNameAndEmailFromDatabase()
    {
        String telephone_number = txt_telephone_number.getText();
        String customer_email = controller.getCustomerEmail(telephone_number);
        String customer_name = controller.getCustomerName(telephone_number);
        if(customer_email !=null && customer_name !=null)
        {
            txt_customer_email.setText(customer_email);
            txt_customer_name.setText(customer_name);
            
            txt_customer_email.setEditable(false);
            txt_customer_name.setEditable(false);
            
            date_reservation_date.setEnabled(true);
        }    
        else
        {
            txt_customer_email.setText("");
            txt_customer_name.setText("");
            
            txt_customer_email.setEditable(true);
            txt_customer_name.setEditable(true);
        }
    } 
    
    //AUTO INCREMENTING THE ID
    public void getAutoId() {
        String id = controller.autoID();
        txt_reservation_id.setText(id);
    }

    //RESTRICT CALENDER DATES CODE
    private void handleBuffetSelection() 
    {
        String selected_buffet = cmb_buffet_type.getSelectedItem().toString();
        if ("High-tea Buffet".equals(selected_buffet)) {
            // If "High tea" is selected, restrict date selection to Wednesday (4) to Sunday (1)
            restrictDateSelectionToWednesdayToSunday();
        } else {
            // Reset the date restrictions for other buffets
            resetDateSelection();
        }
    }

    private void handleDateSelection() 
    {
        try {
            String selected_buffet = cmb_buffet_type.getSelectedItem().toString();
        if ("High-tea Buffet".equals(selected_buffet)) {
            // If "High tea" is selected, enforce date restrictions
            enforceDateRestrictions();
        }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        }
        

    private void restrictDateSelectionToWednesdayToSunday() {
        // Enforce date restrictions when "High-tea Buffet" is selected
        enforceDateRestrictions();
    }

    private void resetDateSelection() {
        // Clear any date restrictions when other buffets are selected
        date_reservation_date.getJCalendar().setSelectableDateRange(null, null);
        date_reservation_date.setMinSelectableDate(date);
    }

    private void enforceDateRestrictions() {
        try {
            Calendar selectedDate = date_reservation_date.getCalendar();
            int dayOfWeek = selectedDate.get(Calendar.DAY_OF_WEEK);

            // Only allow selection on Wednesday (4) to Sunday (1)
            if (dayOfWeek < Calendar.SUNDAY || dayOfWeek > Calendar.THURSDAY) {
            // If the selected date is outside the allowed range, reset the date
            date_reservation_date.setDate(null);
            JOptionPane.showMessageDialog(null, "Only available from Sunday to Thursday!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //DISPLAY VALUES TO JTABLE
    public void displayReservationToTable()
    {
        controller.selectAllReservationDetails(table_reservation_details);
    }
    
    //CALCULATE BALANCE FOR PAYMENT
    public void calculateBalance()
    {
        try
        {
            int total_fee = Integer.parseInt(txt_total_fee.getText());
            int paid_amount = Integer.parseInt(txt_paid_amount.getText());
            int balance = paid_amount- total_fee;
            txt_balance_from_payment.setText(String.valueOf(balance));
            if(balance < 0)
            {
                txt_paid_amount.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                btn_paynow.setEnabled(false);
            }
            else
            {
                txt_paid_amount.setBorder(BorderFactory.createLineBorder(Color.green, 2));
                btn_paynow.setEnabled(true);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //PREVENT ONE CUSTOMER FROM MAKING MANY RESERVATIONS
    public void restrictReservation() {
        try {
            String customer_telephone = txt_telephone_number.getText();
            String buffet_name = cmb_buffet_type.getSelectedItem().toString();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(date_reservation_date.getDate());
            int result = controller.checkCustomerReserved(customer_telephone, buffet_name, date);
            if(result == 1)
            {
                date_reservation_date.setDate(null);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //ENABLING CUSTOMER NAME FIELD
    public void enableCustomerNameField() 
    {
        String text = txt_telephone_number.getText().trim();
        boolean name = !text.isEmpty() && text.matches("\\d+");

        // Enable or disable the second text field based on the condition
        txt_customer_name.setEnabled(name);
        date_reservation_date.getDateEditor().setEnabled(false);
    }
    
    //ENABLING CUSTOMER EMAIL FIELD
    public void enableCustomerEmailField() 
    {
        boolean email = !txt_customer_name.getText().trim().isEmpty();

        // Enable or disable the second text field based on the condition
        txt_customer_email.setEnabled(email);
    }
    
    //ENABLE DATE OF RESERVATION FIELD
    public void enableDateField()
    {
        boolean date = !txt_customer_email.getText().trim().isEmpty();
        date_reservation_date.setEnabled(date);
        date_reservation_date.getDateEditor().setEnabled(false);
    }
    public void enableReserveButtonField()
    {
        String telephone = txt_telephone_number.getText();
        if(telephone.length() == 0)
        {
            btn_save_reservation_details.setEnabled(false);
        }
        else if(telephone.length()<10)
        {
            btn_save_reservation_details.setEnabled(false);
        }
    }
}
