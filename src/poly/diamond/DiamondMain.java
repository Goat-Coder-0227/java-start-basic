package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        System.out.println("InterfaceA -> Child");
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        System.out.println("InterfaceB -> Child");
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        // Child 형으로 생성 시 호출할 기능을 Child에서 탐색
        System.out.println("Child -> Child");
        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();
    }
}
