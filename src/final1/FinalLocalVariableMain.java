package final1;

/*
    상수(Constant)
        - 자바에서 보통 단 하나만 존재하는 변하지 않는 고정된 값
        1. final (지역)변수
            - 변수에 final 키워드가 붙으면 더는 값을 변경 불가
                ex) final int value = 4;
            - class, method 등 여러곳에 사용 가능
        2. final 매개변수
            - 매개변수에 final 사용 시 메서드 내부에서 매개변수 값 변경 불가
            - 메서드 호출 시점에 사용된 값이 메서드 종료까지 사용
 */

public class FinalLocalVariableMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//      data1 = 20; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
//      data2 = 20; // 컴파일 오류

        method(10);
    }

    static void method(final int parameter) {
//      parameter = 10; // 컴파일 오류
    }
}
