package practice_6.Test_ArrayList.Stack;

import java.util.LinkedList;

/**
 * Created by OmeN on 08.04.2016.
 */

class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T value) {
        storage.addFirst(value);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
public class Test {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();
        for(String s : "My dog has fleas".split(" ")) {
            stringStack.push(s);
        }

        while (!stringStack.empty()) {
            System.out.print(stringStack.pop() + "_");
        }
    }
}
