package construct;

public class MemberInit {
    String name;
    int age;
    int grade;
    String nameField;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        /*
            this
            ==> 자기 자신 인스턴스(Instance)를 가리킨다
                즉 여기서는 MemberInit Class를 가리킨다
         */
    }

    void initNoThisMember(String nameParameter) {
        nameField = nameParameter;

        /*
            this가 생략된 경우
            ==> 변수를 찾을 때 가까운 지역변수(매개변수 포함)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다
                만약 멤버 변수도 없으면 오류가 발생한다

            nameField : 먼저 지역변수(매개변수 포함)에서 같은 이름의 변수가 있는지 찾는데 이 경우 없으므로 멤버 변수를 사용
            nameParameter : 먼저 지역변수(매개변수)에서 같은 이름의 변수가 있는지 찾는데 이 경우 매개변수가 있기에 매개변수를 사용
         */
    }
}
