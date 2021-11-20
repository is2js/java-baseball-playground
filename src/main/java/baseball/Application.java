package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.Arrays;
import java.util.List;

/**
 * 객체 지향 프로그램
 * 기능을 가지고 있는 클래스 -> 시작점에서? 인스턴스화하고
 * 인스턴스가 기능(메소드)을 수행하게 한다.
 * 각 결과를 종합한다.
 */
public class Application {
    public static void main(String[] args) {
        // 6. 테스트
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2));
        System.out.println(result);
        // -> 0 볼 3 스트라이크 -> 7. 가서 고치기(나중에)

    }
}
