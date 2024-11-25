
class demo implements Runnable{
    public void run(){
        try {
        
            System.out.println("Thread using runnable - "+Thread.currentThread().getName() +" - is running");
            Thread.sleep(3500);
            System.out.println("helo");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i =0; i<8 ; i++){
            // demo d = new demo();
            // d.start();
            Thread obj = new Thread(new demo());
            obj.start();
        }
    }
    
}
