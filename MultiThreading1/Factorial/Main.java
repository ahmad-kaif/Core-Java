import java.util.*;

class MyThread extends Thread {
    int start;
    int end;
    int fact = 1;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            fact *= i;
        }
    }

    public int getAns() {
        return fact;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10; // Factorial of 10
        int threadCnt = 2;
        int chunk = n / threadCnt; // Chunk size

        List<MyThread> threads = new ArrayList<>();
        for (int i = 0; i < threadCnt; i++) {
            int start = i * chunk + 1; 
            int end = (i == threadCnt - 1) ? n : (i + 1) * chunk; 
            MyThread t = new MyThread(start, end);
            threads.add(t);
            t.start();
        }

        int finalAns = 1; 

        for (MyThread t : threads) {
            try {
                t.join();
                finalAns *= t.getAns(); 
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Factorial using Multithreading: " + finalAns);
    }
}
