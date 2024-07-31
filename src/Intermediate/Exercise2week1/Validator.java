package Intermediate.Exercise2week1;
import java.util.function.Predicate;
public class Validator {
    // Generic method to validate elements based on a predicate
    public static <T> boolean validate(T[] elements, Predicate<T> predicate) {
        for (T element : elements) {
            if (!predicate.test(element)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 6, 8, 10};
        String[] words = {"apple", "banana", "cherry"};

        // Validate if all numbers are even
        boolean areAllEven = validate(numbers, number -> number % 2 == 0);
        System.out.println("All numbers are even: " + areAllEven); // Output: true

        // Validate if all words have more than 3 characters
        boolean areAllWordsLong = validate(words, word -> word.length() > 3);
        System.out.println("All words have more than 3 characters: " + areAllWordsLong); // Output: true

        // Validate if all words start with 'a'
        boolean allStartWithA = validate(words, word -> word.startsWith("a"));
        System.out.println("All words start with 'a': " + allStartWithA); // Output: false
    }
}
