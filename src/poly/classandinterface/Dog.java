package poly.classandinterface;

// AbstractAnimal 클래스를 상속
public class Dog extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
