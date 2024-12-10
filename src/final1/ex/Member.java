package final1.ex;

// 입문편 - section10

/*
    Simple Member Administraion System Using final
 */

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
//        this.id = "ID";  // final 변경 시도 - 컴파일 오류 발생
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }
}
