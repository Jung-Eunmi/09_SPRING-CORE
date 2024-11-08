package com.ohgiraffers.common;

import java.util.Date;

public class Food extends Product{

    private Date bakedDate; // 음식 만들어진 시간

    public Food() {super();}

    public Food(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        // 부모의 tostring 메소드 가져오면서 내 필드를 출력 할 수 있는 구문 추가
        return super.toString() + " " + this.bakedDate;
    }

}
