

abstract class Parent{ //object cannot be made
    int x =10;
    final void m1(){
        System.out.println("m1 of absc");
    }
    abstract void m2(); // method with no body -> abstract method
    abstract void m3();
}

class Child extends Parent{
    void m2(){
        System.out.println("m2 of child");
    }
    void m3(){
        System.out.println("m3 of child");
    }
    void m4(){
        System.out.println("m4 of child");
    }
}

public class Main {
    public static void main(String[] args) {
    
       Parent p = new Child();
       p.m3();
       
    }
    
}
