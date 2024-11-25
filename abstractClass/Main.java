

abstract class Super{
    Super(){
        System.out.println("Const of super");
    }
    public void m1(){
        System.out.println("m1 of super");
    }
    abstract public void m2(); // abstarct method
}
class Sub extends Super{
    @Override
    public void m2(){
        System.out.println("m2 of sub");
    }
}

public class Main {
    public static void main(String[] args) {
        Super s; // reference of abtract class is allowed but object creation is not
        s= new Sub();
        s.m1();
        s.m2();

    }
}
