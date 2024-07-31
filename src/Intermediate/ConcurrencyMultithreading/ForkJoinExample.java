package Intermediate.ConcurrencyMultithreading;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        FibonacciTask task = new FibonacciTask(30);
        System.out.println("Result: " + pool.invoke(task));
    }
}

