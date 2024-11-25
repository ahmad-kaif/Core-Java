

public class Thread2 implements Runnable{
    private String name;

    public Thread2(String name){
        this.name=name;
        // this.start
    }
    public void run(){
        for(int i =10 ; i<15 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
     