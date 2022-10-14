package singly_linked_list.iterative;

import singly_linked_list.ListNode;

public class LC_2095 {
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null)
            return null;

        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }

}
