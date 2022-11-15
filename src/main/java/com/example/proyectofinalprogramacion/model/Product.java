package com.example.proyectofinalprogramacion.model;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private String code;

    public Product(String name, int quantity, double price, String code) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
