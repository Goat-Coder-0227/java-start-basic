package extends1.example;

public class CarMain {
    public static void main(String[] args) {
        /*
            - 전기차(ElectricCar), 가솔린차(GasCar), 수소차(HydrogenCar)가 Car를 상속 받은 덕에 move() 메서드를 사용 가능
            - 문열기 기능인 openDoor()을 상위 부모인 Car에 추가하여 모든 차량에서 해당 기능을 사용 가능
            - 참고로 자식은 부모의 기능을 사용 가능하지만 부모(Car)는 자식 클래스에 접근 불가
         */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}


