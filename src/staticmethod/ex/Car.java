package staticmethod.ex;

// 기본편 - section8

public class Car {

    private String name;
    private static int buyCount;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        buyCount++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + buyCount);
    }
}
