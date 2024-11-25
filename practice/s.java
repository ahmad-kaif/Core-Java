
class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }

    Parent(int x) {
        System.out.println("Parent constructor with parameter: " + x);
    }
}

class Child extends Parent {
    Child() {
    
        System.out.println("Child constructor called");
    }

    Child(int x) {
        super(x); // Calls the parameterized constructor of Parent
        System.out.println("Child constructor with parameter: " + x);
    }
}

public class s{
    public static void main(String[] args) {
        Child c = new Child(100);
    }
}
