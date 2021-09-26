package com.example.schedulemaker;

public class EmployeeShift {

    int shiftID;
    String shiftDate;
    String jobID;
    String JobDescription;

    public EmployeeShift(int shiftID, String shiftDate, String jobID, String jobDescription) {
        this.shiftID = shiftID;
        this.shiftDate = shiftDate;
        this.jobID = jobID;
        JobDescription = jobDescription;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public String getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(String shiftDate) {
        this.shiftDate = shiftDate;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }
}
