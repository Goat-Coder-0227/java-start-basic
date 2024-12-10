package access.ex;

// 기본편 - section7

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public ShoppingCart() {
        itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
//        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("상품명: %s, 합계: %d\n", items[i].getName(), items[i].getPrice() * items[i].getQuantity());
//            total += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
//        System.out.println("전체 가격 합:" + total);
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice() * items[i].getQuantity();
        }
        return totalPrice;
    }
}
