package leetcode;

/**
 * <p>设计一个循环队列，支持入队、出队、获取队首、获取队尾、判空和判满。</p>
 */
public class P0622_DesignCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MyCircularQueue {
        private final int[] data;
        private int front;
        private int rear;
        private int size;

        public MyCircularQueue(int k) {
            data = new int[k];
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            data[rear] = value;
            rear = (rear + 1) % data.length;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % data.length;
            size--;
            return true;
        }

        public int Front() {
            return isEmpty() ? -1 : data[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : data[(rear - 1 + data.length) % data.length];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == data.length;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}

