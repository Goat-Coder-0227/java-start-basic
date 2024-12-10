package poly.pureabstractclass;

/*
    순수 추상 클래스
        - 모든 클래스가 추상 메서드로 되어있는 추상 클래스
        - 실행 로직을 전혀 가지고 있지 않으므로, 다형성을 위한 부모 타입으로써 오직 껍데기 역할만 제공
        - 프로그래밍 개념에서 자주 등장, 마치 일반적으로 얘기하는 규격과 같음 ex) USB 인터페이스
        - 자바에서는 더 편리하게 사용할 수 있도록 인터페이스라는 개념 제공
        
    순수 추상 클래스 특징
        1. 인스턴스 생성 불가
        2. 상속 시 자식은 반드시 모든 메서드를 오버라이딩
        3. 주로 다형성을 위해 사용
 */

// 순수 추상 클래스 - 인스턴스 생성 불가
public abstract class AbstractAnimal {
    // 추상메서드 - 자식 클래스가 반드시 오버라이딩
    public abstract void sound();
    public abstract void move();
}
