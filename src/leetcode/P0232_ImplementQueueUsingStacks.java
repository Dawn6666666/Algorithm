package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>使用两个栈实现队列，支持 push、pop、peek 和 empty。</p>
 */
public class P0232_ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());   // 1
        System.out.println(queue.pop());    // 1
        System.out.println(queue.empty());  // false
        queue.push(3);
        System.out.println(queue.peek());   // 2
        System.out.println(queue.pop());    // 2
        System.out.println(queue.pop());    // 3
        System.out.println(queue.empty());  // true
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MyQueue {
        private final Deque<Integer> inStack;
        private final Deque<Integer> outStack;

        public MyQueue() {
            inStack = new ArrayDeque<>();
            outStack = new ArrayDeque<>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            moveIfNeeded();
            return outStack.pop();
        }

        public int peek() {
            moveIfNeeded();
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void moveIfNeeded() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}

