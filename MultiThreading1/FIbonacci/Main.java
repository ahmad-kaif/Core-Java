//fibonacci
import java.util.ArrayList;
import java.util.List;

class MyThread extends Thread{
    int start;
    int end;
    List<Integer> arr = new ArrayList<>();
    public MyThread(int start, int end){
        this.start = start;
        this.end=end;
    }
    public void run(){
        for(int i = start; i<=end ; i++){
            arr.add(fibo(i));
        }
    }
    private int fibo(int n){
        if(n<2) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public List<Integer> getResult() {
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int threadCnt = 2;
        int chunk=n/threadCnt;

        List<MyThread> A = new ArrayList<>();
        for(int i = 0 ; i<threadCnt ; i++){
            int start = i * chunk;
            int end = (i == threadCnt - 1) ? n - 1 : (i + 1) * chunk - 1;
            MyThread t = new MyThread(start, end);
            A.add(t);
            t.start();
        }

        List<Integer> ans = new ArrayList<>();
        for(MyThread t : A){
            try {
                t.join();
                ans.addAll(t.getResult());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Fibonacci series up to " + n + ": " + ans);
    }
    
}
