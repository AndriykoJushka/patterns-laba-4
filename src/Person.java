import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private List<Person> friends;
    private List<Person> enemies;
    private List<String> tasks;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void addFriend(Person friend) {
        this.friends.add(friend);
    }

    public void removeFriend(Person friend) {
        this.friends.remove(friend);
    }

    public void addEnemy(Person enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(Person enemy) {
        this.enemies.remove(enemy);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    // Method to print out a list of persons or strings
    public String printItemsOut(List<?> list) {
        StringBuilder result = new StringBuilder();
        for (Object item : list) {
            result.append(item.toString()).append(" ");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", friends=" + printItemsOut(friends) +
                ", enemies=" + printItemsOut(enemies) +
                ", tasks=" + printItemsOut(tasks) +
                '}';
    }
}
