package com.uday.taskprocessor.task.take;

import com.uday.taskprocessor.task.dao.TaskDao;
import com.uday.taskprocessor.task.queue.TaskQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.*;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TaskTakerManager {
    private final ExecutorService pool;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private TaskDao taskDao;
    private TaskQueue taskQueue;

    public TaskTakerManager(int threadsNum,TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
        pool = Executors.newFixedThreadPool(10);
        init();
    }

    private void init() {


    }


}
