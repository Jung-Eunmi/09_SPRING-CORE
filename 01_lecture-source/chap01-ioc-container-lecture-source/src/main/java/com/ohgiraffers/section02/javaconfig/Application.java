package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        /* index 2. java 방식의 설정 */
        ApplicationContext context                      // Bean 설정 한 클래스 전달
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println("member = " + member);

    }

}