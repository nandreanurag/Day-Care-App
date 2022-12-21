/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Period;
import java.util.Currency;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.ClassRoom;
import edu.neu.csye6200.model.Parent;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import javax.swing.JFrame;

/**
 *
 * @author dubey
 */
public class StudentController {

    private static StudentController studentController;

    private int getAgeFromDOB(LocalDate dob) {
        return Period.between(dob, new Date(System.currentTimeMillis()).toLocalDate()).getYears();
    }

    private int getAgeFromDOB2(Date dob) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        int monthsBetween = (int) ChronoUnit.MONTHS.between(
                LocalDate.parse(dob.toString()).withDayOfMonth(1),
                LocalDate.parse(dtf.format(now)).withDayOfMonth(1));
        System.out.println(monthsBetween);
        return monthsBetween;
    }

    public void addStudentAndParent(String name, Date dob, String parentName, String parentPhone,
            String parentAddress, String email) {
        System.out.println("Coming in add");
        DB db = DB.getObj();

        int age = getAgeFromDOB2(dob);
        Student s = new Student(name, dob.toString(), age, email);
        Parent p = new Parent(parentName, parentAddress, parentPhone);
        try {
            PreparedStatement statement = db.conn.prepareStatement(p.generateRegisterQuery(),
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getParentName());
            statement.setString(2, p.getParentAddress());
            statement.setString(3, p.getParentPhoneNo());

            int affectedRows = statement.executeUpdate();
            if (affectedRows != 0) {

                System.out.println("Added parent, adding student now");
                int parentId = -1;
                try (ResultSet rs = statement.getGeneratedKeys()) {
                    if (rs.next()) {
                        parentId = rs.getInt(1);
                    }
                    rs.close();
                }

                System.out.println("Parent id " + parentId);
                s.setParentId(parentId);

                statement = db.conn.prepareStatement(s.generateRegisterQuery(), Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, s.getStudentName());
                statement.setString(2, s.getDateofBirth());
                statement.setInt(3, s.getAge());
                statement.setInt(4, s.getParentId());
                statement.setString(5, s.getEmail());

                affectedRows = statement.executeUpdate();
                if (affectedRows != 0) {
                    System.out.println("Added student, adding registration now");

                    int student_id = -1;
                    try (ResultSet rs = statement.getGeneratedKeys()) {
                        if (rs.next()) {
                            student_id = rs.getInt(1);
                        }
                        rs.close();
                    }

                    System.out.println("Student id " + student_id);

                    ImmunizationJdbc.getObj().addStudent(student_id);

                    RegistrationController.getObj().addStudent(student_id);
                } else {
                    System.out.println("Error in adding student");
                }

            } else {
                System.out.println("Error in adding parent");
            }
        } catch (SQLException e) {

        }

    }

    public static StudentController getObj() {
        if (studentController == null) {
            studentController = new StudentController();
        }
        return studentController;
    }

    public void updateStudentAndParent(int studentId, String studentName, Date dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo, String email) throws InterruptedException {

        DB db = DB.getObj();

        int age = getAgeFromDOB2(dateofBirth);
        Student s = new Student(studentId, studentName, dateofBirth.toString(), gpa, email, age);
        Parent p = new Parent(parentId, parentName, parentAddress, parentPhoneNo);

        db.update(s.updateStudentTable());
        Thread.sleep(200);
        db.update(p.updateParentTable());

    }

    public void showStudentAndParentTable(int studentId, String studentName, String dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo) {

        DB db = DB.getObj();

        Date dob = Date.valueOf(dateofBirth);

        int age = getAgeFromDOB2(dob);

        Parent p = new Parent(parentId, parentName, parentAddress, parentPhoneNo);

    }

    public void assignTeacher(int studentId, int id) {
        DB db = DB.getObj();
        Student s = new Student(studentId, id, "teacher");

        db.update(s.updateStudentTeacher());

    }

    public void assignClass(int studentId, int id) {
        DB db = DB.getObj();
        Student s = new Student(studentId, id, "class");

        db.update(s.updateStudentClass());

    }

    public void updateStudentAssigned(int classId, int studentA) {
        DB db = DB.getObj();
        ClassRoom c = new ClassRoom(classId, studentA);
        db.update(c.updateStudentAssigned());
    }

}
