package com.example.App.services;

import com.example.App.dao.ResultDao;
import com.example.App.models.Task;
import com.example.App.models.Shape;
import com.example.App.models.ShapeFactory;
import com.example.App.models.ShapeInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeServiceImpl implements ShapeService {

    @Autowired
    private ResultDao resultDao;

    @Override
    public int calculateAreaAndSaveResult(ShapeInput shapeInput) {
        Shape shape = ShapeFactory.getShape(shapeInput);
        double area = shape.calculateArea();
        Task result = new Task(shapeInput.getType(),area);
        resultDao.save(result);
        return result.getTaskId();
    }

    @Override
    public Task returnTask(int taskId) {
        return resultDao.findById(taskId).orElse(null);
    }
}
