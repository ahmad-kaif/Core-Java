import java.util.*;


class MyThread extends Thread{
    int start;
    int end;
    int Partialsum = 0;
    MyThread(int start, int end){
        this.start = start;
        this.end=end;
    }
    public void run(){
        for(int i = start ; i<=end ; i++){
            Partialsum = Partialsum + i;
        }
    }
    public int getAns(){
        return Partialsum;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int threadCnt = 6;
        int perThread = n/threadCnt;
        List<MyThread> arr = new ArrayList<>();
        for(int i = 0; i<threadCnt ; i++){
            int start = i * perThread + 1;
            int end = (i == threadCnt - 1) ? n : (i + 1) * perThread;
            MyThread t = new MyThread(start, end);
            arr.add(t);
            t.start();
        }
        int finalSum = 0;
        for(MyThread t : arr){
            try {
                t.join();
                finalSum = finalSum + t.getAns();
            } catch (Exception e) {
             System.out.println(e);   
            }   
        }
        System.out.println("Sum is : " + finalSum);
    }
}
