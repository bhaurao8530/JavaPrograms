public class Threads1 extends Thread {
  public static void main(String[] args) {
    Threads1 thread = new Threads1();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}