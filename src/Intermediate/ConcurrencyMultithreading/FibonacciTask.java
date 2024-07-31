package Intermediate.ConcurrencyMultithreading;

import java.util.concurrent.RecursiveTask;
class FibonacciTask extends RecursiveTask<Integer> {
    private final int n;
    public FibonacciTask(int n) {
        this.n = n;
    }
    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        }
        FibonacciTask f1 = new FibonacciTask(n - 1);
        f1.fork();
        FibonacciTask f2 = new FibonacciTask(n - 2);
        return f2.compute() + f1.join();
    }
}
