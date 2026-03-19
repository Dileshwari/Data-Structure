
package Basic;

class Task1 {

    private boolean available = false;

    synchronized void waitForSignal(String threadName) throws InterruptedException {
        while (!available) {  // Always use while!
            System.out.println(threadName + " waiting...");
            wait();
        }

        System.out.println(threadName + " resumed!");
    }

    synchronized void sendSignal() {
        available = true;
        System.out.println("Signal sent to all threads");
        notifyAll();   // Try replacing this with notify()
    }
}

public class NotifyAll {

    public static void main(String[] args) throws InterruptedException {

        Task1 task = new Task1();

        // Multiple waiting threads
        Thread t1 = new Thread(() -> {
            try {
                task.waitForSignal("Thread-1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                task.waitForSignal("Thread-2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                task.waitForSignal("Thread-3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);  // Let them start waiting

        Thread signalThread = new Thread(task::sendSignal);
        signalThread.start();
    }
}
