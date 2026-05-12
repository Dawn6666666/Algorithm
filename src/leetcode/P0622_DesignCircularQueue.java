package leetcode;

/**
 * <p>设计一个循环队列，支持入队、出队、获取队首、获取队尾、判空和判满。</p>
 */
public class P0622_DesignCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MyCircularQueue {
        private final int[] queue;
        private int l;
        private int r;
        private int size;
        private int limit;

        public MyCircularQueue(int k) {
            queue = new int[k];
            l = r = size = 0;
            limit = k;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            else {
                queue[r] = value;
                r = r == (limit - 1) ? 0 : r + 1;
                size++;
                return true;
            }
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            else {
                l = l == (limit - 1) ? 0 : l + 1;
                size--;
                return true;
            }
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            else {
                return queue[l];
            }
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            else {
                int tail = r == 0 ? (limit - 1) : (r - 1);
                return queue[tail];
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == limit;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}

