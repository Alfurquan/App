package com.example.App.services;

import com.example.App.dao.ResultDao;
import com.example.App.models.Result;
import com.example.App.models.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeServiceImpl implements ShapeService {

    @Autowired
    private ResultDao resultDao;

    @Override
    public int calculateAreaAndSaveResult(Shape shape) {
        double area = shape.calculateArea();
        Result result = new Result(shape.getType(),area);
        resultDao.save(result);
        return result.getTaskId();
    }

    @Override
    public Result returnResult(int taskId) {
        return resultDao.findById(taskId).get();
    }
}
