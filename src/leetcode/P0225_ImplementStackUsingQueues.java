package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>使用两个队列实现栈，支持 push、pop、top 和 empty。</p>
 */
public class P0225_ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());    // 2
        System.out.println(stack.pop());    // 2
        System.out.println(stack.empty());  // false
        stack.push(3);
        System.out.println(stack.top());    // 3
        System.out.println(stack.pop());    // 3
        System.out.println(stack.pop());    // 1
        System.out.println(stack.empty());  // true
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MyStack {
        Deque<Integer> deque = new LinkedList<>();

        void push(int x) {
            int n = deque.size();
            deque.push(x);
            for (int i = 0; i < n; i++) {
                deque.push(deque.pop());
            }
        }

        int pop() {
            return deque.pop();
        }

        int top() {
            return deque.peek();
        }

        boolean empty() {
            return deque.isEmpty();
        }


    }
    //leetcode submit region end(Prohibit modification and deletion)
}

