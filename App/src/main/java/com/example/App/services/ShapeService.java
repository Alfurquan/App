package com.example.App.services;

import com.example.App.models.Task;
import com.example.App.models.ShapeInput;

public interface ShapeService {
    int calculateAreaAndSaveResult(ShapeInput shape);
    Task returnTask(int taskId);
}
