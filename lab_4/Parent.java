//1. Create a class named Parent, that must have a non-parameterized constructor. Now implement a
//method named proc1, that takes no parameters. Create a subclass Child overriding the method.
//        Next, create an object of Child assigned to a Parent variable in main method, and invoke proc1
//from the object. Check which method is being invoked. Next, modify the access specifier of
//proc1 in Parent as public, and keep the method in Child as default. Is that doable? If not, note
//down the error you have received. Next, correct the error without changing the access specifier
//in Parent class.

public class Parent {
    Parent(){
        System.out.println("Non Parametrizeddddd Parent Constructor");
    }
     public void proc1(){
        System.out.println("method in parent");
    }
    static class Child extends Parent{
           public void proc1(){
            System.out.println("method in child(over riding the method of parent)");
        }
        //error i recieved
        // modifier default not allowed here
    }
 
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.proc1();
    }
 }
