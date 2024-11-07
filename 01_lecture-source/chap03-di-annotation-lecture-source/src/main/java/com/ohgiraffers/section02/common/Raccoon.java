package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Primary  Koala 에서 Primary 를 설정했기때문에 에러 발생 -> 2개 이상 설정 불가
@Order(1)
public class Raccoon implements Animal {
    @Override
    public void eat() {
        System.out.println("너구리가 이탈리안BLT를 먹어요!!");
    }
}
