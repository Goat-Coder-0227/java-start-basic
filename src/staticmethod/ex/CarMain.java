package staticmethod.ex;

// 기본편 - section8

/*
    Simple CarBuy System using static field
 */

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();
    }
}