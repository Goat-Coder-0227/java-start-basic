package ex;

// 입문편 - section10

/*
    Simple Bank System using Method Only
 */

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

//        Outter:
        while (true) {
            menu();
            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    checkmoney(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
//                    break Outter:
                default:
                    System.out.println("잘못된 선택 입니다.");
            }
        }
    }

    public static void menu() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
        System.out.print("선택: ");
    }

    public static int deposit(int balance, int depositMoney) {
        balance += depositMoney;
        System.out.println(depositMoney + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int withdrawMoney) {
        if (balance < withdrawMoney) {
            System.out.println(withdrawMoney + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= withdrawMoney;
            System.out.println(withdrawMoney + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }

    public static void checkmoney(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
