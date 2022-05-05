package creatation.singleton.first;

public class Test {
    public static void main(String[] args) {
//        QueueTest q = new QueueTest();
//
//        q.enqueue("a");
//        q.enqueue(10);
//        System.out.println(q.getQueTest());
//        q.dequeue();
//        System.out.println(q.getQueTest());
//        q.dequeue();
//        q.dequeue();
        StackTest s = new StackTest();
        s.push(10);
        s.push(100);
        s.push(1000);
        System.out.println(s.getStackTest());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
