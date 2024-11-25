

public class OwnThread  extends Thread{

    private String name;

    public OwnThread(String name){
        this.name = name;
        // this.run();
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
