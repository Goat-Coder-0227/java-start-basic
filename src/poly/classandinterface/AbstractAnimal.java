package poly.classandinterface;

// 추상 클래스 - 다형성을 목적
public abstract class AbstractAnimal {
    // 추상 메서드 - 자식에서 반드시 오버라이딩
    public abstract void sound();
    // 메서드 - 상속을 목적
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
