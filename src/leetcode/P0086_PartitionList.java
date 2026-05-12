package leetcode;

import leetcode.common.ListNode;

/**
 * <p>给你一个链表的头节点 <code>head</code> 和一个特定值 <code>x</code>，请你对链表进行分隔，使得所有 <strong>小于</strong> <code>x</code> 的节点都出现在 <strong>大于或等于</strong> <code>x</code> 的节点之前。</p>
 *
 * <p>你应当 <strong>保留</strong> 两个分区中每个节点的初始相对位置。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>head = [1,4,3,2,5,2], x = 3
 * <strong>输出：</strong>[1,2,2,4,3,5]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>head = [2,1], x = 2
 * <strong>输出：</strong>[1,2]
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li>链表中节点的数目在范围 <code>[0, 200]</code> 内</li>
 * <li><code>-100 &lt;= Node.val &lt;= 100</code></li>
 * <li><code>-200 &lt;= x &lt;= 200</code></li>
 * </ul>
 */
public class P0086_PartitionList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(2))))));
        ListNode result = solution.partition(head, 3);
        printList(result);
    }

    private static void printList(ListNode head) {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        while (head != null) {
            builder.append(head.val);
            head = head.next;
            if (head != null) {
                builder.append(',');
            }
        }
        builder.append(']');
        System.out.println(builder);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode lefthead = null;
            ListNode lefttail = null;
            ListNode righthead = null;
            ListNode righttail = null;

            while (head != null) {
                ListNode next = head.next;
                head.next = null;
                if (head.val < x) {
                    if (lefthead == null) {
                        lefthead = head;
                        lefttail = head;
                    }
                    else {
                        lefttail.next = head;
                        lefttail = head;
                    }
                }
                else {
                    if (righthead == null) {
                        righthead = head;
                        righttail = head;
                    }
                    else {
                        righttail.next = head;
                        righttail = head;
                    }
                }
            }
            if (lefthead == null) {
                return righthead;
            }
            lefttail.next = righthead;
            return lefthead;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}

