package extends1.super2;

/*
    super - 생성자
        - 상속 관계의 인스턴스 생성 시 메모리 내부에는 자식과 부모 클래스가 각각 다 생성
        - 부모와 자식의 생성자도 각각 모두 호출 되어야 함
        - 상속 관계에서 부모의 생성자를 호출 시 super(...)를 사용
        규칙) 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.
        
    정리
        - 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순으로 실행, 따라서 부모의 데이터를 선초기화 후 자식의 데이터를 초기화
        - 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...)를 호출해야함, 단 기본 생성자(super())인 경우 생략 가능
        - 자식 생성자 코드의 첫 줄에 this(...)를 함께 사용하더라도 반드시 한번은 super(...)을 호출해야 함 
 */

public class SuperMain2 {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        System.out.println("===================");
        ClassB classB = new ClassB(100);
    }
}
