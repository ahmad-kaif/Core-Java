//3. Create another subclass of Parent named Child1. Create proper constructor within it, and it must
//also override proc1. Now, create a static factory method within Parent class to return either
//Child or Child1, or null. Invoke the factory method from main, and invoke the proc1 of the
//returned object. Now, change the signature of proc1 in Child1, i.e., put some parameter in proc1
//of Child1. It becomes method overloading for Child1 now. Elaborate the fact. If you create
//Child1 object in Parent variable, will you be able to invoke the modified proc1? What error will
//you receive? Typecast the returned variable to Child1. The error should be gone now. Why is it
//giving error without typecasting?

public class Parent3 {
    static {
        System.out.println("Parent static initializer");
    }

    Parent3(String str) {
        System.out.println("Non Parametrizedddd Parent Constructor, Hi " + str);
    }

    public void proc1() {
        System.out.println("method in parent");
    }

    static class Child extends Parent3 {
        static {
            System.out.println("Child static initializer");
        }

        Child(String str) {
            super(str);
        }

        public void proc1() {
            System.out.println("method in child(over riding the method of parent)");
        }
    }
    static class Child2 extends Parent3 {
        Child2(String str) {
            super(str);
        }
    }

    public static void main(String[] args) {
        Child c1 = new Child("Ahmad");
        c1.proc1();
    }
}