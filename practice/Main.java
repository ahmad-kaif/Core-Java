public class Main{

    // Define Thread C as a non-static inner class
    class ThreadC extends Thread {
        @Override
        public void run() {
            try {
                 
                for(int i=0;i<6;i++)
                {    
                    System.out.println("ThreadC " + i);
                    Thread.sleep(2000);
                }

            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread C was interrupted.");
            }
        }
    }

    // Define Thread B as a non-static inner class
    class ThreadB extends Thread {
        @Override
        public void run() {
            ThreadC threadC = new ThreadC();
            threadC.start();

            try {
                
                /*Thread B will wait for Thread C to finish its execution.
                  Calling thread:B
                  Target thread:C
                */

                threadC.join(); // wait for thread C to finish

                for(int i=50;i<56;i++)
                {    
                    System.out.println("ThreadB " + i);
                    Thread.sleep(2000);
                }

        
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread B was interrupted.");
            }
        }
    }

    // Define Thread A as a non-static inner class
    class ThreadA extends Thread {
        @Override
        public void run() 
        {
            ThreadB threadB = new ThreadB();
            threadB.start();

            try {
                
                /*Thread A will wait for Thread B to finish to finish its execution.
                  Calling thread:A
                  Target thread:B
                 */

                threadB.join();
                
                for(int i=100;i<106;i++)
                {
                    System.out.println("ThreadA " + i);
                     Thread.sleep(2000);
                }
               

            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread A was interrupted.");
            }
        }
    }

    public static void main(String[] args)  
    {
        Main OuterObj = new Main();
        
        // Start Thread A using the instance of the outer class
        ThreadA InnerObj = OuterObj.new ThreadA();
        InnerObj.start();
    }
}