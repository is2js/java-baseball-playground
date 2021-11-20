package baseball;
import baseball.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));

        Calculator teacher = new Calculator();
        System.out.println(teacher.add(1000, 2000));

        System.out.println(Calculator.shareResult);
    }
}
