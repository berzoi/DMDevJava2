package lesson25.lesson253;

public class SimpleRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Hello from runnable: " + Thread.currentThread().getName());
  }
}