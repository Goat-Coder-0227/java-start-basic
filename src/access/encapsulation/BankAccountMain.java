package access.encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("현재 잔액: " + account.getBalance());
    }
}
