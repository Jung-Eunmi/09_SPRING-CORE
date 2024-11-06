package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data => 위에 있는 5가지를 다 수행 할 수 있지만 Lombok 자체의 버그가 많아 권장하지 않음
public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;

}
