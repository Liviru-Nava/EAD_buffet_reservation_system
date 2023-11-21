/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.DBClass;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author ASUS
 */
public class VGenerateReportPage extends javax.swing.JFrame {
    
    /**
     * Creates new form VGenerateReportPage
     */
    public VGenerateReportPage() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        connect();
    }
    private Connection conn;
    private PreparedStatement pst;
    public void connect()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/buffet_reservation_system", "root", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public void loadReport()
    {
        SimpleDateFormat fromDate = new SimpleDateFormat("yyyy-MM-dd");
        String from_date1 = fromDate.format(date_from_date.getDate());
        
        SimpleDateFormat toDate = new SimpleDateFormat("yyyy-MM-dd");
        String to_date1 = toDate.format(date_to_date.getDate());
        
        
        try {
            JasperDesign jasperdesign1 = JRXmlLoader.load("C:\\Users\\ASUS\\OneDrive\\Desktop\\NIBM\\SEMESTER 2\\EAD\\Activities\\Buffet_Reservation_System\\src\\View\\report1.jrxml");
        JRDesignQuery designquery = new JRDesignQuery();
        designquery.setText("SELECT R.buffet_name, (SELECT customer_name FROM tbl_customer WHERE customer_telephone = R.customer_telephone) as customer_name, R.date, R.num_of_guests, \n" +
"R.total_fee\n" +
"FROM tbl_reservation R\n" +
"JOIN tbl_buffet B\n" +
"ON R.buffet_name = B.buffet_name AND date between '"+from_date1+"' AND '"+to_date1+"' ORDER BY R.buffet_name ASC;");
        jasperdesign1.setQuery(designquery);
        JasperReport jasperreport1 = JasperCompileManager.compileReport(jasperdesign1);
        String dbpath = "jdbc:mysql://localhost/buffet_reservation_system";
        Connection conn = DriverManager.getConnection(dbpath, "root", "");
        JasperPrint print1 = JasperFillManager.fillReport(jasperreport1, null, conn);
        JRViewer view1 = new JRViewer(print1);
        
        panel_load_report.removeAll();
        panel_load_report.repaint();
        panel_load_report.revalidate();
        
        panel_load_report.setLayout(new BorderLayout());
        panel_load_report.add(view1);
        
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date_to_date = new com.toedter.calendar.JDateChooser();
        date_from_date = new com.toedter.calendar.JDateChooser();
        btn_generate_daily_report = new javax.swing.JButton();
        btn_generate_monthly_report = new javax.swing.JButton();
        btn_back_button = new javax.swing.JButton();
        panel_load_report = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 830));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 830));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate Revenue Report");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From date:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To date:");

        date_to_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        date_from_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_generate_daily_report.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_generate_daily_report.setText("Generate Daily Revenue Report");
        btn_generate_daily_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_daily_reportActionPerformed(evt);
            }
        });

        btn_generate_monthly_report.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_generate_monthly_report.setText("Generate Monthly Revenue Report");
        btn_generate_monthly_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_monthly_reportActionPerformed(evt);
            }
        });

        btn_back_button.setBackground(new java.awt.Color(0, 0, 51));
        btn_back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-button-50.png"))); // NOI18N
        btn_back_button.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(date_from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(date_to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_generate_daily_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_generate_monthly_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_to_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_from_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btn_generate_monthly_report, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_generate_daily_report, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        panel_load_report.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout panel_load_reportLayout = new javax.swing.GroupLayout(panel_load_report);
        panel_load_report.setLayout(panel_load_reportLayout);
        panel_load_reportLayout.setHorizontalGroup(
            panel_load_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        panel_load_reportLayout.setVerticalGroup(
            panel_load_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel1.add(panel_load_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 1080, 830));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generate_monthly_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_monthly_reportActionPerformed
        // TODO add your handling code here:
        try {
            if(date_from_date.getDate()==null || date_to_date.getDate()==null)
            {
                JOptionPane.showMessageDialog(null, "Please select a date range!", "error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                loadReport();
            }
        } 
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_generate_monthly_reportActionPerformed

    private void btn_generate_daily_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_daily_reportActionPerformed
        // TODO add your handling code here:
        try {
            JasperDesign jasperdesign1 = JRXmlLoader.load("C:\\Users\\ASUS\\OneDrive\\Desktop\\NIBM\\SEMESTER 2\\EAD\\Activities\\Buffet_Reservation_System\\src\\View\\report1.jrxml");
        JRDesignQuery designquery = new JRDesignQuery();
        designquery.setText("SELECT R.buffet_name, (SELECT customer_name FROM tbl_customer WHERE customer_telephone = R.customer_telephone) as customer_name, R.date, R.num_of_guests, \n" +
"R.total_fee\n" +
"FROM tbl_reservation R\n" +
"JOIN tbl_buffet B\n" +
"ON R.buffet_name = B.buffet_name\n" +
"WHERE R.date = CURDATE()\n" +
"ORDER BY R.buffet_name ASC");
        jasperdesign1.setQuery(designquery);
        JasperReport jasperreport1 = JasperCompileManager.compileReport(jasperdesign1);
        String dbpath = "jdbc:mysql://localhost/buffet_reservation_system";
        Connection conn = DriverManager.getConnection(dbpath, "root", "");
        JasperPrint print1 = JasperFillManager.fillReport(jasperreport1, null, conn);
        JRViewer view1 = new JRViewer(print1);
        
        panel_load_report.removeAll();
        panel_load_report.repaint();
        panel_load_report.revalidate();
        
        panel_load_report.setLayout(new BorderLayout());
        panel_load_report.add(view1);
        
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_generate_daily_reportActionPerformed

    private void btn_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_buttonActionPerformed
        // TODO add your handling code here:
        VDashboardPage dashboard_page = new VDashboardPage();
        dashboard_page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(VGenerateReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGenerateReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGenerateReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGenerateReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VGenerateReportPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_button;
    private javax.swing.JButton btn_generate_daily_report;
    private javax.swing.JButton btn_generate_monthly_report;
    private com.toedter.calendar.JDateChooser date_from_date;
    private com.toedter.calendar.JDateChooser date_to_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_load_report;
    // End of variables declaration//GEN-END:variables
    
}
