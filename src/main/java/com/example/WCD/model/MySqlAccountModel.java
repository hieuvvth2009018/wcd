package com.example.WCD.model;

import com.example.WCD.entity.Food;
import com.example.WCD.model.AccountModel;

import java.util.List;

public class MySqlAccountModel implements AccountModel {

    @Override
    public boolean save(Food obj) {
        return false;
    }

    @Override
    public boolean update(int id, Food updateObj) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Food> findAll() {
        return null;
    }

    @Override
    public Food findById(int id) {
        return null;
    }

    @Override
    public Food findByUsername(String username) {
        return null;
    }
}
