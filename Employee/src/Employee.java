// Employee.java
public class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Work method to be implemented by subclasses
    public void work() {
        System.out.println("Employee " + name + " is working :)");
    }
}
