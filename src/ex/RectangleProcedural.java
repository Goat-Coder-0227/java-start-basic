package ex;

// 기본편 - section4

/*
    simple Rectangle Calculation Program using OOP
 */
public class RectangleProcedural {
    int width;
    int height;

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

    public static void main(String[] args) {
        RectangleProcedural rectangle = new RectangleProcedural();
        rectangle.width = 5;
        rectangle.height = 8;

        System.out.println("넓이: " + rectangle.area());
        System.out.println("둘레 길이: " + rectangle.perimeter());
        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }
}
