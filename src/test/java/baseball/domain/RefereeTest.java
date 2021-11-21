package baseball.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    @Test
    void 스트라이크3() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");

    //1. 이번에는 다른 파라미터 -> 다른 아는 답이 나오는 경우도 테스트해본다.
    // -> my) 그냥 1메소드마다 여러경우를  main에서 하는 것처럼 테스트하는거네..
    // **위에 1번째 경우 코드를 복사해서 파라미터 & 주장하는답(expected)만 수정한다.**
    }
    @Test
    void 아웃() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱");
    }

    //2. 다른 아는 파라미터 + 아는 다른 답을 넣어준다.
    @Test
    void 볼3() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }
    // 3. 하나만 더 테스트
    @Test
    void 볼2_스트라이크1() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        assertThat(result).isEqualTo("2 볼 1 스트라이크");
    }

}