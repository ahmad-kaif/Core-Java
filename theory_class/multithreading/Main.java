

class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Our Thread");
        System.out.println(t);

        for(int i = 0 ; i<5 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            } 
        }

    }
    
}
     



// class Thread1 extends Thread{
//     private String name;
//     public Thread1(String name){
//         this.setName("Ahmad");
//         this.run();
//     }
//     public void run(){
//         for(int i = 10 ; i<15 ; i++){
//             System.out.println("from "+name+" "+ i);
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//                 // TODO: handle exception
//                 e.getMessage();
//             }
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Thread1 t = new Thread1("Another Thread");
//         for(int i = 0; i<5 ;i++){
//             System.out.println("from main "+ i);
//             Thread1.sleep(i);
//         }
        
//     }
// }