package com.example.mvc_pattern.model;

public class TotalPrice {
    int totalPrice = 0;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void Americano_decreaseTotalPrice(int price) {
        totalPrice -= price;
        if (totalPrice < 0){
            totalPrice = 0;
        }
    }

    public void Americano_increaseTotalPrice(int price) {
        totalPrice += price;
    }

    public void Latte_increaseTotalPrice(int price) {
        totalPrice += price;
    }

    public void Latte_decreaseTotalPrice(int price) {
        totalPrice -= price;
        if (totalPrice < 0){
            totalPrice = 0;
        }
    }
}
