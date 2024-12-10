package ex;

// 기본편 - section4

/*
    Simple Account System Using OOP
 */

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
