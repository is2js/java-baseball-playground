package baseball;
import baseball.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        // 5. 객체단위로 변수를 관리하기 때문에, 새로운 객체 -> 관리하는 값도 달라진다.

        Calculator teacher = new Calculator;
        System.out.println(calculator.add(1, 2));
    }
}
