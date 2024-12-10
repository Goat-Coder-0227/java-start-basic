package final1;

/*
    ConstructInit
        - 생성자를 사용하여 final필드를 초기화 할 경우, 각 인스턴스마다 final 필드에 다른 값 할당은 가능
        - fianl 필드를 사용하였기에 인스턴스 생성 후 값을 재할당(변경)하는 것은 불가
    FieldInit
        - 필드에서 직접 final필드를 초기화 할 경우, 각 인스턴스마다 같은 fianl 필드 값을 가짐
        - final 필드를 사용하였기에 마찬가지로 인스턴스 생성 후 값을 재할당(변경)하는 것은 불가
        - 모든 인스턴스가 같은 값을 가지기 때문에 결과적으로는 메모리 낭비, 개발자 시점에서 명확한 중복 발생
 */

public class FinalInitMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자를 통한 초기화");
        ConstructInit constructInit1 = new ConstructInit(20);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 직접 초기화
        System.out.println("필드에서 직접 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(Constant.PI);
        System.out.println(Constant.HOURS_IN_DAY);
        System.out.println(Constant.MINUTES_IN_HOUR);
        System.out.println(Constant.SECONDS_IN_MINUTE);
        System.out.println(Constant.MAX_USERS);
    }
}
