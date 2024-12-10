package staticvariable;

/*
    자바 메모리 구조
        !) 크게 메서드(Method) 영역, 스택(Stack) 영역, 힙(heap) 영역 3개로 나눔
        1. 메서드 영역
            - 프로그램의 공통 데이터를 관리, 프로그램 내 모든 영역에서 공유됨
            - 클래스 정보, static 영역, 런타임 상수 풀을 관리
            !) 객체(인스턴스) 내 메서드는 메서드 영역에서 공통으로 관리되고 실햄됨
        2. 스택 영역
            - 실제 프로그램이 실행 되는 영역, 자바 실행 시 하나의 실행 스택(스택 프레임) 생성
            - 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함
            !) 스택 영역은 스레드(Thread) 수 만큼 생성
        3. 힙 영역
            - 객체(인스턴스), 배열이 생성되는 영역
            - 가비지 컬렉션(GC) 수행되는 주요 영역

    스택(Stack)과 큐(Queue) 자료구조
        - 스택 : 후입선출(LIFO, Last-In First-Out)
        - 큐 : 선입선출(FIFO, First-In First-Out);
 */

/*
    멤버 변수(필드)의 종류
        1. 인스턴스 변수  ex) public String name;
            - static이 붙지 않은 멤버 변수
            - 인스턴스에 소속되어 있어 인스턴스를 생성해야 사용 가능
            - 인스턴스를 생성할 때 마다 새로 만들어짐
        2. 클래스 변수, 정적 변수, static 변수  ex) public static int count;
            - static이 붙은 멤버 변수
            - 클래스 자체에 소속되어 있어 인스턴스와 무관하게 클래스에서 바로 접근해서 사용 가능
            - 자바 프로그램 시작 시 1개만 생성됨
            - 여러곳에서 공유하는 목적으로 사용

    변수와 생명주기
        1. 지역 변수(매개변수 포함)
            - 스택 영역의 스택 프레임 속에 존재
            - 스택 프레임이 제거되면 해당 스택 프레임에 포함된 지역 변수도 함께 소멸
        2. 인스턴스 변수
            - 힙 영역을 사용
            - GC(가비지 컬렉션)이 발생되기 전까지 생존
            - 동적으로 생성 및 제거됨
        3. 클래스 변수, 정적 변수, static 변수
            - 메서드 영역(프로그램 전체가 공용하는 공간)의 static 영역에 보관
            - 해당 클래스가 JVM(자바 가상 머신)에 로딩 되는 순간 생성 (프로그램 실행 시점에 생성)
            - JVM 종료 시 함께 소멸 (프로그램 종료 시점에 소멸)
        ==> 지역 변수(매개변수 포함) < 인스턴스 변수 < 클래스 변수, 정적 변수, static 변수
        
    정적 변수 접근 법
        - 클래스를 통해 바로 접근
            ex) ClassName.StaticValue++;
        - 인스턴스를 통해 접근
            ex) ClassName instance = new ClassName();
                instance.StaticValue++;
        !) 정적 변수의 경우 인스턴스를 통한 접근은 인스턴스 변수에 대한 접근으로의 오해 소지가 있기 때문에 삼가하자!
        
    static import
        - 정적 변수를 자주 호출 시 클래스 명을 생략하고 변수 호출 가능
            ex) import static package.class.variableName;
                import static package.class.*;
 */

public class Data3 {
    public String name;
    public static int count;
    public static int importStaticValue;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
