package com.example.WCD.entity;

import com.example.WCD.entity.base.BaseEntity;

import java.time.LocalDateTime;

public class Food  extends BaseEntity {
    private int id;
    private String username;
    private String Describe;
    private String avatar;
    private  String code;
    private double price;
    private String sale_at;
    private String update_at;
    private String delete_at;
    private String update_by;
    private String delete_by;

    public Food() {
    }

    public Food(int id, String username, String describe, String avatar, String code, double price, String sale_at, String update_at, String delete_at, String update_by, String delete_by) {
        this.id = id;
        this.username = username;
        Describe = describe;
        this.avatar = avatar;
        this.code = code;
        this.price = price;
        this.sale_at = sale_at;
        this.update_at = update_at;
        this.delete_at = delete_at;
        this.update_by = update_by;
        this.delete_by = delete_by;
    }

    public Food(LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, int id, String username, String describe, String avatar, String code, double price, String sale_at, String update_at, String delete_at, String update_by, String delete_by) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        this.id = id;
        this.username = username;
        Describe = describe;
        this.avatar = avatar;
        this.code = code;
        this.price = price;
        this.sale_at = sale_at;
        this.update_at = update_at;
        this.delete_at = delete_at;
        this.update_by = update_by;
        this.delete_by = delete_by;
    }
}

