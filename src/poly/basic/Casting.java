package poly.basic;

/*
    캐스팅(Casting)
        - 원래의 타입을 다른 특정 타입으로 변경하는 것

    업캐스팅(Upcasting)
        - 자식에서 부모 타입, 즉 상위 타입으로 변경
            ex) Child upcasting = new Child();
                Parent parent = upcasting;
        - 업캐스팅 시 '(타입)' 생략 가능, 매우 자주 사용되기 때문에 생략 권장

    다운캐스팅(Downcasting)
        - 부모에서 자식 타입, 즉 하위 타입으로 변경
            ex) Parent downcasting = new Parent();
                Child child = (Child) downcasting;
        - 다운캐스팅 시 '(타입)' 생략 불가능, 심각한 런타임 오류 발생 가능성 있기 때문에 주의해서 사용해야 함
        - 다운캐스팅 시 본래의 부모 타입으로 선언된 변수의 타입은 그대로 유지됨

    일시적 다운 캐스팅
        - 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용, 즉 다운캐스팅의 결과를 변수에 저장하는 과정 대체함
            ex) ((Child) downcasting).childMethod();
        - 자식의 해당 메서드를 호출하는 순간만 다운캐스팅을 적용함
        - 본래의 부모 타입이 자식 타입으로 변하지 않고, 기존 부모 타입으로 계속 유지됨
 */

public class Casting {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent downcasting = new Child();
//        poly.childMethod(); // 자식의 기능 호출 불가

        // 다운캐스팅 (부모 타입 => 자식 타입)
        System.out.println("Down Casting : (Child) downcasting");
        Child child = (Child) downcasting;
        child.childMethod();

        // 일시적인 다운 캐스팅
        System.out.println("Temporary Down Casting");
        ((Child) downcasting).childMethod();

        // 업캐스팅 (자식 타입 => 부모 타입)
        System.out.println("Up Casting : (Parent) upcasting");
        Child upcasting = new Child();
        Parent parent1 = (Parent) upcasting; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = upcasting; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
