package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 객체 지향 프로그램
 * 기능을 가지고 있는 클래스 -> 시작점에서? 인스턴스화하고
 * 인스턴스가 기능(메소드)을 수행하게 한다.
 * 각 결과를 종합한다.
 */
public class Application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
//        List<Integer> players = askNumbers();

        //1. 이제 result가 (0볼) 3스트라이크  나올때까지 계속 게임 한다.
        // -> while문이 필요하다.
        // --> 업데이트되는 조건변수? while문 들어가기 전에, 미리 초기화 해두자.
        // --> 매번 초기화하면 변수 생성비용 & 값이 초기화되면 안됨. 업데이트되어야하면 변수를 위로 빼자.
        // my) while문에 들어갈 놈들이 변수, 객체 생성하고 있으면 -> 미리 while문 위에 빼놓고 업데이트 되도록하자.
//        String result = referee.compare(computer, players);
        String result = "";
        // my) "0 볼 3 스트라이크" 나오기직전까지 -> !( equals
        while (!(result.equals("0 볼 3 스트라이크"))) {
            //2. 뭐야.. 매번 새롭게 물어봐야하므로.. aksNumbers()를 호출하는 과정도 while문 안으로..
            List<Integer> players = askNumbers();
            result = referee.compare(computer, players);

            //3. 돌면서 매번 판별결과를 보여줘야한다.
            System.out.println(result);
        }



    }
    public static List<Integer> askNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 3개를 입력해주세요. ex> 123");
        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for ( String num : input.split("")) {
            numbers.add(Integer.valueOf(num));
        }
        return numbers;
    }
}
