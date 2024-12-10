package staticmethod;

import static staticmethod.DecoData.importStaticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        // 클래스를 통한 static 메서드에 접근
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        // 인스턴스를 통한 static 메서드에 접근
        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 정적 메서드에서 인스턴스 멤버에 접근
        System.out.println("DecoData.staticCall(data1)");
        DecoData.staticCall(data1);

        // import static을 통한 정적 메서드 호출
        importStaticCall();
        importStaticCall();
        importStaticCall();
        importStaticCall();
        importStaticCall();
    }
}
