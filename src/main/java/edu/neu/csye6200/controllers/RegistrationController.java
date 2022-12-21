package edu.neu.csye6200.controllers;

import java.sql.PreparedStatement;
import java.time.LocalDate;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Registration;

public class RegistrationController {
    private static RegistrationController regController;

    public void addStudent(int student_id) {
        try {

            DB db = DB.getObj();

            LocalDate currentDate = LocalDate.now();
            LocalDate renewalDate = currentDate.plusYears(1);
            int yearsMember = 1;
            Registration reg = new Registration(student_id, currentDate, renewalDate, yearsMember);

            PreparedStatement statement = db.conn.prepareStatement(reg.generateRegisterQuery());
            statement.setInt(1, reg.getStudent_id());
            statement.setDate(2, reg.getRegisteredDate());
            statement.setDate(3, reg.getRenewalDate());
            statement.setInt(4, reg.getYearsMember());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int student_id) {
        try {

            DB db = DB.getObj();

            Registration reg = new Registration(student_id);

            PreparedStatement statement = db.conn.prepareStatement(reg.generateUpdateQuery());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static RegistrationController getObj() {
        if (regController == null) {
            regController = new RegistrationController();
        }
        return regController;
    }
}
