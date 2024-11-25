class SharedResource {
    private int data;
    private int readers = 0;

    public synchronized void write(int value) {
        while (readers > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Written: " + data);
        notifyAll();
    }

    public synchronized int read() {
        while (readers < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        readers++;
        int value = data;
        readers--;
        notifyAll();
        System.out.println("Read: " + value);
        return value;
    }
}

class Writer extends Thread {
    SharedResource resource;

    public Writer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.write(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Reader extends Thread {
    SharedResource resource;

    public Reader(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.read();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Writer writer = new Writer(resource);
        Reader reader1 = new Reader(resource);
        Reader reader2 = new Reader(resource);
        writer.start();
        reader1.start();
        reader2.start();
    }
}
