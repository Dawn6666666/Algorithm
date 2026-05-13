package leetcode;

import java.util.Stack;

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
        Stack<Integer> in = new Stack<>();
        Stack<Integer> out = new Stack<>();

        void inToOut() {
            if (out.empty()) {
                while (!in.empty()) {
                    out.push(in.pop());
                }
            }
        }

        void push(int x) {
            in.push(x);
            inToOut();
        }

        int pop() {
            inToOut();
            return out.pop();
        }

        int peek() {
            inToOut();
            return out.peek();
        }

        boolean empty() {
            return in.empty() && out.empty();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}

