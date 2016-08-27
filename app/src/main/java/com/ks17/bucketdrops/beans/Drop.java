package com.ks17.bucketdrops.beans;

import io.realm.RealmObject;

/**
 * Created by karthik90 on 8/25/2016.
 */
public class Drop extends RealmObject {
    private String goal;

    private long Time_GoalAdded;

    private long Time_GoalOnDue;
    private boolean Goal_Completed_Check;

    public Drop() {
    }

    public Drop(String goal, long time_GoalAdded, long time_GoalOnDue, boolean goal_Completed_Check) {
        this.goal = goal;
        Time_GoalAdded = time_GoalAdded;
        Time_GoalOnDue = time_GoalOnDue;
        Goal_Completed_Check = goal_Completed_Check;
    }


    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public long getTime_GoalAdded() {
        return Time_GoalAdded;
    }

    public void setTime_GoalAdded(long time_GoalAdded) {
        Time_GoalAdded = time_GoalAdded;
    }

    public long getTime_GoalOnDue() {
        return Time_GoalOnDue;
    }

    public void setTime_GoalOnDue(long time_GoalOnDue) {
        Time_GoalOnDue = time_GoalOnDue;
    }

    public boolean isGoal_Completed_Check() {
        return Goal_Completed_Check;
    }

    public void setGoal_Completed_Check(boolean goal_Completed_Check) {
        Goal_Completed_Check = goal_Completed_Check;
    }
}
