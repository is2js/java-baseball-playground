package baseball;

import baseball.domain.NumberGenerator;

import java.util.List;

/**
 * 객체 지향 프로그램
 * 기능을 가지고 있는 클래스 -> 시작점에서? 인스턴스화하고
 * 인스턴스가 기능(메소드)을 수행하게 한다.
 * 각 결과를 종합한다.
 */
public class Application {
    public static void main(String[] args) {
        //2. 기능모음집 클래스에서 구현한 기능은, 클래스를 인스턴스화 해서 기능구현한다.
        // -> 객체 생성시 변수명은 new 생성자(); 호출후 ctrl+.으로 자동완성해서 변수 편하게 고르자.
        // -> 메서드의 결과값을 보려고한 것이기 때문에 변수에 담아서 찍자.
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers); // [4, 7, 7]
    }
}
