package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfig.class);

        Product kimchi = context.getBean("kimchi", Food.class);
        Product coke = context.getBean("coke", Drink.class);
        Product soda = context.getBean("soda", Drink.class);

        // 첫 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.addItem(kimchi);
        cart1.addItem(soda);

        System.out.println("첫 번째 손님 cart 목록" + cart1.showCart());

        // 두 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.addItem(coke);

        System.out.println("두 번째 손님 cart 목록" + cart2.showCart());

        System.out.println("cart1.hashCode() : " + cart1.hashCode());
        System.out.println("cart2.hashCode() : " + cart2.hashCode());

        /* comment.
        *   init 메소드는 Bean 객체 생성 시점에 동작한다.
        *   destroy 메소드는 Bean 객체 소멸 시점에 동작하며 이 메소드는
        *   컨테이너를 종료 시키지 않으면 확인 할 수 없다.
        *   가비지 컬렉터가 해당 빈을 메모리에서 삭제할 때 destroy 메소드가 동작하게되며
        *   메모리가 지워지기 전에 프로세스가 종료되기 때문에 강제로 컨테이너를 닫아줘야 destroy 를 확인 가능하다.
        * */

        ((AnnotationConfigApplicationContext)context).close();

    }

}
