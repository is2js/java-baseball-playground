package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public List<Integer> createRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        // 1. 담을때 중복을 제거하고 담으면, 서다수 3개를 뽑는 것이 된다.
        // ** 중복을 제거하는 방법 **
        // -> 매번 랜덤으로 뽑으면서 & if로 중복을 확인하며 & 반복횟수는 정해지지 않고(for->while) -> 3개가 담길때까지 계속 돌려야한다.
        // 1) 담길때까지 -> for문으로 해결안됨. -> while
        // - 조건변수 대신 List는 List.size()로 매번 갯수를 확인할 수 있다.
        // -> 갯수가 3개면.. 진입하면 안된다..  < 3...( 3개가 되기 직전까지 add임.. 3 미포함임.. 3일 때 드가지말고 탈출해야됨.)
        // my) 갯수를 whlie에 돌릴 때는, countNumber 때 탈출해야하므로  size == N일 때 탈출 -> size < N일때가지만 돈다.
        while (numbers.size() < 3 ) {
            int number = new Random().nextInt(9) + 1;
            //2) List.contains로 이미 포함하면 건너띈다.
            if (numbers.contains(number)) {
                continue;
            }
            numbers.add(number);
        }
//        for (int i = 0; i < 3; i++) {
//            int number = new Random().nextInt(9) + 1;
//            numbers.add(number);
//        }
        return numbers;
    }
}
