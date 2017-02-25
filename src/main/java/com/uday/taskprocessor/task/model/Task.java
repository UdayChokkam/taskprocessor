package com.uday.taskprocessor.task.model;

import com.uday.taskprocessor.task.constants.Country;
import com.uday.taskprocessor.task.constants.OrderType;
import com.uday.taskprocessor.task.constants.TaskStatus;

/**
 * Created by Udaykiran on 25/02/2017.
 */
public class Task {
    private Integer taskId;
    private Integer orderId;
    private Country country;
    private OrderType orderType;
    private Integer version;
    private TaskStatus taskStatus;


    public Task(Integer taskId,Integer orderId,Country country,OrderType orderType,Integer version, TaskStatus taskStatus){
        this.taskId = taskId;
        this.orderId = orderId;
        this.country = country;
        this.orderType = orderType;
        this.version = version;
        this.taskStatus = taskStatus;
    }
}
