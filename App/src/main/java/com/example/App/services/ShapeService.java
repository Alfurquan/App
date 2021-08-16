package com.example.App.services;

import com.example.App.models.Result;
import com.example.App.models.Shape;

public interface ShapeService {
    int calculateAreaAndSaveResult(Shape shape);
    Result returnResult(int taskId);
}
