package access.a;

/*
    접근 제어자(Access Modifier)
        - 접근 제어자를 사용하여 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 제약
        - 캡슐화(Encapsulation)를 안전하게 완성할 수 있게 해주는 장치

    접근 제어자 사용 위치
        - 클래스 레벨, 속성(필드), 생성자, 메서드
        
    접근 제어자 종류
        - private : 모든 외부 호출을 막음 
            ==> 해당 클래스 내부로 속성과 기능을 숨길 때 사용, 외부 클래스에서 접근 불가

        - default(package-private) : 같은 패키지내에서 호출 허용
            ==> 해당 패키지 내부로 속성과 기능을 숨길 때 사용, 외부 패키지에서 접근 불가

        - protected : 같은 패키지내에서 호출을 허용하나 패키지가 달라도 상속 관계의 호출은 허용
            ==> 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 접근 불가

        - public : 모든 외부 호출을 허용
            ==> 기능을 숨기지 않을 때 사용, 어디서든 접근 가능
            
        !)  private -> default -> protected -> public
        !)  private : 클래스
            default : 패키지
            protected : 패키지 or 상속 관계
            public : 외부
 */

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
