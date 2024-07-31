package Intermediate.ConcurrencyMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedCounter {
    private int counter = 0;
    private final Lock lock = new ReentrantLock();
    public void increment() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }
    public int getCounter() {
        return counter;
    }
    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();
        Runnable task = counter::increment;

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final counter value: " + counter.getCounter());
        System.out.println("Thread 1: " + thread1.getName());
        System.out.println("Thread 2: " + thread2.getName());
        System.out.println("Thread 3: " + thread3.getName());
    }
}
