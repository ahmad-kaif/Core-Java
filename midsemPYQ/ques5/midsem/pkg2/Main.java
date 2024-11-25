package midsem.pkg2;
import midsem.pkg1.*;

public class Main {
    public static void main(String[] args) {
        A v = new A(){
            protected void m1(){
                System.out.println("m1 of aic");
            }

        };
        v.m1();
    }
    
}
