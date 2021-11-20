package baseball;

import baseball.domain.Calculator;

public class App {
    public static void main(String[] args) {
        //12. 생성자를 부를 수 있는 new(연산자)를 통해 타class의 객체를 만들어 쓸 수 있다. ( static안붙어서 무조건 객체 만들어 사용)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
    }
}
