

class demo extends Thread{
    public void run(){
        // try {
        //     System.out.println("Thread "+Thread.currentThread().getName() +" is running");
        // } catch (Exception e) {
        //     System.out.println("Exception is caught");
        // }
        System.out.println("Thread " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0; i<n ; i++){
            demo obj = new demo();
            obj.start();
        }
        
    }
    
}
