// package practice;

class Parent{
    Parent(){
        System.out.println("non-param const of parent");
    }
    Parent(int x){
        System.out.println("Param const of parent "+x);
    }

}

class Child extends Parent{
    Child(){
        System.out.println("Non param const of child");
    }
    Child(int y){
        super(y);
        System.out.println("param cosnt of child "+y);
    }
}


public class SuperConst {
    public static void main(String[] args) {

        // Child c = new Child();
        // non-param const of parent
        // Non param const of child

        // Child c = new Child(10); 
        //non-param const of parent
        // param cosnt of child 10

        //if we want the param const of parent to be called we need super()
        Child c = new Child(100);
    }
}
