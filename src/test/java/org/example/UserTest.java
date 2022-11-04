package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull(); // 널이 아닌지 검사하고 널이면 exception발생// 널이 아니면 패쓰, 널이면 에러
    }

    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        //given
        User user = new User();

        //when
        user.initPassword(new WrongFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();// 2글자는 항상 초기화가 되지 않기 때문에 널로 확인 // 널이 아니면 exception 발생 //초기화안되면 null인가?????
    }
}