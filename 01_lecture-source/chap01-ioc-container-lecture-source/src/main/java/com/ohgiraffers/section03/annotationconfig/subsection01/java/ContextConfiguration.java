package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("configuration03")

// 경로를 설정해주면 그 경로부터 위에서 아래로 스캔해주고 Component 가 있는 것을 Bean 으로 설정해준다.
// @ComponentScan.Filter 를 사용하여 지정해주면 그것은 빼고 Scan 해준다.
/* test 1 */
//@ComponentScan(basePackages = "com.ohgiraffers")
/* test 2 */
@ComponentScan(basePackages = "com.ohgiraffers",
        excludeFilters = {
            @ComponentScan.Filter(
                    /* 1. 타입으로 설정 */
//                    type = FilterType.ASSIGNABLE_TYPE,
//                    classes = {MemberDAO.class}
                    /* 2. 어노테이션 종류 */
//                    type = FilterType.ANNOTATION,
//                    classes = {org.springframework.stereotype.Component.class}
                    /* 3. 표현식으로 설정 */
//                    type = FilterType.REGEX,
//                    pattern = {"com.ohgiraffers.section03.annotationconfig.subsection.java.*"}
            )
        }
)
public class ContextConfiguration {

}
