package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // public 접근 및 호출 가능
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 및 호출 불가
//        DefaultClass1 defaultclass1 = new DefaultClass1();
//        DefaultClass2 defaultclass2 = new DefaultClass2();
    }
}
