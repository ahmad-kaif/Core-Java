
class Outer{
    int x =  100; //non static 
    static int z = 300;
    void m1(){
        System.out.println("m1 of outer");
    }
    static void m3(){
        System.out.println("static m3 inside outer");
    }

    static class Inner{
        int y = 200;
        void m2(){
            System.out.println("m2 of inner ");
            System.out.println(z);
            m3();
        }
        // 
        // System.out.println("ahmad"); // normal sysout is not allowed inside a class it has to be inside a method or something
        
    
    }

}


public class test {
    public static void main(String[] args) {
        // Outer myouter = new Outer();
        Outer.Inner myinner = new Outer.Inner();
        myinner.m2();
        System.out.println(myinner.y);
        // myouter.m1();
    }
    
}
