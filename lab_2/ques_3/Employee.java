
public class Employee {
    String name;
    int id;
    String office;
    String designation;

    public Employee(String name, int id, String office, String designation) {
        this.name = name;
        this.id = id;
        this.office = office;
        this.designation = designation;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Office: " + office);
        System.out.println("Designation: " + designation);
    }
}
