// 4. In main method, invoke another method of your choice, that will perform some division by
// zero. Do not catch the exception. Note down the stack trace printed by JRE. Now, catch the
// corresponding exception, and print the exception string from within the catch clause. Program
// must not terminate in this second scenario.

public class Main extends Exception{
    public static  int m() throws Exception{
        int a =  10;
        int b = 0;
        return a/b;
        // try {
        //     return a/b;
        // } catch (Exception e) {
        //     System.out.println("Error : "+e.getMessage());

        // }
    }
    public static void main(String[] args) {
    //    System.out.println(m());
    try {
        System.out.println(m());
    } catch (Exception e) {
        System.out.println("Error : "+e.getMessage());
    }
        
    }
    
}
