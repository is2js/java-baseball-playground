package baseball.domain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    //1. 테스트코드의 공통된 부분(같은 메소드의 다른 경우 테스트라.. 파라미터 전깢 시작이 동일)은,
    //  **각각이 서로 다른 객체(인스턴스)들이기 때문에 **
    // -> 매 테스트마다 실행될 수 있게, @BeforeEach 애너테이션 아래에 작성될수있게 한다.
    // -> **각 테스트마다 객체는 새로 생성되지만 참조변수는 1개면 된다.** -> 참조변수는 먼저 선언해두자.
    // 여기서만 쓸꺼니.. private으로 참조변수 선언
    private Referee referee;

    //3. 파라미터중, computer수는 배열이지만 고정이라서, static final상수List로 선언해준다.
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    //2. 매 test마다 새롭게 세팅될 중복코드들은 [alt+insert > Setup method] - @BeforeEach에다가 작성하자.
    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void 스트라이크3() {
//        Referee referee = new Referee();
        String result = referee.compare(ANSWER, ANSWER);
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }
    @Test
    void 아웃() {
//        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void 볼3() {
//        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(3, 1, 2));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    void 볼2_스트라이크1() {
//        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(3, 2, 1));
        assertThat(result).isEqualTo("2 볼 1 스트라이크");
    }

}