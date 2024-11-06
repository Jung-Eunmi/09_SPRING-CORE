package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member.getPersonalAccount());
        System.out.println(member.getPersonalAccount().deposit(1000000));
        System.out.println(member.getPersonalAccount().getBalance());
        System.out.println(member.getPersonalAccount().withDraw(5000));
        System.out.println(member.getPersonalAccount().getBalance());



    }

}
