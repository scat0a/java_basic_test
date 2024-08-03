package java_basic_test.section6;

import java.security.spec.RSAOtherPrimeInfo;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니 가득참");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 : "+ item.getTotalAmount());
        }

        System.out.println("전체 가격의 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalAmount();
        }

        return totalPrice;
    }
}
