/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.StudentController;
import edu.neu.csye6200.controllers.TeacherController;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dubey
 */
public class StudentAssigning extends javax.swing.JFrame {

    /**
     * Creates new form StudentAssigning
     */
    public StudentAssigning() throws SQLException {
        initComponents();
        populateTeacherDD();
        populateClassDD();
        tableShow5();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentIdText = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        assignTeacherBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        teacherLabel = new javax.swing.JLabel();
        teacherDD = new javax.swing.JComboBox<>();
        classDD = new javax.swing.JComboBox<>();
        assignClassBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1680, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentIdText.setEditable(false);
        studentIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(studentIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 102, 99, -1));

        idLabel.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("STUDENT ID");
        getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 81, 99, -1));

        classLabel.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLabel.setText("CLASS");
        getContentPane().add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 247, 60, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "AGE (Months)", "Teacher ID", "Teacher Name", "Class ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 81, 628, 557));

        assignTeacherBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        assignTeacherBtn.setText("ASSIGN TEACHER");
        assignTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTeacherBtnActionPerformed(evt);
            }
        });
        getContentPane().add(assignTeacherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 189, 141, -1));

        back.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 46, -1, -1));

        teacherLabel.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(255, 255, 255));
        teacherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherLabel.setText("TEACHER");
        getContentPane().add(teacherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 158, -1, -1));

        getContentPane().add(teacherDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 150, 99, -1));

        classDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDDActionPerformed(evt);
            }
        });
        getContentPane().add(classDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 239, 99, -1));

        assignClassBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        assignClassBtn.setText("ASSIGN CLASS");
        assignClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignClassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(assignClassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 282, 143, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT ASSIGN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 1193, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dubey\\Downloads\\ood_project-main (1)\\ood_project-latest\\src\\Assets\\stback1.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -3, 1320, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTeacherBtnActionPerformed
        // TODO add your handling code here:


        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to assign.");
            return;
        }
        if (teacherId != 0) {
            JOptionPane.showMessageDialog(null, "Teacher has been already assigned");
            return;
        }

        if (teacherDD.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a teacher to assign.");
            return;
        }


        StudentController std = new StudentController();
        try {
            Statement stmt = DB.getObj().conn.createStatement();
            ResultSet rs;

            int id_teacher = 0;
            for (Map.Entry<Integer, String> mapElement : teacherMap.entrySet()) {

                String value = (mapElement.getValue());
                if (value.equals(teacherDD.getSelectedItem().toString())) {
                    id_teacher = mapElement.getKey();
                }

            }

            rs = stmt.executeQuery("Select * From student where teacher_id=" + id_teacher);


            if (rs != null) {
                int count = 0;

                while (rs.next()) {
                    count++;

                }
                rs = stmt.executeQuery("Select * From classroom");
                while (rs.next()) {
                    if (age <= rs.getInt("maxAge") && age >= rs.getInt("minAge")) {
                        int studentCapacity = rs.getInt("studentCapacity") / rs.getInt("teacherCapacity");
                        if (count == studentCapacity) {
                            JOptionPane.showMessageDialog(null, "Teacher does not have capacity to assign more student.");
                            return;
                        } else {

                            std.assignTeacher(studentId, id_teacher);
                            JOptionPane.showMessageDialog(null, "Teacher has been assigned.");
                        }
                    }
                }
            } else {
                std.assignTeacher(studentId, id_teacher);
                JOptionPane.showMessageDialog(null, "Teacher has been assigned.");
            }

            tableShow5();
        } catch (SQLException ex) {
            Logger.getLogger(StudentUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_assignTeacherBtnActionPerformed

    private void studentIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentIdTextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.toBack();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.toFront();
        mf.setVisible(false);

    }//GEN-LAST:event_backActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();

        studentIdText.setText(df.getValueAt(selectedRow, 0).toString());
        studentId = Integer.parseInt(df.getValueAt(selectedRow, 0).toString());
        teacherId = (df.getValueAt(selectedRow, 3) != null) ? Integer.parseInt(df.getValueAt(selectedRow, 3).toString()) : 0;
        classId = (df.getValueAt(selectedRow, 5) != null) ? Integer.parseInt(df.getValueAt(selectedRow, 5).toString()) : 0;
        age = (df.getValueAt(selectedRow, 2) != null) ? Integer.parseInt(df.getValueAt(selectedRow, 2).toString()) : 0;



    }//GEN-LAST:event_tableMouseClicked

    private void classDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classDDActionPerformed

    private void assignClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignClassBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to assign.");
            return;
        }
        if (teacherId == 0) {
            JOptionPane.showMessageDialog(null, "Assign teacher first.");
            return;
        }
        if (classId != 0) {
            JOptionPane.showMessageDialog(null, "Classroom has been already assigned");
            return;
        }

        if (classDD.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a classroom to assign.");
            return;
        }

        StudentController std = new StudentController();
        TeacherController tc = new TeacherController();
        try {
            Statement stmt = DB.getObj().conn.createStatement();
            ResultSet rs;
            int id = 0;
            for (Map.Entry<Integer, String> mapElement : classMap.entrySet()) {

                String value = (mapElement.getValue());
                if (value.equals(classDD.getSelectedItem().toString())) {
                    id = mapElement.getKey();
                }

            }
            rs = stmt.executeQuery("Select * From classroom where class_id=" + id);
            if (rs.next()) {
                if (rs.getInt("studentCapacity") == rs.getInt("studentAssigned")) {
                    JOptionPane.showMessageDialog(null, "Classroom does not have capacity to assign more student.");
                    return;
                }

                if (age > rs.getInt("maxAge") || age < rs.getInt("minAge")) {
                    JOptionPane.showMessageDialog(null, "This class is not available for the selected age group, please select different class.");
                    return;
                }


                int studentA = rs.getInt("studentAssigned");


                rs = stmt.executeQuery("Select * From teacher where class_id=" + id);
                if (rs != null) {
                    int count = 0;
                    while (rs.next()) {
                        count++;

                    }
                    rs = stmt.executeQuery("Select * From classroom where class_id=" + id);
                    if (rs.next()) {
                        if (count == rs.getInt("teacherCapacity")) {
                            JOptionPane.showMessageDialog(null, "Classroom does not have capacity to assign more student - teacher.");
                            return;
                        } else {
                            std.assignClass(studentId, id);
                            tc.assignClass(teacherId, id);
                            studentA++;
                            std.updateStudentAssigned(id, studentA);
                            JOptionPane.showMessageDialog(null, "Class has been assigned.");
                        }
                    }
                } else {
                    std.assignClass(studentId, id);
                    tc.assignClass(teacherId, id);
                    std.updateStudentAssigned(id, studentA);
                    JOptionPane.showMessageDialog(null, "Class has been assigned.");
                }

                tableShow5();
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_assignClassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentAssigning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAssigning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAssigning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAssigning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentAssigning().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentAssigning.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void populateTeacherDD() throws SQLException {
        teacherDD.removeAll();
        teacherDD.addItem(" ");
        DB db = DB.getObj();
        ResultSet rs1 = db.query("SELECT * FROM teacher;");
        while (rs1.next()) {
            teacherMap.put(rs1.getInt("employee_id"), rs1.getString("fname") + " " + rs1.getString("lname"));
            teacherDD.addItem(rs1.getString("fname") + " " + rs1.getString("lname"));
        }
    }

    public void populateClassDD() throws SQLException {
        classDD.removeAll();
        classDD.addItem(" ");
        DB db = DB.getObj();
        ResultSet rs1 = db.query("SELECT * FROM classroom;");
        while (rs1.next()) {
            classMap.put(rs1.getInt("class_id"), rs1.getInt("class_id") + " (" + rs1.getInt("minAge") + "-" + rs1.getInt("maxAge") + ")");
            classDD.addItem(rs1.getInt("class_id") + " (" + rs1.getInt("minAge") + "-" + rs1.getInt("maxAge") + ")");
        }
    }

    public void tableShow5() throws SQLException {
        DB db = DB.getObj();
        DefaultTableModel df = (DefaultTableModel) table.getModel();
        df.setRowCount(0);
        ResultSet rs = db.query("SELECT * FROM student;");
        ResultSetMetaData rss = rs.getMetaData();

        int c = rss.getColumnCount();
        while (rs.next()) {
            Vector v = new Vector();
            for (int a = 1; a <= c; a++) {
                v.add(rs.getString("student_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("age"));
                v.add(rs.getString("teacher_id"));
                int id = rs.getInt("teacher_id");
                String teacherName = (teacherMap.get(id)) == null ? "" : teacherMap.get(id);

                v.add(teacherName);
                v.add(rs.getString("class_id"));

            }
            df.addRow(v);
        }
    }

    int studentId;
    int classId = 0;
    int teacherId = 0;
    int age;

    Map<Integer, String> teacherMap = new HashMap<Integer, String>();
    Map<Integer, String> classMap = new HashMap<Integer, String>();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignClassBtn;
    private javax.swing.JButton assignTeacherBtn;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> classDD;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField studentIdText;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> teacherDD;
    private javax.swing.JLabel teacherLabel;
    // End of variables declaration//GEN-END:variables
}
