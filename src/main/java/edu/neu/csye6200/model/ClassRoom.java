/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author dubey
 */
public class ClassRoom {
    private int ClassID;
    private int studentCapacity;
    private int studentEnrolled;
    private int studentAssigned;
    private int minAge;
    private int maxAge;
    private int teacherCapacity;
    private int teachersAssigned;
    
    public ClassRoom(int classId, int studentA){
        this.ClassID = classId;
        this.studentAssigned = studentA; 
    }

    public int getClassID() {
        return ClassID;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public int getStudentEnrolled() {
        return studentEnrolled;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getTeacherCapacity() {
        return teacherCapacity;
    }

    public int getTeachersAssigned() {
        return teachersAssigned;
    }

    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public void setStudentEnrolled(int studentEnrolled) {
        this.studentEnrolled = studentEnrolled;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setTeacherCapacity(int teacherCapacity) {
        this.teacherCapacity = teacherCapacity;
    }

    public void setTeachersAssigned(int teachersAssigned) {
        this.teachersAssigned = teachersAssigned;
    }
    
    public String updateStudentAssigned() {
        return "UPDATE classroom SET "
                + " studentAssigned = " + "'" + this.studentAssigned + "'"
                + " WHERE class_id =" + "'" + this.ClassID+ "'" + ";";
    }
    
}
