package Basic;

class Task{
  synchronized void waitForSignal() throws InterruptedException {
      System.out.println("waiting for signal");
      wait();
      System.out.println("Resume after signal");
  }

    synchronized void sendSignal(){

      notify();
      System.out.println("Signal sent");
  }
}
public class WaitNotifyNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        Task task= new Task();
        Thread t = new Thread(() -> {
            try {
                task.waitForSignal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t1= new Thread(task::sendSignal);

        t.start();
        Thread.sleep(1000);
        t1.start();
    }
}
