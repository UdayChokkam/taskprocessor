package com.uday.taskprocessor.task.queue;

import com.uday.taskprocessor.task.model.Task;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TaskQueue {

    //TODO Comparator needs to be implemented to decide the priority among the versions - highest version highest priority
    private final BlockingQueue<Task> taskQueue = new PriorityBlockingQueue<Task>();

    public void addTasks(List<Task> tasks){
        taskQueue.addAll(tasks);
    }

    public Task getTask(){
        Task task = null;
        try {
           taskQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return task;
    }
}
