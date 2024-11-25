
interface A{
    public void meth1();
    void meth2();
}
class B implements A{
    public void meth1(){
        System.out.println("meth 1 of B");
    }
    public void meth2(){
        System.out.println("meth 2 of B");
    }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();
        obj.meth1();
        obj.meth2();
    }
}
