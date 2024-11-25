
public class Rectangle extends Shape {
    public double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
    public double area(){
        return l*b;
    }
}
