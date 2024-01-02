// Designer.java
public class Designer extends Employee {
    // Constructor
    public Designer(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Designer
    @Override
    public void work() {
        System.out.println("Designer " + getName() + " is designing and creating visuals :)");
    }
}
