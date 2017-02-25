package com.uday.taskprocessor.task.dao;

import com.uday.taskprocessor.task.constants.Country;
import com.uday.taskprocessor.task.dao.TaskDao;
import com.uday.taskprocessor.task.model.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TestTaskDaoImpl implements TaskDao{

    private  List<Task> ausTasks = new LinkedList<Task>();
    private  List<Task> indTasks = new LinkedList<Task>();
    private  List<Task> engTasks = new LinkedList<Task>();

    public List<Task> getTasks(Country country) {
        switch (country){
            case AUS:
                return ausTasks;
            case ENG:
                return  engTasks;
            case IND:
                return indTasks;

            default:
                return null;
        }
    }

    public boolean updatetask(Country country) {
        return false;
    }

    public List<Task> getAusTasks() {
        return ausTasks;
    }

    public List<Task> getIndTasks() {
        return indTasks;
    }

    public List<Task> getEngTasks() {
        return engTasks;
    }

    public void setAusTasks(List<Task> ausTasks) {
        this.ausTasks = ausTasks;
    }

    public void setIndTasks(List<Task> indTasks) {
        this.indTasks = indTasks;
    }

    public void setEngTasks(List<Task> engTasks) {
        this.engTasks = engTasks;
    }
}
