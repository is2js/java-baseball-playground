package baseball;

import baseball.domain.NumberGenerator;
import baseball.domain.Referee;
import java.util.ArrayList;
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
        String result = "";
        while (!(result.equals("0 볼 3 스트라이크"))) {
            List<Integer> players = askNumbers();
            result = referee.compare(computer, players);
            System.out.println(result);
        }


    }

    public static List<Integer> askNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 3개를 입력해주세요. ex> 123");
        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (String num : input.split("")) {
            numbers.add(Integer.valueOf(num));
        }
        return numbers;
    }
}
