package com.example.App.controllers;

import com.example.App.models.Task;
import com.example.App.models.ShapeInput;
import com.example.App.services.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShapeController {

    @Autowired
    ShapeService shapeService;

    @PostMapping("/results")
    public int postShape(@RequestBody ShapeInput shapeInput){
       int taskId = shapeService.calculateAreaAndSaveResult(shapeInput);
       return taskId;
    }

    @GetMapping("/results/{taskId}")
    public Task getResult(@PathVariable String taskId){
        return shapeService.returnTask(Integer.parseInt(taskId));
    }

}
