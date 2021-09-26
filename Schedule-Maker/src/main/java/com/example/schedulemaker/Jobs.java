package com.example.schedulemaker;

public class Jobs {

    String jobID;
    String jobDescription; // what is done in the job ( "wash dishes in dishroom" )
    int routineID;

    public Jobs(String jobID, String jobDescription, int routineID) {
        this.jobID = jobID;
        this.jobDescription = jobDescription;
        this.routineID = routineID;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getRoutineID() {
        return routineID;
    }

    public void setRoutineID(int routineID) {
        this.routineID = routineID;
    }
}
