package construct;

/*
    생성자(Consructor)
        - 객체 생성 동시에 객체를 초기화 하기 위한 특별한 메서드
        - 객체를 생성하는 시점에서 어떤 작업을 수행하고 싶다면 생성자(Constructor)를 이용
        
    생성자(Constructor) 장점
    1. 중복 호출 제거 
        객체를 생성하면서 동시에 생성 직후에 필요한 작업(초기화)을 한번에 처리 가능
    2. 제약(Constraint) - 호출 필수
        객체를 생성 시 직접 정의한 생성자를 반드시 호출 해야 함
        
    기본 생성자(default Consdtructor)
        - 매개변수가 없고, 작동하는 코드가 없는 생성자
        - 클래스와 같은 접근 제어자를 가짐
        - 클래스에 생성자가 하나라도 없으면 컴파일러가 기본 생성자를 생성
        - 생성자가 하나라도 존재 시 컴파일러는 기본 생성자를 만들지 않음
        - 생성자가 하나라도 존재 시 개발자는 반드시 직접 정의한 생성자를 호출해야 함(제약)

    this()
        - 생성자 내부에서 다른 생성자를 호출 할 때 사용
        - 생성자에서 중복 코드를 제거 가능
        - 단 this()는 반드시 생성자 코드의 첫 줄에서만 사용 가능
 */

public class MemberConstruct {
    String name;
    int age;
    int grade;
    String nameField;

    MemberConstruct(String name, int age, int grade) {
        System.out.printf("생성자 호출 name=%s, age=%d, grade=%d\n", name, age, grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

/*
    this
        자기 자신 인스턴스(Instance)를 가리킨다 즉, 여기서는 MemberConstruct Class를 가리킨다

    this가 생략된 경우
        변수를 찾을 때 가까운 지역변수(매개변수 포함)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다
        만약 멤버 변수도 없으면 오류가 발생한다

    nameField : 먼저 지역변수(매개변수 포함)에서 같은 이름의 변수가 있는지 찾는데 이 경우 없으므로 멤버 변수를 사용
    nameParameter : 먼저 지역변수(매개변수)에서 같은 이름의 변수가 있는지 찾는데 이 경우 매개변수가 있기에 매개변수를 사용
 */

    void initNoThisMember(String nameParameter) {
        nameField = nameParameter;
    }
}
