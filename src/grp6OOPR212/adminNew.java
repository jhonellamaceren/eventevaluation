/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grp6OOPR212;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author jmallari
 */
public class adminNew extends javax.swing.JFrame {
 Connection con;
    Statement stmt;
    ResultSet rs;
    public adminNew() {
        initComponents();
        DoConnect();
    }
    
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    public static String randomAlphaNumeric(int count) {
    
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) {
    int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
    builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
    }
    
     public void DoConnect(){
        //method to connect to Database
    String jdbcUrl = "jdbc:derby://localhost:1527/dbSEE";
    String username = "group6";
    String password = "oopr212123";

    
    try {

      con = DriverManager.getConnection(jdbcUrl, username, password);
     
       stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           String SQL = "Select * FROM TBLEVENTS ";
           rs = stmt.executeQuery(SQL);
           
           //navigate to the first record
           rs.next(); //like clicking the next button in the database GUI
    } catch (SQLException e) {
      e.printStackTrace();
    }/* finally {
      try {
        // Close connection
        if (stmt != null) {
          stmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }*/
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnNewEvent = new javax.swing.JButton();
        txtVenue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtActivity = new javax.swing.JTextField();
        txtOrg = new javax.swing.JTextField();
        txtevtCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 330));
        setPreferredSize(new java.awt.Dimension(420, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnNewEvent.setText("CREATE EVENT");
        btnNewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEventActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewEvent);
        btnNewEvent.setBounds(40, 250, 343, 23);

        txtVenue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVenue.setOpaque(false);
        getContentPane().add(txtVenue);
        txtVenue.setBounds(180, 220, 199, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Venue:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 220, 60, 20);

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setOpaque(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate);
        txtDate.setBounds(180, 190, 199, 23);

        txtActivity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtActivity.setOpaque(false);
        getContentPane().add(txtActivity);
        txtActivity.setBounds(180, 160, 199, 23);

        txtOrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOrg.setOpaque(false);
        txtOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrg);
        txtOrg.setBounds(180, 130, 199, 23);

        txtevtCode.setEditable(false);
        txtevtCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtevtCode.setOpaque(false);
        getContentPane().add(txtevtCode);
        txtevtCode.setBounds(180, 100, 200, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date (YYYY-MM-DD):");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 190, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title of Activity:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 110, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name of Organization: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 130, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Event Code:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 100, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EVENT CREATION");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 40, 150, 22);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/auqna.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 30, 50, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/7db70f43414483.png"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 420, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEventActionPerformed
        String evtCode = "evt"+txtevtCode.getText(); //append evt and generated code together
        String Org= txtOrg.getText();
        String Act= txtActivity.getText();
        String Date= txtDate.getText();
        String Venue= txtVenue.getText();

        try{
            rs.moveToInsertRow( );

            rs.updateString("EvtCode", evtCode);
            rs.updateString("OrgName", Org);
            rs.updateString("Activity", Act);
            rs.updateString("Date", Date);
            rs.updateString("Venue", Venue);

            rs.insertRow( );

            stmt.close( );
            rs.close( );

            JOptionPane.showMessageDialog(adminNew.this,"Event Saved");

        }
        catch (SQLException err) {
            System.out.println(err.getMessage() );
        }

        

        try{
            String CREATE_TABLE_SQL="CREATE TABLE "+evtCode+" ("
            + "Ia Integer NOT NULL,"
            + "Ib Integer NOT NULL,"
            + "IIa Integer NOT NULL,"
            + "IIb Integer NOT NULL,"
            + "IIc Integer NOT NULL,"
            + "IId Integer NOT NULL,"
            + "IIIa Integer NOT NULL,"
            + "IIIb Integer NOT NULL,"
            + "IIIc Integer NOT NULL,"
            + "IIId Integer NOT NULL,"
            + "IV Integer NOT NULL,"
            + "COMMENT VARCHAR(50),"
            + "SUGGESTION VARCHAR(50)) ";
            

            stmt = con.createStatement();

            stmt.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Table created");
            JOptionPane.showMessageDialog(adminNew.this,"Event ready for Evaluation");
        }
        catch (SQLException err) {
            System.out.println(err.getMessage() );
        }
        
        this.setVisible(false);
        new adminMenu().setVisible(true);
    }//GEN-LAST:event_btnNewEventActionPerformed

    private void txtOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String evtCode = randomAlphaNumeric(5);

        txtevtCode.setText(evtCode);
        
    }//GEN-LAST:event_formWindowOpened

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new adminMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(adminNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewEvent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtActivity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JTextField txtevtCode;
    // End of variables declaration//GEN-END:variables
}
