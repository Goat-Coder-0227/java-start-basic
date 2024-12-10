package access.a;

/*
    클래스 레벨 접근 제어자(Access Modifier)
        - public, default만 사용 가능
            !) private, protected 사용 불가
        - public 클래스는 반드시 파일명과 클래스명이 같아야 함
            !) 하나의 자바 파일(.java)에 public 클래스는 하나만 존재
            !) 하나의 자바 파일(.java)에 default 클래스는 무한정 존재 가능
    
    클래스 레벨 접근 제어자 종류
        - public : 외부에서 접근 및 호출 가능
        - default : 같은 패키지 내부에서만 접근 및 호출 가능
 */

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicclass = new PublicClass();
        DefaultClass1 defaultclass1 = new DefaultClass1();
        DefaultClass2 defaultclass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
