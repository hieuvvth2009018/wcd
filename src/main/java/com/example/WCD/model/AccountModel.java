package com.example.WCD.model;

import com.example.WCD.entity.Category;
import com.example.WCD.entity.Food;
import com.example.WCD.model.AccountModel;

import java.util.List;

public interface AccountModel {
    boolean save(Food obj);
    boolean update(int id, Food updateObj);
    boolean delete(int id);
    List<Food> findAll();
    Food findById(int id);
    Food findByUsername(String username);
}
