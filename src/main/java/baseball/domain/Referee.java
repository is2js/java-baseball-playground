package baseball.domain;

import java.util.List;

public class Referee {
    //2. compare()는 3자리의 수 2개 배열(리스트 in 컬렉션)를 받고 비교까지 한다.(파라미터 유)
    // 컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교후 -> 결과도 일단 문자열 "1볼 1스트랑크"로 반환해야한다. (리턴 유)
    // -> List<Integer> 컴퓨터수, 플레이어수 를 받고 -> 비교의 결과 -> 우리에게 결과를 문자열로 알려줘야한다.
    // -> my) 메서드가 결과값이 있는지, 생각하자. 리턴값=결과값으로 생각하자.
    public String compare(List<Integer> computer, List<Integer> player) {
        return "3 스트라이크";
    }

}
