package method;

/*
    메소드 오버로딩(Overloading) 규칙
    1. 메소드의 이름이 같아도 매개변수(Parmaeter)의 타입(Type) 및 순서가 다르면 오버로딩(Overloading) 가능
    2. 반환 타입(Return Type)은 인정하지 않음
    
    ex) 오버로딩 실패
        int add(int a, int b)
        double add(int a, int b)
        ==> 반환 타입 때문에 오버로딩이 인정되지 않음
 */

public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        add(1, 2.0);
        add(2.0, 1);
        System.out.println(sub(1.1, 1.0));
        System.out.println(sub(2, 1));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void add(int a, double b) {
        System.out.println("int, double");
    }

    public static void add(double a, int b) {
        System.out.println("double, int");
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
