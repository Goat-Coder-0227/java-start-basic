package class1;

/*
    기본형과 참조형의 메서드 호출
    ==> 자바에서 메서드의 매개변수(parameter)는 항상 값에 의해 전달되지만,
        해당 값이 실제 값인지, 참조(메모리 주소)값인지에 따라 결과가 상이
    기본형 : 기본형 데이터 전달 시, 해당 값이 복사되어 전달
            따라서 매서드 내부에서 전달된 데이터 값 변경해도 호출자(원본)에는 무영향
    참조형 : 참조형 데이터 전달 시, 참조값(메모리 주소값)이 복사되어 전달
            따라서 매서드 내부에서 전달된 객체의 멤버 변수 변경 시 호출자(원본)의 객체도 변경됨
 */

public class MethodCalling {
    int value;

    public static void main(String[] args) {
        MethodCalling dataA = new MethodCalling();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);
    }

    private static void changeReference(MethodCalling dataX) {
        dataX.value = 20;
    }
}
