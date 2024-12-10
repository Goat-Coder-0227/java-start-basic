package final1;

/*
    final 변수와 참조
        - final을 기본형 변수에 사용 시 값을 변경할 수 없음
        - final을 참조형 변수에 사용 시 참조값(주소값)을 변경할 수 없음
        !) 참조형 변수에 final이 붙을 시 참조 대상 자체를 다른 대상으로 변경 불가능 한 것이지, 참조하는 대상의 값은 변경 가능
        ==> final은 매우 유용한 제약, 특정 변수의 값을 할당한 이후에 변경하지 않아야 한다면 final을 사용하자
 */

public class FinalRefMain {
    public static void main(String[] args) {
        final Constant constant = new Constant();
//        constant = new Constant(); // final 변경 불가 컴파일 오류

        // 참조 대상의 필드 값은 변경 가능
        constant.not_final_value = 20;  // Constant.not_final_value는 final이 아니므로 변경 가능
        System.out.println(constant.not_final_value);
        constant.not_final_value = 30;  // Constant.not_final_value는 final이 아니므로 변경 가능
        System.out.println(constant.not_final_value);
    }
}
