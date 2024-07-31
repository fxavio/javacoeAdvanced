package Intermediate.Exercise2week1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
public class ThreadSafeCache<K, V> {
    private final ConcurrentMap<K, V> cache;
    public ThreadSafeCache() {
        this.cache = new ConcurrentHashMap<>();
    }
    // Add an item to the cache
    public void put(K key, V value) {
        cache.put(key, value);
    }
    // Retrieve an item from the cache
    public V get(K key) {
        return cache.get(key);
    }
    // Remove an item from the cache
    public V remove(K key) {
        return cache.remove(key);
    }
    // Check if the cache contains a key
    public boolean containsKey(K key) {
        return cache.containsKey(key);
    }
    // Clear the cache
    public void clear() {
        cache.clear();
    }
    public static void main(String[] args) {
        ThreadSafeCache<String, String> cache = new ThreadSafeCache<>();
        // Adding items to the cache
        cache.put("1", "One");
        cache.put("2", "Two");
        cache.put("3", "Three");

        // Retrieving items from the cache
        System.out.println("Key 1: " + cache.get("1"));
        System.out.println("Key 2: " + cache.get("2"));

        // Removing an item from the cache
        System.out.println("Removing Key 2: " + cache.remove("2"));
        System.out.println("Key 2 after removal: " + cache.get("2"));

        // Checking if a key exists in the cache
        System.out.println("Cache contains key 1: " + cache.containsKey("1"));
        System.out.println("Cache contains key 2: " + cache.containsKey("2"));

        // Clearing the cache
        cache.clear();
        System.out.println("Cache cleared. Cache contains key 1: " + cache.containsKey("1"));
    }
}

