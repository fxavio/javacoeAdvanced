package Intermediate.Exercise2week1;

public class GenericMethodExample {
    // Generic method to check if an element is present in an array
    public static <T> boolean contains(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry", "grape"};
        System.out.println(contains(intArray, 3));
        System.out.println(contains(strArray, "banana"));
        System.out.println(contains(strArray, "grape"));
        System.out.println(contains(strArray, "kiwi"));
    }
}

