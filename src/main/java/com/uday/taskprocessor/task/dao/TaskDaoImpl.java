package com.uday.taskprocessor.task.dao;

import com.uday.taskprocessor.task.constants.Country;
import com.uday.taskprocessor.task.model.Task;

import java.util.List;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TaskDaoImpl implements TaskDao{
    public List<Task> getTasks(Country country) {
        return null;
    }

    public boolean updatetask(Country country) {
        return false;
    }

    public List<Task> getAusTasks() {
        return null;
    }

    public List<Task> getIndTasks() {
        return null;
    }

    public List<Task> getEngTasks() {
        return null;
    }

    public void setAusTasks(List<Task> ausTasks) {

    }

    public void setIndTasks(List<Task> indTasks) {

    }

    public void setEngTasks(List<Task> engTasks) {

    }
}
