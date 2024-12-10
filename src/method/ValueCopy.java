package method;

/*
    자바의 대원칙)
    "자바는 항상 변수의 값을 복사해서 대입"
    ==> 향후 아무리 복잡한 상황에도 대원칙을 기반으로 코드를 단순하게 이해 가능
    
    기본형(Primitive Type) : 변수에 들어 있는 실제 사용하는 값을 복사해서 대입
    참조형(Reference Type) : 변수에 들어 있는 참조값(메모리 주소값)을 복사해서 대입
 */

public class ValueCopy {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before Function Calling number : " + number);
        changeNumber(number);
        System.out.println("After Function Calling number : " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("변경 전 number: " + number);
        number *= 2;
        System.out.println("변경 후 number: " + number);
    }
}
