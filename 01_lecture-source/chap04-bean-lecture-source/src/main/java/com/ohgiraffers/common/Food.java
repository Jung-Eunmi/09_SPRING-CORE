package com.ohgiraffers.common;

import java.util.Date;

public class Food extends Product{

    private Date bakedDate; // 음식 만들어진 시간

    public Food() {super();}

    public Food(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

}
