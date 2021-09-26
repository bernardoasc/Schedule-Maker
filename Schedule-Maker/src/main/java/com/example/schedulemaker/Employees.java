package com.example.schedulemaker;

public class Employees {

    int employeeID;
    String name;
    int workHours;      //adds up all worked hours
    int[] experience;       // all known jobs (stores jobID)
    int scheduleID;

    public Employees(int employeeID, String name, int workHours, int[] experience, int scheduleID) {
        this.employeeID = employeeID;
        this.name = name;
        this.workHours = workHours;
        this.experience = experience;
        this.scheduleID = scheduleID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int[] getExperience() {
        return experience;
    }

    public void setExperience(int[] experience) {
        this.experience = experience;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }
}
