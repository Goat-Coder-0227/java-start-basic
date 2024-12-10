package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // public 접근 및 호출 가능
        PublicClass publicClass = new PublicClass();

        // 같은 패키지 default 접근 및 호출 가능
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
