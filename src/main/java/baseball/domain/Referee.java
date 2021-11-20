package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);
        //1. 깜빡한 낫싱 구현
        if (correctCount==0) {
            return "낫싱";
        }
        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
            if (judgement.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike += 1;
            }
        }
        int ball = correctCount - strike;
        
        return ball + " 볼 " + strike + " 스트라이크";
    }

}
