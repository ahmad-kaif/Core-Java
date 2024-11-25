// (a) How will you create a thread as anonymous inner class? Elaborate with an example of a program,
// where the child thread gets created as anonymous inner class, printing from 100 to 120 with 500 ms
// sleep in between each print, and at the same time the main thread will print from 1 to 10, then will wait
// for the child thread to exit, and then will print from 1 to 20 again.

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){ //child thread
            public void run(){
                for(int i = 100 ; i<=120 ; i++){
                    try {
                        System.out.println(i);
                        Thread.sleep(500);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
            
        };
        t.start();

        //main thread
        for(int i = 1;i<=10 ; i++){
            System.out.println(i);
        }
        try {
            t.join();

        } catch (Exception e) {
            // TODO: handle exception
        }
        for(int i = 1 ; i<=20 ; i++){
            System.out.println(i);;
        }
    }
}
