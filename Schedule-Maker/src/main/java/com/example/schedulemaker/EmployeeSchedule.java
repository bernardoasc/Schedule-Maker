package com.example.schedulemaker;

public class EmployeeSchedule {

    int scheduleID;
    String date;
    String dayTime; // stores a 00:00 time if not available
    String comments; // stores availability / routine number if already scheduled
    int employeeID;

    public EmployeeSchedule(int scheduleID, String date, String dayTime, String comments, int employeeID) {
        this.scheduleID = scheduleID;
        this.date = date;
        this.dayTime = dayTime;
        this.comments = comments;
        this.employeeID = employeeID;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
