package final1;

/*
    final - 생성자 초기화
        - final을 필드에 사용 시 해당 필드는 생성자를 통해서 한번만 초기화 가능
        - 추후 Main()에서 재할당 불가
 */

public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
