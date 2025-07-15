package tnsif.dyp;

 public class ChildThread extends Thread {
    private int count;
    private String threadName;

    public ChildThread(int count, String threadName) {
        this.count = count;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.err.println(threadName + " interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }



    public static void main(String[] args) {
        ChildThread t1 = new ChildThread(5, "First");
        ChildThread t2 = new ChildThread(10, "Second");
        t1.start();
        t2.start();
        
        Thread.currentThread().setName("Parent Thread");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Current Thread: " + Thread.currentThread());
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupt: " + e.getMessage());
        }
        System.out.println("-----End of Program-------");
    }
}
