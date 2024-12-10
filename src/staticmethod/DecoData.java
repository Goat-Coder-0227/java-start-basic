package staticmethod;

/*
    멤버 메서드의 종류
        1. 인스턴스 메서드  ex) public void instanceMethod(){ }
            - static이 붙지 않은 멤버 메서드
            - 인스턴스에 소속되어 인스턴스를 생성해야 사용 가능
        2. 클래스 메서드, 정적 메서드, static 메서드  ex) public static void staticMethod() {}
            - static이 붙은 메서드
            - 클래스 자체에 소속되어 인스턴스와 무관하게 클래스에 바로 접근해서 사용 가능
        !) 멤버 변수에도 동일하게 적용

    정적 메서드 접근 법
        - 클래스를 통해 바로 접근
            ex) ClassName.staticMethod();
        - 인스턴스를 통해 접근
            ex) ClassName instance = new ClassName();
                instance.staticMethod();
        !) 정적 메서드의 경우 인스턴스를 통한 접근은 인스턴스 메서드에 대한 접근으로의 오해 소지가 있기 때문에 삼가하자!

    정적 메서드 사용법
        1. static 메서드는 static만 사용 가능
            - 클래스 내부 기능 사용 시, 정적 메서드는 정적 메서드나 정적 변수만 사용 가능
            - 클래스 내부 기능 사용 시, 정적 메서드는 인스턴스 메서드나 인스턴스 변수 사용 불가
        2. 모든 곳에서 static을 호출 가능
            - 정적 메서드는 공용 기능, 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 정적 변수, 정적 메서드 호출 가능

    정적 메서드 활용
        - 객체(인스턴스) 생성이 필요 없이 메서드만 이용하여 필요한 기능을 수행할 때 주로 사용
            ex) 수학의 여러가지 기능을 담은 클래스
            
    static import
        - 정적 메서드를 자주 호출 시 클래스 명을 생략하고 메서드 호출 가능
            ex) import static package.class.methodname;
                import static package.class.*;

 */

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        /*
            정적 메서드에서 인스턴스 변수 접근 및 인스턴스 메서드 호출 방법
         */
        data.instanceValue++;
        data.instanceMethod();
    }

    public static void importStaticCall() {
        System.out.println("importStaticCall()");
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
}
