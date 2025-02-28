// A correct implementation of a producer and consumer.
class Q1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer1 implements Runnable {
    Q1 q;
    Thread t;

    Producer1(Q1 q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer2 implements Runnable {
    Q1 q;
    Thread t;

    Consumer2(Q1 q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}


class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        Producer1 p = new Producer1(q);
        Consumer2 c = new Consumer2(q);

        // Start the threads.
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}
