package src;

public class LinkedListCycle141 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode start = head;
        ListNode skip = head.next;
        while (skip != null && skip.next != null) {
            if (start == skip)
                return true;
            start = start.next;
            skip = skip.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        // Link nodes to form a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 3
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        System.out.println(hasCycle(node1));
    }
}
