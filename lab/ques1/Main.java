package lab.ques1;
public class Main {
    public static void main(String[] args) {
       
        Singleton singletonInstance1 = Singleton.getinstance();
        System.out.println(singletonInstance1.s);

        Singleton singletonInstance2 = Singleton.getinstance();
        System.out.println(singletonInstance2.s);

        if(singletonInstance1 == singletonInstance2) {
            System.out.println("Both are the same instance.");
        }
    }
}
