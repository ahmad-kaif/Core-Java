
class Outer{
    static int x = 10;
    int y = 20;
    public static void m(){
        // System.out.println(y); // inside a static method, we cannot use non static variable
        System.out.println(x);
    }
}

public class practice {
    public static void main(String[] args) {
        // System.out.println(x);
        // System.out.println(y);

        Outer o = new Outer();
        o.m();
        // System.out.println(o.y);
        // System.out.println(o.x);
    }
}
