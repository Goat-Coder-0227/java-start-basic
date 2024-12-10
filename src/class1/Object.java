package class1;

public class Object {
    String productName;
    int price;
    int quantity;

    public static void main(String[] args) {
        Object[] productOrders = new Object[3];
        int total = 0;

        Object productOrder1 = new Object();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        Object productOrder2 = new Object();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        Object productOrder3 = new Object();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;
        productOrders[2] = productOrder3;

        for (Object productOrder : productOrders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", productOrder.productName, productOrder.price, productOrder.quantity);
            total += (productOrder.price * productOrder.quantity);
        }

        System.out.println("총 결제 금액: " + total);
    }
}
