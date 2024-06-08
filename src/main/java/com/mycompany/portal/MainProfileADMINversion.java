/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.portal;

import static com.mycompany.portal.ReportCard.jLabel13;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.net.http.WebSocket.Listener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class MainProfileADMINversion extends javax.swing.JInternalFrame {

   //Var declarations: Necessary to make cleaner/readable code - Avery
    Connection ConnectDB;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public MainProfileADMINversion() {
        try {
            File importTitleFont = new File("src/main/resources/BebasNeue-Regular.ttf");
            
//            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, importTitleFont).deriveFont(60f);
            
            studentFullNameField.setFont(Font.createFont(Font.TRUETYPE_FONT, importTitleFont).deriveFont(35f));
        } catch (Exception e) {
        }
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI panel = (BasicInternalFrameUI) this.getUI();
        panel.setNorthPane(null);   
        
        ConnectDB = DBconnection.Conn();
        
        
        gradeLevelComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if ((String) gradeLevelComboBox.getSelectedItem() != "Select grade level...") {
                    GradeAdd1.setText((String) gradeLevelComboBox.getSelectedItem());
                } else if ((String) gradeLevelComboBox.getSelectedItem() == "Select grade level...") {
                    GradeAdd1.setText("[GRADE LEVEL]");
                }
            }
            
        });
        
        strandComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if ((String) strandComboBox.getSelectedItem() != "Select strand...")
                    StrandAdd1.setText((String) strandComboBox.getSelectedItem());
                    else if ((String) strandComboBox.getSelectedItem() == "Select strand...") {
                        StrandAdd1.setText("[ STRAND ]");
                    }
                }
            }
            
        });
        
        ((AbstractDocument) SectionAdd1.getDocument()).setDocumentFilter(new DocumentFilter() {
                @Override
                public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                    if (string == null) {
                        return;
                    } else {
                        replace(fb, offset, 0, string, attr);
                    }
                }

                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    Document doc = fb.getDocument();
                    int currentLength = doc.getLength();
                    String upper = text.toUpperCase();
                    if ((currentLength - length) < 1 && upper.matches("[A-Z]")) {
                        super.replace(fb, offset, length, upper, attrs);
                    }
                }

                @Override
                public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                    super.remove(fb, offset, length);
                }
            });

