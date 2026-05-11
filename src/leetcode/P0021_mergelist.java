package leetcode;

import leetcode.common.ListNode;

public class P0021_mergelist {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = solution.mergeTwoLists(list1, list2);
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
        public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
            if (head1 == null || head2 == null) {
                return head1 == null ? head2 : head1;
            }

            ListNode head = head1.val <= head2.val ? head1 : head2;
            ListNode cur1 = head.next;
            ListNode cur2 = head == head1 ? head2 : head1;
            ListNode pre = head;
            while (cur1 != null && cur2 != null) {
                if (cur1.val <= cur2.val) {
                    pre.next = cur1;
                    cur1 = cur1.next;
                }
                else {
                    pre.next = cur2;
                    cur2 = cur2.next;
                }
                pre = pre.next;
            }

            pre.next = cur1 != null ? cur1 : cur2;

            return head;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
