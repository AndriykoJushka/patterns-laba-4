package task2;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Item> items;
    private double totalPrice = 0.0;

    private Order(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
        totalPrice = calculateTotalPrice(items);
    }

    public static Order processOrder(Customer customer, List<Item> items) {
        double totalPrice = calculateTotalPrice(items);
        if (totalPrice > customer.getBudget()) {
            System.out.println("Unable to process the order.");
            return null;
        } else {
            Order order = new Order(customer, items);
            customer.replenishBalance(-order.totalPrice);
            System.out.println("task2.Order was successfully processed. Here is your cheque: " + order);
            return order;
        }
    }

    private static double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String printItemsOut(){
        String result = "";
        for(Item it : items){
           result+= it.getName() + " ";
        }
        return result;
    }
    @Override
    public String toString() {
        return "Customer name: " + customer.getName() + "\n" +
                "Purchased products: " + printItemsOut() + "\n" +
                "Total price: " + totalPrice;
    }
}
