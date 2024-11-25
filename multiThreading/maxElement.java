

import java.util.ArrayList;
import java.util.List;

class FibonacciThread extends Thread {
    private int n;
    private List<Integer> fibonacciList;

    public FibonacciThread(int n, List<Integer> fibonacciList) {
        this.n = n;
        this.fibonacciList = fibonacciList;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacciList.add(i);
            } else {
                int next = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
                fibonacciList.add(next);
            }
        }
    }
}

public class maxElement {
    public static void main(String[] args) throws InterruptedException {
        int n = 10; // Calculate first 10 Fibonacci numbers
        List<Integer> fibonacciList = new ArrayList<>();
        FibonacciThread fibThread = new FibonacciThread(n, fibonacciList);
        fibThread.start();
        fibThread.join();

        System.out.println("Fibonacci series: " + fibonacciList);
    }
}




// import java.util.*;


// class MyThread extends Thread{
//     int start_idx,end_idx;
//     List<Integer> arr;
//     public MyThread(int start_idx,int end_idx,List<Integer> arr){
//         this.start_idx=start_idx;
//         this.end_idx = end_idx;
//         this.arr = arr;
//     }
//     int maxi = Integer.MIN_VALUE;
//     public void run(){
//         for(int i = start_idx; i<=end_idx ; i++){
//             maxi = Math.max(maxi,arr.get(i));
//         }
//     }
//     public int getAns(){
//         return maxi;
//     }
   
// }

// public class maxElement{
//     public static void main(String[] args) {
//         List<Integer> arr = Arrays.asList(2, 12, 4, 6,22,7,90,1); // 8
//         int n = arr.size();
//         int threadCnt = 2;
//         int perThread = n/threadCnt; //4

//         List<MyThread> arr1 = new ArrayList<>();
//         for(int i = 0; i<threadCnt ; i++){
//             int start_idx = i*perThread;
//             int end_idx = (i+1)*(perThread-1);
//             MyThread t = new MyThread(start_idx,end_idx,arr);
//             arr1.add(t);
//             t.start();
//         }
//         int ans = Integer.MIN_VALUE;
//         for(MyThread t : arr1){
//             try {
//                 t.join();
//             ans = Math.max(ans,t.getAns());
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//         System.out.println(ans);
        
//     }
// }




















// // import java.util.*;

// // class MyThread extends Thread {
// //     List<Integer> arr;
// //     int start;
// //     int end;
// //     int maxEl = Integer.MIN_VALUE;  // Initialize to the minimum value

// //     public MyThread(int start, int end, List<Integer> arr) {
// //         this.start = start;
// //         this.end = end;
// //         this.arr = arr;
// //     }

// //     public void run() {
// //         for (int i = start; i <= end; i++) {
// //             maxEl = Math.max(arr.get(i), maxEl);  // Find the maximum element in the range
// //         }
// //     }

// //     public int getAns() {
// //         return maxEl;  // Return the maximum element found
// //     }
// // }

// // public class maxElement {
// //     public static void main(String[] args) {
// //         // Initialize the list of integers
// //         List<Integer> arr = Arrays.asList(2, 12, 4, 6,22,7);
// //         int n = arr.size(); // 6
// //         int threadCnt = 3;
// //         int perThread = n/threadCnt; //2

// //         for(int i = 0; i<threadCnt ; i++){
// //             int start = i*(perThread);
// //             int end = (i+1)*(perThread-1) ; 
// //         }
        

        

// //         MyThread t = new MyThread(start, end, arr);
// //         t.start();  

// //         try {
// //             t.join();  // Wait for the thread to finish
// //         } catch (InterruptedException e) {
// //             e.printStackTrace();
// //         }
// //         System.out.println("Maximum element is " + t.getAns());
// //     }
// // }
