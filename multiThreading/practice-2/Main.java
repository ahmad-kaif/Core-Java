class Test extends Thread {
    // Constructor to set thread name
    Test(String name) {
        super(name);
    }

    // Factory method to create and start the thread
    public static Test factory(String name) {
        Test t = new Test(name);
        t.start();
        return t;
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting ");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400); 
                System.out.println("In " + getName() + " count is " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " ending ");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread starting");

        // Create and start threads using the factory method
        Test t1 = Test.factory("Child 1");
        Test t2 = Test.factory("Child 2");
        Test t3 = Test.factory("Child 3");

        // Main thread waits for child threads to complete
        try {
            t1.join(); // t1 ka wait kro main thread
            System.out.println("Child 1 joined");
            t2.join();
            System.out.println("Child 2 joined");
            t3.join();
            System.out.println("Child 3 joined");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread ending...");
    }
}
