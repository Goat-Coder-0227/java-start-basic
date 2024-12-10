package class1;

public class NullPointerException {
    int value;

    public static void main(String[] args) {
        NullPointerException npe = null;
        npe.value = 10;
        System.out.println("NullPointerException: " + npe.value);
    }
}
