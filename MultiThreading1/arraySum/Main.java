
import java.util.*;

class MyThread extends Thread{
    int start;
    int end;
    int sum = 0;
    List<Integer> arr;
    public MyThread(int start, int end, List<Integer>arr){
        this.start = start;
        this.end=end;
        this.arr=arr;
    }
    @Override
    public void run(){
        for(int i = start ; i<= end ; i++){
            sum = sum + arr.get(i);
        }
    }
    public int getAns(){
        return sum;
    }

}

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8);
        int n = arr.size();
        int threadCnt = 2;
        int chunk = n/threadCnt; // 4
        List<MyThread> A = new ArrayList<>();
        for(int i = 0; i<threadCnt ; i++){
            int start = i*chunk;
            int end = (i == threadCnt -1)? n-1 : (i+1)*(chunk-1);
            MyThread t = new MyThread(start, end, arr);
            A.add(t);
            t.start();
        }
        int finalAns= 0;
        for(MyThread t : A){
            try {
                t.join();
                finalAns += t.getAns();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Sum of array using Multithreading : "+finalAns);
        
    }
    
}
