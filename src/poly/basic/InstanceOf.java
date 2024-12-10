package poly.basic;

/*
    instanceof
        - 참조형 변수가 어떤 인스턴스를 참조하고 있는지 확인하기 위한 키워드
        - 다운캐스팅 수행 전 instanceof를 사용하여 원하는 타입으로 변경 가능 여부를 확인하는 것이 안전
    
    instanceof 사용법
        - 오른쪽 대상의 타입을 왼쪽에서 참조하는 경우 true
        - 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우 true
        - 오른쪽 대상의 타입을 왼쪽에서 참조하지 않는 경우 false
        ==> 쉽게 말해 instanceof 기준 오른쪽 타입에 왼쪽 타입이 들어갈 수 있는지 대입
            ex) new Parent() instanceof Parent : true // 같은 타입
                new Child() instanceof Parent : true // 부모는 자식을 담을 수 있음(다형적 참조)
                new Parent() instanceof Child : false // 자식은 부모를 담을 수 없음
                new Child instanceof Child : true // 같은 타입
 */

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod();
        }
    }

    /*
    // 자바 16
    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
     */
}
