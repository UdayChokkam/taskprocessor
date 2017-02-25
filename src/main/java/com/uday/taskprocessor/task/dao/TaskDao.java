package com.uday.taskprocessor.task.dao;

import com.uday.taskprocessor.task.constants.Country;
import com.uday.taskprocessor.task.model.Task;

import java.util.List;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public interface TaskDao {

    public List<Task> getTasks(Country country);

    public boolean updatetask(Country country);


    // For testing purposes

    public List<Task> getAusTasks();
    public List<Task> getIndTasks();
    public List<Task> getEngTasks();
    public void setAusTasks(List<Task> ausTasks);
    public void setIndTasks(List<Task> indTasks);
    public void setEngTasks(List<Task> engTasks);
}
