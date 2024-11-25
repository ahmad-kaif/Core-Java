import java.util.ArrayList;
import java.util.List;

class MyThread extends Thread {
    private int start;
    private int end;
    private List<Integer> arr;

    MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    synchronized public void run() {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                arr.add(number);
                
            }
        }
    }
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true; 
        if (number % 2 == 0) return false; 
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public List<Integer> getResult() {
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 100; 
        int threadCount = 8; 
        int range = n / threadCount;
       

        List<MyThread> arr = new ArrayList<>();
    
        for (int i = 0; i < threadCount; i++) {
            int start = i * range + 1; 
            int end = (i == threadCount - 1) ? n : (i + 1) * range; 
            MyThread t = new MyThread(start, end);
            arr.add(t);
            t.start();
        }

        // Wait for all threads to finish
        List<Integer> ans = new ArrayList<>();
        for (MyThread t : arr) {
            try {
                t.join();
                ans.addAll(t.getResult());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
  
        System.out.println("Prime numbers up to " + n + ": " + ans);
    }
}
