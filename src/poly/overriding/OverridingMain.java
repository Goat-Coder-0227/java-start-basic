package poly.overriding;

/*
    다형성과 메서드 오버라이딩
        - 다형성에서 오버라이딩 된 메서드가 항상 우선권을 가짐
        - 자식의 자식 즉, 더 하위 자식에 오버라이딩 된 메서드 존재시 그 메서드가 우선권을 가짐
 */

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩X
        poly.method(); // 메서드 오버라이딩!
    }
}
