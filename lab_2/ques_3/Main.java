

public class Main {
    public static void main(String[] args) {
        
        Employee e = new Employee("zaib", 3, "mumbai", "tester");

        Developer d = new Developer("ahmad", 1,"delhi");
        Manager m = new Manager("Hema", 2,"Noida");

      

        e.display();
        d.display();
        m.display();
    }
    
}
