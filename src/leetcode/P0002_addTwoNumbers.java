package leetcode;

import leetcode.common.ListNode;

public class P0002_addTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = solution.addTwoNumbers(l1, l2);
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans = null;
            ListNode cur = null;
            int carry = 0;

            for (
                    int var, sum;
                    l1.next != null || l2.next != null;
                    l1 = l1 == null ? null : l1.next, l2 = l2 == null ? null : l2.next
            ) {
                sum = (l1 == null ? 0 : l1.val)
                        + (l2 == null ? 0 : l2.val)
                        + carry;
                var = sum % 10;
                carry = sum / 10;

                if (ans == null) {
                    ans = new ListNode(var);
                    cur = ans;
                }
                else {
                    cur = new ListNode(var);
                    cur = cur.next;
                }
            }
            if (carry == 1) {
                cur.next = new ListNode(1);
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}

