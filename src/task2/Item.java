package task2;

public class Item {
    public String getName() {
        return Name;
    }

    private String Name;
    private double Price;
    public Item(String name, double price) {
        Name = name;
        Price = price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }


}
