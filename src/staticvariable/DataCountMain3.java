package staticvariable;

import static staticvariable.Data3.importStaticValue;

public class DataCountMain3 {
    public static void main(String[] args) {
        // 클래스를 통한 static 변수에 접근
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);


        // 인스턴스를 통한 static 변수에 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count);

        // import static을 통한 정적 변수 호출
        System.out.println("importStaticValue=" + importStaticValue);
    }
}
