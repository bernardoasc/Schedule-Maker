package com.example.schedulemaker;

public class Routines {

    int routineID;
    String routineDescription;
    String startTime;
    String endTime;

    public Routines(int routineID, String routineDescription, String startTime, String endTime) {
        this.routineID = routineID;
        this.routineDescription = routineDescription;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getRoutineID() {
        return routineID;
    }

    public void setRoutineID(int routineID) {
        this.routineID = routineID;
    }

    public String getRoutineDescription() {
        return routineDescription;
    }

    public void setRoutineDescription(String routineDescription) {
        this.routineDescription = routineDescription;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
