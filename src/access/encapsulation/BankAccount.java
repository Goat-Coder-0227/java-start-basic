package access.encapsulation;

/*
    캡슐화(Encapsulation)
        - 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것
        - 캡슐화를 통해 데이터의 직접적인 변경을 방지 및 제한
        !) 속성(필드)과 기능(메서드)을 하나로 묶고, 외부에 꼭 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것
        !) 접근 제어자(Access Modifier)를 통해 캡슐화를 안전하게 완성
    
    캡슐화에서 숨기고 노출해야 할 것
        1. 데이터를 숨겨라
            - 캡슐화에서 가장 필수로 숨겨야 하는 것은 속성(데이터)
            - 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 함
        2. 기능을 숨겨라
            - 객체 내부에서만 사용하는 기능들은 숨기고, 외부에서 사용하는 기능만을 노출
            - 사용자(클라이언트) 입장에서 꼭 필요한 기능만 외부에 노출
    ==> 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화(Encapsulation)
 */
public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            this.balance += amount;
        } else {
            System.out.println("유요하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return this.balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
