package poly.basic;

/*
    업캐스팅이 안전하고 다운캐스팅이 위험한 이유
        1. 업캐스팅
            - 객체 생성 시 메모리 내에 해당 타입의 모든 상위 부모 타입도 함께 생성
            ==> 위로만 타입을 변경하는 업캐스팅은 항상 안전
        2. 다운 캐스팅
            - 객체 생성 시 메모리 내에 해당 타입의 자식 타입은 생성되지 않음
            - ClassCastException 예외 발생 
            ==> 개발자가 문제를 인지하고 있다는 의미로 명시적으로 캐스팅을 수행
            
    컴파일 오류 vs 런타임 오류
        1. 컴파일 오류
            - 변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램을 실행 전 발생하는 오류
            - IDE에서 즉시 확인 가능하므로 안전하고 좋은 오류
        2. 런타임 오류
            - 프로그램이 실행되고 있는 시점, 즉 프로그램 실행 도중 발생하는 오류
            - 고객의 프로그램 사용 중 발생하는 오류로서 매우 안좋은 오류
 */

// 다운캐스팅을 자동으로 하지 않는 이유
public class DownCastingCaution {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 안됨
    }
}
