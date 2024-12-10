package poly.polypractice;

// 기본편 - section10

/*
    Simple Animal Sound Test Using Polymorphism (Not Abstract & Interface)
 */

public class AnimalSoundMain1 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
