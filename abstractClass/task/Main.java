

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(2.0);
        Shape r = new Rectangle(2.0,3.0);
        System.out.println("perimeter of circle is "+c.perimeter());
        System.out.println("area of circle is "+c.area());

        System.out.println("perimeter of rectangle is "+r.perimeter());
        System.out.println("area of circle is "+r.area());


        
    }
}
