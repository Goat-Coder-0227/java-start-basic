package class1;

/*
    Data dataB = dataA
    ==> dataA 변수에 들어있는 값을 복사해서 사용하지만 그 값이 참조값(메모리 주소값)
        따라서 dataA와 dataB는 같은 참조값(메모리 주소값)을 가짐
        즉, 두 변수는 같은 객체 인스턴스를 참조하게 됨
 */
public class ObjectFieldCopy {
    int value;

    public static void main(String[] args) {
        ObjectFieldCopy dataA = new ObjectFieldCopy();
        dataA.value = 10;
        ObjectFieldCopy dataB = dataA;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("dataA.value Change to 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("dataB.value Change to 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}