//        LoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        curvedPanel1 = new topglobalnakaw.CurvedPanel();
        curvedPanel2 = new topglobalnakaw.CurvedPanel();
        jSeparator1 = new javax.swing.JSeparator();
        StudentNumber = new javax.swing.JLabel();
        RatingText = new javax.swing.JLabel();
        GradeLevelText2 = new javax.swing.JLabel();
        GradeAndSectionText = new javax.swing.JLabel();
        RegularStudentText = new javax.swing.JLabel();
        StrandText1 = new javax.swing.JLabel();
        strandComboBox = new javax.swing.JComboBox<>();
        studentFullNameField = new topglobalnakaw.LoginCustomTextField();
        Status1 = new topglobalnakaw.LoginCustomTextField();
        StrandAdd1 = new topglobalnakaw.LoginCustomTextField();
        GradeAdd1 = new topglobalnakaw.LoginCustomTextField();
        SectionAdd1 = new topglobalnakaw.LoginCustomTextField();
        gradeLevelComboBox = new javax.swing.JComboBox<>();
        curvedPanel3 = new topglobalnakaw.CurvedPanel();
        curvedPanel4 = new topglobalnakaw.CurvedPanel();
        jSeparator2 = new javax.swing.JSeparator();
        MobileNumberTextHolder = new javax.swing.JLabel();
        EmailTextHolder = new javax.swing.JLabel();
        GuardianFacebookAccountTextHolder = new javax.swing.JLabel();
        GuardianMobileNumberTextHolder = new javax.swing.JLabel();
        FacebookAccountTextHolder1 = new javax.swing.JLabel();
        EmailTextHolder1 = new javax.swing.JLabel();
        GuardianNameTextHolder = new javax.swing.JLabel();
        studentEmailAdd = new topglobalnakaw.LoginCustomTextField();
        mNumberAdd1 = new topglobalnakaw.LoginCustomTextField();
        studentFbAdd = new topglobalnakaw.LoginCustomTextField();
        GuardianNameAdd1 = new topglobalnakaw.LoginCustomTextField();
        GuardianMnumberAdd1 = new topglobalnakaw.LoginCustomTextField();
        guardianFBadd1 = new topglobalnakaw.LoginCustomTextField();
        guardianEMAILadd1 = new topglobalnakaw.LoginCustomTextField();
        curvedPanel5 = new topglobalnakaw.CurvedPanel();
        curvedPanel6 = new topglobalnakaw.CurvedPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        StudentFormerSectionsActual = new javax.swing.JLabel();
        Schoolyear = new topglobalnakaw.LoginCustomTextField();
        FormerSection1 = new topglobalnakaw.LoginCustomTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BackgroundOnly6 = new javax.swing.JLabel();
        BackgroundOnly5 = new javax.swing.JLabel();
        BackgroundOnly2 = new javax.swing.JLabel();
        BackgroundOnly3 = new javax.swing.JLabel();
        BackgroundOnly1 = new javax.swing.JLabel();
        BackgroundOnly4 = new javax.swing.JLabel();
        BackgroundOnly10 = new javax.swing.JLabel();
        BackgroundOnly13 = new javax.swing.JLabel();
        BackgroundOnly11 = new javax.swing.JLabel();
        BackgroundOnly12 = new javax.swing.JLabel();
        BackgroundOnly14 = new javax.swing.JLabel();
        BackgroundOnly15 = new javax.swing.JLabel();
        BackgroundOnly16 = new javax.swing.JLabel();
        BackgroundOnly17 = new javax.swing.JLabel();
        BackgroundOnly18 = new javax.swing.JLabel();
        BackgroundOnly19 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(234, 232, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Main Profile");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 150, 30));

        curvedPanel1.setBackground(new java.awt.Color(222, 212, 208));

        curvedPanel2.setBackground(new java.awt.Color(243, 242, 237));
        curvedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 25));
        curvedPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 103, 810, 10));

        StudentNumber.setBackground(new java.awt.Color(204, 204, 204));
        StudentNumber.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        StudentNumber.setForeground(new java.awt.Color(204, 204, 204));
        StudentNumber.setText("[ # STUDENT NUMBER ]");
        curvedPanel2.add(StudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        RatingText.setFont(new java.awt.Font("Modern No. 20", 2, 20)); // NOI18N
        RatingText.setForeground(new java.awt.Color(130, 130, 43));
        RatingText.setText("[ CUSTOM RATING ]");
        curvedPanel2.add(RatingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        GradeLevelText2.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        GradeLevelText2.setForeground(new java.awt.Color(0, 0, 0));
        GradeLevelText2.setText("•  Senior High School");
        curvedPanel2.add(GradeLevelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 131, -1, -1));

        GradeAndSectionText.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        GradeAndSectionText.setForeground(new java.awt.Color(0, 0, 0));
        GradeAndSectionText.setText("• ");
        curvedPanel2.add(GradeAndSectionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        RegularStudentText.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        RegularStudentText.setForeground(new java.awt.Color(0, 0, 0));
        RegularStudentText.setText("•  ");
        curvedPanel2.add(RegularStudentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        StrandText1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        StrandText1.setForeground(new java.awt.Color(0, 0, 0));
        StrandText1.setText("•  [ STRAND ]");
        curvedPanel2.add(StrandText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 168, -1, -1));

        strandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select strand...", "STEM", "HUMSS", "ABM", "GAS", "ICT", "HE" }));
        curvedPanel2.add(strandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        studentFullNameField.setBackground(new java.awt.Color(234, 232, 220));
        studentFullNameField.setForeground(new java.awt.Color(0, 0, 0));
        studentFullNameField.setText("[ ENTER FULL STUDENT NAME ]");
        studentFullNameField.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        studentFullNameField.setLabelText("");
        studentFullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFullNameFieldActionPerformed(evt);
            }
        });
        curvedPanel2.add(studentFullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 590, 70));

        Status1.setBackground(new java.awt.Color(234, 232, 220));
        Status1.setForeground(new java.awt.Color(0, 0, 0));
        Status1.setText("[ IRREGULAR OR REGULAR STUDENT ]");
        Status1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        Status1.setLabelText("");
        Status1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Status1ActionPerformed(evt);
            }
        });
        curvedPanel2.add(Status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 480, 50));

        StrandAdd1.setEditable(false);
        StrandAdd1.setBackground(new java.awt.Color(234, 232, 220));
        StrandAdd1.setForeground(new java.awt.Color(0, 0, 0));
        StrandAdd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StrandAdd1.setText("[ STRAND ]");
        StrandAdd1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        StrandAdd1.setLabelText("");
        StrandAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrandAdd1ActionPerformed(evt);
            }
        });
        curvedPanel2.add(StrandAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 140, 50));

        GradeAdd1.setEditable(false);
        GradeAdd1.setBackground(new java.awt.Color(234, 232, 220));
        GradeAdd1.setForeground(new java.awt.Color(0, 0, 0));
        GradeAdd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GradeAdd1.setText("[ GRADE LEVEL ]");
        GradeAdd1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        GradeAdd1.setLabelText("");
        GradeAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeAdd1ActionPerformed(evt);
            }
        });
        curvedPanel2.add(GradeAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 230, 50));

        SectionAdd1.setBackground(new java.awt.Color(234, 232, 220));
        SectionAdd1.setForeground(new java.awt.Color(0, 0, 0));
        SectionAdd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SectionAdd1.setText("[ SECTION ]");
        SectionAdd1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        SectionAdd1.setLabelText("");
        SectionAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionAdd1ActionPerformed(evt);
            }
        });
        curvedPanel2.add(SectionAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 50));

        gradeLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select grade level...", "11", "12" }));
        curvedPanel2.add(gradeLevelComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, 30));

        javax.swing.GroupLayout curvedPanel1Layout = new javax.swing.GroupLayout(curvedPanel1);
        curvedPanel1.setLayout(curvedPanel1Layout);
        curvedPanel1Layout.setHorizontalGroup(
            curvedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel1Layout.createSequentialGroup()
                .addComponent(curvedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        curvedPanel1Layout.setVerticalGroup(
            curvedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel1Layout.createSequentialGroup()
                .addComponent(curvedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(curvedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 880, 320));

        curvedPanel3.setBackground(new java.awt.Color(221, 212, 208));

        curvedPanel4.setBackground(new java.awt.Color(243, 242, 237));
        curvedPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        curvedPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 937, -1));

        MobileNumberTextHolder.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        MobileNumberTextHolder.setForeground(new java.awt.Color(0, 0, 0));
        MobileNumberTextHolder.setText("• ");
        curvedPanel4.add(MobileNumberTextHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        EmailTextHolder.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        EmailTextHolder.setForeground(new java.awt.Color(0, 0, 0));
        EmailTextHolder.setText("• ");
        curvedPanel4.add(EmailTextHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        GuardianFacebookAccountTextHolder.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        GuardianFacebookAccountTextHolder.setForeground(new java.awt.Color(0, 0, 0));
        GuardianFacebookAccountTextHolder.setText("• ");
        curvedPanel4.add(GuardianFacebookAccountTextHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        GuardianMobileNumberTextHolder.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        GuardianMobileNumberTextHolder.setForeground(new java.awt.Color(0, 0, 0));
        GuardianMobileNumberTextHolder.setText("• ");
        curvedPanel4.add(GuardianMobileNumberTextHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        FacebookAccountTextHolder1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        FacebookAccountTextHolder1.setForeground(new java.awt.Color(0, 0, 0));
        FacebookAccountTextHolder1.setText("• ");
        curvedPanel4.add(FacebookAccountTextHolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        EmailTextHolder1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        EmailTextHolder1.setForeground(new java.awt.Color(0, 0, 0));
        EmailTextHolder1.setText("• ");
        curvedPanel4.add(EmailTextHolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        GuardianNameTextHolder.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        GuardianNameTextHolder.setForeground(new java.awt.Color(0, 0, 0));
        GuardianNameTextHolder.setText("• ");
        curvedPanel4.add(GuardianNameTextHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        studentEmailAdd.setBackground(new java.awt.Color(234, 232, 220));
        studentEmailAdd.setForeground(new java.awt.Color(0, 0, 0));
        studentEmailAdd.setText("[ STUDENT EMAIL]");
        studentEmailAdd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        studentEmailAdd.setLabelText("");
        studentEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEmailAddActionPerformed(evt);
            }
        });
        curvedPanel4.add(studentEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 310, 50));

        mNumberAdd1.setBackground(new java.awt.Color(234, 232, 220));
        mNumberAdd1.setForeground(new java.awt.Color(0, 0, 0));
        mNumberAdd1.setText("[ STUDENT MOBILE NUMBER ]");
        mNumberAdd1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        mNumberAdd1.setLabelText("");
        mNumberAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNumberAdd1ActionPerformed(evt);
            }
        });
        curvedPanel4.add(mNumberAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 50));

        studentFbAdd.setBackground(new java.awt.Color(234, 232, 220));
        studentFbAdd.setForeground(new java.awt.Color(0, 0, 0));
        studentFbAdd.setText("[ STUDENT FACEBOOK ACC ]");
        studentFbAdd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        studentFbAdd.setLabelText("");
        studentFbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFbAddActionPerformed(evt);
            }
        });
        curvedPanel4.add(studentFbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 50));

        GuardianNameAdd1.setBackground(new java.awt.Color(234, 232, 220));
        GuardianNameAdd1.setForeground(new java.awt.Color(0, 0, 0));
        GuardianNameAdd1.setText("[ STUDENT GUARDIAN NAME ]");
        GuardianNameAdd1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        GuardianNameAdd1.setLabelText("");
        GuardianNameAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardianNameAdd1ActionPerformed(evt);
            }
        });
        curvedPanel4.add(GuardianNameAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 50));

        GuardianMnumberAdd1.setBackground(new java.awt.Color(234, 232, 220));
        GuardianMnumberAdd1.setForeground(new java.awt.Color(0, 0, 0));
        GuardianMnumberAdd1.setText("[ GUARDIAN MOBILE NUMBER ]");
        GuardianMnumberAdd1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        GuardianMnumberAdd1.setLabelText("");
        GuardianMnumberAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardianMnumberAdd1ActionPerformed(evt);
            }
        });
        curvedPanel4.add(GuardianMnumberAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 310, 50));

        guardianFBadd1.setBackground(new java.awt.Color(234, 232, 220));
        guardianFBadd1.setForeground(new java.awt.Color(0, 0, 0));
        guardianFBadd1.setText("[ GUARDIAN FACEBOOK ACC ]");
        guardianFBadd1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        guardianFBadd1.setLabelText("");
        guardianFBadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardianFBadd1ActionPerformed(evt);
            }
        });
        curvedPanel4.add(guardianFBadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 50));

        guardianEMAILadd1.setBackground(new java.awt.Color(234, 232, 220));
        guardianEMAILadd1.setForeground(new java.awt.Color(0, 0, 0));
        guardianEMAILadd1.setText("[ GUARDIAN EMAIL]");
        guardianEMAILadd1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        guardianEMAILadd1.setLabelText("");
        guardianEMAILadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardianEMAILadd1ActionPerformed(evt);
            }
        });
        curvedPanel4.add(guardianEMAILadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 300, 50));

        javax.swing.GroupLayout curvedPanel3Layout = new javax.swing.GroupLayout(curvedPanel3);
        curvedPanel3.setLayout(curvedPanel3Layout);
        curvedPanel3Layout.setHorizontalGroup(
            curvedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel3Layout.createSequentialGroup()
                .addComponent(curvedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        curvedPanel3Layout.setVerticalGroup(
            curvedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jPanel2.add(curvedPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 970, 310));

        curvedPanel5.setBackground(new java.awt.Color(221, 212, 208));

        curvedPanel6.setBackground(new java.awt.Color(243, 242, 237));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Past Sections");

        StudentFormerSectionsActual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        StudentFormerSectionsActual.setForeground(new java.awt.Color(0, 0, 0));
        StudentFormerSectionsActual.setText("•  ");

        Schoolyear.setBackground(new java.awt.Color(234, 232, 220));
        Schoolyear.setForeground(new java.awt.Color(0, 0, 0));
        Schoolyear.setText("[ SCHOOL YEAR]");
        Schoolyear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Schoolyear.setLabelText("");
        Schoolyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolyearActionPerformed(evt);
            }
        });

        FormerSection1.setBackground(new java.awt.Color(234, 232, 220));
        FormerSection1.setForeground(new java.awt.Color(0, 0, 0));
        FormerSection1.setText("[FORMER SECTIONS]");
        FormerSection1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FormerSection1.setLabelText("");
        FormerSection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormerSection1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout curvedPanel6Layout = new javax.swing.GroupLayout(curvedPanel6);
        curvedPanel6.setLayout(curvedPanel6Layout);
        curvedPanel6Layout.setHorizontalGroup(
            curvedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(curvedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvedPanel6Layout.createSequentialGroup()
                        .addGroup(curvedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(curvedPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator4))
                        .addContainerGap())
                    .addGroup(curvedPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(StudentFormerSectionsActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Schoolyear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(FormerSection1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(167, Short.MAX_VALUE))))
        );
        curvedPanel6Layout.setVerticalGroup(
            curvedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(curvedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentFormerSectionsActual)
                    .addComponent(Schoolyear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormerSection1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout curvedPanel5Layout = new javax.swing.GroupLayout(curvedPanel5);
        curvedPanel5.setLayout(curvedPanel5Layout);
        curvedPanel5Layout.setHorizontalGroup(
            curvedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel5Layout.createSequentialGroup()
                .addComponent(curvedPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        curvedPanel5Layout.setVerticalGroup(
            curvedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvedPanel5Layout.createSequentialGroup()
                .addComponent(curvedPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(curvedPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 770, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contact Information");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(243, 242, 237));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Update");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 770, 150, 50));

        jButton2.setBackground(new java.awt.Color(243, 242, 237));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 770, 150, 50));

        BackgroundOnly6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 500, 270));

        BackgroundOnly5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly5.setText("jLabel1");
        jPanel2.add(BackgroundOnly5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 500, 260));

        BackgroundOnly2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly2.setText("jLabel1");
        jPanel2.add(BackgroundOnly2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -10, 500, 270));

        BackgroundOnly3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 480, 580, 290));

        BackgroundOnly1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly1.setText("jLabel1");
        jPanel2.add(BackgroundOnly1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 500, 270));

        BackgroundOnly4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly4.setText("jLabel1");
        jPanel2.add(BackgroundOnly4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 500, 260));

        BackgroundOnly10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly10.setText("jLabel1");
        jPanel2.add(BackgroundOnly10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 750, 470, 100));

        BackgroundOnly13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 530, 270));

        BackgroundOnly11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 500, 260));

        BackgroundOnly12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 500, 260));

        BackgroundOnly14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, -20, 580, 290));

        BackgroundOnly15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, -20, 580, 290));

        BackgroundOnly16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        jPanel2.add(BackgroundOnly16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 230, 580, 290));

        BackgroundOnly17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly17.setText("jLabel1");
        jPanel2.add(BackgroundOnly17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 470, 100));

        BackgroundOnly18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly18.setText("jLabel1");
        jPanel2.add(BackgroundOnly18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, 470, 100));

        BackgroundOnly19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18% background 500 x 250.png"))); // NOI18N
        BackgroundOnly19.setText("jLabel1");
        jPanel2.add(BackgroundOnly19, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 470, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1735, 870);
    }// </editor-fold>//GEN-END:initComponents

    private void studentEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentEmailAddActionPerformed

    private void studentFullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentFullNameFieldActionPerformed

    private void Status1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Status1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Status1ActionPerformed

    private void StrandAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrandAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrandAdd1ActionPerformed

    private void GradeAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradeAdd1ActionPerformed

    private void SectionAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionAdd1ActionPerformed

    private void mNumberAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNumberAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNumberAdd1ActionPerformed

    private void SchoolyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SchoolyearActionPerformed

    private void studentFbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFbAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentFbAddActionPerformed

    private void GuardianNameAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardianNameAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardianNameAdd1ActionPerformed

    private void GuardianMnumberAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardianMnumberAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardianMnumberAdd1ActionPerformed

    private void guardianFBadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardianFBadd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardianFBadd1ActionPerformed

    private void guardianEMAILadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardianEMAILadd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardianEMAILadd1ActionPerformed

    private void FormerSection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormerSection1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormerSection1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Gets the text from the student name text field, we'll pass the name to the database to check if it already exists. - Avery
        String studentNameHolder = studentFullNameField.getText();
        
        // here we store the other fields' value to another variable for later use
        String studentStatus = Status1.getText();
        String studentGradeFinal = GradeAdd1.getText();
        String studentStrand = StrandAdd1.getText();
        String studentSection = (StrandAdd1.getText() + GradeAdd1.getText() + SectionAdd1.getText());
        
        String studentMobileNumber = mNumberAdd1.getText();
        String sanitizedStudentMobileNumber = studentMobileNumber.replaceAll("\\s+", "");
        
        String studentEmail = studentEmailAdd.getText();
        String studentFbAccount = studentFbAdd.getText();
        
        String guardianName = GuardianNameAdd1.getText();
        String guardianEmail = guardianEMAILadd1.getText();
        
        String guardianMobileNum = GuardianMnumberAdd1.getText();
        String sanitizedGuardianMobileNumber = guardianMobileNum.replaceAll("\\s+", "");
        
        String guardianFbAcc = guardianFBadd1.getText();
        
        String pastSchoolYear = Schoolyear.getText();
        String formerSection = FormerSection1.getText();
        
        // We use a try catch for the following code; if ever there's an error it'll handle it in the "catch" instead of just breaking the program.
        try {
            // Prepare a statement that will tell the database that we want to communicate with it
            String query = "SELECT * FROM AdminManagement WHERE Student_Name = ?";
            pst = ConnectDB.prepareStatement(query);
            // The line of code below looks cryptic but it essentially replaces the first "?" in the query (hence the "1") with the value within the studentNameHolder - Avery
            pst.setString(1, studentNameHolder);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "This student already exists");
            } else if (!rs.next()) {
                int confirmCreate = JOptionPane.showConfirmDialog(null, "Are you sure you want to create a student with the provided information?", "Confirm user creation", JOptionPane.YES_NO_OPTION);
                if (confirmCreate == JOptionPane.YES_OPTION) {
                    if (checkCreateInfo(studentNameHolder, studentStatus, studentSection, sanitizedStudentMobileNumber, studentEmail, studentFbAccount,
                            guardianName, guardianEmail, sanitizedGuardianMobileNumber, guardianFbAcc, pastSchoolYear, formerSection) == true) {
                        try {
                            System.out.println("checking cleared");
                             String sqlquery = "INSERT INTO AdminManagement (Student_Name, Student_Grade_Level, Student_Strand, Student_Status, Student_Section, Student_Mobile_Number,"
                                     + "Student_Email, Student_Facebook_Account, Student_Guardian_Name, Student_Guardian_Email, Student_Guardian_Mobile_Number, "
                                     + "Student_Guardian_Facebook_Account, Past_School_Year, Former_Section) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            pst = ConnectDB.prepareStatement(sqlquery);
                            pst.setString(1, studentNameHolder);
                            pst.setString(2, studentGradeFinal);
                            pst.setString(3, studentStrand);
                            pst.setString(4, studentStatus);
                            pst.setString(5, studentSection);
                            pst.setString(6, sanitizedStudentMobileNumber);
                            pst.setString(7, studentEmail);
                            pst.setString(8, studentFbAccount);
                            pst.setString(9, guardianName);
                            pst.setString(10, guardianEmail);
                            pst.setString(11, sanitizedGuardianMobileNumber);
                            pst.setString(12, guardianFbAcc);
                            pst.setString(13, pastSchoolYear);
                            pst.setString(14, formerSection);
                            System.out.println("db connected");
                            int affectedRows = pst.executeUpdate();
                            if (affectedRows > 0) {
                                JOptionPane.showMessageDialog(null, "Student creation successful", "Student created", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Student creation unsuccessful", "Unable to Create Student", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                    else {
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainProfileADMINversion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void LoadData(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "C:\\Users\\avery\\OneDrive\\Documents\\NetBeansProjects\\Portal\\db\\DatabaseNiBFF.accdb";
            String url = "jdbc:ucanaccess://" + path;  
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            String StudentID = null;
            String query = "SELECT recentID FROM recentlogininfo WHERE ID= 1";
            ResultSet rs = st.executeQuery(query);
  
            while(rs.next()){
                StudentID = rs.getString(1);               
            }
            String query2 = "SELECT * FROM Main_Profile_ICT_12B WHERE Student_Number='"+StudentID+"'";
            ResultSet rs2 = st.executeQuery(query2);
            System.out.println(rs2);
                       
               
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static boolean checkCreateInfo(String StudentName, String studentStatus, String studentSection,
            String studentMobileNumber, String studentEmail, String studentFbAccount, String guardianName, String guardianEmail, String guardianMobileNumber,
            String guardianFbAcc, String pastSchoolYear, String formerSection) {
        
        String namePattern =  "^[A-Za-z, ]++$";
        String studentStatusPattern =  "^(regular|irregular|Regular|Irregular|REGULAR|IRREGULAR)$";
        String mobileNumberPattern = "^(09|\\+639)\\d{9}$";
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;
        String pastSchoolYearPattern =  "^\\d{4}-\\d{4}$";
        String formerSectionPattern = "^(STEM|HUMSS|ABM|GAS|ICT|HE)(11|12)[A-Z]$";
        
        if (!StudentName.matches(namePattern)) {
            JOptionPane.showMessageDialog(null, "Invalid student name input", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!studentStatus.matches(studentStatusPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid student status input. Enter either Regular or Irregular", "Invalid Student Status", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!studentMobileNumber.matches(mobileNumberPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid student mobile number, check your format ", "Invalid Number", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!studentEmail.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid student email format", "Invalid Email", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!studentFbAccount.matches(namePattern)) {
            JOptionPane.showMessageDialog(null, "Invalid student Facebook name input", "Invalid Facebook Name", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!guardianName.matches(namePattern)) {
            JOptionPane.showMessageDialog(null, "Invalid guardian name input", "Invalid Name Input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!guardianEmail.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid guardian email format", "Invalid Guardian Email", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!guardianMobileNumber.matches(mobileNumberPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid guardian mobile number format", "Invalid Number", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!guardianFbAcc.matches(namePattern)) {
            JOptionPane.showMessageDialog(null, "Invalid guardian Facebook name", "Invalid Facebook Name", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!pastSchoolYear.matches(pastSchoolYearPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid past school year, check the format", "Invalid Past  School Year", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!formerSection.matches(formerSectionPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid former section, check the format", "Invalid Former Section", JOptionPane.ERROR_MESSAGE);
        }
//        else {
//            JOptionPane.showMessageDialog(null, "Checking success.", "Checking success", JOptionPane.INFORMATION_MESSAGE);
//            return true;
//        }
        String[] years = pastSchoolYear.split("-");
        int startYear = Integer.parseInt(years[0]);
        int endYear = Integer.parseInt(years[1]);
        boolean yearDifference = endYear - startYear >= 1;
        if (yearDifference == true) {
            return true;
        } else {
            return false;
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundOnly1;
    private javax.swing.JLabel BackgroundOnly10;
    private javax.swing.JLabel BackgroundOnly11;
    private javax.swing.JLabel BackgroundOnly12;
    private javax.swing.JLabel BackgroundOnly13;
    private javax.swing.JLabel BackgroundOnly14;
    private javax.swing.JLabel BackgroundOnly15;
    private javax.swing.JLabel BackgroundOnly16;
    private javax.swing.JLabel BackgroundOnly17;
    private javax.swing.JLabel BackgroundOnly18;
    private javax.swing.JLabel BackgroundOnly19;
    private javax.swing.JLabel BackgroundOnly2;
    private javax.swing.JLabel BackgroundOnly3;
    private javax.swing.JLabel BackgroundOnly4;
    private javax.swing.JLabel BackgroundOnly5;
    private javax.swing.JLabel BackgroundOnly6;
    private javax.swing.JLabel EmailTextHolder;
    private javax.swing.JLabel EmailTextHolder1;
    private javax.swing.JLabel FacebookAccountTextHolder1;
    private topglobalnakaw.LoginCustomTextField FormerSection1;
    private topglobalnakaw.LoginCustomTextField GradeAdd1;
    private javax.swing.JLabel GradeAndSectionText;
    private javax.swing.JLabel GradeLevelText2;
    private javax.swing.JLabel GuardianFacebookAccountTextHolder;
    private topglobalnakaw.LoginCustomTextField GuardianMnumberAdd1;
    private javax.swing.JLabel GuardianMobileNumberTextHolder;
    private topglobalnakaw.LoginCustomTextField GuardianNameAdd1;
    private javax.swing.JLabel GuardianNameTextHolder;
    private javax.swing.JLabel MobileNumberTextHolder;
    private javax.swing.JLabel RatingText;
    private javax.swing.JLabel RegularStudentText;
    private topglobalnakaw.LoginCustomTextField Schoolyear;
    private topglobalnakaw.LoginCustomTextField SectionAdd1;
    private topglobalnakaw.LoginCustomTextField Status1;
    private topglobalnakaw.LoginCustomTextField StrandAdd1;
    private javax.swing.JLabel StrandText1;
    private javax.swing.JLabel StudentFormerSectionsActual;
    private javax.swing.JLabel StudentNumber;
    private topglobalnakaw.CurvedPanel curvedPanel1;
    private topglobalnakaw.CurvedPanel curvedPanel2;
    private topglobalnakaw.CurvedPanel curvedPanel3;
    private topglobalnakaw.CurvedPanel curvedPanel4;
    private topglobalnakaw.CurvedPanel curvedPanel5;
    private topglobalnakaw.CurvedPanel curvedPanel6;
    private javax.swing.JComboBox<String> gradeLevelComboBox;
    private topglobalnakaw.LoginCustomTextField guardianEMAILadd1;
    private topglobalnakaw.LoginCustomTextField guardianFBadd1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private topglobalnakaw.LoginCustomTextField mNumberAdd1;
    private javax.swing.JComboBox<String> strandComboBox;
    private topglobalnakaw.LoginCustomTextField studentEmailAdd;
    private topglobalnakaw.LoginCustomTextField studentFbAdd;
    private topglobalnakaw.LoginCustomTextField studentFullNameField;
    // End of variables declaration//GEN-END:variables
}
