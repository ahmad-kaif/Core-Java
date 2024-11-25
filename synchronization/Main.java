
class MyData{
    synchronized void display(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
           
        }
    }
}

class Mythread1 extends Thread{
    MyData d;
    public Mythread1(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("Hello world");
    }

}
class Mythread2 extends Thread{
    MyData d;
    public Mythread2(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("Welcome");
    }
}

public class Main {
    public static void main(String[] args) {
        MyData d = new MyData();

        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);

        t1.start();
       
        t2.start();
        
    }
    
}
