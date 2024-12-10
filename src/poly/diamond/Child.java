package poly.diamond;

/*
    자바가 다중 상속을 지원하지 않는 이유 - 복습
        - 자식 클래스에서 부모 클래스의 기능을 호출 시 어떤 부모의 기능을 사용할 지 모호
        - 다중 상속 사용 시 클래스 계층 구조가 보다 매우 복잡해질 가능성 존재
        - 다중 상속과 관련된 이슈를 다이아몬드 문제라함
        
    인터페이스 - 다중 구현
        - 자바에서 클래스와 다르게 인터페이스는 다중 구현을 허용
        - 인터페이스의 모든 메서드는 추상 메서드(Abstract Method)로 구성되어 있기에 다중 구현 가능
 */

public class Child implements InterfaceA, InterfaceB{
    /*
    (poly.diamond 패키지)
        InterfaceA) +methodA()
                    +methodCommon()
        InterfaceB) +methodB()
                    +methodCommon()
        Child)  +methodA()
                +methodB()
                +methodCommon()
        ==> methodCommon()의 경우 두 인터페이스에 모두 존재하지만, 같은 메서드이므로 구현은 하나만 하면 됨
        
    인터페이스 다이아몬드 문제
        - 두 부모 중에 어떤 한 부모의 methodCommon()을 사용해야 할지 결정해야하는 다이아몬드 문제 발생
        - 두 인터페이스(InterfaceA, InterfaceB)는 같은 methodCommon()을 제공하지만, Child에서 이 기능을 구현함
        - methodCommon() 호출 시 오버라이딩에 의해 어차피 Child에 있는 methodCommon()이 호출됨
        - 결과적으로 한 부모를 선택하여 기능을 호출하는 것이 아닌, 인터페이스들을 구현한 Child에 있는 methodCommon()이 사용됨
        ==> 인터페이스에서는 다이아몬드 문제가 발생되지 않으므로 자바에선 인터페이스의 경우 다중 구현을 허용
     */

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}



