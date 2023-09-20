package com.example.mvc_pattern.model;

public class Americano extends Beverage{


    public Americano() {   //Americano 생성자
        super(1500);    //자신이 상속받은 부모의 생성자 호출 -> Beverage
    }

}
