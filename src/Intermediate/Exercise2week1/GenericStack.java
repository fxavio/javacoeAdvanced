package Intermediate.Exercise2week1;
import java.util.ArrayList;
import java.util.List;
import java.util.EmptyStackException;

public class GenericStack<T> {
    private final List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    // Push an element onto the stack
    public void push(T element) {
        stack.add(element);
    }

    // Pop an element from the stack
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek the top element of the stack without removing it
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Integer stack example
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Top of integer stack: " + intStack.peek()); // Output: 3
        System.out.println("Pop from integer stack: " + intStack.pop()); // Output: 3
        System.out.println("Pop from integer stack: " + intStack.pop()); // Output: 2
        System.out.println("Is integer stack empty? " + intStack.isEmpty()); // Output: false

        // String stack example
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("hello");
        stringStack.push("world");
        System.out.println("Top of string stack: " + stringStack.peek()); // Output: world
        System.out.println("Pop from string stack: " + stringStack.pop()); // Output: world
        System.out.println("Is string stack empty? " + stringStack.isEmpty()); // Output: false
    }
}
