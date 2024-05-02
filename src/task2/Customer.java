package task2;

public class Customer {
    public String getName() {
        return Name;
    }

    String Name;

    public Double getBudget() {
        return Budget;
    }

    Double Budget;
    public Customer(String name, double budget){
        Name = name;
        Budget = budget;
    }

    public double replenishBalance(double sum){
        return Budget += sum;
    }
}
