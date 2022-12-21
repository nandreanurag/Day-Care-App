/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.RegistrationController;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dubey
 */
public class StudentRenewal extends javax.swing.JFrame {

    /**
     * Creates new form StudentRenewal
     */
    public StudentRenewal() throws SQLException {
        initComponents();
        tableShow2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentID3 = new javax.swing.JTextField();
        studentName3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        renew = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1680, 750));
        setPreferredSize(new java.awt.Dimension(1680, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentID3.setEditable(false);
        studentID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentID3ActionPerformed(evt);
            }
        });
        getContentPane().add(studentID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 227, 143, -1));

        studentName3.setEditable(false);
        studentName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentName3ActionPerformed(evt);
            }
        });
        getContentPane().add(studentName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 302, 143, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 46, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 208, 143, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 283, 143, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "STUDENT NAME", "DATE OF JOINNING", "RENEWAL DATE", "MEMBERSHIP YEARS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 116, 615, 383));

        renew.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        renew.setText("RENEW");
        renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewActionPerformed(evt);
            }
        });
        getContentPane().add(renew, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 349, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ANNUAL REGISTRATION TRACK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1165, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\dubey\\Downloads\\ood_project-main (1)\\ood_project-latest\\src\\Assets\\stback1.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1370, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.toBack();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentID3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentID3ActionPerformed
        // TODO add your handling code here:
        studentId = Integer.parseInt(studentID3.getText());
    }// GEN-LAST:event_studentID3ActionPerformed

    private void renewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_renewActionPerformed
        // TODO add your handling code here:
         try {
        studentId = Integer.parseInt(studentID3.getText());
        studentName = studentName3.getText();
        } catch (Exception ex) {
            
             JOptionPane.showMessageDialog(this, "Please Select a row");
             return;
        }
        // TODO: Controller code
        try {
        RegistrationController reg = new RegistrationController();
        reg.updateStudent(studentId);
       
            tableShow2();
        } catch (SQLException ex) {
            Logger.getLogger(StudentRenewal.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, "This language just gets better and better!");
        }

    }// GEN-LAST:event_renewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        studentID3.setText(df.getValueAt(selectedRow, 0).toString());
        studentName3.setText(df.getValueAt(selectedRow, 1).toString());

    }// GEN-LAST:event_jTable1MouseClicked

    private void studentName3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentName3ActionPerformed
        // TODO add your handling code here:
        studentName = studentName3.getText();

    }// GEN-LAST:event_studentName3ActionPerformed

    public void tableShow2() throws SQLException {
        try{
        DB db = DB.getObj();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        ResultSet rs = db.query("SELECT r.student_id,s.name,r.created_date,r.renewal_date,r.years_member"
                + " FROM registration r,student s where s.student_id = r.student_id;");
        ResultSetMetaData rss = rs.getMetaData();
        if(rss==null){
        JOptionPane.showMessageDialog(this, "No records to Show");
        }
        int c = rss.getColumnCount();
        while (rs.next()) {
            Vector v = new Vector();
            for (int a = 1; a <= c; a++) {
                v.add(rs.getString("student_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("created_date"));
                v.add(rs.getString("renewal_date"));
                v.add(rs.getString("years_member"));

            }
            df.addRow(v);
        }
        }catch(Exception e){
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentRenewal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentRenewal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    int studentId;
    String studentName;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton renew;
    private javax.swing.JTextField studentID3;
    private javax.swing.JTextField studentName3;
    // End of variables declaration//GEN-END:variables
}
