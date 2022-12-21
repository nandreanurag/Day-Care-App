/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author dubey
 */
public class Teacher {

    
    
    protected int employeeId;
    protected String fname;
    protected String lname;
    protected String address;
    protected String phoneNo;
    protected Double rating;
    protected int classId;

    public Teacher(){}
    
    public Teacher(String fname,int classId){
        super();
        this.fname=fname;
        this.classId=classId; 
    }
    
    public Teacher(int teacherId,int classId){
        super();
        this.employeeId=teacherId;
        this.classId=classId; 
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Double getRating() {
        return rating;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    public String updateStudentTeacher(){
            return "UPDATE teacher SET " +
                         " class_id = " +"'"+this.classId+"'"+
                        " WHERE class_id =" +"'"+ this.classId + "'"+";";
        }
    
    public String updateTeacherClass() {
        return "UPDATE teacher SET "
                + " class_id = " + "'" + this.classId + "'"
                + " WHERE employee_id =" + "'" + this.employeeId + "'" + ";";
    }
}
