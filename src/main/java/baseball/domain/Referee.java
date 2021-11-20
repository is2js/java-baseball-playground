package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 1. 몇개의 갯수가 같은지 구함. -> by 들여쓰기1의 Judgement#correctCount()  -> Judgement와 [[협력]]한다.
        // -> 볼(자기자리 아니면 2개..자리..) 어려우니 -> 스트라이크 구해서 -> 같은수갯수 -스트라이크 = 볼

        // 2. 타클래스의 메서드를 가져다 쓴다 -> 객체지향에서는 [[협력]]한다. 라고 함.
//        new Judgement();
        Judgement judgement = new Judgement();
//        judgement.correctCount(computer, player);
        int correctCount = judgement.correctCount(computer, player);

        //3. 또다른 메서드를 가져다쓰는 협력을 통해, 스트라이크의 갯수를 구한다.
        // -> hasPlace( 컴퓨터수List,   비교할자리,  플레이어의 수1개씩) -> 반복문으로 들어간다.
        // -> *** my) 아~~ 2개 배열  비교를 위해, <메서드 작성시 파라미터에도  player(한쪽만) 돌렸다 가정>하고, ***
        // -> *** <한쪽은 원소1개, 한쪽(computer)는 배열>을 받고 있구나. ***
        // player 숫자 1개씩을 도는데, 그 도는 i번째 index를 활용해서 -> computer[i]번째도 같은 값이 있는지 물어본다.
        // -> for문 1개로 i를 2번 이용하는 sense

        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
            // ** placeIndex는 player의 원소입장에서는 i번째 위치한, i번재 원소-> computer의 i번째와 같은지 물어본다
//            judgement.hasPlace(computer, placeIndex, player.get(placeIndex));
            if (judgement.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike += 1;
            }
        }
        // 4. 같은 숫자의 갯수  - 스트라이크수 = 볼수
        int ball = correctCount - strike;

        // 5.문자열로 결과 반환
//        return "3 스트라이크";
        return ball + " 볼 " + strike + " 스트라이크"; // 6. 시작점 가서 테스트해보기.
    }

}
