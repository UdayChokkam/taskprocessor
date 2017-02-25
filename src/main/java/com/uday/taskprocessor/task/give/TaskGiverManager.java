package com.uday.taskprocessor.task.give;

import com.uday.taskprocessor.task.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TaskGiverManager {

    private final ExecutorService pool;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    // TODO The number of threads should be configurable in properties and passed into this class
    public TaskGiverManager(int threadsNum) {
        pool = Executors.newFixedThreadPool(10);
        init();
    }

    private void init() {
        Queue<Future<List<Task>>> results = new LinkedList<Future<List<Task>>>();
        // TODO The below needs to be iterated for required entities
        for (int i = 0; i < 5; i++) {
            Future<List<Task>> taskList = pool.submit(new Callable<List<Task>>() {
                public List<Task> call() throws Exception {
                    MDC.put("logFileName", Thread.currentThread().getName());
                    //TODO  Following code here
               /*
               1. Connect to Database
               2. If the connection is not obtained apply retry mechanism which needs to be analysed
               3. Run the proc
               3. Get the list of tasks
                */
                    logger.info("Inside call method");
                    MDC.put("logFileName", Thread.currentThread().getName());
                    return null;
                }
            });
            results.add(taskList);
        }
        while (!results.isEmpty()) {
            try {
                Future<List<Task>> futureResult = results.poll();
                List<Task> tasks = futureResult.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
