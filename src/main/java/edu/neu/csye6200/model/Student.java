/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author dubey
 */
public class Student {

    private int studentId;
    private int parentId;
    private String studentName;
    private int age;
    private String dateofBirth;
    private double gpa;
    private int classId;
    private String email;
    private int teacherId;

    {
        studentId = -1;
        studentName = "";
        age = -1;
        dateofBirth = "";
        gpa = 0.0;

    }

    public Student(int studentId, String studentName, int age, String dateofBirth, double gpa) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.dateofBirth = dateofBirth;
        this.gpa = gpa;
    }

    public Student(String studentName, String dateOfBirth, int age, String email) {
        super();
        this.studentName = studentName;
        this.dateofBirth = dateOfBirth;
        this.age = age;
        this.email = email;

    }

    public Student(int studentId, String studentName, String dateofBirth, double gpa, String email, int age) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateofBirth = dateofBirth;
        this.gpa = gpa;
        this.email = email;
        this.age = age;
    }

    public Student(int studentId, int id, String type) {
        super();
        this.studentId = studentId;
        if (type.equals("teacher")) {
            this.teacherId = id;
        } else {
            this.classId = id;
        }
    }

    public Student() {
        super();

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String generateRegisterQuery() {
        return "INSERT INTO student (name, dob, age,parent_id, email) VALUES(?,?,?,?,?);";
    }

//        public String getStudentByEmailQuery(String email){
//            return "Select * From student where email="+email;
//        }
    public String generateStudentIdQuery() {
        return "SELECT student_id FROM student WHERE name=" + this.studentName;
    }

    public String updateStudentTable() {
        return "UPDATE student SET "
                + " name = " + "'" + this.studentName + "'"
                + ", dob = " + "'" + this.dateofBirth + "'"
                + ", gpa= " + "'" + this.gpa + "'"
                + ", age= " + "'" + this.age + "'"
                + ", email= " + "'" + this.email + "'"
                + " WHERE student_id =" + "'" + this.studentId + "'" + ";";
    }

    public String showStudentTable() {
        return "SELECT s.student_id,s.name,s.age,s.dob,s.gpa,s.parent_id,p.name,p.address,p.phone "
                + " FROM student s,parent p;";
    }

    public String updateStudentTeacher() {
        return "UPDATE student SET "
                + " teacher_id = " + "'" + this.teacherId + "'"
                + " WHERE student_id =" + "'" + this.studentId + "'" + ";";
    }
    
    public String updateStudentClass() {
        return "UPDATE student SET "
                + " class_id = " + "'" + this.classId + "'"
                + " WHERE student_id =" + "'" + this.studentId + "'" + ";";
    }

}
