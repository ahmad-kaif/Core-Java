
class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
    public void m(){
        System.out.println("m method of parent");
    }
}

public class Main11 extends  Parent{
    public static void main(String[] args) {
        Parent p = new Parent(){
            public void m(){
                System.out.println("m method of anonymous inner clas");
            }
        };
        p.m();
    }
}
