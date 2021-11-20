package baseball.domain;

public class Calculator {
    public static int shareResult = 0; // 클래스변수. static
    public int result = 0; // 인스턴스변수.

    public Calculator() {
    }
    public int add(int number1, int number2) {
        shareResult = number1 + number2;
        result = number1 + number2;
        return number1 + number2;
    }
}
