package com.example.schedulemaker;

public interface DatabaseInterface {

    public void addEmployee(int eID, String name, int workHours, int[] experience, int sID);
    public void updateEmployee(int eID, String name, int workHours, int[] experience, int sID);
    public void addEmployeeSchedule(int sID, String date,String time, String comments, int shiftID);
    public void updateEmployeeSchedule(int sID, String date,String time, String comments, int shiftID);
    public void addEmployeeShift(int shiftID, String shiftDate, int rID);
    public void updateEmployeeShift(int shiftID, String shiftDate, int rID);
    public void addRoutine(int rID, String rDescription, String startTime, String endTime, int jID);
    public void updateRoutine(int rID, String rDescription, String startTime, String endTime, int jID);
    public void addJob(int jobID, String jobDescription);
    public void updateJob(int jobID, String jobDescription);
    public void displayOneEmployee(int employeeID);
    public void displayAllEmployee();
}
