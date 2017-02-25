package com.uday.taskprocessor.task.constants;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public enum TaskStatus {
    NEW("New"),
    INPRG("Inprogress"),
    RETRY("Retry"),
    COMP("Completed");
    private String taskStatus;

    TaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }



}
