package com.example.schedulemaker;

import java.sql.Connection;

public class DatabaseService implements DatabaseInterface{

    Connection con;

    public DatabaseService(Connection con) {
        this.con = con;
    }

    @Override
    public void addEmployee(int eID, String name, int workHours, int[] experience, int sID) {

    }

    @Override
    public void updateEmployee(int eID, String name, int workHours, int[] experience, int sID) {

    }

    @Override
    public void addEmployeeSchedule(int sID, String date, String time, String comments, int shiftID) {

    }

    @Override
    public void updateEmployeeSchedule(int sID, String date, String time, String comments, int shiftID) {

    }

    @Override
    public void addEmployeeShift(int shiftID, String shiftDate, int rID) {

    }

    @Override
    public void updateEmployeeShift(int shiftID, String shiftDate, int rID) {

    }

    @Override
    public void addRoutine(int rID, String rDescription, String startTime, String endTime, int jID) {

    }

    @Override
    public void updateRoutine(int rID, String rDescription, String startTime, String endTime, int jID) {

    }

    @Override
    public void addJob(int jobID, String jobDescription) {

    }

    @Override
    public void updateJob(int jobID, String jobDescription) {

    }

    @Override
    public void displayOneEmployee(int employeeID) {

    }

    @Override
    public void displayAllEmployee() {

    }
}
