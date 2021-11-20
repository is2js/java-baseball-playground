package baseball.domain;

public class Calculator {
    public static int shareResult = 0; // 클래스변수. static
    public int result = 0; // 인스턴스변수.
    //1. 공유는 하되, 불변하도록 하고 싶다.
    // -> 변하도록 결과값을 조장하는 메소드에서 아예 결과값을 해당 변수에 안주면 상관없는데 실수 할 수 있따.
    // -> 사람은 실수하기 때문에, 메소드에서도 아예 건들이지못하게
    // -> 불변변수를 쓰는게 좋다.
    // -> 클래스단위로 == 모든객체가 공유하면서 불변하는 상수
    // * 공유는 하되 변하지 않는 값을 쓰려면 -> final로 상수화 한다.
    // -> 메소드결과값을 메소드내부에서 전달 못함.
    // -> 전부 대문자를 쓴다.
    public final int SHARE_BIRTHDAY = 1104;

    public Calculator() {
    }
    public int add(int number1, int number2) {
        shareResult = number1 + number2;
        result = number1 + number2;
        return number1 + number2;
    }
}
