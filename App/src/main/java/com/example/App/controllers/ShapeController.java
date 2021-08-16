package com.example.App.controllers;

import com.example.App.models.Result;
import com.example.App.models.Shape;
import com.example.App.services.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @Autowired
    ShapeService shapeService;

    @PostMapping("/results")
    public int postShape(Shape shape){
       int taskId = shapeService.calculateAreaAndSaveResult(shape);
       return taskId;
    }

    @GetMapping("/results/${taskId}")
    public Result getResult(@PathVariable String taskId){
        return shapeService.returnResult(Integer.parseInt(taskId));
    }

}
