
class Buffer{
    int n;
    boolean hasValue = false; // if buffer has data
    synchronized void write(int x){
        while(hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n=x;
        System.out.println("Producer write "+n);
        hasValue=true;
        notify();
       
    }
    
    synchronized int read(){
        while(!hasValue){
            try {
                wait();
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
        System.out.println("Consumer read "+ n);
        hasValue = false;
        notify();
        return n;
    }
}

class Producer extends Thread{
    Buffer b;

    public Producer(Buffer b) {
        this.b=b;
    }
    public void run(){
        for(int i = 1 ; i<=5 ; i++){
            b.write(i);
        }
    } 
}

class Consumer extends  Thread{
    Buffer b;
    public Consumer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i = 1 ; i<=5 ; i++){
            b.read();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
    
}











// // erroroneous code
// class Buffer{
//     int n;
//     synchronized void write(int x){
//         n=x;
//         System.out.println("Producer write "+n);
//     }
//     synchronized int read(){
//         System.out.println("Consumer read "+ n);
//         return n;
//     }
// }

// class Producer extends Thread{
//     Buffer b;

//     public Producer(Buffer b) {
//         this.b=b;
//     }
//     public void run(){
//         for(int i = 1 ; i<=5 ; i++){
//             b.write(i);
//         }
//     } 
// }
// class Consumer extends  Thread{
//     Buffer b;
//     public Consumer(Buffer b){
//         this.b = b;
//     }
//     public void run(){
//         for(int i = 1 ; i<=5 ; i++){
//             b.read();
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Buffer b = new Buffer();
//         Producer p = new Producer(b);
//         Consumer c = new Consumer(b);
//         p.start();
//         c.start();
//     }
    
// }
