import java.math.BigInteger;

public class Main {

    private static class Multiplier implements Runnable {
        private int start, end;
        private Thread t;
        private BigInteger lfact;

        public Multiplier(int start, int end) {
            this.start = start;
            this.end = end;
            this.lfact = BigInteger.ONE;
            t = new Thread(this);
            t.start();
        }

        public void run() {
            for (int i = start; i <= end; ++i) {
                lfact = lfact.multiply(new BigInteger(Integer.toString(i)));
            }
        }

        public void join() throws InterruptedException {
            t.join();
        }

        public BigInteger getValue() {
            return lfact;
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int tcount = 10;
        int perthread = n / tcount;

        BigInteger fact = BigInteger.ONE;

        Multiplier helpers[] = new Multiplier[tcount];

        // Initialize threads
        for (int i = 0; i < tcount; i++) {
            int start = i * perthread + 1;
            int end = (i == tcount - 1) ? n : (i + 1) * perthread; // Ensuring last thread covers the remainder
            helpers[i] = new Multiplier(start, end);
        }

        // Wait for threads to finish and accumulate results
        try {
            for (int i = 0; i < tcount; i++) {
                helpers[i].join();
                fact = fact.multiply(helpers[i].getValue());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Output the final factorial result
        System.out.println("Factorial of " + n + " is: " + fact.toString());
    }
}
