package lab4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WordFrequencyCounter {
    private final ConcurrentHashMap<String, Integer> wordCounts = new ConcurrentHashMap<>();

    public void countWords(List<String> words) {
        words.forEach(word -> wordCounts.merge(word, 1, Integer::sum));
    }

    public ConcurrentHashMap<String, Integer> getWordCounts() {
        return wordCounts;
    }

    public static void main(String[] args) {
        WordFrequencyCounter counter = new WordFrequencyCounter();

        List<String> text = Arrays.asList(
                "hello", "world", "hello", "concurrency",
                "world", "java", "hello", "concurrency",
                "thread", "safety", "java", "hello"
        );

        int numThreads = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        int chunkSize = text.size() / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? text.size() : (i + 1) * chunkSize;
            List<String> sublist = text.subList(start, end);

            executorService.submit(() -> counter.countWords(sublist));
        }

        executorService.shutdown();
        try {
            boolean finished = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (!finished) {
                System.err.println("Not all tasks finished within the timeout");
            }
        } catch (InterruptedException e) {
            System.err.println("Tasks interrupted");
            e.printStackTrace();
        }

        counter.getWordCounts().forEach((word, count) ->
                System.out.println(word + ": " + count)
        );
    }
}


