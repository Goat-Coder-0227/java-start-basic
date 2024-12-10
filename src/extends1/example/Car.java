package extends1.example;

/*
    상속 관계
        - 객체 지향 프로그래밍의 핵심 요소 중 하나
        - 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용
        - extends 키워드를 사용
            ex) class SubClass extends SuperClass
        - extedns 대상은 하나만 선택 가능 즉 자바는 다중 상속을 지원하지 않음

    용어 정리
        1. 부모 클래스 (슈퍼 클래스)
            - 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
            - 부모 클래스는 자식 클래스에 접근 불가 (부모는 자식의 기능을 사용 불가)
        2. 자식 클래스 (서브 클래스)
            - 부모 클래스로부터 필드와 메서드를 상속받는 클래스
            - 자식 클래스는 부모 클래스의 기능을 물려 받기 때문에 접근 가능 (자식은 부모의 기능을 사용 가능)

    상속과 메모리 구조 (매우 중요!!!!!)
        1. 상속 관계의 객체를 생성하면 힙(Heap) 영역에는 부모와 지식 객체가 모두 생성된다.
        2. 상속 관계의 객체에 있는 기능을 호출할 때, 기능을 호출할 대상을 정해야 한다. 이떄 객체(호출자)의 타입을 통해 대상 타입을 찾는다.
        3. 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 올라가 기능을 찾은 뒤 실행하고, 기능을 찾지 못하면 컴파일 오류가 발생한다.
        ==> 즉 상속은 단순히 부모의 필드와 기능만을 물려 받는게 아닌, 실제로는 내부에 부모와 자식의 클래스 정보가 모두 공존하는 것
        !) ClassType instance = new ClassType();
            - 'new ClassType()'을 포함 그 위의 부모 클래스의 인스턴스를 메모리 상에 생성
            - 'ClassType' 즉 객체 타입을 통해서 실행한 기능을 탐색할 클래스를 선정
            ==> new를 기준으로 메모리에 인스턴스를 생성 후 객체 타입을 통하여 기능을 찾을 주체를 결정
        
    클래스에 final
        - 상속 끝!
        - final로 선언된 클래스는 확장 불가능 즉 다른 클래스가 final로 선언된 클래스를 상속 불가능
            ex) public final class MyFinalCalss {...}
 */

public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 추가
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}