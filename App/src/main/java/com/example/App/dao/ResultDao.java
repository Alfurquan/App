package com.example.App.dao;

import com.example.App.models.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultDao extends JpaRepository<Result, Integer> {
}
