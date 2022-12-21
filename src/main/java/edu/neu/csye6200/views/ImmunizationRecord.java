/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.*;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import static edu.neu.csye6200.DB.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.ImmunizationJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Thread;
import java.util.ArrayList;



/**
 *
 * @author Divya Sharma
 */
public class ImmunizationRecord extends javax.swing.JFrame {
    Immunization immune = new Immunization();
        ImmunizationJdbc jdbc = new ImmunizationJdbc();

    private DefaultTableModel model = new DefaultTableModel(columns, 0);
    // Create the table
    private JTable table = new JTable(model);
    // Create the main panel
    private JPanel mainPanel = new JPanel(new BorderLayout());
    /**
     * Creates new form Immunization
     */
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    ResultSet rs3;
    public static final String[] columns = {
        "Name", "Age", "Address"
    };
    public ImmunizationRecord() throws SQLException {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        studentIdinView = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        irBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Immunization Record");
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(0, 153, 153));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 6, 12));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT IMMUNIZATION RECORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 872, 27));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "HIB", "", null, null},
                {null, "TDap", "", null, null},
                {null, "Polio", "", null, null},
                {null, "Hepatitis B", "", null, null},
                {null, "MMR", "", null, null},
                {null, "Varicella", "", null, null},
                {null, "Influenza", "", null, null}
            },
            new String [] {
                "SV ID", "VACCINE NAME", "LAST DOSE DATE", "NEXT DUE DATE", "VACCINATED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setMinimumSize(new java.awt.Dimension(80, 175));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(2);
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 134, 485, 202));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("STUDENT ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 152, 74, -1));
        getContentPane().add(studentIdinView, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 176, 71, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 207, 69, -1));

        irBack.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        irBack.setText("BACK");
        irBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irBackActionPerformed(evt);
            }
        });
        getContentPane().add(irBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 64, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 83, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dubey\\Downloads\\ood_project-main (1)\\ood_project-latest\\src\\Assets\\stback1.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -6, 880, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        try {
            // TODO add your handling code here:
            view();
            
        } catch (SQLException ex) {
            Logger.getLogger(ImmunizationRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void irBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irBackActionPerformed
         this.toBack();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.toFront();
        this.setVisible(false);
    }//GEN-LAST:event_irBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        System.out.println(selectedRow);
        String svid=jTable1.getValueAt(selectedRow, 0).toString();
        String last_dose=null;
        if(jTable1.getValueAt(selectedRow, 2)!=null)
        last_dose=jTable1.getValueAt(selectedRow, 2).toString();
        String next_dose=null;
        if(jTable1.getValueAt(selectedRow, 3)!=null)
        next_dose=jTable1.getValueAt(selectedRow, 3).toString();
        String vaccinated=null;
        if(jTable1.getValueAt(selectedRow, 4)!=null)
        vaccinated=jTable1.getValueAt(selectedRow, 4).toString();
        System.out.println(svid+"  "+last_dose+"  "+next_dose+" "+vaccinated);
        db = DB.getObj();
        PreparedStatement stmt;
        try {
            stmt = db.conn.prepareStatement("update immunization_record set last_dose_date= ?, next_dose_due_date =? , vaccinated =? where svid = ?");
        stmt.setString(1, last_dose);
        stmt.setString(2, next_dose);
        stmt.setString(3, vaccinated);
        stmt.setString(4, svid);
        int row=stmt.executeUpdate();
        if(row!=-1)
            JOptionPane.showMessageDialog(null,"Successfully updated Immunization details for svid "+svid);
        else
            JOptionPane.showMessageDialog(null,"Update Failed Please try again");
        } catch (SQLException ex) {
            Logger.getLogger(ImmunizationRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            view();
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(ImmunizationRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

     private void alert() throws SQLException{
         LocalDate now= LocalDate.now();
         LocalDate[] nextdosedate = null;
         db = DB.getObj();
         String nd[]=new String[7];
         //JOptionPane.showMessageDialog(null, "next dose date is still due");

        ResultSet rs = db.query("select svid,student_id,vaccine_name,last_dose_date,next_dose_due_date,vaccinated from immunization_record where student_id ="+studentIdinView.getText());
        List<ImmunizationDto> immunizationList=new ArrayList<>();
        int k = 0,incomplete_count=0,PARTIAL_COUNT=0,FULLY_COUNT=0;
        String displayMessage="";
        String incompleteMessage="Vaccination Incomplete ";
        String partialMessage="Partially Vaccinated ";
        String fullyMessage="Fully Vaccinated";
        while(rs.next()){
                ImmunizationDto dto=new ImmunizationDto();
                dto.setSvid(rs.getString(1));
                dto.setStudentId(rs.getString(2));
                dto.setVaccineName(rs.getString(3));
                dto.setLastDoseDate(rs.getString(4));
                dto.setDueDate(rs.getString(5));
                dto.setVaccinated(rs.getString(6));
                immunizationList.add(dto);
                if(dto.getVaccinated()==null){
                    incomplete_count++;
                    incompleteMessage+=dto.getVaccineName()+",";
                }
                else if(dto.getVaccinated().equals("PARTIALLY VACCINATED")){
                    PARTIAL_COUNT++;
                    partialMessage+=dto.getVaccineName()+" next due Date: "+dto.getDueDate()+",";
                }
                else if(dto.getVaccinated().equals("FULLY VACCINATED")){
                    FULLY_COUNT++;
                }
//                String next_dose=rs.getString(1);
//                System.out.println(next_dose);
////                nd[k] = rs.getString("next_dose_due_date");
////                nextdosedate[k] = LocalDate.parse(nd[k]);
//                int compareDates = now.compareTo(LocalDate.parse(next_dose));
//                if (compareDates > 0) {
////                    System.out.println(nextdosedate[k]);
//                displayMessage+=next_dose+" ";
////                JOptionPane.showMessageDialog(null, "next due date "+next_dose);
//                }
        }
        incompleteMessage+=" Pending";
        partialMessage+=" next dose is Pending";
        if(incomplete_count>0)
            JOptionPane.showMessageDialog(null,incompleteMessage);
        else{
            if(PARTIAL_COUNT==0)
               JOptionPane.showMessageDialog(null,fullyMessage);
            else
               JOptionPane.showMessageDialog(null,partialMessage);
        }
     }
     
    private void view() throws SQLException{
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//    if( i>=0){
    
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ood", "root", "root");
        Statement stmt = con.createStatement();
        String svid[] = new String[7];
        String ld[]= new String[7];
        String nd[]=new String[7];
        String isVaccinated[] = new String[7];

     
//    if( i>=0){


       

        db = DB.getObj();

        rs = db.query("select svid from immunization_record where student_id = "+ studentIdinView.getText() );
        int i = 0;
        while(rs.next()){
            svid[i] = rs.getString("svid");
            i++;
        }
        if(i==0){
            JOptionPane.showMessageDialog(null,"No Student Found with Id: "+studentIdinView.getText());
            return;
        }
      
            
//        while(rs1.next()){
//        String svid_db = rs1.getString("svid");
//        }

//First column - SVID
        Student s=new Student();
        for (int v = 0; v < 7; v++) {
            model.setValueAt(svid[v], v, 0);
        }



//Second column - Last due date
        rs1 = db.query("select last_dose_date from immunization_record where student_id = "+ studentIdinView.getText() );
        int j = 0;
        while(rs1.next()){
            ld[j] = rs1.getString("last_dose_date");
            j++;
        }
        for (int v = 0; v < 7; v++) {
            model.setValueAt(ld[v], v, 2);
        }


//Fourth Column - Next Due Date

        rs2 = db.query("select next_dose_due_date from immunization_record where student_id = "+ studentIdinView.getText());
        int k = 0;
        while(rs2.next()){
            nd[k] = rs2.getString("next_dose_due_date");
            k++;
        }
        for (int v = 0; v < 7; v++) {
            model.setValueAt(nd[v] , v , 3);
        }



//Fifth Column - Vaccinated

        rs3 = db.query("select vaccinated from immunization_record where student_id = "+ studentIdinView.getText());
        int l = 0;
        while(rs3.next()){
            isVaccinated[l] = rs3.getString("vaccinated");
            l++;
        }
        for (int v = 0; v < 7; v++) {
            model.setValueAt(isVaccinated[v], v, 4);
        }
          alert();
       
    }   
    /**
     * 
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
            java.util.logging.Logger.getLogger(ImmunizationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImmunizationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImmunizationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImmunizationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ImmunizationRecord().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ImmunizationRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton irBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField studentIdinView;
    // End of variables declaration//GEN-END:variables
    
    public JTable getjTable1() {
       
        return jTable1;
        
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    private static class LocalDatTime {

        public LocalDatTime() {
        }
    }

    

}