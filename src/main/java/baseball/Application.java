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
        // 1. 이제 남은 것은 [구현완료된 기능을 각 인스턴스에게 수행]시키고 -> [종합]이 남았다.
        Referee referee = new Referee();
        // 2. 심판은 필요해서 그대로 두고, 예제로 준 computer 수를 하드코딩이 아니라 <NumberGenerator#createRandomNumbers()>로 생성하도록 한다.
//        new NumberGenerator();
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
        // 3. 서다수 3개 computer를 심판에게 준다.
        String result = referee.compare(computer, Arrays.asList(4, 5, 6));
        System.out.println(result);
    }
}
