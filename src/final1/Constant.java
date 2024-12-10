package final1;

/*
    static final(상수)
        - static 영역에 존재하면서, final 키워드를 사용하여 초기화 값이 변하지 않음
        - 단 하나만 존재하는 영역이므로 명확한 중복과 메모리 비효율 문제 해결 가능
        - 중앙에서 값을 하나로 관리할 수 있음
        ==> 필드에 fianl + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적임
 */

public class Constant {
    public static final double PI = 3.14;
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MAX_USERS = 1000;

    public int not_final_value;
}
