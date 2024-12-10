package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 접근 및 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 접근 및 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // 다른 클래스 private 접근 및 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        // public 접근 및 호출 가능
        data.innerAccess();
    }
}
