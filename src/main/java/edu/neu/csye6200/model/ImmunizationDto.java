/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author Anurag
 */
public class ImmunizationDto {
    private String svid;
    private String studentId;
    private String vaccineName;
    private String lastDoseDate;
    private String dueDate;
    private String vaccinated;

    public ImmunizationDto(String svid, String studentId, String vaccineName, String lastDoseDate, String dueDate, String vaccinated) {
        this.svid = svid;
        this.studentId = studentId;
        this.vaccineName = vaccineName;
        this.lastDoseDate = lastDoseDate;
        this.dueDate = dueDate;
        this.vaccinated = vaccinated;
    }

    public ImmunizationDto() {
    }

    public String getSvid() {
        return svid;
    }

    public void setSvid(String svid) {
        this.svid = svid;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getLastDoseDate() {
        return lastDoseDate;
    }

    public void setLastDoseDate(String lastDoseDate) {
        this.lastDoseDate = lastDoseDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(String vaccinated) {
        this.vaccinated = vaccinated;
    }

   
    
    
}
