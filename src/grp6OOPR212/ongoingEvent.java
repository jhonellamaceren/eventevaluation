/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grp6OOPR212;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jmallari
 */
public class ongoingEvent extends javax.swing.JFrame {

    DefaultTableModel dm;
    Connection con;
    Statement stmt,stmt2,stmt3,stmt4,stmt5;
    ResultSet rs = null,rs2 = null,rs3 = null;
    int curRow = 0;
    String selectedevtCode,evtCode,SQL;//for selection of event
    String org,activity,venue;
    PreparedStatement pst = null;
    Date evtDate;
    
    public ongoingEvent() {
        initComponents();
   DoConnect();
   fetch();
        //CreateColumns();
    }
    /*private void CreateColumns()
    {
    
        dm=(DefaultTableModel) tblRatings.getModel();
    }*/
    
    
    public void DoConnect(){
        //method to connect to Database
        try{
           //method definition is always in main class
           String host="jdbc:derby://localhost:1527/dbSEE";
           String uName = "group6";
           String uPass = "oopr212123";
           //get host from Services>Server>Properties>Database URL
           con = DriverManager.getConnection(host, uName, uPass) ;
        }
        catch(SQLException err){
            System.out.println(err+"Connection error");
        }
        
        try{
           stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           //select event details from tblevents from active event
           SQL = "Select * FROM TBLEVENTS WHERE activate = true";
           rs = stmt.executeQuery(SQL);
           
           
           //navigate to the first record
           rs.next(); //like clicking the next button in the database GUI
           //DISPLAY THE EVENT DETAILS IN THE TEXT BOXES
           evtCode = rs.getString("evtCode");
           org = rs.getString("orgName");
           activity = rs.getString("Activity");
           evtDate = new Date(rs.getDate("Date").getTime());
           venue = rs.getString("Venue");
           //System.out.println("Event Details:"+evtCode+" "+org);

           
           //display in the text fields
           txtOrgName.setText(org);
           txtActivity.setText(activity);
           txtDate.setText(String.valueOf(evtDate));
           txtVenue.setText(venue);
        }
        catch(SQLException err){
            System.out.println(err+" DoConnect() SQL Statement error");
        }
        
        //autocommit to save any changes to sql automatically
        try{
            con.setAutoCommit(true);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    //display the contents of table
    public void fetch() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"IA", "IB", "IIA","IIB","IIC","IID","IIIA","IIIB","IIIC","IIID","IV","COMMMENT","SUGGESTIONS"}, 0);
        try {
             //to display ratings of table
           stmt2 =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           //System.out.println(evtCode);
           String evtCodeSQL = "Select * FROM "+ evtCode +"";
           rs2 = stmt2.executeQuery(evtCodeSQL);
           while(rs2.next())
{
    String d = rs2.getString("IA");
    String e = rs2.getString("IB");
    String f = rs2.getString("IIA");
    String g = rs2.getString("IIB");
    String h = rs2.getString("IIC");
    String i = rs2.getString("IID");
    String j = rs2.getString("IIIA");
    String k = rs2.getString("IIIB");
    String l = rs2.getString("IIIC");
    String m = rs2.getString("IIID");
        String n = rs2.getString("IV");
    String o = rs2.getString("COMMENT");
    String p = rs2.getString("SUGGESTION");

    model.addRow(new Object[]{d, e, f,g,h,i,j,k,l,m,n,o,p});
    tblRatings.setModel(model);
}
           
            //tblRatings.setModel(DbUtils.resultSetToTableModel(rs2));

            
            //count how many ratings there are
           rs2.last();
            int count = rs2.getRow();
            lblAmount.setText(String.valueOf(count));
            /*System.out.println("Commiting data here....");
      con.commit();
           */
           stmt2.close();
            rs2.close(); 
        }catch (SQLException err) {
            System.out.println(err+"fetch() error");
            
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

        jLabel11 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtActivity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtVenue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRatings = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 540));
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name of Organization");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 97, 150, 18);

        txtOrgName.setEditable(false);
        txtOrgName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtOrgName.setOpaque(false);
        txtOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrgName);
        txtOrgName.setBounds(187, 97, 678, 16);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Title of Activity");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 126, 102, 17);

        txtActivity.setEditable(false);
        txtActivity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtActivity.setOpaque(false);
        getContentPane().add(txtActivity);
        txtActivity.setBounds(187, 126, 678, 16);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 149, 32, 17);

        txtDate.setEditable(false);
        txtDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtDate.setOpaque(false);
        getContentPane().add(txtDate);
        txtDate.setBounds(187, 153, 678, 16);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Venue");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 177, 44, 17);

        txtVenue.setEditable(false);
        txtVenue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtVenue.setOpaque(false);
        getContentPane().add(txtVenue);
        txtVenue.setBounds(187, 187, 678, 16);

        tblRatings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRatings);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 219, 860, 275);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. of Submitted Ratings:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 50, 231, 22);

        lblAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setText("jLabel2");
        getContentPane().add(lblAmount);
        lblAmount.setBounds(350, 50, 66, 22);

        btnFinish.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFinish.setText("FINISH EVALUATION");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish);
        btnFinish.setBounds(460, 50, 160, 23);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/auqna.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 40, 50, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grp6OOPR212/7db70f43414483.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
              
        int ans = JOptionPane.showConfirmDialog(this, "End Evaluation?"
                   , "CONFIRM",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.WARNING_MESSAGE);
      if(ans == 0){
         try{
            //deactivate event
            stmt3 =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           String SQL = "UPDATE TBLEVENTS set activate = false WHERE activate = true ";
           stmt3.executeUpdate(SQL);
         }
         catch(SQLException err){
              System.out.println(err.getMessage()+"turning off activate");
         }
         
         try{
           //display the event as evaluated
           stmt4 =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           SQL = "UPDATE TBLEVENTS set EVALUATED = true WHERE EVTCODE = '"+ evtCode +"'";
           stmt4.executeUpdate(SQL);
    
           
           JOptionPane.showMessageDialog(this,"Evaluation for "+ activity +" closed");
          this.setVisible(false);
          stmt3.close();
          stmt4.close();
        }
        catch(SQLException err){
            System.out.println(err.getMessage()+"turning on evaluated");
        }
          
       
      } else if (ans == 1) {
         System.out.println("Pressed NO");
      } else {
         System.out.println("Pressed CANCEL");
      }
      
      new adminMenu().setVisible(true);
          
                                           
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(ongoingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ongoingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ongoingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ongoingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ongoingEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JTable tblRatings;
    private javax.swing.JTextField txtActivity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
