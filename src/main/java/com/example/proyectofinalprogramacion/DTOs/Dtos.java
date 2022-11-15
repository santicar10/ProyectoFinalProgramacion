package com.example.proyectofinalprogramacion.DTOs;

public class Dtos {
    String name;
    int amount;
    int price;

    public Dtos(String name,int amount,int price) {
        this.name = name;
        this.amount=amount;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
