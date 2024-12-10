package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // electriCar.move() 호출 시 오버라이딩 한 ElectricCar의 move() 메서드가 실행

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}


