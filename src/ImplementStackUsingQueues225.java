package src;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingQueues225 {
    static class MyStack {
        List<Integer> stack;

        public MyStack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            return stack.removeLast();
        }

        public int top() {
            return stack.getLast();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty()); // return False
    }
}
