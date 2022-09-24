package singly_linked_list;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode buildList(int ... args) {
        ListNode dummy = new ListNode(-1), result = dummy;
        int n = args.length;

        for (int i = 0; i < n; i++) {
            dummy.next = new ListNode(args[i]);
            dummy = dummy.next;
        }

        return result.next;
    }

    public static boolean equals(ListNode a, ListNode b) {

        while (a != null && b != null) {
            if (a.val != b.val)
                return false;

            a = a.next;
            b = b.next;
        }

        return a == null && b == null;
    }

}