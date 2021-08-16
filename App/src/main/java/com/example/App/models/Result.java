package com.example.App.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int taskId;
    String type;
    double result;

    public Result(String type, double result) {
        this.type = type;
        this.result = result;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getType() {
        return type;
    }

    public double getResult() {
        return result;
    }
}
