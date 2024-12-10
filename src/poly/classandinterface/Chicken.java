package poly.classandinterface;

// AbstractAnimal 클래스를 상속, Fly 인터페이스를 구현
public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
