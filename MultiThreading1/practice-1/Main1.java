import java.util.ArrayList;
import java.util.List;

class Test extends Thread{
    int start;
    int end;
    int sum;
    Test(int start, int end){
        this.start = start;
        this.end=end;
        sum = 0;
    }
    public void run(){
        for(int i = start ; i<=end ; i++){
            sum = sum + i;
        }
    }

    int getAns(){
        return sum;
    }

}

public class Main1{
    public static void main(String[] args) {
        int n = 16;
        int threadCnt = 8;
        int perThread = n/threadCnt;

        List<Test> arr = new ArrayList<>();

        
        for(int i = 0 ; i<threadCnt ; ++i){
            int start = i*perThread+1;
            int end = (i+1)*perThread;
            Test t = new Test(start, end);
            arr.add(t);
            t.start();
        }
        int finalAns= 0;
        for(Test t : arr){
            try {
                t.join();
                finalAns += t.getAns();
            } catch (Exception e) {
            }
        }
        System.err.println(finalAns);
    }
}