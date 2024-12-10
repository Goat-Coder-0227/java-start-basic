package ex;

// 입문편 - section9
/*
    Simple ProductAdmin System Using switch-case & Array
 */

import java.util.Scanner;

public class ProductAdmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        do {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    if (productCount > 2) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        continue;
                    }

                    System.out.print("상품 이름을 입력하세요:");
                    String productName = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요:");
                    int productPrice = scanner.nextInt();

                    productNames[productCount] = productName;
                    productPrices[productCount] = productPrice;

                    productCount++;
                }
                case 2 -> {
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        continue;
                    }

                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> {
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                }
            }
        } while (true);
    }
}
