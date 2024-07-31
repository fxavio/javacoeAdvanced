package Intermediate.ConcurrencyMultithreading;
import java.util.concurrent.Callable;

class SumTask implements Callable<Integer> {
    private final int a;
    private final int b;
    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}
