package baseball;
import baseball.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));

        Calculator teacher = new Calculator();
        System.out.println(teacher.add(1000, 2000));

        //System.out.println(teacher.shareResult);
        // 클래스 변수는 바로 클래스에서 접근할 수 있다.
        // 굳이 모든 인스턴스 공통인데 한 인스턴스에서 접근 ㄴㄴ
        System.out.println(Calculator.shareResult);
    }
}
