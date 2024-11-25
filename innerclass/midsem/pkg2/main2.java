package midsem.pkg2;
import midsem.pkg1.*;


public class main2 {
    public static void main(String[] args) {
        main1 obj = new main1(){
            @Override
            public void m1(){
                System.out.println("m1 of aic");
            }
        };
        obj.m1();
    }
}