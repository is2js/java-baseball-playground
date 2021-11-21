package baseball.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    //1. comppare( , )함수의 결과를 테스트하기 위해
    // -> 인스턴스를 통해 메서드기능 실행시키는 것은 똑가다.
    // -> 결과값까지 받아두고.. 처리하는데..
    @Test
    void 스트라이크3() {
        // 1. 클래스 사용ㅇ하는 것은  Test 아닐때 -> Application matn메소드에서 하는 것 과 비슷하다.
        Referee referee = new Referee();
        // 일단, 알고 있는 답이 나오도록 파라미터들을 넣어준다.
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        //2. "0 볼 3 스틀라이크"의 확인을 컴퓨터에게 맞겨야한다. -> printlin은 그만!
        //System.out.println(result);
        
        // 3. assertj라는 라이브러리를 이용해서 
        // ctlr+. -> import static method -> Assertions.assertThat 선택
        // -> 내가 알고 있는 답은 "이거야" 라고 주장(assert)한다.
        // -> assertThat( 결과변수 ) -> 이 결과변수는
        // -> .isEualTo("값") -> 이 값과 같다고 나는 주장한다.
        // -> print안찍을테니까 너가 확인해줘.
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }
}