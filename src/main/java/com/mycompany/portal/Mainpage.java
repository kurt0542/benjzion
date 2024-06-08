package com.mycompany.portal;

import LoginAndSignup.Login;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mainpage extends javax.swing.JFrame {
    Connection ConnectDB;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    /**
     * 
     * Creates new form Mainpage
     */
    public Mainpage() {
        initComponents();
        MainProfile main = new MainProfile();
        Background.removeAll();
        Background.add(main).setVisible(true);
        
        ConnectDB = DBconnection.Conn();
        findstrand();
    }
    
    public final void findstrand(){
        try {
            st = ConnectDB.createStatement();
            String query = "SELECT recentID FROM recentlogininfo WHERE ID= 1";
            rs = st.executeQuery(query);
            String StudentID = null, Strand = null;
            while(rs.next()){
                StudentID = rs.getString(1);               
            }
            System.out.println(StudentID);
            query = "SELECT Strand FROM Main_Profile_ICT_12B WHERE Student_Number='"+StudentID+"'";
            rs = st.executeQuery(query);
            while(rs.next()){
                Strand = rs.getString(1);
            }
            System.out.println(Strand);
            if("INFORMATION COMMUNICATION TECHNOLOGY".equals(Strand) || "IA".equals(Strand)){
                Color Primary = new Color(4,138,150);
                Color Secondary = new Color (153,255,255);
                jPanel3.setBackground(Primary);
                jPanel10.setBackground(Secondary);
                jPanel11.setBackground(Secondary);
                jPanel7.setBackground(Secondary);
                jPanel8.setBackground(Secondary);
                jPanel9.setBackground(Secondary);                
            }
            else if("GAS".equals(Strand)){
                Color Primary = new Color(0,153,0);
                Color Secondary = new Color (51,255,51);
                jPanel3.setBackground(Primary);
                jPanel10.setBackground(Secondary);
                jPanel11.setBackground(Secondary);
                jPanel7.setBackground(Secondary);
                jPanel8.setBackground(Secondary);
                jPanel9.setBackground(Secondary); 
                jPanel12.setBackground(Primary);
                jPanel4.setBackground(Primary);
                jPanel5.setBackground(Primary);
                jPanel6.setBackground(Primary);
            }
            else if("HUMSS".equals(Strand)) {
                Color Primary = new Color(153,0,0);
                Color Secondary = new Color (255,0,51);
                jPanel3.setBackground(Primary);
                jPanel10.setBackground(Secondary);
                jPanel11.setBackground(Secondary);
                jPanel7.setBackground(Secondary);
                jPanel8.setBackground(Secondary);
                jPanel9.setBackground(Secondary); 
                jPanel12.setBackground(Primary);
                jPanel4.setBackground(Primary);
                jPanel5.setBackground(Primary);
                jPanel6.setBackground(Primary);
        }
            else if("ABM".equals(Strand)) {
                Color Primary = new Color(153,153,0);
                Color Secondary = new Color (255,255,0);
                jPanel3.setBackground(Primary);
                jPanel10.setBackground(Secondary);
                jPanel11.setBackground(Secondary);
                jPanel7.setBackground(Secondary);
                jPanel8.setBackground(Secondary);
                jPanel9.setBackground(Secondary); 
                jPanel12.setBackground(Primary);
                jPanel4.setBackground(Primary);
                jPanel5.setBackground(Primary);
                jPanel6.setBackground(Primary);
            }
            else if("HOME ENGINEERING".equals(Strand)) {
                Color Primary = new Color(102,0,102);
                Color Secondary = new Color (204,0,204);
                jPanel3.setBackground(Primary);
                jPanel10.setBackground(Secondary);
                jPanel11.setBackground(Secondary);
                jPanel7.setBackground(Secondary);
                jPanel8.setBackground(Secondary);
                jPanel9.setBackground(Secondary); 
                jPanel12.setBackground(Primary);
                jPanel4.setBackground(Primary);
                jPanel5.setBackground(Primary);
                jPanel6.setBackground(Primary);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        avatarBorder1 = new topglobalnakaw.AvatarBorder();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Background = new javax.swing.JDesktopPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Mainpage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Classinfo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reportcard = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(4, 138, 150));
        jPanel12.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 4, 750));

        avatarBorder1.setBorderSize(7);
        avatarBorder1.setBorderSpace(-20);
        avatarBorder1.setGradientColor1(new java.awt.Color(0, 0, 0));
        avatarBorder1.setGradientColor2(new java.awt.Color(0, 0, 0));
        avatarBorder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/ccst nigga.png"))); // NOI18N
        jPanel1.add(avatarBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 230));

        jPanel3.setBackground(new java.awt.Color(4, 138, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLARK COLLEGE OF SCIENCE AND TECHNOLOGY");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 28, 1160, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SNS BLDG...AUREA ST., SAMSONVILLE SUBD. DAU MABALACAT CITY, PAMPANGA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 870, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 138));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logout");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 113, 28));

        Background.setBackground(new java.awt.Color(234, 232, 220));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1517, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 144, -1, -1));

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 130, 10, 760));

        jPanel4.setBackground(new java.awt.Color(4, 138, 150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(32, 5));
        jPanel7.setName(""); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(230, 5));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        Mainpage.setBackground(new java.awt.Color(4, 138, 150));
        Mainpage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Mainpage.setForeground(new java.awt.Color(255, 255, 255));
        Mainpage.setText("  Main profile");
        Mainpage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mainpage.setMaximumSize(new java.awt.Dimension(145, 25));
        Mainpage.setMinimumSize(new java.awt.Dimension(145, 25));
        Mainpage.setPreferredSize(new java.awt.Dimension(145, 25));
        Mainpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainpageMouseClicked(evt);
            }
        });
        jPanel4.add(Mainpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 60));

        jPanel5.setBackground(new java.awt.Color(4, 138, 150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(32, 5));
        jPanel8.setName(""); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 5));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        Classinfo.setBackground(new java.awt.Color(4, 138, 150));
        Classinfo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Classinfo.setForeground(new java.awt.Color(255, 255, 255));
        Classinfo.setText("Class Information");
        Classinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Classinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassinfoMouseClicked(evt);
            }
        });
        jPanel5.add(Classinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-calendar-50.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 60));

        jPanel6.setBackground(new java.awt.Color(4, 138, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(32, 5));
        jPanel9.setName(""); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(230, 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-report-card-50.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 40));

        reportcard.setBackground(new java.awt.Color(4, 138, 150));
        reportcard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reportcard.setForeground(new java.awt.Color(255, 255, 255));
        reportcard.setText("Report Card");
        reportcard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportcard.setMaximumSize(new java.awt.Dimension(145, 25));
        reportcard.setMinimumSize(new java.awt.Dimension(145, 25));
        reportcard.setPreferredSize(new java.awt.Dimension(145, 25));
        reportcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportcardMouseClicked(evt);
            }
        });
        jPanel6.add(reportcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 230, 60));

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(32, 5));
        jPanel10.setName(""); // NOI18N
        jPanel10.setPreferredSize(new java.awt.Dimension(230, 5));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 135, 1520, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lower opacity orgs logo resized.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void reportcardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportcardMouseClicked
        ReportCard reportcard = new ReportCard();
        Background.removeAll();
        Background.add(reportcard).setVisible(true);
    }//GEN-LAST:event_reportcardMouseClicked

    private void ClassinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassinfoMouseClicked
        Classinformation classinfo = new Classinformation();
        Background.removeAll();
        Background.add(classinfo).setVisible(true);
    }//GEN-LAST:event_ClassinfoMouseClicked

    private void MainpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainpageMouseClicked
       MainProfile mainprofile = new MainProfile();
        Background.removeAll();
        Background.add(mainprofile).setVisible(true);
    }//GEN-LAST:event_MainpageMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login betlog = new Login();
        dispose();
        betlog.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Background;
    private javax.swing.JLabel Classinfo;
    private javax.swing.JLabel Mainpage;
    private topglobalnakaw.AvatarBorder avatarBorder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel reportcard;
    // End of variables declaration//GEN-END:variables
}
