

public class Sync1 {
    private static  class Printer implements Runnable{
        private String msg;

        public Printer(String msg){
            this.msg = msg;
            Thread t =  new Thread(this);
            t.start();
        }

         private void print(){
            System.out.print("[");
            System.out.print(msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("]");
        }
        public synchronized  void run(){
            print();
        }
    }

    public static void main(String[] args) {
        Printer p1 = new Printer("C");
        Printer p2 = new Printer("Java");
        Printer p3 = new Printer("Python");
        
    }
    
}
