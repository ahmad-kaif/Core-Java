// 2. Now create another concrete class named Concrete2 that implements the same interface Iface1.
// Implement im1 and override dm1 in it. Now create a static factory method inside Iface1, and
// employ it to dynamically create objects of Concrete1 and Concrete2. Invoke im1, and dm1 from
// the objects accordingly.


interface Iface1{  // inside interface all methods are by default public and abstract (it means no body))
    //  only methods declared as default or static can have body
    void im1();
    private void im2(){
        System.out.println("private methods of interface 1");
    }
    default void dm1(){
        System.out.println("default method of interfaceee 1");
    }
    //factory method
    public static Iface1 getConcreteClass(String str){
        if(str.equals("Concrete1")){
            return new Concrete1();
        }
        else if(str.equals("Concrete2")){
            return new Concrete2();
        }
        return null;
    }
}
class Concrete1 implements Iface1{
    public void im1(){
        System.out.println("im1 of Child Concreteeee 1 Class");
    }
}
class Concrete2 implements Iface1{
    public void im1(){
        System.out.println("im1 of child concrete 2 class");
    }
    @Override
    public void dm1(){
        System.out.println("overrided default method in concret 2 class");
    }

}


public class Main {
    public static void main(String[] args) {
        Iface1 I = Iface1.getConcreteClass("Concrete1");
        I.im1();
        I.dm1();
        
        I = Iface1.getConcreteClass("Concrete2");
        I.im1();
        I.dm1();
    }
    
}
