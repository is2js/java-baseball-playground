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
        // 1. 이제 우리가 수를 주는 것은 input을 받아야한다. - > readme -> 아닌 github참고
        // 원본 readme를 보고 input받는 창을 간단하게 구현해본다.
        //      ## 실행 결과
        //      숫자를 입력해 주세요 : 123
        //      1볼 1스트라이크
        // -> 일단, 여기서 메소드로 구현해버린다. -> 2.
        
        // 4. 테스트
        List<Integer> players = askNumbers();
        System.out.println(players);


        String result = referee.compare(computer, Arrays.asList(4, 5, 6));
        System.out.println(result);
    }
    // 2. input창을 만든다. 사용자에게 물어볼 땐 ask로 시작한다.
    // -> 결과값이 있나? 사용자입력은 입력받을 값이 결과값으로서 return되어야한다.
    // -> 입력값 ==결과값 ==메소드 return타입 -> List를 사용자에게 ask해서 결과값으로 반환할 것이다.
    // --> static메소드인 main에서 바로 사용할거라.. static으로 선언해준다. (타클래스의 인스턴스라면 static메소드 안에서 작동해도 상관없다..)
    public static List<Integer> askNumbers() {
        //3. 
//        new Scanner();
        Scanner scanner = new Scanner(System.in);
        // 연속된 문자열을 받았다면 -> 문자열을 1글자씩 돌면서 담아야한다.
        System.out.println("숫자 3개를 입력해주세요. ex> 123");
        String input = scanner.nextLine();
        // 문자열을 1개씩 쪼개는 기능을 모르겠다면.. 자동완성에서 확인해봐야할듯..
//        input.
        // ""로 split하면 될듯싶다? -> 담아줄 List<Integer>를 생성하고, split("")로 돌아서 담아보자.
        List<Integer> numbers = new ArrayList<>();
        // java도 python처럼 쉽게할 수 있는데 classic하게 하는 중.
        // -> for문에서 향상된for문( forEach문?)을 써보자.
        for ( String num : input.split("")) {
            //cf) valueOf 는 결국 parseInt 를 호출하는 형태이지만, 기본자료형 int가 아니라 객체 Integer라고 한다.
            //문자열을 변환할 때 객체로 받아서 사용하느냐, 기본 자료형으로 받아서 사용하느냐의 차이다
            //-> 두 메소드 중에 어느 것을 사용할지는 사용의 용도에 맞게 사용하면 되겠다. 기본 int 가 필요하면 parseInt() , Integer 래퍼 객체가 필요하면 valueOf() 를 사용하면 된다.
            numbers.add(Integer.valueOf(num));
        }

        return numbers;
    }
}
