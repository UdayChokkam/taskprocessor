package com.uday.taskprocessor.task.give;

import com.uday.taskprocessor.task.constants.Country;
import com.uday.taskprocessor.task.dao.TaskDao;
import com.uday.taskprocessor.task.model.Task;
import com.uday.taskprocessor.task.queue.TaskQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class TaskGiverManager {

    private final ScheduledExecutorService pool;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private TaskQueue taskQueue;
    private TaskDao taskDao;

    // TODO The number of threads should be configurable in properties and passed into this class
    public TaskGiverManager(int threadsNum,TaskQueue taskQueue,TaskDao taskDao) {
        this.taskQueue = taskQueue;
        this.taskDao = taskDao;
        pool = Executors.newScheduledThreadPool(10);
        init();
    }

    private void init() {
        Queue<Future<List<Task>>> results = new LinkedList<Future<List<Task>>>();
        // TODO The below needs to be iterated for required entities
        List<Country> countries = Arrays.asList(new Country[]{Country.AUS, Country.ENG, Country.IND});
        for (final Country country : countries) {
            Future<List<Task>> taskList = pool.schedule(new Callable<List<Task>>() {
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
                    return  taskDao.getTasks(country);
                }
            },5,TimeUnit.SECONDS);
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
