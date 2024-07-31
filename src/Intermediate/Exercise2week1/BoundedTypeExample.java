package Intermediate.Exercise2week1;

public class BoundedTypeExample {
    // Method to compare two numbers and return the maximum
    public static <T extends Number> T max(T a, T b) {
        if (a.doubleValue() > b.doubleValue()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(3.14, 2.71));
    }
}
