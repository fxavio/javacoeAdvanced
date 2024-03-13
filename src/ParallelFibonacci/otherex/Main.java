package ParallelFibonacci.otherex;

import ParallelFibonacci.otherex.Fibonacci;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        int numberToCalculate = 20; // Change this to any number you want to calculate Fibonacci for
        Fibonacci fibonacciTask = new Fibonacci(numberToCalculate);

        int result = pool.invoke(fibonacciTask);
        System.out.println("Fibonacci(" + numberToCalculate + ") = " + result);
    }
}

