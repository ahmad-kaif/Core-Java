class Parent {
    public void m(){
        System.out.println("in parent");
    }
}


class Child extends Parent {
    public void m(){
        System.out.println("in child");
    }
}


// method will be called depending upon the object
// a super class reference holding an object of sub class --- > and over ridden method is called then method will be called depending upon the object
public class Main{
    public static void main(String[] args) {
        // Parent p = new Parent();
        // Child p = new Child();
        Parent p = new Child(); // reference of parent but object of child ---> dMD says object's is made from child therefor child'd method will be called1
        p.m();
    }
}