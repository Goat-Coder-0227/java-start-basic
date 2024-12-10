package ex;

// 기본편 - section3

import java.util.Scanner;

/*
    Simple Product Order System using User Input(Scanner) & class (not constructor, getter, setter etc)
 */

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = scanner.nextInt();
        scanner.nextLine(); // clear Buffer
        ProductOrder[] orders = new ProductOrder[orderCount];
        
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // clear Buffer

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.printf("상품명 : %s, 가격 : %d, 수량 : %d\n", order.productName, order.price, order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
