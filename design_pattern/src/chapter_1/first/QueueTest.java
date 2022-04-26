package chapter_1.first;

import java.util.ArrayList;

public class QueueTest<T> {
    private ArrayList<T> queTest = new ArrayList<T>();

    public void enqueue(T x) {
        queTest.add(x);
        System.out.println(queTest);
    }

    public void dequeue() {
        if (queTest.isEmpty()) {
            System.out.println("null");
        } else {
            queTest.remove(0);
            System.out.println(queTest);
        }
    }

    public ArrayList<T> getQueTest() {

        return queTest;
    }
}
