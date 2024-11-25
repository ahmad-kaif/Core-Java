//2. Now remove the non-parameterized constructor of Parent, and put a parameterized constructor
//of your choice. What error will you receive if you do not modify any code in Child? Modify the
//code accordingly in Child. Next, additionally place static and non-static initializer in both of
//Parent and Child, with proper printing messages. Check and state, in which sequence the
//initializers of the two classes are being invoked?

public  class Parent2 {
   static{
       System.out.println("Parent static initializer");
   }
   Parent2(String str){
       System.out.println("Non Parametrizedddd Parent Constructor, Hi "+ str);
   }
   public void proc1(){
       System.out.println("method in parent");
   }
   static class Child extends Parent2{
       static {
           System.out.println("Child static initializer");
       }
       Child(String str) {
           super(str);
       }

       public void proc1(){
           System.out.println("method in child(over riding the method of parent)");
       }
   }

   public static void main(String[] args) {
       Child c1 = new Child("Ahmad");
       c1.proc1();
   }
}