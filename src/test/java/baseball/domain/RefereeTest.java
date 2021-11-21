package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    private Referee referee;
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    //1. Junit5부터는 여러경우를 콤마로 받아서 동시에 테스트 할 수 있다. -> @ParameterizedTest + @CsvSource
    // -> 바뀌는 파라미터들을 모두 "1주기씩 문자열로 묶어, 정답포함 csv 쉼표로 분리"해준다. result까지 갯수를 맞춰준다.
    // -> 함수에서는 그 파라미터+resut의 1주기 갯수만큼 인자받는 메소드로 정의한다.
    // -> "아는 파라미터, 아는 정답"을 붙혀서 콤마라 준다

    @ParameterizedTest
    @CsvSource({"1,2,3,0 볼 3 스트라이크", "7,8,9,낫싱", "2,3,1,3 볼 0 스트라이크"})
    public void compare(int number1, int number2, int number3, String expected){
        String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
        assertThat(actual).isEqualTo(expected);
    }
//
//    @Test
//    void 스트라이크3() {
//        String result = referee.compare(ANSWER, ANSWER);
//        assertThat(result).isEqualTo("0 볼 3 스트라이크");
//    }
//
//    @Test
//    void 아웃() {
//        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
//        assertThat(result).isEqualTo("낫싱");
//    }
//
//    @Test
//    void 볼3() {
//        String result = referee.compare(ANSWER, Arrays.asList(3, 1, 2));
//        assertThat(result).isEqualTo("3 볼 0 스트라이크");
//    }
//
//    @Test
//    void 볼2_스트라이크1() {
//        String result = referee.compare(ANSWER, Arrays.asList(3, 2, 1));
//        assertThat(result).isEqualTo("2 볼 1 스트라이크");
//    }
}