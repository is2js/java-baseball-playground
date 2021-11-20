package baseball.domain;

import java.util.List;

public class NumberGenerator {
    //.1 이제 createRandomNumbers()의 뼈대를 만든다.
    // -> 접근제어자 + 반환타입 -> int[] 인트배열 아니면 List<Integer>다.
    // -> List는, 배열int[]와는 다른 자바에서 제공하는 컬렉션이다.
    // -> 실제배열은 값을 도중에 끼우거나  중간 것을 뺄때도..  구현까지 해야됨.. 잘 안함.
    // -> add.부터.. 미리 길이 몰라도 더해줄 수 있다. -> 굳이 배열을 쓸 필요가 없다.
    public List<Integer> createRandomNumbers() {
        //2. 뼈대만 만들 것이기 때문에, return 리스트자리에 null;해준다.
        return null;
    }

}
