package poly.basic;

/*
    다형성(Polymorphism) - '다양한 형태, 여러 형태'
        - 한 객체가 여러 타입의 객체로 취급될 수 있는 능력
        - 하나의 객체가 다른 타입으로 사용될 수 있다는 뜻

    다형적 참조
        - 부모 타입의 변수가 자식 인스턴스를 참조 (부모는 자식을 담을 수 있다)
            ex) Parent poly = new Child(); // Parent -> Child
        - 자신을 기준, 자신을 포함 모든 자식 타입 참조 가능
            ex) Parent poly = new Parent();
                Parent poly = new Child();
                Parent poly = new GrandSon();
                ...
        - 반대로 자식 타입은 부모 타입을 담을 수(참조) 없음
            ex) Child child = new Parent(); // 컴파일 오류 발생

    다형적 참조의 한계
        - 상속 관계는 부모 방향으로 찾아 올라갈 수 있지만 자식 방향으로는 찾아 내려갈 수 없음
        - 따라서 자식의 기능은 호출할 수 없으므로 컴파일 오류 발생
            ex) Parent poly = new Child();
                poly.childMethod(); // 컴파일 오류 발생
        - 자식의 기능을 호출하고 싶으면 캐스팅(Casting)을 해줘야 함
 */

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        /*
            - 자식 타입인 Child를 생성, 따라서 메모리 상에 Child와 Parent 모두 생성
            - 생성된 참조값을 Parent 타입 변수 Poly에 저장
         */
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod(); // poly는 Parent 타입이므로 Parent 클래스를 시작으로 필요한 기능을 탐색
//        poly.childMethod(); // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생

//        Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

    }
}
