import java.util.ArrayList;
import java.util.List;

class MyThread extends Thread {
    private int start;
    private int end;
    private int fact = 1;  

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            fact = fact * i;  
        }
    }

    public int getAns() {
        return fact;  
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10;  
        int threadCnt = 2;  
        int perThread = n / threadCnt;  

        List<MyThread> arr = new ArrayList<>();

        for (int i = 0; i < threadCnt; i++) {
            int start = i * perThread + 1;
            int end = (i == threadCnt - 1) ? n : (i + 1) * perThread;   
            MyThread t = new MyThread(start, end);
            arr.add(t);
            t.start();
        }

        int finalAns = 1;

        for (MyThread t : arr) {
            try {
                t.join();  
                finalAns = finalAns * t.getAns();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Factorial of " + n + " is: " + finalAns);
    }
}
