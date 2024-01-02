// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager, Developer, dan Designer
        Manager manager = new Manager("Alberth");
        Developer developer = new Developer("Lisa Blackpink");
        Designer designer = new Designer("Jihyo");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }
}
