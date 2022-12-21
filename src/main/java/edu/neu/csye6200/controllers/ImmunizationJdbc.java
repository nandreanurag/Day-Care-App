package edu.neu.csye6200.controllers;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Immunization;
import edu.neu.csye6200.views.ImmunizationRecord;

import java.sql.*;
import java.time.LocalDate;

import static edu.neu.csye6200.DB.db;
import edu.neu.csye6200.model.Registration;

public class ImmunizationJdbc {
    private static ImmunizationJdbc immuniazation;
    //public static void main(String args[]){
        //update("");
    //}
    LocalDate nd;
    String vaccinated = "";
    int svid_int;

    public void update(String updated_ld , int sid, int student_id) throws SQLException {
        String svid = String.valueOf(sid);
        int len = svid.length();
        char ch;
        svid_int = sid;
        ch = svid.charAt(len - 1);
        ImmunizationRecord ir = new ImmunizationRecord();
        LocalDate ld;
        ld = LocalDate.parse(updated_ld);
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ood", "root", "root");
        Statement stmt = con.createStatement();
        db = DB.getObj();
        ResultSet rs =  stmt.executeQuery("select age from student where student_id = "+student_id);
//        ResultSet rs = db.query("select age from student where student_id = '"+ir.studentIdinView.getText() +"'");
            while(rs.next()){
            int age = rs.getInt("age");
                //ld[i] = LocalDate.parse(updated_ld);


                if (ch == '1') {
                    // Vaccine Name : Hib
                    if (age < 2){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 2 && age < 4){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 4 && age < 6){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 6 && age < 9){
                        nd = ld.plusMonths(9);}
                    else{
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";

                    System.out.println(nd);
                    System.out.println(vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");
                    System.out.println("updating");
                    //stmt.executeUpdate(formattedStrin);
                }
                if(ch == '2'){
                    // Vaccine Name : DTap
                    if(age < 2){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 2 && age < 4){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 4 && age < 6){
                        nd = ld.plusMonths(2);
                    }
                    else if(age >= 6 && age < 18){
                        nd = ld.plusMonths(12);
                    }
                    else if(age >= 18 && age < 72){
                        nd = ld.plusMonths(54);
                    }
                    else {
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");
                }

                if(ch == '3'){
                    // Vaccine Name : Polio
                    if(age < 2)
                        nd = ld.plusMonths(2);
                    else if(age >= 2 && age < 4){
                        nd = ld.plusMonths(2);}
                    else if(age >=4 && age < 18){
                        nd = ld.plusMonths(14);}
                    else if(age >= 18 && age < 72){
                        nd = ld.plusMonths(54);}
                    else{
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");
                }

                if(ch == '4'){
                    // Vaccine Name : Hepatitis B
                    //nd = ld[i];
                    if(age < 2)
                        nd = ld.plusMonths(2);
                    else if(age >=2 && age < 18){
                        nd = ld.plusMonths(16);
                    }
                    else{
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");
                }

                if(ch == '5'){
                    //Vaccine Name = MMR
                    if(age < 15)
                        nd = ld.plusMonths(15);
                    else if(age >= 15 && age < 72){
                        nd = ld.plusMonths(57);
                    }
                    else {
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");

                }

                if(ch == '6'){
                    //Vaccine Name = Varicella
                    if(age < 15)
                        nd = ld.plusMonths(15);
                    else if(age >= 15 && age < 72){
                        nd = ld.plusMonths(57);
                    }
                    else {
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");

                }

                if(ch == '7'){
                    //ld[i] = LocalDate.parse(dob);
                    if(age < 6){
                        nd = ld.plusMonths(6);
                    }
                    else if(age >= 6 && age < 18){
                        nd= ld.plusMonths(12);
                    }
                    else if(age >= 18 && age < 30){
                        nd = ld.plusMonths(12);
                    }
                    else if(age >= 30 && age < 42){
                        nd = ld.plusMonths(12);
                    }
                    else if(age >= 42 && age < 54){
                        nd = ld.plusMonths(12);
                    }
                    else if(age >= 54 && age < 66){
                        nd = ld.plusMonths(12);
                    }
                    else{
                        nd = null;
                    }
                    if(nd == null)
                        vaccinated = "fully vaccinated";
                    else
                        vaccinated = "not fully vaccinated";
                    //System.out.println(svid + "\t" + id + "\t" + fld + "\t" + nd + "\t" + vaccinated);
                    stmt.executeUpdate("UPDATE immunization_record SET next_dose_due_date = '"+ String.valueOf(nd) +"' , vaccinated = '"+ vaccinated +"' WHERE svid = '" + String.valueOf(svid_int) +"'");

                }
            }

        }
    
    public static ImmunizationJdbc getObj() {
        if (immuniazation == null) {
            immuniazation = new ImmunizationJdbc();
        }
        return immuniazation;
    }
    
    public void addStudent(int student_id) {
        try {

            DB db = DB.getObj();

//            LocalDate currentDate = LocalDate.now();
//            LocalDate renewalDate = currentDate.plusYears(1);
//            int yearsMember = 1;
            Immunization imm = new Immunization();
//            Registration reg = new Registration(student_id, currentDate, renewalDate, yearsMember);

            PreparedStatement statement = db.conn.prepareStatement(imm.generateRegisterQuery());
            statement.setInt(1, student_id);
            statement.setString(2, "HIB");
//            statement.setDate(3, reg.getRenewalDate());
//            statement.setInt(4, reg.getYearsMember());

            int affectedRows = statement.executeUpdate();
            statement.setString(2, "TDap");
            affectedRows = statement.executeUpdate();
            statement.setString(2, "Polio");
            affectedRows = statement.executeUpdate();
            statement.setString(2, "Hepatitis B");
            affectedRows = statement.executeUpdate();
            statement.setString(2, "MMR");
            affectedRows = statement.executeUpdate();
            statement.setString(2, "Varicella");
            affectedRows = statement.executeUpdate();
            statement.setString(2, "Influenza");
            affectedRows = statement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


