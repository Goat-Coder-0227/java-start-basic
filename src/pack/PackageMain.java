package pack;

/*
    패키지 규칙
        - 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다 (필수)
        - 패키지 이름은 모두 소문자를 사용한다 (관례)
        - 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용 (관례)
            ex) com.company.myapp

    패키지와 계층 구조
        package a     : 계층 구조상 a, a.b, a.c 총 3개의 패키지 존재
            package b
            package c  
            ==> 패키지가 계층 구조를 이루더라도 모든 패키지는 서로 다른(독립적인) 패키지
                따라서 다른 패키지가 필요 시 반드시 import해서 사용해야함
    
    패키지 구성
        - 패키지 구성 시 서로 관련된 클래스는 하나의 패키지에 모으고, 관련이 적은 클래스는 다른 패키키로 분리하는 것이 바람직

 */

import pack.a.User;

/*
    import pack.a.*;
    ==> pack패키지 속 a패키지 속 모든클래스(*)를 포함(사용)하겠다.
    
    패키지 내 클래스명이 중복된 경우)
        - import는 둘 중 하나만 선택 가능 (pack.a.User 혹은 pack.b.User)
        - 자주 사용하는 클래스를 import, 나머지는 패키지를 포함한 전체 경로를 적어서 사용
        - 둘 다 전체 경로를 적어서 사용해도 상관없음
 */

public class PackageMain {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        pack.a.User2 user2 = new pack.a.User2();

        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
