package edu.neu.csye6200.model;
import java.sql.*;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

public class Immunization extends Student {
    private String svid;
    private String nextDueDate;
    private int tempSID;
    private String lastVaccineDate;
    private LocalDate[] ld; //last_vaccine_dose
    private LocalDate[] nd; //next_dose

    public Immunization(int studentId, String studentName, int age, String dateofBirth, double gpa, String svid, String nextDueDate, int tempSID, String lastVaccineDate, LocalDate[] ld, LocalDate[] nd) {
        super(studentId, studentName, age, dateofBirth, gpa);
        this.svid = svid;
        this.nextDueDate = nextDueDate;
        this.tempSID = tempSID;
        this.lastVaccineDate = lastVaccineDate;
        this.ld = ld;
        this.nd = nd;
    }

    public Immunization(String svid, String nextDueDate, int tempSID, String lastVaccineDate, LocalDate[] ld, LocalDate[] nd) {
        this.svid = svid;
        this.nextDueDate = nextDueDate;
        this.tempSID = tempSID;
        this.lastVaccineDate = lastVaccineDate;
        this.ld = ld;
        this.nd = nd;
    }

    public Immunization() {

    }
    
    public String generateRegisterQuery() {
        return "INSERT INTO immunization_record (student_id,vaccine_name) VALUES(?,?);";
    }

    public String getSvid() {
        return svid;
    }

    public void setSvid(String svid) {
        this.svid = svid;
    }

    public String getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(String nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public int getTempSID() {
        return tempSID;
    }

    public void setTempSID(int tempSID) {
        this.tempSID = tempSID;
    }

    public String getLastVaccineDate() {
        return lastVaccineDate;
    }

    public void setLastVaccineDate(String lastVaccineDate) {
        this.lastVaccineDate = lastVaccineDate;
    }

    public LocalDate[] getLd() {
        return ld;
    }

    public void setLd(LocalDate[] ld) {
        this.ld = ld;
    }

    public LocalDate[] getNd() {
        return nd;
    }

    public void setNd(LocalDate[] nd) {
        this.nd = nd;
    }
}



