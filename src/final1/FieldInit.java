package final1;

/*
    final - 필드 직접 초기화
        - final을 필드에서 직접 초기화 시 생성자에서도 초기화 불가
        - 추후 Main()에서 재할당 불가
 */

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;
}
