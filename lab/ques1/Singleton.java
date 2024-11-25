package lab.ques1;

class Singleton{
    private static Singleton single_instance=null;
    String s;
     private Singleton()
     {
         s="This is singleton obj";
         System.out.println("This is singleton constructor");
     }
    public static Singleton getinstance()
     {
         if(single_instance==null)
         {
             single_instance=new Singleton();
         }
         return single_instance;
     }
 }