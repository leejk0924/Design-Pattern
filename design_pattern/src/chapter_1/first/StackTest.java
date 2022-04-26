package chapter_1.first;

import java.util.ArrayList;

public class StackTest<T> {
    private ArrayList<T> stackTest = new ArrayList<T>();

    public void push(T x) {
        stackTest.add(x);
        System.out.println(stackTest);
    }

    public T pop() {
        if (stackTest.isEmpty()) {
            System.out.println("null");
        }

        return stackTest.remove(stackTest.size() - 1);
    }

    public ArrayList<T> getStackTest() {
        return stackTest;
    }
}
