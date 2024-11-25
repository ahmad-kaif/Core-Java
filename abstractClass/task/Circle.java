

public class Circle extends Shape {
    public double r;
    Circle(double r){
        this.r=r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}
