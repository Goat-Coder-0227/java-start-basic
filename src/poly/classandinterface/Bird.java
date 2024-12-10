package poly.classandinterface;

/*
    하나의 클래스 여러 인터페이스 사용법
        - 단일 상속, 다중 구현을 지원하므로 extends가 먼저 나와야함
            ex) public class Child extends Parent implements InterfaceA, InterfaceB {...}
 */

// AbstractAnimal 클래스를 상속, Fly 인터페이스를 구현
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
