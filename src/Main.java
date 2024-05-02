import task2.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("item1", 18.9);
        Item item2 = new Item("item2", 10);
        Customer c = new Customer("customer1", 145.76);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        Order.processOrder(c, itemList);
    }
}