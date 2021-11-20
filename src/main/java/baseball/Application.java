package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;

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
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers); // [4, 7, 7]

        //4. new Judgement();
        Judgement judgement = new Judgement();
        // -> 파라미터로 List를 넣는 방법은 Arrays.asList( , ,, );형태로 만든다.
        int correctCount = judgement.correctCount(Arrays.asList(1, 5, 3), Arrays.asList(1, 2, 3));
        System.out.println(correctCount);

    }
}
