/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grp6OOPR212;

import static java.lang.Compiler.command;
import java.sql.*;
import javax.swing.*;

public class formStudentEval extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
   
    
    private void groupButton(){//function to select radio buttons one at a time
        ButtonGroup bgIa = new ButtonGroup();//add follownig radio button members into one group
        bgIa.add(rbtnIa1);
        bgIa.add(rbtnIa2);
        bgIa.add(rbtnIa3);
        bgIa.add(rbtnIa4);
        bgIa.add(rbtnIa5);
        
        ButtonGroup bgIb = new ButtonGroup();//add follownig radio button members into one group
        bgIb.add(rbtnIb1);
        bgIb.add(rbtnIb2);
        bgIb.add(rbtnIb3);
        bgIb.add(rbtnIb4);
        bgIb.add(rbtnIb5);
        
        ButtonGroup bgIIa = new ButtonGroup();//add follownig radio button members into one group
        bgIIa.add(rbtnIIa1);
        bgIIa.add(rbtnIIa2);
        bgIIa.add(rbtnIIa3);
        bgIIa.add(rbtnIIa4);
        bgIIa.add(rbtnIIa5);
        
        ButtonGroup bgIIb = new ButtonGroup();//add follownig radio button members into one group
        bgIIb.add(rbtnIIb1);
        bgIIb.add(rbtnIIb2);
        bgIIb.add(rbtnIIb3);
        bgIIb.add(rbtnIIb4);
        bgIIb.add(rbtnIIb5);
        
        ButtonGroup bgIIc = new ButtonGroup();//add follownig radio button members into one group
        bgIIc.add(rbtnIIc1);
        bgIIc.add(rbtnIIc2);
        bgIIc.add(rbtnIIc3);
        bgIIc.add(rbtnIIc4);
        bgIIc.add(rbtnIIc5);
        
         ButtonGroup bgIId = new ButtonGroup();//add follownig radio button members into one group
        bgIId.add(rbtnIId1);
        bgIId.add(rbtnIId2);
        bgIId.add(rbtnIId3);
        bgIId.add(rbtnIId4);
        bgIId.add(rbtnIId5);
        
        ButtonGroup bgIIIa = new ButtonGroup();//add follownig radio button members into one group
        bgIIIa.add(rbtnIIIa1);
        bgIIIa.add(rbtnIIIa2);
        bgIIIa.add(rbtnIIIa3);
        bgIIIa.add(rbtnIIIa4);
        bgIIIa.add(rbtnIIIa5);
        
        ButtonGroup bgIIIb = new ButtonGroup();//add follownig radio button members into one group
        bgIIIb.add(rbtnIIIb1);
        bgIIIb.add(rbtnIIIb2);
        bgIIIb.add(rbtnIIIb3);
        bgIIIb.add(rbtnIIIb4);
        bgIIIb.add(rbtnIIIb5);
        
        ButtonGroup bgIIIc = new ButtonGroup();//add follownig radio button members into one group
        bgIIIc.add(rbtnIIIc1);
        bgIIIc.add(rbtnIIIc2);
        bgIIIc.add(rbtnIIIc3);
        bgIIIc.add(rbtnIIIc4);
        bgIIIc.add(rbtnIIIc5);
        
         ButtonGroup bgIIId = new ButtonGroup();//add follownig radio button members into one group
        bgIIId.add(rbtnIIId1);
        bgIIId.add(rbtnIIId2);
        bgIIId.add(rbtnIIId3);
        bgIIId.add(rbtnIIId4);
        bgIIId.add(rbtnIIId5);
        
        ButtonGroup bgIV = new ButtonGroup();//add follownig radio button members into one group
        bgIV.add(rbtnIV1);
        bgIV.add(rbtnIV2);
        bgIV.add(rbtnIV3);
        bgIV.add(rbtnIV4);
        bgIV.add(rbtnIV5);
        
       
        
        
    }
    
    public formStudentEval() {
        initComponents();
        groupButton();
        DoConnect();
    }
    
    public void DoConnect(){
        //method to connect to Database
        try{
           //method definition is always in main class
           String host="jdbc:derby://localhost:1527/dbSEE";
           String uName = "group6";
           String uPass = "oopr212123";
           //get host from Services>Server>Properties>Database URL
           Connection con = DriverManager.getConnection(host, uName, uPass) ;
           //Connection con = DriverManager.getConnection(host, uName, uPass );
           
           //execute sql statement for displaying records
           //stmt =  con.createStatement();
           stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           //select event details from tblevents from active event
           String SQL = "Select * FROM TBLEVENTS WHERE activate = true ";
           rs = stmt.executeQuery(SQL);
           //
           
           //navigate to the first record
           rs.next(); //like clicking the next button in the database GUI
           //DISPLAY THE EVENT DETAILS IN THE TEXT BOXES
           String evtCode = rs.getString("evtCode");
           String orgName = rs.getString("orgName");
           String Activity = rs.getString("Activity");
           Date evtDate = new Date(rs.getDate("Date").getTime());
           String Venue = rs.getString("Venue");

           
           //display in the text fields
           txtOrgName.setText(orgName);
           txtActivity.setText(Activity);
           txtDate.setText(String.valueOf(evtDate));
           txtVenue.setText(Venue);
           
           //to insert ratings to new table
           stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           String evtCodeSQL = ("Select * FROM "+ evtCode +" ");
           
           rs = stmt.executeQuery(evtCodeSQL);

           
           
           
           
        
           
           
           
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtnIa3 = new javax.swing.JRadioButton();
        rbtnIa1 = new javax.swing.JRadioButton();
        rbtnIa2 = new javax.swing.JRadioButton();
        rbtnIa5 = new javax.swing.JRadioButton();
        rbtnIa4 = new javax.swing.JRadioButton();
        rbtnIb5 = new javax.swing.JRadioButton();
        rbtnIb4 = new javax.swing.JRadioButton();
        rbtnIb3 = new javax.swing.JRadioButton();
        rbtnIb2 = new javax.swing.JRadioButton();
        rbtnIb1 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtnIIa1 = new javax.swing.JRadioButton();
        rbtnIIa2 = new javax.swing.JRadioButton();
        rbtnIIa3 = new javax.swing.JRadioButton();
        rbtnIIa4 = new javax.swing.JRadioButton();
        rbtnIIa5 = new javax.swing.JRadioButton();
        rbtnIIb1 = new javax.swing.JRadioButton();
        rbtnIIb2 = new javax.swing.JRadioButton();
        rbtnIIb3 = new javax.swing.JRadioButton();
        rbtnIIb4 = new javax.swing.JRadioButton();
        rbtnIIb5 = new javax.swing.JRadioButton();
        rbtnIIc1 = new javax.swing.JRadioButton();
        rbtnIIc2 = new javax.swing.JRadioButton();
        rbtnIIc3 = new javax.swing.JRadioButton();
        rbtnIIc4 = new javax.swing.JRadioButton();
        rbtnIIc5 = new javax.swing.JRadioButton();
        rbtnIId1 = new javax.swing.JRadioButton();
        rbtnIId2 = new javax.swing.JRadioButton();
        rbtnIId3 = new javax.swing.JRadioButton();
        rbtnIId4 = new javax.swing.JRadioButton();
        rbtnIId5 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtnIIIa3 = new javax.swing.JRadioButton();
        rbtnIIIa1 = new javax.swing.JRadioButton();
        rbtnIIIa2 = new javax.swing.JRadioButton();
        rbtnIIIa5 = new javax.swing.JRadioButton();
        rbtnIIIa4 = new javax.swing.JRadioButton();
        rbtnIIIb5 = new javax.swing.JRadioButton();
        rbtnIIIb4 = new javax.swing.JRadioButton();
        rbtnIIIb3 = new javax.swing.JRadioButton();
        rbtnIIIb2 = new javax.swing.JRadioButton();
        rbtnIIIb1 = new javax.swing.JRadioButton();
        rbtnIIId5 = new javax.swing.JRadioButton();
        rbtnIIIc5 = new javax.swing.JRadioButton();
        rbtnIIIc4 = new javax.swing.JRadioButton();
        rbtnIIIc3 = new javax.swing.JRadioButton();
        rbtnIIId4 = new javax.swing.JRadioButton();
        rbtnIIId3 = new javax.swing.JRadioButton();
        rbtnIIId2 = new javax.swing.JRadioButton();
        rbtnIIIc2 = new javax.swing.JRadioButton();
        rbtnIIIc1 = new javax.swing.JRadioButton();
        rbtnIIId1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        rbtnIV3 = new javax.swing.JRadioButton();
        rbtnIV1 = new javax.swing.JRadioButton();
        rbtnIV2 = new javax.swing.JRadioButton();
        rbtnIV5 = new javax.swing.JRadioButton();
        rbtnIV4 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSuggestions = new javax.swing.JTextArea();
        btnDone = new javax.swing.JButton();
        txtOrgName = new javax.swing.JTextField();
        txtActivity = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(565, 600));
        getContentPane().setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Attainment of Objectives"));
        jPanel6.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Clarity of theme");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Clarity of objectives");

        rbtnIa3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIa3.setText("3");
        rbtnIa3.setOpaque(false);

        rbtnIa1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIa1.setText("1");
        rbtnIa1.setOpaque(false);

        rbtnIa2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIa2.setText("2");
        rbtnIa2.setOpaque(false);

        rbtnIa5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIa5.setText("5");
        rbtnIa5.setOpaque(false);

        rbtnIa4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIa4.setText("4");
        rbtnIa4.setOpaque(false);

        rbtnIb5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIb5.setText("5");
        rbtnIb5.setOpaque(false);

        rbtnIb4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIb4.setText("4");
        rbtnIb4.setOpaque(false);

        rbtnIb3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIb3.setText("3");
        rbtnIb3.setOpaque(false);

        rbtnIb2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIb2.setText("2");
        rbtnIb2.setOpaque(false);

        rbtnIb1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIb1.setText("1");
        rbtnIb1.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbtnIa1)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnIa2)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIa3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIa4)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIa5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbtnIb1)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnIb2)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIb3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIb4)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIb5)))
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbtnIa3)
                    .addComponent(rbtnIa1)
                    .addComponent(rbtnIa2)
                    .addComponent(rbtnIa4)
                    .addComponent(rbtnIa5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIb3)
                        .addComponent(rbtnIb1)
                        .addComponent(rbtnIb2)
                        .addComponent(rbtnIb4)
                        .addComponent(rbtnIb5))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Organization"));
        jPanel7.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Venue");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Time frame");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Involvement of participants");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Orderliness");

        rbtnIIa1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIa1.setText("1");
        rbtnIIa1.setOpaque(false);

        rbtnIIa2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIa2.setText("2");
        rbtnIIa2.setOpaque(false);

        rbtnIIa3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIa3.setText("3");
        rbtnIIa3.setOpaque(false);

        rbtnIIa4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIa4.setText("4");
        rbtnIIa4.setOpaque(false);

        rbtnIIa5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIa5.setText("5");
        rbtnIIa5.setOpaque(false);

        rbtnIIb1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIb1.setText("1");
        rbtnIIb1.setOpaque(false);

        rbtnIIb2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIb2.setText("2");
        rbtnIIb2.setOpaque(false);

        rbtnIIb3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIb3.setText("3");
        rbtnIIb3.setOpaque(false);

        rbtnIIb4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIb4.setText("4");
        rbtnIIb4.setOpaque(false);

        rbtnIIb5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIb5.setText("5");
        rbtnIIb5.setOpaque(false);

        rbtnIIc1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIc1.setText("1");
        rbtnIIc1.setOpaque(false);

        rbtnIIc2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIc2.setText("2");
        rbtnIIc2.setOpaque(false);

        rbtnIIc3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIc3.setText("3");
        rbtnIIc3.setOpaque(false);

        rbtnIIc4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIc4.setText("4");
        rbtnIIc4.setOpaque(false);

        rbtnIIc5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIc5.setText("5");
        rbtnIIc5.setOpaque(false);

        rbtnIId1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIId1.setText("1");
        rbtnIId1.setOpaque(false);

        rbtnIId2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIId2.setText("2");
        rbtnIId2.setOpaque(false);

        rbtnIId3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIId3.setText("3");
        rbtnIId3.setOpaque(false);

        rbtnIId4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIId4.setText("4");
        rbtnIId4.setOpaque(false);

        rbtnIId5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIId5.setText("5");
        rbtnIId5.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(rbtnIIb1)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnIIb2)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIb3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIb4)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIb5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(rbtnIIa1)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnIIa2)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIa3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIa4)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnIIa5))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(rbtnIId1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIId2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIId3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIId4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIId5))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(rbtnIIc1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIIc2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIc3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIc4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIc5))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIIa3)
                        .addComponent(rbtnIIa1)
                        .addComponent(rbtnIIa2)
                        .addComponent(rbtnIIa4)
                        .addComponent(rbtnIIa5))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIIb3)
                        .addComponent(rbtnIIb1)
                        .addComponent(rbtnIIb2)
                        .addComponent(rbtnIIb4)
                        .addComponent(rbtnIIb5))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIIc3)
                        .addComponent(rbtnIIc1)
                        .addComponent(rbtnIIc2)
                        .addComponent(rbtnIIc4)
                        .addComponent(rbtnIIc5))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIId3)
                        .addComponent(rbtnIId1)
                        .addComponent(rbtnIId2)
                        .addComponent(rbtnIId4)
                        .addComponent(rbtnIId5))
                    .addComponent(jLabel4))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Objectives and Organization ", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relevance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("To curriculum");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("To leadership skills");

        rbtnIIIa3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIa3.setText("3");
        rbtnIIIa3.setOpaque(false);

        rbtnIIIa1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIa1.setText("1");
        rbtnIIIa1.setOpaque(false);

        rbtnIIIa2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIa2.setText("2");
        rbtnIIIa2.setOpaque(false);

        rbtnIIIa5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIa5.setText("5");
        rbtnIIIa5.setOpaque(false);

        rbtnIIIa4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIa4.setText("4");
        rbtnIIIa4.setOpaque(false);

        rbtnIIIb5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIb5.setText("5");
        rbtnIIIb5.setOpaque(false);

        rbtnIIIb4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIb4.setText("4");
        rbtnIIIb4.setOpaque(false);

        rbtnIIIb3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIb3.setText("3");
        rbtnIIIb3.setOpaque(false);

        rbtnIIIb2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIb2.setText("2");
        rbtnIIIb2.setOpaque(false);

        rbtnIIIb1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIb1.setText("1");
        rbtnIIIb1.setOpaque(false);

        rbtnIIId5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIId5.setText("5");
        rbtnIIId5.setOpaque(false);

        rbtnIIIc5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIc5.setText("5");
        rbtnIIIc5.setOpaque(false);

        rbtnIIIc4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIc4.setText("4");
        rbtnIIIc4.setOpaque(false);

        rbtnIIIc3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIc3.setText("3");
        rbtnIIIc3.setOpaque(false);

        rbtnIIId4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIId4.setText("4");
        rbtnIIId4.setOpaque(false);

        rbtnIIId3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIId3.setText("3");
        rbtnIIId3.setOpaque(false);

        rbtnIIId2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIId2.setText("2");
        rbtnIIId2.setOpaque(false);

        rbtnIIIc2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIc2.setText("2");
        rbtnIIIc2.setOpaque(false);

        rbtnIIIc1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIIc1.setText("1");
        rbtnIIIc1.setOpaque(false);

        rbtnIIId1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIIId1.setText("1");
        rbtnIIId1.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("To personal development");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("To social development");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(rbtnIIIc1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIIIc2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIc3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIc4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIc5))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(rbtnIIId1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIIId2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIId3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIId4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIId5)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(rbtnIIIa1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIIIa2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIa3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIa4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIa5))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(rbtnIIIb1)
                            .addGap(10, 10, 10)
                            .addComponent(rbtnIIIb2)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIb3)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIb4)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnIIIb5))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbtnIIIa3)
                    .addComponent(rbtnIIIa1)
                    .addComponent(rbtnIIIa2)
                    .addComponent(rbtnIIIa4)
                    .addComponent(rbtnIIIa5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbtnIIIb3)
                    .addComponent(rbtnIIIb1)
                    .addComponent(rbtnIIIb2)
                    .addComponent(rbtnIIIb4)
                    .addComponent(rbtnIIIb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rbtnIIIc3)
                    .addComponent(rbtnIIIc1)
                    .addComponent(rbtnIIIc2)
                    .addComponent(rbtnIIIc4)
                    .addComponent(rbtnIIIc5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rbtnIIId3)
                    .addComponent(rbtnIIId1)
                    .addComponent(rbtnIIId2)
                    .addComponent(rbtnIIId4)
                    .addComponent(rbtnIIId5))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Overall impression"));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.setOpaque(false);

        rbtnIV3.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIV3.setText("3");
        rbtnIV3.setOpaque(false);

        rbtnIV1.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIV1.setText("1");
        rbtnIV1.setOpaque(false);

        rbtnIV2.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIV2.setText("2");
        rbtnIV2.setOpaque(false);

        rbtnIV5.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIV5.setText("5");
        rbtnIV5.setOpaque(false);

        rbtnIV4.setForeground(new java.awt.Color(51, 51, 51));
        rbtnIV4.setText("4");
        rbtnIV4.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Overall Impression");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(60, 60, 60)
                .addComponent(rbtnIV1)
                .addGap(10, 10, 10)
                .addComponent(rbtnIV2)
                .addGap(18, 18, 18)
                .addComponent(rbtnIV3)
                .addGap(18, 18, 18)
                .addComponent(rbtnIV4)
                .addGap(18, 18, 18)
                .addComponent(rbtnIV5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnIV3)
                    .addComponent(rbtnIV1)
                    .addComponent(rbtnIV2)
                    .addComponent(rbtnIV4)
                    .addComponent(rbtnIV5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relevance and Overall Impression", jPanel3);

        jLabel1.setText("Comments:");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane1.setViewportView(txtComment);

        jLabel18.setText("Suggestions");

        txtSuggestions.setColumns(20);
        txtSuggestions.setRows(5);
        jScrollPane2.setViewportView(txtSuggestions);

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDone)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comments and Suggestions", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 200, 500, 356);

        txtOrgName.setEditable(false);
        txtOrgName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtOrgName.setOpaque(false);
        txtOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrgName);
        txtOrgName.setBounds(200, 60, 332, 16);

        txtActivity.setEditable(false);
        txtActivity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtActivity.setOpaque(false);
        getContentPane().add(txtActivity);
        txtActivity.setBounds(200, 80, 332, 16);

        txtDate.setEditable(false);
        txtDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtDate.setOpaque(false);
        getContentPane().add(txtDate);
        txtDate.setBounds(200, 100, 332, 16);

        txtVenue.setEditable(false);
        txtVenue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtVenue.setOpaque(false);
        getContentPane().add(txtVenue);
        txtVenue.setBounds(200, 120, 332, 16);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Venue");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 120, 44, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 100, 32, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Title of Activity");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 80, 102, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5-Excellent  ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 170, 80, 18);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Evaluation");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 30, 180, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("1-Needs Improvement");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(410, 170, 110, 18);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Name of Organization");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 60, 150, 18);

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("4-Very Satisfactory");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 170, 120, 18);

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("3-Satisfactory");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(200, 170, 120, 18);

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("2-Moderately Satisfactory");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(270, 170, 140, 18);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/auqna.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 10, 50, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/7db70f43414483.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 0, 570, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String IA = "";
        int intIA = 0,intIB = 0,intIIA = 0,intIIB = 0,intIIC = 0,intIID = 0,intIIIA = 0,intIIIB = 0,intIIIC = 0,intIIID = 0,intIV = 0;
        

        if(rbtnIa1.isSelected()){
            IA = rbtnIa1.getText();
            intIA = Integer.parseInt( IA );

        }
        else if(rbtnIa2.isSelected()){
            IA = rbtnIa2.getText();
            intIA = Integer.parseInt( IA );
        }
        else if(rbtnIa3.isSelected()){
            IA = rbtnIa3.getText();
            intIA = Integer.parseInt( IA );
        }
        else if(rbtnIa4.isSelected()){
            IA = rbtnIa4.getText();
            intIA = Integer.parseInt( IA );
         
        }
        else if(rbtnIa5.isSelected()){
            IA = rbtnIa5.getText();
            intIA = Integer.parseInt( IA );
        }
        
        //Ib get
        String IB = "";

        if(rbtnIb1.isSelected()){
            IB = rbtnIb1.getText();
            intIB = Integer.parseInt( IB );
            

        }
        else if(rbtnIb2.isSelected()){
            IB = rbtnIb2.getText();
            intIB = Integer.parseInt( IB );
            
        }
        else if(rbtnIb3.isSelected()){
            IB = rbtnIb3.getText();
            intIB = Integer.parseInt( IB );
        }
        else if(rbtnIb4.isSelected()){
            IB = rbtnIb4.getText();
            intIB = Integer.parseInt( IB );
        }
        else if(rbtnIb5.isSelected()){
            IB = rbtnIb5.getText();
            intIB = Integer.parseInt( IB );
        }
        
        //IIa get
        String IIA = "";

        if(rbtnIIa1.isSelected()){
            IIA = rbtnIIa1.getText();
            intIIA = Integer.parseInt( IIA );
            

        }
        else if(rbtnIIa2.isSelected()){
            IIA = rbtnIIa2.getText();
            intIIA = Integer.parseInt( IIA );
            
        }
        else if(rbtnIIa3.isSelected()){
            IIA = rbtnIIa3.getText();
            intIIA = Integer.parseInt( IIA );
        }
        else if(rbtnIIa4.isSelected()){
            IIA = rbtnIIa4.getText();
            intIIA = Integer.parseInt( IIA );
        }
        else if(rbtnIIa5.isSelected()){
            IIA = rbtnIIa5.getText();
            intIIA = Integer.parseInt( IIA );
        }
        
        //IIb get
        String IIB = "";

        if(rbtnIIb1.isSelected()){
            IIB = rbtnIIb1.getText();
            intIIB = Integer.parseInt( IIB );
            

        }
        else if(rbtnIIb2.isSelected()){
            IIB = rbtnIIb2.getText();
            intIIB = Integer.parseInt( IIB );
            
        }
        else if(rbtnIIb3.isSelected()){
            IIB = rbtnIIb3.getText();
            intIIB = Integer.parseInt( IIB );
        }
        else if(rbtnIIb4.isSelected()){
            IIB = rbtnIIb4.getText();
            intIIB = Integer.parseInt( IIB );
        }
        else if(rbtnIIb5.isSelected()){
            IIB = rbtnIIb5.getText();
            intIIB = Integer.parseInt( IIB );
        }
        
        //IIc get
        String IIC = "";

        if(rbtnIIc1.isSelected()){
            IIC = rbtnIIc1.getText();
            intIIC = Integer.parseInt( IIC );
            

        }
        else if(rbtnIIc2.isSelected()){
            IIC = rbtnIIc2.getText();
            intIIC = Integer.parseInt( IIC );
            
        }
        else if(rbtnIIc3.isSelected()){
            IIC = rbtnIIc3.getText();
            intIIC = Integer.parseInt( IIC );
        }
        else if(rbtnIIc4.isSelected()){
            IIC = rbtnIIc4.getText();
            intIIC = Integer.parseInt( IIC );
        }
        else if(rbtnIIc5.isSelected()){
            IIC = rbtnIIc5.getText();
            intIIC = Integer.parseInt( IIC );
        }
        
        //IId get
        String IID = "";

        if(rbtnIId1.isSelected()){
            IID = rbtnIId1.getText();
            intIID = Integer.parseInt( IID );
            

        }
        else if(rbtnIId2.isSelected()){
            IID = rbtnIId2.getText();
            intIID = Integer.parseInt( IID );
            
        }
        else if(rbtnIId3.isSelected()){
            IID = rbtnIId3.getText();
            intIID = Integer.parseInt( IID );
        }
        else if(rbtnIId4.isSelected()){
            IID = rbtnIId4.getText();
            intIID = Integer.parseInt( IID );
        }
        else if(rbtnIId5.isSelected()){
            IID = rbtnIId5.getText();
            intIID = Integer.parseInt( IID );
        }
        
         //IIIa get
        String IIIA = "";

        if(rbtnIIIa1.isSelected()){
            IIIA = rbtnIIIa1.getText();
            intIIIA = Integer.parseInt( IIIA );
            

        }
        else if(rbtnIIIa2.isSelected()){
            IIIA = rbtnIIIa2.getText();
            intIIIA = Integer.parseInt( IIIA );
            
        }
        else if(rbtnIIIa3.isSelected()){
            IIIA = rbtnIIIa3.getText();
            intIIIA = Integer.parseInt( IIIA );
        }
        else if(rbtnIIIa4.isSelected()){
            IIIA = rbtnIIIa4.getText();
            intIIIA = Integer.parseInt( IIIA );
        }
        else if(rbtnIIIa5.isSelected()){
            IIIA = rbtnIIIa5.getText();
            intIIIA = Integer.parseInt( IIIA );
        }
        
        //IIIb get
        String IIIB = "";

        if(rbtnIIIb1.isSelected()){
            IIIB = rbtnIIIb1.getText();
            intIIIB = Integer.parseInt( IIIB );
            

        }
        else if(rbtnIIIb2.isSelected()){
            IIIB = rbtnIIIb2.getText();
            intIIIB = Integer.parseInt( IIIB );
            
        }
        else if(rbtnIIIb3.isSelected()){
            IIIB = rbtnIIIb3.getText();
            intIIIB = Integer.parseInt( IIIB );
        }
        else if(rbtnIIIb4.isSelected()){
            IIIB = rbtnIIIb4.getText();
            intIIIB = Integer.parseInt( IIIB );
        }
        else if(rbtnIIIb5.isSelected()){
            IIIB = rbtnIIIb5.getText();
            intIIIB = Integer.parseInt( IIIB );
        }
        
        //IIIc get
        String IIIC = "";

        if(rbtnIIIc1.isSelected()){
            IIIC = rbtnIIIc1.getText();
            intIIIC = Integer.parseInt( IIIC );
            

        }
        else if(rbtnIIIc2.isSelected()){
            IIIC = rbtnIIIc2.getText();
            intIIIC = Integer.parseInt( IIIC );
            
        }
        else if(rbtnIIIc3.isSelected()){
            IIIC = rbtnIIIc3.getText();
            intIIIC = Integer.parseInt( IIIC );
        }
        else if(rbtnIIIc4.isSelected()){
            IIIC = rbtnIIIc4.getText();
            intIIIC = Integer.parseInt( IIIC );
        }
        else if(rbtnIIIc5.isSelected()){
            IIIC = rbtnIIIc5.getText();
            intIIIC = Integer.parseInt( IIIC );
        }
        
        //IIId get
        String IIID = "";

        if(rbtnIIId1.isSelected()){
            IIID = rbtnIIId1.getText();
            intIIID = Integer.parseInt( IIID );
            

        }
        else if(rbtnIIId2.isSelected()){
            IIID = rbtnIIId2.getText();
            intIIID = Integer.parseInt( IIID );
            
        }
        else if(rbtnIIId3.isSelected()){
            IIID = rbtnIIId3.getText();
            intIIID = Integer.parseInt( IIID );
        }
        else if(rbtnIIId4.isSelected()){
            IIID = rbtnIIId4.getText();
            intIIID = Integer.parseInt( IIID );
        }
        else if(rbtnIIId5.isSelected()){
            IIID = rbtnIIId5.getText();
            intIIID = Integer.parseInt( IIID );
        }
        
        //IIId get
        String IV = "";

        if(rbtnIV1.isSelected()){
            IV = rbtnIV1.getText();
            intIV = Integer.parseInt( IIID );
            

        }
        else if(rbtnIV2.isSelected()){
            IV = rbtnIV2.getText();
            intIV = Integer.parseInt( IIID );
            
        }
        else if(rbtnIV3.isSelected()){
            IV = rbtnIV3.getText();
            intIV = Integer.parseInt( IIID );
        }
        else if(rbtnIV4.isSelected()){
            IV = rbtnIV4.getText();
            intIV = Integer.parseInt( IIID );
        }
        else if(rbtnIV5.isSelected()){
            IV = rbtnIV5.getText();
            intIV = Integer.parseInt( IIID );
        }
        
               
        try{
        
      

        rs.moveToInsertRow( );

     
        rs.updateInt("IA", intIA );
        rs.updateInt("IB", intIB);
        rs.updateInt("IIA", intIIA);
        rs.updateInt("IIB", intIIB);
        rs.updateInt("IIC", intIIC);
        rs.updateInt("IID", intIID);
        rs.updateInt("IIIA", intIIIA);
        rs.updateInt("IIIB", intIIIB);
        rs.updateInt("IIIC", intIIIC);
        rs.updateInt("IIID", intIIID);
        rs.updateInt("IV", intIV);
        
        
         //get comments and suggesstions
        if(!(txtComment.getText().isEmpty())){
                String comment;
                
                comment = txtComment.getText();
                rs.updateString("COMMENT", comment);
        }
        if(!(txtSuggestions.getText().isEmpty())){
                String suggestions;
                
                suggestions = txtSuggestions.getText();
                rs.updateString("SUGGESTION", suggestions);
        }

        
        

        rs.insertRow( );

        stmt.close( );
        rs.close( );
        
        JOptionPane.showMessageDialog(formStudentEval.this,"Thank you for your feedback.");
        
        }
        catch (SQLException err) {
            System.out.println(err.getMessage() );
        }
        
        this.setVisible(false);
        new studentWelcome().setVisible(true);
 
    }//GEN-LAST:event_btnDoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new studentWelcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(formStudentEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formStudentEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formStudentEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formStudentEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formStudentEval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtnIIIa1;
    private javax.swing.JRadioButton rbtnIIIa2;
    private javax.swing.JRadioButton rbtnIIIa3;
    private javax.swing.JRadioButton rbtnIIIa4;
    private javax.swing.JRadioButton rbtnIIIa5;
    private javax.swing.JRadioButton rbtnIIIb1;
    private javax.swing.JRadioButton rbtnIIIb2;
    private javax.swing.JRadioButton rbtnIIIb3;
    private javax.swing.JRadioButton rbtnIIIb4;
    private javax.swing.JRadioButton rbtnIIIb5;
    private javax.swing.JRadioButton rbtnIIIc1;
    private javax.swing.JRadioButton rbtnIIIc2;
    private javax.swing.JRadioButton rbtnIIIc3;
    private javax.swing.JRadioButton rbtnIIIc4;
    private javax.swing.JRadioButton rbtnIIIc5;
    private javax.swing.JRadioButton rbtnIIId1;
    private javax.swing.JRadioButton rbtnIIId2;
    private javax.swing.JRadioButton rbtnIIId3;
    private javax.swing.JRadioButton rbtnIIId4;
    private javax.swing.JRadioButton rbtnIIId5;
    private javax.swing.JRadioButton rbtnIIa1;
    private javax.swing.JRadioButton rbtnIIa2;
    private javax.swing.JRadioButton rbtnIIa3;
    private javax.swing.JRadioButton rbtnIIa4;
    private javax.swing.JRadioButton rbtnIIa5;
    private javax.swing.JRadioButton rbtnIIb1;
    private javax.swing.JRadioButton rbtnIIb2;
    private javax.swing.JRadioButton rbtnIIb3;
    private javax.swing.JRadioButton rbtnIIb4;
    private javax.swing.JRadioButton rbtnIIb5;
    private javax.swing.JRadioButton rbtnIIc1;
    private javax.swing.JRadioButton rbtnIIc2;
    private javax.swing.JRadioButton rbtnIIc3;
    private javax.swing.JRadioButton rbtnIIc4;
    private javax.swing.JRadioButton rbtnIIc5;
    private javax.swing.JRadioButton rbtnIId1;
    private javax.swing.JRadioButton rbtnIId2;
    private javax.swing.JRadioButton rbtnIId3;
    private javax.swing.JRadioButton rbtnIId4;
    private javax.swing.JRadioButton rbtnIId5;
    private javax.swing.JRadioButton rbtnIV1;
    private javax.swing.JRadioButton rbtnIV2;
    private javax.swing.JRadioButton rbtnIV3;
    private javax.swing.JRadioButton rbtnIV4;
    private javax.swing.JRadioButton rbtnIV5;
    private javax.swing.JRadioButton rbtnIa1;
    private javax.swing.JRadioButton rbtnIa2;
    private javax.swing.JRadioButton rbtnIa3;
    private javax.swing.JRadioButton rbtnIa4;
    private javax.swing.JRadioButton rbtnIa5;
    private javax.swing.JRadioButton rbtnIb1;
    private javax.swing.JRadioButton rbtnIb2;
    private javax.swing.JRadioButton rbtnIb3;
    private javax.swing.JRadioButton rbtnIb4;
    private javax.swing.JRadioButton rbtnIb5;
    private javax.swing.JTextField txtActivity;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextArea txtSuggestions;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
