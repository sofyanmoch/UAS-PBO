// Manager.java
public class Manager extends Employee {
    // Constructor
    public Manager(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Manager
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing the team :)");
    }
}
