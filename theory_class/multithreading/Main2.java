

public class Main2 {

    public static void main(String[] args) {
        Thread2 t2 = new Thread2("Another Thread");
        Thread t1 = new Thread(t2);
        t1.start();
        for(int i = 0; i<5 ; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
        }
        System.out.println("Main Thread Waiting");
        try {
            t1.join();
        } catch (Exception e) {
        }
        System.out.println("Main Thread Exiting");
        
        
        


        // OwnThread t1 = new OwnThread("Own Thread");
        // t1.start();
        // for(int i = 0; i<5 ; i++){
        //     System.out.println(i);
        //     try {
        //         Thread.sleep(500);
        //     } catch (Exception e) {
        //     }
        // }
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // System.out.println("Main Thread Exiting");

    }
}
