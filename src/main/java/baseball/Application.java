package baseball;
import baseball.domain.Calculator;

//1. 기본 패키지를 만든 뒤, 그곳에 main 시작점을 가지는 Application을 만든다
//11. 이제 Calculator에 만들어준 public int add를 쓰고 싶으니까 들고와야한다.
public class Application {
    public static void main(String[] args) {
        //12. 생성자를 부를 수 있는 new(연산자)를 통해 타class의 객체를 만들어 쓸 수 있다. ( static안붙어서 무조건 객체 만들어 사용)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        //13. 다시 정리하면
        // -> 자바에서는 기능(메소드)을 사용하기 위해서는, 무조건 Class(기능 모음집)가 일단 필요하다!!
        // -> 메소드가 잇으려면 class가 있어야한다.
        // -> 메소드를 쓰려면 class의 객체를 생성해줘야한다.
    }
}
