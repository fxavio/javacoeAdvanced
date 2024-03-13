public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
            // Attempt to create a very large array to fill up heap space
            int[] array = new int[Integer.MAX_VALUE];

            // This will throw an OutOfMemoryError
            int sum = 0;
            for (int j : array) {
                sum += j;
            }

            System.out.println("Sum: " + sum);
        } catch (OutOfMemoryError e) {
            // This will throw an OutOfMemoryError
            System.err.println("OutOfMemoryError: " + e.getMessage());
        }
        }

    }

