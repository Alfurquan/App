package com.example.App.dao;

import com.example.App.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultDao extends JpaRepository<Task, Integer> {
}
