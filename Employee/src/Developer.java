// Developer.java
public class Developer extends Employee {
    // Constructor
    public Developer(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Developer
    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding and developing system :)");
    }
}
