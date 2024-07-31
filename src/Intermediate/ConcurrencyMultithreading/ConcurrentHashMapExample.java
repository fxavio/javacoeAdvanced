package Intermediate.ConcurrencyMultithreading;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();
    public void put(String key, String value) {
        cache.put(key, value);
    }
    public String get(String key) {
        return cache.get(key);
    }
    public static void main(String[] args) {
        ConcurrentHashMapExample example = new ConcurrentHashMapExample();
        example.put("1", "One");
        System.out.println(example.get("1"));
    }
}

