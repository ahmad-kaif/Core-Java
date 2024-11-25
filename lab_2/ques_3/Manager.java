

public class Manager extends Employee {
    String name;
    int id;
    String office;

    // Manager(String name, int id, String office){
    //     this.name = name;
    //     this.id=id;
    //     this.office=office;
    // }
    Manager(String name, int id, String office){
        super(name,id,office,"manager");
    }

}
