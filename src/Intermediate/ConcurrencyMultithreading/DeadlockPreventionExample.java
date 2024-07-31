package Intermediate.ConcurrencyMultithreading;

public class DeadlockPreventionExample {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            try { Thread.sleep(10); } catch (InterruptedException ignored) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock 1 and lock 2...");
            }
        }
    }
    public void method2() {
        synchronized (lock1) { // changed the lock order
            System.out.println("Thread 2: Holding lock 1...");
            try { Thread.sleep(10); } catch (InterruptedException ignored) {}
            System.out.println("Thread 2: Waiting for lock 2...");
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 1 and lock 2...");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockPreventionExample example = new DeadlockPreventionExample();

        Thread thread1 = new Thread(example::method1);
        Thread thread2 = new Thread(example::method2);

        thread1.start();
        thread2.start();
    }
}
