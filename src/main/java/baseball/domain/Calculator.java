package baseball.domain;

// 10. python는 무조건 public이라서, 아무나 다 쓸 수 있다. 접근 못하게 하려면 _add, __add를 붙이지만, 관례적일 뿐 맘 먹으면 접근 가능.
// - java는 class or 기능(method)를 어느정도까지 열어줄지 지정해 줄 수 있다.
// - public과 private 2개를 많이 쓴다.
// -> private : class중괄호 내부처리용이다. 여기서만 쓸 거다.
// -> 다시 main으로 가자.
public class Calculator {
    //5. 똑같이 생성자를 만들고 메소드도 만든다.
    // - 일단 생성자는 만들어주고 본다?
    public Calculator() {
    }

    //6. 메소드니까 기능을 할 것이다. -> 기능인 숫자를 더하려면 좌항, 우항이 필요하다
    // - python과 다르게 type을 명시해서, 그것만 딱 받을거라고 명시해줘야한다.
    //public add(int number1, int number2) {
    //7. 무엇인가 반환할 것이면 함수명 앞에 반환할 타입도 적어줘야한다.
    public int add(int number1, int number2) {
        // 8. 반환도 마무리 해야한다.
        return number1 + number2;
        // 9. 메소드명(파라미터, 들) 부분을 method의 [시그니처]라고 부른다. ex> add(int number1, int number2)
    }
}
