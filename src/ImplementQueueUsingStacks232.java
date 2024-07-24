package src;

import java.util.ArrayList;
import java.util.List;

public class ImplementQueueUsingStacks232 {
    public static class MyQueue {
        List<Integer> stack;

        public MyQueue() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            return stack.removeFirst();
        }

        public int peek() {
            return stack.getFirst();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}
