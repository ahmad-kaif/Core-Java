// 3. Create another interface named Iface2. Create two undefined methods im1() and im2(), and a
// default method named dm1(). Now let both the concrete classes implement both the interfaces.
// Only implement im2() in the two concrete classes. Compiling the java files should now give
// error in one concrete class, but not in another. Why? Correct the error-producing class
// accordingly.

interface Iface1{  
    // inside interface all methods are by default public and abstract (it means no body))
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

interface Iface2{
    void im1();
    void im2();
    default void dm1(){
        System.out.println("default method of interface 2");
    }
}

class Concrete1 implements Iface1,Iface2{
    public void im1(){
        System.out.println("im1 of Child Concreteeee 1 Class");
    }
    public void im2(){

    }

    public void dm1(){
        System.out.println("dm1 of concrete1 class");
    }
}
class Concrete2 implements Iface1,Iface2{
    public void im1(){
        System.out.println("im1 of child concrete 2 class");
    }
    public void im2(){

    }
    @Override
    public void dm1(){
        System.out.println("overrided default method in concret 2 class");
    }

}

public class Main {
    public static void main(String[] args) {
        Iface1 i = Iface1.getConcreteClass("Concrete1");
        i.im1();
        // i.im2(); // im2 is private 
        i.dm1();
    }
    
}
