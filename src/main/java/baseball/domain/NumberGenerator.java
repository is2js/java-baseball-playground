package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public List<Integer> createRandomNumbers() {
        //1. 자바에는 Random이라는 녀석이 있으며, new Random()으로 객체 만들고 , nextInt()로 뽑아 쓰면 된다.
        // - 뽑을 때 바운더리를 지정해줄 수 있다. 0~ n-1까지 -> 우리는 1~9가 필요하니.. 0~8을 만든 뒤 +1을 하면 된다. -> n-1까지 만드니  9를 대입한다.
        //int number = new Random().nextInt(9) + 1;
        // 3번 뽑는다. -> 각 수마다 컬렉션에 담아야한다. -> 리스트.add()로 담으면 된다.
        List<Integer> numbers = new ArrayList<>(); // ArrayList는 List의 실제클래스라고 보면 된다.
        for (int i = 0; i < 3; i++) {
            int number = new Random().nextInt(9) + 1;
            numbers.add(number);
        }
        // 3번 뽑아서 담긴 놈을 return한다.
//        return null;
        return numbers; // 2. -> 생성한 기능은 [Application.java]에서 인스턴스화해서 사용한다.
    }
}
