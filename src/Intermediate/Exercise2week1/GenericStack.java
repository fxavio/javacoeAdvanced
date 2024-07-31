package Intermediate.Exercise2week1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericStack<T> {
    private final List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println(intStack.pop());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("hello");
        stringStack.push("world");
        System.out.println(stringStack.pop());
    }
}
