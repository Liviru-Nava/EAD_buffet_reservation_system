/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.CDashboardPage;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class VDashboardPage extends javax.swing.JFrame {
    private CDashboardPage controller;
    public String table_id;
    /**
     * Creates new form VDashboardPage
     */
    public VDashboardPage() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controller = new CDashboardPage();
        txt_table_id.setEditable(false);
        setReservationsToday();
        setNumberOfGuestsToday();
        setTotalRevenueToday();
        displayBuffetToTable();
        displayTablesToTable();
        getAutoId();
        loadTableCapacityToComboBox();
        
        btn_add_buffet.setEnabled(false);
        btn_update_buffet.setEnabled(false);
        btn_delete_buffet.setEnabled(false);
        
        btn_add_table.setEnabled(false);
        btn_update_table.setEnabled(false);
        btn_delete_table.setEnabled(false);
        
        txt_buffet_description.setEnabled(false);
        txt_price_per_head.setEnabled(false);
        
        
        txt_buffet_name.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }
                    
        });
        txt_buffet_description.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }
                    
        });
        txt_price_per_head.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableAddButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
               enableAddButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableAddButton();
            }
                    
        });
    }
    public VDashboardPage(String username)
    {
        initComponents();
        controller = new CDashboardPage();
        txt_table_id.setEditable(false);
        setReservationsToday();
        setNumberOfGuestsToday();
        setTotalRevenueToday();
        displayBuffetToTable();
        displayTablesToTable();
        getAutoId();
        loadTableCapacityToComboBox();
        
        btn_add_buffet.setEnabled(false);
        btn_update_buffet.setEnabled(false);
        btn_delete_buffet.setEnabled(false);
        
        btn_add_table.setEnabled(false);
        btn_update_table.setEnabled(false);
        btn_delete_table.setEnabled(false);
        
        txt_buffet_description.setEnabled(false);
        txt_price_per_head.setEnabled(false);
        
        
        txt_buffet_name.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableDescriptionField();
            }
                    
        });
        txt_buffet_description.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enablePricePerHead();
            }
                    
        });
        txt_price_per_head.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                enableAddButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
               enableAddButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                enableAddButton();
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

        panel_dashboard_main = new javax.swing.JPanel();
        panel_Dashboard_sidepanel = new javax.swing.JPanel();
        btn_user_register = new javax.swing.JButton();
        btn_generate_reports = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_view_reservations = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel_number_of_reservations = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_reservation_today = new javax.swing.JLabel();
        panel_number_of_guests = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_guests_today = new javax.swing.JLabel();
        panel_total_revenue = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_total_revenue_today = new javax.swing.JLabel();
        panel_add_buffet = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_buffet_details = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_buffet_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_buffet_description = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_price_per_head = new javax.swing.JTextField();
        btn_add_buffet = new javax.swing.JButton();
        btn_delete_buffet = new javax.swing.JButton();
        btn_update_buffet = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmb_time = new javax.swing.JComboBox<>();
        cmb_time_numbers = new javax.swing.JComboBox<>();
        btn_refresh_buffet = new javax.swing.JButton();
        panel_add_table = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Table_details = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_table_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_add_table = new javax.swing.JButton();
        btn_update_table = new javax.swing.JButton();
        btn_delete_table = new javax.swing.JButton();
        cmb_table_capacity = new javax.swing.JComboBox<>();
        btn_refresh_table = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dashboard_main.setBackground(new java.awt.Color(181, 240, 255));
        panel_dashboard_main.setForeground(new java.awt.Color(202, 255, 253));
        panel_dashboard_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Dashboard_sidepanel.setBackground(new java.awt.Color(0, 0, 51));
        panel_Dashboard_sidepanel.setForeground(new java.awt.Color(255, 255, 255));

        btn_user_register.setBackground(new java.awt.Color(181, 168, 216));
        btn_user_register.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_user_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_user_register.setText("User Registration");
        btn_user_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_registerActionPerformed(evt);
            }
        });

        btn_generate_reports.setBackground(new java.awt.Color(181, 168, 216));
        btn_generate_reports.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_generate_reports.setForeground(new java.awt.Color(0, 0, 0));
        btn_generate_reports.setText("Generate Reports");
        btn_generate_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_reportsActionPerformed(evt);
            }
        });

        btn_dashboard.setBackground(new java.awt.Color(181, 168, 216));
        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(0, 0, 0));
        btn_dashboard.setText("Dashboard");

        btn_logout.setBackground(new java.awt.Color(0, 0, 51));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-logout-50.png"))); // NOI18N
        btn_logout.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_view_reservations.setBackground(new java.awt.Color(181, 168, 216));
        btn_view_reservations.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_view_reservations.setForeground(new java.awt.Color(0, 0, 0));
        btn_view_reservations.setText("View Reservation");
        btn_view_reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_reservationsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin ");

        javax.swing.GroupLayout panel_Dashboard_sidepanelLayout = new javax.swing.GroupLayout(panel_Dashboard_sidepanel);
        panel_Dashboard_sidepanel.setLayout(panel_Dashboard_sidepanelLayout);
        panel_Dashboard_sidepanelLayout.setHorizontalGroup(
            panel_Dashboard_sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                .addGroup(panel_Dashboard_sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_Dashboard_sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_generate_reports, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(btn_user_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(btn_view_reservations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                    .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                        .addGroup(panel_Dashboard_sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_Dashboard_sidepanelLayout.setVerticalGroup(
            panel_Dashboard_sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Dashboard_sidepanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_user_register, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_view_reservations, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_generate_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        panel_dashboard_main.add(panel_Dashboard_sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 830));

        panel_number_of_reservations.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reservations Made Today");

        lbl_reservation_today.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_reservation_today.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reservation_today.setText("jLabel10");

        javax.swing.GroupLayout panel_number_of_reservationsLayout = new javax.swing.GroupLayout(panel_number_of_reservations);
        panel_number_of_reservations.setLayout(panel_number_of_reservationsLayout);
        panel_number_of_reservationsLayout.setHorizontalGroup(
            panel_number_of_reservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_number_of_reservationsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_reservation_today, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(panel_number_of_reservationsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panel_number_of_reservationsLayout.setVerticalGroup(
            panel_number_of_reservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_number_of_reservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(lbl_reservation_today, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        panel_dashboard_main.add(panel_number_of_reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 380, 210));

        panel_number_of_guests.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>\n<p>Number of Guests</p>\n<p>Expected Today</p>\n</html>");

        lbl_guests_today.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_guests_today.setForeground(new java.awt.Color(255, 255, 255));
        lbl_guests_today.setText("jLabel11");

        javax.swing.GroupLayout panel_number_of_guestsLayout = new javax.swing.GroupLayout(panel_number_of_guests);
        panel_number_of_guests.setLayout(panel_number_of_guestsLayout);
        panel_number_of_guestsLayout.setHorizontalGroup(
            panel_number_of_guestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_number_of_guestsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_number_of_guestsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_guests_today)
                .addGap(51, 51, 51))
        );
        panel_number_of_guestsLayout.setVerticalGroup(
            panel_number_of_guestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_number_of_guestsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lbl_guests_today, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panel_dashboard_main.add(panel_number_of_guests, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 374, 210));

        panel_total_revenue.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Revenue Made Today");

        lbl_total_revenue_today.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_total_revenue_today.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total_revenue_today.setText("jLabel12");

        javax.swing.GroupLayout panel_total_revenueLayout = new javax.swing.GroupLayout(panel_total_revenue);
        panel_total_revenue.setLayout(panel_total_revenueLayout);
        panel_total_revenueLayout.setHorizontalGroup(
            panel_total_revenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_total_revenueLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_total_revenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_total_revenue_today)
                    .addComponent(jLabel3))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel_total_revenueLayout.setVerticalGroup(
            panel_total_revenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_total_revenueLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(lbl_total_revenue_today, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        panel_dashboard_main.add(panel_total_revenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, 210));

        panel_add_buffet.setBackground(new java.awt.Color(153, 153, 153));

        table_buffet_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Buffet_Name", "Description", "Price_per_head", "Time slot"
            }
        ));
        table_buffet_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_buffet_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_buffet_details);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buffet Name");

        txt_buffet_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_buffet_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buffet_nameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Description");

        txt_buffet_description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_buffet_description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buffet_descriptionKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Price per head");

        txt_price_per_head.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_price_per_head.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_price_per_headKeyTyped(evt);
            }
        });

        btn_add_buffet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add_buffet.setText("Add Buffet");
        btn_add_buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_buffetActionPerformed(evt);
            }
        });

        btn_delete_buffet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete_buffet.setText("Delete Buffet");
        btn_delete_buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_buffetActionPerformed(evt);
            }
        });

        btn_update_buffet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_update_buffet.setText("Update Buffet");
        btn_update_buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_buffetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Time Slot");

        cmb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        cmb_time_numbers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btn_refresh_buffet.setBackground(new java.awt.Color(153, 153, 153));
        btn_refresh_buffet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-refresh-30.png"))); // NOI18N
        btn_refresh_buffet.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_refresh_buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_buffetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_add_buffetLayout = new javax.swing.GroupLayout(panel_add_buffet);
        panel_add_buffet.setLayout(panel_add_buffetLayout);
        panel_add_buffetLayout.setHorizontalGroup(
            panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_buffetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_buffetLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_add_buffetLayout.createSequentialGroup()
                                .addComponent(cmb_time_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_refresh_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_buffetLayout.createSequentialGroup()
                                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_buffet_name, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_buffet_description, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_price_per_head)
                                    .addComponent(jLabel7)))
                            .addGroup(panel_add_buffetLayout.createSequentialGroup()
                                .addComponent(btn_add_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btn_update_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn_delete_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(panel_add_buffetLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panel_add_buffetLayout.setVerticalGroup(
            panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_buffetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_add_buffetLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buffet_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_add_buffetLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_price_per_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_add_buffetLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buffet_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_time_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel_add_buffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_buffet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        panel_dashboard_main.add(panel_add_buffet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 580, 490));

        panel_add_table.setBackground(new java.awt.Color(153, 153, 153));

        table_Table_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Table_ID", "Table_Capacity"
            }
        ));
        table_Table_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_Table_detailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_Table_details);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Table ID");

        txt_table_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Table Capacity");

        btn_add_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add_table.setText("Add Table");
        btn_add_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_tableActionPerformed(evt);
            }
        });

        btn_update_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_update_table.setText("Update Table");
        btn_update_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_tableActionPerformed(evt);
            }
        });

        btn_delete_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete_table.setText("Delete Table");
        btn_delete_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_tableActionPerformed(evt);
            }
        });

        cmb_table_capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_table_capacityActionPerformed(evt);
            }
        });

        btn_refresh_table.setBackground(new java.awt.Color(153, 153, 153));
        btn_refresh_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-refresh-30.png"))); // NOI18N
        btn_refresh_table.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_refresh_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_add_tableLayout = new javax.swing.GroupLayout(panel_add_table);
        panel_add_table.setLayout(panel_add_tableLayout);
        panel_add_tableLayout.setHorizontalGroup(
            panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_tableLayout.createSequentialGroup()
                .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_add_tableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_tableLayout.createSequentialGroup()
                        .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_add_tableLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_add_table, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btn_update_table, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(panel_add_tableLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_table_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(btn_delete_table, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_table_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_tableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_refresh_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panel_add_tableLayout.setVerticalGroup(
            panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_table_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_table_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_refresh_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panel_add_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_table, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_table, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_table, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        panel_dashboard_main.add(panel_add_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, 490));

        getContentPane().add(panel_dashboard_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 900));

        setBounds(0, 0, 1543, 837);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_user_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_registerActionPerformed
        // TODO add your handling code here:
        VUserRegistrationPage user_register_page = new VUserRegistrationPage();
        user_register_page.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btn_user_registerActionPerformed

    private void btn_add_buffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_buffetActionPerformed
        // TODO add your handling code here:
        try 
        {
            String buffet_name = txt_buffet_name.getText();
            String buffet_description = txt_buffet_description.getText();
            int price_per_head = Integer.parseInt(txt_price_per_head.getText());
            String time_slot = (cmb_time_numbers.getSelectedItem()).toString();
            String time_of_day = String.valueOf(cmb_time.getSelectedItem());
            StringBuilder new_time_slot = new StringBuilder();
            new_time_slot.append(time_slot + " ");
            new_time_slot.append(time_of_day);
        
            //INSERT INTO DATABASE
            controller.addNewBuffet(buffet_name, buffet_description, price_per_head, new_time_slot);
            displayBuffetToTable();
            txt_buffet_name.setText("");
            txt_buffet_description.setText("");
            txt_price_per_head.setText("");
            cmb_time_numbers.setSelectedIndex(0);
            cmb_time.setSelectedIndex(0);
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please provide an price", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add_buffetActionPerformed

    private void table_buffet_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_buffet_detailsMouseClicked
        // TODO add your handling code here:
        btn_add_buffet.setEnabled(false);
        btn_update_buffet.setEnabled(true);
        btn_delete_buffet.setEnabled(true);
        int row = table_buffet_details.getSelectedRow();
        DefaultTableModel tableBuffet = (DefaultTableModel)table_buffet_details.getModel();
        
        //insert row records to text boxes
        txt_buffet_name.setText(tableBuffet.getValueAt(row, 0).toString());
        txt_buffet_description.setText(tableBuffet.getValueAt(row, 1).toString());
        txt_price_per_head.setText(tableBuffet.getValueAt(row, 2).toString());
    }//GEN-LAST:event_table_buffet_detailsMouseClicked

    private void btn_update_buffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_buffetActionPerformed
        // TODO add your handling code here:
        String buffet_name = txt_buffet_name.getText();
        String buffet_description = txt_buffet_description.getText();
        int price_per_head = Integer.parseInt(txt_price_per_head.getText());
        String time_slot = (cmb_time_numbers.getSelectedItem()).toString();
        String time_of_day = String.valueOf(cmb_time.getSelectedItem());
        StringBuilder new_time_slot = new StringBuilder();
        new_time_slot.append(time_slot + " ");
        new_time_slot.append(time_of_day);
        
        //UPDATE INTO DATABASE
        controller.updateBuffet(buffet_name, buffet_description, price_per_head, new_time_slot);
        displayBuffetToTable();
        txt_buffet_name.setText("");
        txt_buffet_description.setText("");
        txt_price_per_head.setText("");
    }//GEN-LAST:event_btn_update_buffetActionPerformed

    private void btn_delete_buffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_buffetActionPerformed
        // TODO add your handling code here:
        String buffet_name = txt_buffet_name.getText();

        //UPDATE INTO DATABASE
        controller.deleteBuffet(buffet_name);
        displayBuffetToTable();
        txt_buffet_name.setText("");
        txt_buffet_description.setText("");
        txt_price_per_head.setText("");
    }//GEN-LAST:event_btn_delete_buffetActionPerformed

    private void btn_add_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_tableActionPerformed
        // TODO add your handling code here:
        String table_id = txt_table_id.getText();
        String capacity = cmb_table_capacity.getSelectedItem().toString();
        StringBuilder new_table_id = new StringBuilder();
        new_table_id.append(table_id + "-");
        new_table_id.append(capacity);
        
        //INSERT INTO DATABASE
        controller.addNewTable(new_table_id, capacity);
        displayTablesToTable();
        cmb_table_capacity.setSelectedIndex(0);
        getAutoId();
    }//GEN-LAST:event_btn_add_tableActionPerformed

    private void table_Table_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Table_detailsMouseClicked
        // TODO add your handling code here:
        btn_add_table.setEnabled(false);
        btn_update_table.setEnabled(true);
        btn_delete_table.setEnabled(true);
        int row = table_Table_details.getSelectedRow();
        DefaultTableModel table_details = (DefaultTableModel)table_Table_details.getModel();
        table_id = table_details.getValueAt(row, 0).toString();
        String front_text = table_id.substring(0, table_id.indexOf("-"));
        
        //insert row records to text boxes
        txt_table_id.setText(front_text);
    }//GEN-LAST:event_table_Table_detailsMouseClicked

    private void btn_update_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_tableActionPerformed
        // TODO add your handling code here:
        String front_text = txt_table_id.getText();
        String capacity = cmb_table_capacity.getSelectedItem().toString();
        controller.updateTableCapacity(front_text, capacity, table_id); 
        displayTablesToTable();
        cmb_table_capacity.setSelectedIndex(0);
        getAutoId();
        btn_add_table.setEnabled(true);
    }//GEN-LAST:event_btn_update_tableActionPerformed

    private void cmb_table_capacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_table_capacityActionPerformed
        // TODO add your handling code here:
        btn_add_table.setEnabled(true);
    }//GEN-LAST:event_cmb_table_capacityActionPerformed

    private void btn_delete_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_tableActionPerformed
        // TODO add your handling code here:
        controller.deleteTableFromDatabase(table_id);
        displayTablesToTable();
        getAutoId();
        btn_add_table.setEnabled(true);
    }//GEN-LAST:event_btn_delete_tableActionPerformed

    private void btn_generate_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_reportsActionPerformed
        // TODO add your handling code here:
        VGenerateReportPage generateReport = new VGenerateReportPage();
        generateReport.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_generate_reportsActionPerformed

    private void btn_view_reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_reservationsActionPerformed
        // TODO add your handling code here:
        VCancelReservationPage cancelReservation = new VCancelReservationPage();
        cancelReservation.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_view_reservationsActionPerformed

    private void btn_refresh_buffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_buffetActionPerformed
        // TODO add your handling code here:
        controller.selectAllBuffetDetails(table_buffet_details);
        txt_buffet_name.setText("");
        txt_buffet_description.setText("");
        txt_price_per_head.setText("");
    }//GEN-LAST:event_btn_refresh_buffetActionPerformed

    private void btn_refresh_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_tableActionPerformed
        // TODO add your handling code here:
        controller.selectAllTableDetails(table_Table_details);
    }//GEN-LAST:event_btn_refresh_tableActionPerformed

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

    private void txt_buffet_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buffet_nameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_buffet_nameKeyTyped

    private void txt_buffet_descriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buffet_descriptionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_buffet_descriptionKeyTyped

    private void txt_price_per_headKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_price_per_headKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((!Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || Character.isLetter(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_price_per_headKeyTyped

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
            java.util.logging.Logger.getLogger(VDashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDashboardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_buffet;
    private javax.swing.JButton btn_add_table;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_delete_buffet;
    private javax.swing.JButton btn_delete_table;
    private javax.swing.JButton btn_generate_reports;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_refresh_buffet;
    private javax.swing.JButton btn_refresh_table;
    private javax.swing.JButton btn_update_buffet;
    private javax.swing.JButton btn_update_table;
    private javax.swing.JButton btn_user_register;
    private javax.swing.JButton btn_view_reservations;
    private javax.swing.JComboBox<String> cmb_table_capacity;
    private javax.swing.JComboBox<String> cmb_time;
    private javax.swing.JComboBox<String> cmb_time_numbers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_guests_today;
    private javax.swing.JLabel lbl_reservation_today;
    private javax.swing.JLabel lbl_total_revenue_today;
    private javax.swing.JPanel panel_Dashboard_sidepanel;
    private javax.swing.JPanel panel_add_buffet;
    private javax.swing.JPanel panel_add_table;
    private javax.swing.JPanel panel_dashboard_main;
    private javax.swing.JPanel panel_number_of_guests;
    private javax.swing.JPanel panel_number_of_reservations;
    private javax.swing.JPanel panel_total_revenue;
    private javax.swing.JTable table_Table_details;
    private javax.swing.JTable table_buffet_details;
    private javax.swing.JTextField txt_buffet_description;
    private javax.swing.JTextField txt_buffet_name;
    private javax.swing.JTextField txt_price_per_head;
    private javax.swing.JTextField txt_table_id;
    // End of variables declaration//GEN-END:variables
    
    //METHODS
    public void setReservationsToday()
    {
        lbl_reservation_today.setText(String.valueOf(controller.getReservationToday()));
    }
    public void setNumberOfGuestsToday()
    {
        lbl_guests_today.setText(String.valueOf(controller.getNumberOfGuestsToday()));
    }
    public void setTotalRevenueToday()
    {
        lbl_total_revenue_today.setText(String.valueOf(controller.getTotalRevenueToday()));
    }
    //DISPLAY VALUES TO JTABLE
    public void displayBuffetToTable()
    {
        controller.selectAllBuffetDetails(table_buffet_details);
    }

    public void displayTablesToTable() {
        controller.selectAllTableDetails(table_Table_details);
    }
    public void getAutoId() {
        String id = controller.autoID();
        txt_table_id.setText(id);
    }
    public void loadTableCapacityToComboBox() 
    {
        List<String> TableCapacity = controller.getTableCapacity();
        for (String table_capacity : TableCapacity) 
        {
        cmb_table_capacity.addItem(table_capacity);
        //System.out.println("Combo box populated: " + buffetItems);
        }
    }
    
    public void enableDescriptionField()
    {
        boolean buffet_name = !txt_buffet_name.getText().trim().isEmpty();
        txt_buffet_description.setEnabled(buffet_name);
    }
    public void enablePricePerHead()
    {
        boolean buffet_description = !txt_buffet_description.getText().trim().isEmpty();
        txt_price_per_head.setEnabled(buffet_description);
    }
    public void enableAddButton()
    {
        boolean price_per_head = !txt_price_per_head.getText().trim().isEmpty();
        btn_add_buffet.setEnabled(price_per_head);
    }
}
