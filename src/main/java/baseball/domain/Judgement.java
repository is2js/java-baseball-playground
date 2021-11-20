package baseball.domain;

import java.util.List;

//- [x] 컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교할 수 있다. - Referee#compare()
//        - [x] 몇개의 숫자가 같은지 알 수 있다. - Judgement#correctCount()
//        - [ ] 특정 자리에  특정 숫자가 있는지 알 수 있다. - Judgement#hasPlace()
public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            int playerNumber = player.get(i);
            if (computer.contains(playerNumber)) {
                result += 1;
            }
        }
        return result;
    }

    //[ ] 특정 자리에  특정 숫자가 있는지 알 수 있다. - Judgement#hasPlace()
    //1. compute숫자의 특정자리의 숫자를 일단 가져와야하는데, index에 사용될 숫자이므로
    // -> 명확한 표현을 위해 index에 들어갈 변수명은 xxxIndex라고 명시하자.
//    public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
    public boolean hasPlace(List<Integer> computer, int placeIndex, int number) {
//        if (computer.get(placeIndex) == number) {
//            return true;
//        }
//        return false;
        //2. **참이면 true를, 거짓이면 false를 구한다면, 조건식 자체를 return해주면 된다.**
        return computer.get(placeIndex) == number; // 3. Application에 가서 클래스 인스턴스화 해서 메서드 기능  테스트한다.

    }
}
