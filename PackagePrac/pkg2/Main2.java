package PackagePrac.pkg2;
import PackagePrac.pkg1.*;

public class Main2{
    public static void main(String[] args){
        // anonymoush inner class extending class Main1 from pkg1 
        Main1 obj = new Main1(){
        };
        obj.m1();

    }
}