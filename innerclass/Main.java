class Outer{
    int X = 10;

    class Inner{
        int Y = 100;
        void innerDisplay(){
            System.out.println(Y);
            System.out.println(X);
        }
    }

    void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.Y);
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
    }
    
}
