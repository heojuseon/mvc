package com.example.mvc_pattern.model;

public class Beverage {
    int price;
    int quantity;

    public Beverage(int price) {
        this.price = price;
        this.quantity = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void down() {
        --quantity;
        if (quantity < 0) {
            quantity = 0;
        }
    }


    public void up() {
        ++quantity;
    }
}
