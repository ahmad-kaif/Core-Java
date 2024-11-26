class SelfCheckedException extends Exception{
    SelfCheckedException(String msg){
        super(msg);
    }
}

// paremnt p = new Parent();
// Parent p = Parent.FactoryMethod("child");
interface Employee{

   String getName();
   String getAddress();

   void setName(String name);
   void setAddress(String address);

   public static Employee getEmployee(String type,String name, String address){
        if(type.equals("Programmer")){
            return new ProgrammerImpl(name,address);
        }
        if(type.equals("Manager")){
            return new ManagerImpl(name,address);
        }
        return null;

   }

}

interface Programmer extends Employee{
   
}
interface Manager extends Employee{
    int getProgrammersCount();
}


class ProgrammerImpl implements Programmer{
    String name;
    String address;

    public ProgrammerImpl(String name, String address) {
        this.name=name;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

class ManagerImpl implements Manager{

    String name;
    String address;


    ManagerImpl(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    @Override
    public int getProgrammersCount() {
        return 10; // Example value
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee e1 = Employee.getEmployee("Programmer", "Ahmad", "Jsr");

        System.out.println(e1.getAddress());
        System.out.println(e1.getName());

        Employee e2 = Employee.getEmployee("Manager", "hema", "kkr");
        System.out.println(e2.getAddress());
        System.out.println(e2.getName());

    }
}
