package baseball.domain;

import java.util.List;

//- [ ] 컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교할 수 있다. - Referee#compare()
//        - [ ] 몇개의 숫자가 같은지 알 수 있다. - Judgement#correctCount()
//        - [ ] 특정 자리에  특정 숫자가 있는지 알 수 있다. - Judgement#hasPlace()
// 1. 첫번째가 너무 어려우니까, 들여쓰기(Judgement) 2개 증
// 1) correctCount는..  2개 리스트를 다 돌면서 비교해야한다 -> 어렵다??
// 2) hasPlace의 경우, <리스트>의 특정index(place)에 특정숫자(number)가 있는지 확인하는 것이므로 더 쉽다.
// -> List도 파라밑터로 추가로 받아주자.

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player) {
        // 2. correctCount의 가장 간단한 방법은, 2개 배열을 2중 포문을 돌면서 1:1매칭으로 비교하면 되지만,,
        // -> 1개 배열만 돌고 * contains (python의 in)으로 확인하기!! for  i in x[] : i in y[]
        // -> player가 가진 숫자 하나하나를 -> 컴퓨터가 가지고 있는지 의 순서가 <코드 읽기 더 편하다>
//        for (int i = 0; i < player.size(); i++) {
//            int playerNumber = player.get(i); // 어려울까바 올린 것 굳이 안해도됨.
//            // 사람의 숫자를 컴퓨터가 가지고 있는지 -> 가지고 있을 때마다, 변수에 +1해주기
//            computer.contains(playerNumber);
//        }
        // 3. player 리스트 하나만 돌면서 -> computer내부에 가진게 나올때마다 count +=1 해준다.
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            int playerNumber = player.get(i);
            if (computer.contains(playerNumber)) {
                result += 1;
            }
        }
        return result; // 4. Application으로 가서 잘 동작하는지 확인한다. ->
    }

    //    public boolean hasPlace(int placeNumber, int number) {
    public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
        return false;
    }
}
