package extends1.access.child;

import extends1.access.parent.Parent;

/*
    UML
        + : public
        # : protected
        ~ : default
        - : private

    접근 제어와 메모리 구조
        - 본인 타입에 없으면 부모 타입에서 기능을 찾는데, 이때 접근 제어자가 영향을 줌
        - 객체 내부에서는 자식과 부모가 구분되어서 객체가 존재
        - 자식 타입에서 부모 타입의 기능을 호출 시, 부모 입장에서는 외부에서 호출한 것과 동일
 */

public class Child extends Parent {
    public void call() {
        publicValue = 1; // public 접근 가능
        protectedValue = 1; // 상속 관계 or 같은 패키지
//        defaultValue = 1; // 다른 패키지 접근 불가 , 컴파일 오류
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
//        defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
//        privateMethod(); // 접근 불가, 컴파일 오류

        printParent(); // public 접근 가능
    }
}
