// 1. Create an interface named Iface1. This interface must have at least one undefined method im1().
// Create one private method of your choice, and create a default method named dm1() in the
// interface. Now, let a concrete class named Concrete to implement the interface. Create an object
// of the concrete class, and invoke im1 and dm1 from it. Concrete must implement im1, but it
// should not override dm1.



















interface Iface1{  // inside interface all methods are by default public and abstract (it means no body))
    //  only methods declared as default or static can have body
    void im1();
    private void im2(){
        System.out.println("private methods of interface 1");
    }
    default void dm1(){
        System.out.println("default method of interface 1");
    }
}
class Concrete implements Iface1{
    public void im1(){
        System.out.println("im1 of Child Concrete Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Concrete c = new Concrete();
        c.im1();
        // c.im2(); private cannot be called
        c.dm1();
    }
    
}
