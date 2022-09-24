package singly_linked_list.iterative;

import singly_linked_list.ListNode;

class LC_0002 {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {

        ListNode c = new ListNode(-1), result = c;
        int carry = 0;

        while (a != null || b != null || carry != 0) {

            int aVal = (a != null) ? a.val : 0;
            int bVal = (b != null) ? b.val : 0;
            int cVal = aVal + bVal + carry;

            carry = cVal / 10;
            c.next = new ListNode(cVal % 10);

            c = c.next;
            a = (a != null) ? a.next : null;
            b = (b != null) ? b.next : null;
        }

        return result.next;
    }
}