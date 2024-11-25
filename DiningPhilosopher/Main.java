class Chopstick {
    private final int id;

    public Chopstick(int id) {
        this.id = id;
    }

    public void pickUp() {
        System.out.println("Chopstick " + id + " picked up.");
    }

    public void putDown() {
        System.out.println("Chopstick " + id + " put down.");
    }
}

class Philosopher extends Thread {
    private final Chopstick left;
    private final Chopstick right;

    public Philosopher(Chopstick left, Chopstick right) {
        this.left = left;
        this.right = right;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            think();
            synchronized (left) {
                left.pickUp();
                synchronized (right) {
                    right.pickUp();
                    eat();
                    right.putDown();
                }
                left.putDown();
            }
        }
    }

    private void think() {
        System.out.println(Thread.currentThread().getName() + " is thinking.");
    }

    private void eat() {
        System.out.println(Thread.currentThread().getName() + " is eating.");
    }
}

public class Main{
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Chopstick[] chopsticks = new Chopstick[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            chopsticks[i] = new Chopstick(i);
        }

        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(chopsticks[i], chopsticks[(i + 1) % numPhilosophers]);
            philosophers[i].start();
        }
    }
}
