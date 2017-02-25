package com.uday.taskprocessor.task.model;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public enum TaskStatus {
    NEW("New","New status of a task");
    private String taskStatus;
    private String desc;

    TaskStatus(String taskStatus, String desc){
        this.taskStatus = taskStatus;
        this.desc = desc;

    }



}
