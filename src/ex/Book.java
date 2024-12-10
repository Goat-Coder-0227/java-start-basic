package ex;

// 기본편 - section05

/*
    Simple Book Class Using Constructor(default Constructor & Constructor Overloading)
 */

public class Book {
    String title;
    String author;
    int page;

    void displayInfo() {
        System.out.printf("제목: %s, 저자: %s, 페이지: %d\n", title, author, page);
    }

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Sed");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
